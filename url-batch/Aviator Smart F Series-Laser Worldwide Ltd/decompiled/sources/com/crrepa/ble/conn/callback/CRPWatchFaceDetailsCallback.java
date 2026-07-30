package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPWatchFaceDetailsInfo;
import com.crrepa.ble.conn.bean.CRPWatchFaceStoreInfo;

/* loaded from: classes3.dex */
public interface CRPWatchFaceDetailsCallback {
    void onError(String str);

    void onNewWatchFaceChange(CRPWatchFaceDetailsInfo cRPWatchFaceDetailsInfo);

    void onWatchFaceChange(CRPWatchFaceStoreInfo.WatchFaceBean watchFaceBean);
}
