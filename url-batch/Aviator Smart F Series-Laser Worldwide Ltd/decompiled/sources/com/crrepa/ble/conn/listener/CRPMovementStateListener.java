package com.crrepa.ble.conn.listener;

/* loaded from: classes3.dex */
public interface CRPMovementStateListener {
    void onMeasureState(int i8);

    void onMeasuring(int i8);

    void onStartFailed();

    void onStartSuccess(int i8);
}
