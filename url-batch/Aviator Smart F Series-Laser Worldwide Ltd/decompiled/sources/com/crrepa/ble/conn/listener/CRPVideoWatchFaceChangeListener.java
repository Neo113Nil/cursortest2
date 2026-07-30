package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.type.CRPVideoWatchFaceDisplayMode;

/* loaded from: classes3.dex */
public interface CRPVideoWatchFaceChangeListener {
    void onAvailableSize(int i8);

    void onDisplayMode(CRPVideoWatchFaceDisplayMode cRPVideoWatchFaceDisplayMode);

    void onSavedWatchFace(String str);
}
