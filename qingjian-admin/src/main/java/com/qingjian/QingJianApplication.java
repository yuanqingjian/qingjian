package com.qingjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author qingjian
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class QingJianApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(QingJianApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  清建启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "    ,-----.   .-./`) ,---.   .--.  .-_'''-.        .-./`) .-./`)    ____   ,---.   .--. \n" +
                "  .'  .-,  '. \\ .-.')|    \\  |  | '_( )_   \\       \\ '_ .') .-.') .'  __ `.|    \\  |  | \n" +
                " / ,-.|  \\ _ \\/ `-' \\|  ,  \\ |  ||(_ o _)|  '     (_ (_) _) `-' \\/   '  \\  \\  ,  \\ |  | \n" +
                ";  \\  '_ /  | :`-'`\"`|  |\\_ \\|  |. (_,_)/___|       / .  \\ `-'`\"`|___|  /  |  |\\_ \\|  | \n" +
                "|  _`,/ \\ _/  |.---. |  _( )_\\  ||  |  .-----. ___  |-'`|  .---.    _.-`   |  _( )_\\  | \n" +
                " : (  '\\_/ \\   ;|   | | (_ o _)  |'  \\  '-   .'|   | |   '  |   | .'   _    | (_ o _)  | \n" +
                " \\ `\"/  \\  )  \\|   | |  (_,_)\\  | \\  `-'`   | |   `-'  /   |   | |  _( )_  |  (_,_)\\  | \n" +
                "  '. \\_/``\"/)  )   | |  |    |  |  \\        /  \\      /    |   | \\ (_ o _) /  |    |  | \n" +
                "    '-----' `-''---' '--'    '--'   `'-...-'    `-..-'     '---'  '.(_,_).''--'    '--' \n");
    }
}
