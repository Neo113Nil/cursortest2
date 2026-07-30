package com.crrepa.band.my.device.ai.picture.model;

import com.crrepa.ble.conn.bean.CRPAiWatchFacePreviewInfo;

/* loaded from: classes2.dex */
public class RequestPreviewEvent {
    private final CRPAiWatchFacePreviewInfo watchFacePreviewInfo;

    public RequestPreviewEvent(CRPAiWatchFacePreviewInfo cRPAiWatchFacePreviewInfo) {
        this.watchFacePreviewInfo = cRPAiWatchFacePreviewInfo;
    }

    public CRPAiWatchFacePreviewInfo getWatchFacePreviewInfo() {
        return this.watchFacePreviewInfo;
    }
}
