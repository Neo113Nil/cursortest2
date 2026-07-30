package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.model.band.provider.BandTapToWakeProvider;
import com.crrepa.ble.conn.callback.CRPTapToWakeCallback;

/* loaded from: classes2.dex */
public class o implements CRPTapToWakeCallback {
    @Override // com.crrepa.ble.conn.callback.CRPTapToWakeCallback
    public void onWakeState(boolean z7) {
        com.orhanobut.logger.f.d("onWakeState: " + z7);
        BandTapToWakeProvider.saveTapToWakeState(z7);
    }
}
