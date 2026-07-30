package com.crrepa.band.my.ble.band.cmd.callback;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.callback.CRPDeviceTestModeCallback;

/* loaded from: classes2.dex */
public class p implements CRPDeviceTestModeCallback {
    @Override // com.crrepa.ble.conn.callback.CRPDeviceTestModeCallback
    public void onTestMode(boolean z7) {
        if (z7) {
            i4.getInstance().sendUserMode();
        }
    }
}
