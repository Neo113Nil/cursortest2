package com.moyoung.classes;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ClassesLanguageBean implements Serializable {
    private static final long serialVersionUID = 1;
    private String code;
    private String translate;

    public ClassesLanguageBean(String str, String str2) {
        this.code = str;
        this.translate = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getTranslate() {
        return this.translate;
    }
}
