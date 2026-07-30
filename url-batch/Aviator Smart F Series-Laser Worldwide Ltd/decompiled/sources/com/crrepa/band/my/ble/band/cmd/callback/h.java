package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.crrepa.band.my.model.db.proxy.HeartRateWarningDaoProxy;
import com.crrepa.band.my.model.user.provider.HeartRateWarningProvider;
import com.crrepa.ble.conn.callback.CRPDeviceMaxHeartRateCallback;

/* loaded from: classes2.dex */
public class h implements CRPDeviceMaxHeartRateCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceMaxHeartRateCallback
    public void onHeartRate(int i8, boolean z7) {
        com.orhanobut.logger.f.d("warning hr enable: " + z7);
        if (i8 < HeartRateWarningProvider.getMinHr()) {
            i8 = HeartRateWarningProvider.getWarningMaxHeartRate();
            i4.getInstance().sendHeartRateWarning((byte) i8, z7);
        }
        com.orhanobut.logger.f.d("warning hr: " + i8);
        HeartRateWarningDaoProxy heartRateWarningDaoProxy = new HeartRateWarningDaoProxy();
        HeartRateWarning heartRateWarning = heartRateWarningDaoProxy.get();
        if (heartRateWarning == null) {
            heartRateWarning = new HeartRateWarning();
            heartRateWarning.setId(1L);
        }
        heartRateWarning.setEnable(Boolean.valueOf(z7));
        heartRateWarning.setHr(Integer.valueOf(i8));
        heartRateWarningDaoProxy.insert(heartRateWarning);
    }
}
