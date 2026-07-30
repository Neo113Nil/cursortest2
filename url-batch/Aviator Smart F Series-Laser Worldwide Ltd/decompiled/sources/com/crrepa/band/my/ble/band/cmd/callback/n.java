package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.band.provider.BandSosProvider;
import com.crrepa.ble.conn.callback.CRPSosStateCallback;

/* loaded from: classes2.dex */
public class n implements CRPSosStateCallback {
    @Override // com.crrepa.ble.conn.callback.CRPSosStateCallback
    public void onSosState(boolean z7) {
        com.orhanobut.logger.f.d("onSosState: " + z7);
        BandSosProvider.saveSosState(z7);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.setting.sos.a(z7));
    }
}
