package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.training.model.BandTrainingStartedChangeEvent;
import com.crrepa.band.my.training.model.BandTrainingStateChangeEvent;
import com.crrepa.ble.conn.listener.CRPMovementStateListener;

/* loaded from: classes2.dex */
public class j implements CRPMovementStateListener {
    @Override // com.crrepa.ble.conn.listener.CRPMovementStateListener
    public void onMeasureState(int i8) {
        com.orhanobut.logger.f.d("BandMovementStateListener onMeasureState: " + i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandTrainingStateChangeEvent((byte) i8));
    }

    @Override // com.crrepa.ble.conn.listener.CRPMovementStateListener
    public void onMeasuring(int i8) {
        org.greenrobot.eventbus.c.getDefault().post(new BandTrainingStartedChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPMovementStateListener
    public void onStartFailed() {
    }

    @Override // com.crrepa.ble.conn.listener.CRPMovementStateListener
    public void onStartSuccess(int i8) {
    }
}
