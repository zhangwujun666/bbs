package cc.javaee.bbs.controller.laptop;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.javaee.bbs.model.Bankuai;
import cc.javaee.bbs.model.Link;
import cc.javaee.bbs.model.PageBean;
import cc.javaee.bbs.model.Pic;
import cc.javaee.bbs.service.BankuaiService;
import cc.javaee.bbs.service.CommonService;
import cc.javaee.bbs.service.LinkService;
import cc.javaee.bbs.service.PicService;
import cc.javaee.bbs.tool.PublicStatic;
import cc.javaee.bbs.tool.Tool;
/*
 * 产品详情页
 *
 */
@Controller
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    BankuaiService bankuaiService;

    @Autowired
    CommonService commonService;

    @Autowired
    LinkService linkService;

    @Autowired
    PicService picService;

    private static Logger log = Logger.getLogger(LaptopController.class);

    @RequestMapping("index")
    public String laptop(HttpServletRequest request, Model model,Bankuai bankuai,PageBean<Bankuai> page) {
        return "home/laptop/laptop_info";
    }
    @RequestMapping("index.html")
    public String index() {

        return "front/index.html";
    }
}
