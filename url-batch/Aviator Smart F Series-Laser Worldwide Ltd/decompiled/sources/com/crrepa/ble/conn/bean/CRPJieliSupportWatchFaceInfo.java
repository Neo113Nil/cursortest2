package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPJieliSupportWatchFaceInfo {
    private int displayWatchFace;
    private List<Integer> supportTypeList;
    private int watchFaceMaxSize;

    public CRPJieliSupportWatchFaceInfo(int i8, int i9, List<Integer> list) {
        this.displayWatchFace = i8;
        this.watchFaceMaxSize = i9;
        this.supportTypeList = list;
    }

    public int getDisplayWatchFace() {
        return this.displayWatchFace;
    }

    public List<Integer> getSupportTypeList() {
        return this.supportTypeList;
    }

    public int getWatchFaceMaxSize() {
        return this.watchFaceMaxSize;
    }

    public void setDisplayWatchFace(int i8) {
        this.displayWatchFace = i8;
    }

    public void setSupportTypeList(List<Integer> list) {
        this.supportTypeList = list;
    }

    public void setWatchFaceMaxSize(int i8) {
        this.watchFaceMaxSize = i8;
    }

    public String toString() {
        return "CRPJieliSupportWatchFaceInfo{displayWatchFace=" + this.displayWatchFace + ", watchFaceMaxSize=" + this.watchFaceMaxSize + ", supportTypeList=" + this.supportTypeList + '}';
    }
}
