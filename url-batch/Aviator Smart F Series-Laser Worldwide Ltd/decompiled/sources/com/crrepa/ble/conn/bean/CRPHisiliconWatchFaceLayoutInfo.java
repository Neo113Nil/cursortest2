package com.crrepa.ble.conn.bean;

import androidx.annotation.ColorInt;
import com.crrepa.ble.conn.type.CRPWatchFaceType;

/* loaded from: classes3.dex */
public class CRPHisiliconWatchFaceLayoutInfo {

    @ColorInt
    private int textColor;
    private int timeBottomContent;
    private int timeTopContent;
    private CRPWatchFaceType watchFaceType;

    /* renamed from: x, reason: collision with root package name */
    private int f12284x;

    /* renamed from: y, reason: collision with root package name */
    private int f12285y;

    public int getTextColor() {
        return this.textColor;
    }

    public int getTimeBottomContent() {
        return this.timeBottomContent;
    }

    public int getTimeTopContent() {
        return this.timeTopContent;
    }

    public CRPWatchFaceType getWatchFaceType() {
        return this.watchFaceType;
    }

    public int getX() {
        return this.f12284x;
    }

    public int getY() {
        return this.f12285y;
    }

    public void setTextColor(int i8) {
        this.textColor = i8;
    }

    public void setTimeBottomContent(int i8) {
        this.timeBottomContent = i8;
    }

    public void setTimeTopContent(int i8) {
        this.timeTopContent = i8;
    }

    public void setWatchFaceType(CRPWatchFaceType cRPWatchFaceType) {
        this.watchFaceType = cRPWatchFaceType;
    }

    public void setX(int i8) {
        this.f12284x = i8;
    }

    public void setY(int i8) {
        this.f12285y = i8;
    }

    public String toString() {
        return "CRPHisiliconWatchFaceLayoutInfo{watchFaceType=" + this.watchFaceType + ", x=" + this.f12284x + ", y=" + this.f12285y + ", timeTopContent=" + this.timeTopContent + ", timeBottomContent=" + this.timeBottomContent + ", textColor=" + this.textColor + '}';
    }
}
