package com.realsil.sdk.core.bluetooth;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes4.dex */
public abstract class BluetoothProfileCallback {
    public void onA2dpPlayingStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onA2dpStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onHfpAudioStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onHfpConnectionStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onHidStateChanged(BluetoothDevice bluetoothDevice, int i8) {
    }

    public void onVendorSpecificHeadsetEvent(BluetoothDevice bluetoothDevice, String str, int i8, Object[] objArr) {
    }
}
