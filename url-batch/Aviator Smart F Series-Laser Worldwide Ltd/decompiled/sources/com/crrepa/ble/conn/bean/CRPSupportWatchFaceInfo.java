package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPSupportWatchFaceInfo {
    public static final int DEFAULT_WATCH_FACE_ID = 65535;
    private int displayWatchFace;
    private List<Integer> supportWatchFaceList;

    public CRPSupportWatchFaceInfo(int i8, List<Integer> list) {
        this.displayWatchFace = i8;
        this.supportWatchFaceList = list;
    }

    public int getDisplayWatchFace() {
        return this.displayWatchFace;
    }

    public List<Integer> getSupportWatchFaceList() {
        return this.supportWatchFaceList;
    }

    public String toString() {
        return "CRPSupportWatchFaceInfo{displayWatchFace=" + this.displayWatchFace + ", supportWatchFaceList=" + this.supportWatchFaceList + '}';
    }
}
