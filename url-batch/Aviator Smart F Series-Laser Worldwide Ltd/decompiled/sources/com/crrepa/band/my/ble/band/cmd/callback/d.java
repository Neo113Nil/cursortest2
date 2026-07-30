package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.device.setting.other.model.BandDisplayTimeChangeEvent;
import com.crrepa.band.my.model.band.provider.BandDisplayTimeProvider;
import com.crrepa.ble.conn.callback.CRPDeviceDisplayTimeCallback;

/* loaded from: classes2.dex */
public class d implements CRPDeviceDisplayTimeCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceDisplayTimeCallback
    public void onDisplayTime(int i8) {
        com.orhanobut.logger.f.d("onDisplayTime: " + i8);
        BandDisplayTimeProvider.saveDisplayTime(i8);
        org.greenrobot.eventbus.c.getDefault().post(new BandDisplayTimeChangeEvent(i8));
    }

    @Override // com.crrepa.ble.conn.callback.CRPDeviceDisplayTimeCallback
    public void onSupportAlwayOn(boolean z7) {
        com.orhanobut.logger.f.d("onSupportAlwayOn: " + z7);
        BandDisplayTimeProvider.saveAlwayOn(z7);
    }
}
