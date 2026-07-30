package com.moyoung.classes.meditation.model;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class OnlineClassShortBean implements Serializable {
    private final int duration;
    private final int id;
    private final String thumbUrl;
    private final String title;

    public OnlineClassShortBean(int i8, String str, int i9, String str2) {
        this.id = i8;
        this.title = str;
        this.duration = i9;
        this.thumbUrl = str2;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getId() {
        return this.id;
    }

    public String getThumbUrl() {
        return this.thumbUrl;
    }

    public String getTitle() {
        return this.title;
    }
}
