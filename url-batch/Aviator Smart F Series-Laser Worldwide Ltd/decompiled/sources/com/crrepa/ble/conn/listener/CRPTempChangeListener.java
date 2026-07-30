package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPTempInfo;

/* loaded from: classes3.dex */
public interface CRPTempChangeListener {
    void onContinueState(boolean z7);

    void onContinueTemp(CRPTempInfo cRPTempInfo);

    void onMeasureState(boolean z7);

    void onMeasureTemp(float f8);
}
