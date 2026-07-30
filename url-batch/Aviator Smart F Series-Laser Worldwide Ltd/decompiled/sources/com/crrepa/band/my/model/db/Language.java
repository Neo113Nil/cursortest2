package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class Language {
    private Long cmd;
    private String code;
    private String languageText;

    public Language(String str, String str2, Long l8) {
        this.code = str;
        this.languageText = str2;
        this.cmd = l8;
    }

    public Long getCmd() {
        return this.cmd;
    }

    public String getCode() {
        return this.code;
    }

    public String getLanguageText() {
        return this.languageText;
    }

    public void setCmd(Long l8) {
        this.cmd = l8;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setLanguageText(String str) {
        this.languageText = str;
    }

    public Language() {
    }
}
