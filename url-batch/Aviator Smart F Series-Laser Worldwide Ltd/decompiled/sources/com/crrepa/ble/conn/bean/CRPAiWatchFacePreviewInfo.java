package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPAiWatchFacePreviewInfo {
    private int cornerRadius;
    private int height;
    private int width;

    public CRPAiWatchFacePreviewInfo(int i8, int i9, int i10) {
        this.width = i8;
        this.height = i9;
        this.cornerRadius = i10;
    }

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String toString() {
        return "CRPAiWatchFacePreviewInfo{width=" + this.width + ", height=" + this.height + ", cornerRadius=" + this.cornerRadius + '}';
    }
}
