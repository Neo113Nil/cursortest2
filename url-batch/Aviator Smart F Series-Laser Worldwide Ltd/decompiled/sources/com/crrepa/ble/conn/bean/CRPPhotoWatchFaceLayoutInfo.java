package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPPhotoWatchFaceLayoutInfo {
    private CRPJieliWatchFaceLayoutInfo layoutInfo;
    private int maxAvailableSize;
    private int supportElementCount;
    private int supportPhotoCount;

    public CRPPhotoWatchFaceLayoutInfo(int i8, int i9, int i10, CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        this.maxAvailableSize = i8;
        this.supportPhotoCount = i9;
        this.supportElementCount = i10;
        this.layoutInfo = cRPJieliWatchFaceLayoutInfo;
    }

    public CRPJieliWatchFaceLayoutInfo getLayoutInfo() {
        return this.layoutInfo;
    }

    public int getMaxAvailableSize() {
        return this.maxAvailableSize;
    }

    public int getSupportElementCount() {
        return this.supportElementCount;
    }

    public int getSupportPhotoCount() {
        return this.supportPhotoCount;
    }

    public void setLayoutInfo(CRPJieliWatchFaceLayoutInfo cRPJieliWatchFaceLayoutInfo) {
        this.layoutInfo = cRPJieliWatchFaceLayoutInfo;
    }

    public void setMaxAvailableSize(int i8) {
        this.maxAvailableSize = i8;
    }

    public void setSupportElementCount(int i8) {
        this.supportElementCount = i8;
    }

    public void setSupportPhotoCount(int i8) {
        this.supportPhotoCount = i8;
    }

    public String toString() {
        return "CRPPhotoWatchFaceLayoutInfo{maxAvailableSize=" + this.maxAvailableSize + ", supportPhotoCount=" + this.supportPhotoCount + ", supportElementCount=" + this.supportElementCount + ", layoutInfo=" + this.layoutInfo + '}';
    }
}
