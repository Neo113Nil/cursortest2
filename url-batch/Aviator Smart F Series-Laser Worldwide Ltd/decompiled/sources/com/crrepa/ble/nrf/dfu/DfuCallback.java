package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGattCallback;

/* loaded from: classes3.dex */
interface DfuCallback extends DfuController {

    public static class DfuGattCallback extends BluetoothGattCallback {
        public void onDisconnected() {
        }
    }

    DfuGattCallback getGattCallback();

    void onBondStateChanged(int i8);
}
