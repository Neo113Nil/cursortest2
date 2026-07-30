package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class UserInfoModel {
    private String content;
    private int name;
    private InfoType type;

    public enum InfoType {
        GENDER,
        BIRTHDAY,
        HEIGHT,
        WEIGHT,
        STEP_LENGTH
    }

    public String getContent() {
        return this.content;
    }

    public int getName() {
        return this.name;
    }

    public InfoType getType() {
        return this.type;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setName(int i8) {
        this.name = i8;
    }

    public void setType(InfoType infoType) {
        this.type = infoType;
    }
}
