package com.baidu.ar.bean;

/* loaded from: classes.dex */
public class BrowserBean {
    public static final String TYPE = "type";
    public static final String URL = "url";
    private int browserType;
    private String browserUrl;

    public enum OPENTYPE {
        DEFAULT_TYPE,
        SHOUBAI_O2O_TYPE,
        INTERNAL_TYPE
    }

    public int getBrowserType() {
        return this.browserType;
    }

    public String getBrowserUrl() {
        return this.browserUrl;
    }

    public void setBrowserType(int i8) {
        this.browserType = i8;
    }

    public void setBrowserUrl(String str) {
        this.browserUrl = str;
    }
}
