package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;

/* loaded from: classes3.dex */
public interface CRPWatchFaceStoreCallback {
    void onError(String str);

    void onWatchFaceStoreChange(CRPWatchFaceStoreInfo cRPWatchFaceStoreInfo);
}
