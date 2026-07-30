package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPLocalVideoInfo;

/* loaded from: classes3.dex */
public interface CRPLocalVideoChangeListener {
    void onLocalVideoDeleted(boolean z7);

    void onLocalVideoInfo(CRPLocalVideoInfo cRPLocalVideoInfo);
}
