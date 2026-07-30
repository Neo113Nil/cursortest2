package com.crrepa.band.my.device.ai.picture.model;

import com.crrepa.ble.conn.bean.CRPWatchFaceLayoutInfo;

/* loaded from: classes2.dex */
public class CRPWatchFaceLayoutInfoEvent {
    private final CRPWatchFaceLayoutInfo crpWatchFaceLayoutInfo;

    public CRPWatchFaceLayoutInfoEvent(CRPWatchFaceLayoutInfo cRPWatchFaceLayoutInfo) {
        this.crpWatchFaceLayoutInfo = cRPWatchFaceLayoutInfo;
    }

    public CRPWatchFaceLayoutInfo getCrpWatchFaceLayoutInfo() {
        return this.crpWatchFaceLayoutInfo;
    }
}
