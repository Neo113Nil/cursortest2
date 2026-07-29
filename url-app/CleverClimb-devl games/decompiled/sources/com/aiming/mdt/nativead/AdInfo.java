package com.aiming.mdt.nativead;

/* loaded from: classes.dex */
public class AdInfo {
    private String callToActionText;
    private String desc;
    private double starRating;
    private String title;
    private int type;

    public String getCallToActionText() {
        return this.callToActionText;
    }

    public String getDesc() {
        return this.desc;
    }

    public double getStarRating() {
        return this.starRating;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setCallToActionText(String str) {
        this.callToActionText = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setStarRating(double d2) {
        this.starRating = d2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
