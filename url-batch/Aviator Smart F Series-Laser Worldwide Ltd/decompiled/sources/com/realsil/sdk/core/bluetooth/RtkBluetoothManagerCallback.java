package com.realsil.sdk.core.bluetooth;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes4.dex */
public abstract class RtkBluetoothManagerCallback {
    public void onAclConnectionStateChanged(BluetoothDevice bluetoothDevice, boolean z7) {
    }

    public void onBleAclConnectionStateChanged(BluetoothDevice bluetoothDevice, boolean z7) {
    }

    public void onBluetoothStateChanged(int i8) {
    }

    public void onBondStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onPairingRequestNotify(BluetoothDevice bluetoothDevice, int i8) {
    }
}
