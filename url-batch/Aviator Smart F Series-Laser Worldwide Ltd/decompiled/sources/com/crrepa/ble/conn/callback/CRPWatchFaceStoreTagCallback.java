package com.crrepa.ble.conn.callback;

import com.crrepa.ble.conn.bean.CRPWatchFaceStoreTagInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface CRPWatchFaceStoreTagCallback {
    void onError(String str);

    void onWatchFaceStoreTagChange(List<CRPWatchFaceStoreTagInfo> list);
}
