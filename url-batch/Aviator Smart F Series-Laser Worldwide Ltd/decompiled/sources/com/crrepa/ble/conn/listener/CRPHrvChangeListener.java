package com.crrepa.ble.conn.listener;

import com.crrepa.ble.conn.bean.CRPHrvInfo;

/* loaded from: classes3.dex */
public interface CRPHrvChangeListener {
    void onHrvChange(CRPHrvInfo cRPHrvInfo);

    void onMeasureCount(int i8, int i9);

    void onMeasureInterval(int i8);

    void onMeasureResult(int i8, int i9, CRPHrvInfo cRPHrvInfo);

    void onRealRri(int i8, int i9);
}
