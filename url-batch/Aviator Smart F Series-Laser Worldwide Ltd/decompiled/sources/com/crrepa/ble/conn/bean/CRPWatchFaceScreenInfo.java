package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWatchFaceScreenInfo {
    private int cornerRadius;
    private int height;
    private int thumbCornerRadius;
    private int thumbHeight;
    private int thumbWidth;
    private int width;

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    public int getHeight() {
        return this.height;
    }

    public int getThumbCornerRadius() {
        return this.thumbCornerRadius;
    }

    public int getThumbHeight() {
        return this.thumbHeight;
    }

    public int getThumbWidth() {
        return this.thumbWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public void setCornerRadius(int i8) {
        this.cornerRadius = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setThumbCornerRadius(int i8) {
        this.thumbCornerRadius = i8;
    }

    public void setThumbHeight(int i8) {
        this.thumbHeight = i8;
    }

    public void setThumbWidth(int i8) {
        this.thumbWidth = i8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPWatchFaceScreenInfo{width=" + this.width + ", height=" + this.height + ", cornerRadius=" + this.cornerRadius + ", thumbWidth=" + this.thumbWidth + ", thumbHeight=" + this.thumbHeight + ", thumbCornerRadius=" + this.thumbCornerRadius + '}';
    }
}
