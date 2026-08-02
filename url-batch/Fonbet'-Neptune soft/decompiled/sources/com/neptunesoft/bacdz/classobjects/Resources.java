package com.neptunesoft.bacdz.classobjects;

/* loaded from: classes4.dex */
public class Resources {
    private final String contentProvider;
    private final boolean dark;
    private final String link;
    private final String title;
    private final String type;

    public Resources(String title, String contentProvider, String link, String type, boolean dark) {
        this.title = title;
        this.contentProvider = contentProvider;
        this.link = link;
        this.type = type;
        this.dark = dark;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContentProvider() {
        return this.contentProvider;
    }

    public String getLink() {
        return this.link;
    }

    public String getType() {
        return this.type;
    }

    public boolean isDark() {
        return this.dark;
    }
}
