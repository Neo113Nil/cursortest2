package com.neptunesoft.bacdz.classobjects;

/* loaded from: classes4.dex */
public class Topics {
    private final int icon;
    private final String information;
    private final String module;

    public Topics(String module, String information, int icon) {
        this.module = module;
        this.information = information;
        this.icon = icon;
    }

    public String getModule() {
        return this.module;
    }

    public String getInformation() {
        return this.information;
    }

    public int getIcon() {
        return this.icon;
    }
}
