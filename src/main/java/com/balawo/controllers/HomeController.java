package com.balawo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    /**
     * 首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "views/index";
    }

    /**
     * 主页
     * @return
     */
    @RequestMapping("/home")
    public String home(){
        return "views/home";
    }

    /**
     * 面包屑页面
     * @return
     */
    @RequestMapping("/breadcrumb")
    public String breadcrumb(){
        return "views/breadcrumb";
    }

    /**
     * 卡片布局
     * @return
     */
    @RequestMapping("/cards")
    public String cards(){
        return "views/cards";
    }

    @RequestMapping("forms")
    public String froms(){
        return "views/forms";
    }

    /**
     * 登陆界面
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "views/login";
    }

    /**
     * 注册界面
     * @return
     */
    @RequestMapping("/register")
    public String register(){
        return "views/register";
    }

    /**
     * bootstrap4的样式模板
     * @return
     */
    @RequestMapping("/bootstrap")
    public String bootstrap4(){
        return "views/bootstrap";
    }




}
