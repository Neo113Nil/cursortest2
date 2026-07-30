package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPWatchFaceType;

/* loaded from: classes3.dex */
public class CRPWatchFaceElementInfo {
    private int dateHeight;
    private int dateWidth;
    private int timeHeight;
    private int timeWidth;
    private CRPWatchFaceType watchFaceType;

    public int getDateHeight() {
        return this.dateHeight;
    }

    public int getDateWidth() {
        return this.dateWidth;
    }

    public int getTimeHeight() {
        return this.timeHeight;
    }

    public int getTimeWidth() {
        return this.timeWidth;
    }

    public CRPWatchFaceType getWatchFaceType() {
        return this.watchFaceType;
    }

    public void setDateHeight(int i8) {
        this.dateHeight = i8;
    }

    public void setDateWidth(int i8) {
        this.dateWidth = i8;
    }

    public void setTimeHeight(int i8) {
        this.timeHeight = i8;
    }

    public void setTimeWidth(int i8) {
        this.timeWidth = i8;
    }

    public void setWatchFaceType(CRPWatchFaceType cRPWatchFaceType) {
        this.watchFaceType = cRPWatchFaceType;
    }

    public String toString() {
        return "CRPWatchFaceElementInfo{watchFaceType=" + this.watchFaceType + ", timeWidth=" + this.timeWidth + ", timeHeight=" + this.timeHeight + ", dateWidth=" + this.dateWidth + ", dateHeight=" + this.dateHeight + '}';
    }
}
