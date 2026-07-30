package com.crrepa.band.my.model.net;

import java.util.List;

/* loaded from: classes2.dex */
public class BandConfigEntity {
    private int code;
    private List<Integer> deleted;
    private int lang;
    private List<ListBean> list;
    private String url;

    /* renamed from: v, reason: collision with root package name */
    private int f12093v;

    public static class ListBean {
        private String chip;
        private String cn_name;
        private List<?> extend_menu;
        private int face_number;
        private int hid_support;
        private int id;
        private int is_24heart;
        private int is_bo;
        private int is_bp;
        private int is_dyheart;
        private int is_ecg;
        private int is_faces;
        private int is_func;
        private int is_guide;
        private int is_heart;
        private int is_screen;
        private int is_sport;
        private int is_switch;
        private int is_weather;
        private List<Integer> languages;
        private int lcm;
        private String logo;
        private int mcu;
        private String name;
        private int pid;
        private List<String> screens;
        private List<Integer> screens_config;
        private String shape;
        private int status;
        private int updated_at;
        private String version;

        public String getChip() {
            return this.chip;
        }

        public String getCn_name() {
            return this.cn_name;
        }

        public List<?> getExtend_menu() {
            return this.extend_menu;
        }

        public int getFace_number() {
            return this.face_number;
        }

        public int getHid_support() {
            return this.hid_support;
        }

        public int getId() {
            return this.id;
        }

        public int getIs_24heart() {
            return this.is_24heart;
        }

        public int getIs_bo() {
            return this.is_bo;
        }

        public int getIs_bp() {
            return this.is_bp;
        }

        public int getIs_dyheart() {
            return this.is_dyheart;
        }

        public int getIs_ecg() {
            return this.is_ecg;
        }

        public int getIs_faces() {
            return this.is_faces;
        }

        public int getIs_func() {
            return this.is_func;
        }

        public int getIs_guide() {
            return this.is_guide;
        }

        public int getIs_heart() {
            return this.is_heart;
        }

        public int getIs_screen() {
            return this.is_screen;
        }

        public int getIs_sport() {
            return this.is_sport;
        }

        public int getIs_switch() {
            return this.is_switch;
        }

        public int getIs_weather() {
            return this.is_weather;
        }

        public List<Integer> getLanguages() {
            return this.languages;
        }

        public int getLcm() {
            return this.lcm;
        }

        public String getLogo() {
            return this.logo;
        }

        public int getMcu() {
            return this.mcu;
        }

        public String getName() {
            return this.name;
        }

        public int getPid() {
            return this.pid;
        }

        public List<String> getScreens() {
            return this.screens;
        }

        public List<Integer> getScreens_config() {
            return this.screens_config;
        }

        public String getShape() {
            return this.shape;
        }

        public int getStatus() {
            return this.status;
        }

        public int getUpdated_at() {
            return this.updated_at;
        }

        public String getVersion() {
            return this.version;
        }

        public void setChip(String str) {
            this.chip = str;
        }

        public void setCn_name(String str) {
            this.cn_name = str;
        }

        public void setExtend_menu(List<?> list) {
            this.extend_menu = list;
        }

        public void setFace_number(int i8) {
            this.face_number = i8;
        }

        public void setHid_support(int i8) {
            this.hid_support = i8;
        }

        public void setId(int i8) {
            this.id = i8;
        }

        public void setIs_24heart(int i8) {
            this.is_24heart = i8;
        }

        public void setIs_bo(int i8) {
            this.is_bo = i8;
        }

        public void setIs_bp(int i8) {
            this.is_bp = i8;
        }

        public void setIs_dyheart(int i8) {
            this.is_dyheart = i8;
        }

        public void setIs_ecg(int i8) {
            this.is_ecg = i8;
        }

        public void setIs_faces(int i8) {
            this.is_faces = i8;
        }

        public void setIs_func(int i8) {
            this.is_func = i8;
        }

        public void setIs_guide(int i8) {
            this.is_guide = i8;
        }

        public void setIs_heart(int i8) {
            this.is_heart = i8;
        }

        public void setIs_screen(int i8) {
            this.is_screen = i8;
        }

        public void setIs_sport(int i8) {
            this.is_sport = i8;
        }

        public void setIs_switch(int i8) {
            this.is_switch = i8;
        }

        public void setIs_weather(int i8) {
            this.is_weather = i8;
        }

        public void setLanguages(List<Integer> list) {
            this.languages = list;
        }

        public void setLcm(int i8) {
            this.lcm = i8;
        }

        public void setLogo(String str) {
            this.logo = str;
        }

        public void setMcu(int i8) {
            this.mcu = i8;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPid(int i8) {
            this.pid = i8;
        }

        public void setScreens(List<String> list) {
            this.screens = list;
        }

        public void setScreens_config(List<Integer> list) {
            this.screens_config = list;
        }

        public void setShape(String str) {
            this.shape = str;
        }

        public void setStatus(int i8) {
            this.status = i8;
        }

        public void setUpdated_at(int i8) {
            this.updated_at = i8;
        }

        public void setVersion(String str) {
            this.version = str;
        }
    }

    public int getCode() {
        return this.code;
    }

    public List<Integer> getDeleted() {
        return this.deleted;
    }

    public int getLang() {
        return this.lang;
    }

    public List<ListBean> getList() {
        return this.list;
    }

    public String getUrl() {
        return this.url;
    }

    public int getV() {
        return this.f12093v;
    }

    public void setCode(int i8) {
        this.code = i8;
    }

    public void setDeleted(List<Integer> list) {
        this.deleted = list;
    }

    public void setLang(int i8) {
        this.lang = i8;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setV(int i8) {
        this.f12093v = i8;
    }
}
