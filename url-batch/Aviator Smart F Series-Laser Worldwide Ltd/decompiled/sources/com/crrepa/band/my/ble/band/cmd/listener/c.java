package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.model.band.provider.BandBatterySavingProvider;
import com.crrepa.ble.conn.listener.CRPBatterySavingChangeListener;

/* loaded from: classes2.dex */
public class c implements CRPBatterySavingChangeListener {
    @Override // com.crrepa.ble.conn.listener.CRPBatterySavingChangeListener
    public void onBatterSaving(boolean z7) {
        com.orhanobut.logger.f.d("onBatterSaving: " + z7);
        BandBatterySavingProvider.saveSupportBatterySaving(true);
        BandBatterySavingProvider.saveBatterySaving(z7);
        org.greenrobot.eventbus.c.getDefault().post(new l0.c(z7));
    }
}
