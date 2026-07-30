package com.crrepa.band.my.device.ai.picture.model;

import com.crrepa.ble.conn.bean.CRPPhotoWatchFaceLayoutInfo;

/* loaded from: classes2.dex */
public class CRPJieliWatchFaceLayoutInfoEvent {
    private final CRPPhotoWatchFaceLayoutInfo crpWatchFaceLayoutInfo;

    public CRPJieliWatchFaceLayoutInfoEvent(CRPPhotoWatchFaceLayoutInfo cRPPhotoWatchFaceLayoutInfo) {
        this.crpWatchFaceLayoutInfo = cRPPhotoWatchFaceLayoutInfo;
    }

    public CRPPhotoWatchFaceLayoutInfo getCrpWatchFaceLayoutInfo() {
        return this.crpWatchFaceLayoutInfo;
    }
}
