package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.health.heartrate.model.BandTimingHeartRateStateChangeEvent;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.ble.conn.callback.CRPDeviceTimingMeasureHeartRateCallback;

/* loaded from: classes2.dex */
public class q implements CRPDeviceTimingMeasureHeartRateCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceTimingMeasureHeartRateCallback
    public void onTimingMeasure(int i8) {
        com.orhanobut.logger.f.d("onTimingMeasure: " + i8);
        if (!BandTimingHeartRateProvider.isValid(i8)) {
            com.crrepa.band.my.ble.band.cmd.d.getInstance().sendTimingHeartRateInterval(0);
            i8 = 0;
        }
        BandTimingHeartRateProvider.saveTimingHeartRateInterval(i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandTimingHeartRateStateChangeEvent(i8));
    }
}
