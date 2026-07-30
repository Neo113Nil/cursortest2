package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class ExtendMenuModel {
    public static final int AD = 4;
    public static final int E_MAIL = 2;
    public static final int TEL = 3;
    public static final int WEBSITE = 1;
    private String content;
    private String default_text;
    private String icon;
    private String string_var;
    private int type;

    public ExtendMenuModel() {
    }

    public String getContent() {
        return this.content;
    }

    public String getDefault_text() {
        return this.default_text;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getString_var() {
        return this.string_var;
    }

    public int getType() {
        return this.type;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDefault_text(String str) {
        this.default_text = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setString_var(String str) {
        this.string_var = str;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public ExtendMenuModel(int i8, String str, String str2, String str3, String str4) {
        this.type = i8;
        this.default_text = str;
        this.string_var = str2;
        this.content = str3;
        this.icon = str4;
    }
}
