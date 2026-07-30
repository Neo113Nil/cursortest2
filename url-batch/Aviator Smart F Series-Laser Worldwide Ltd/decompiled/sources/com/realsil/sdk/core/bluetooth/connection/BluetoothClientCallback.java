package com.realsil.sdk.core.bluetooth.connection;

/* loaded from: classes4.dex */
public abstract class BluetoothClientCallback {
    public static final int ABORTED = 1;
    public static final int FAILURE = 2;
    public static final int SUCCESS = 0;

    public void onConnectionStateChanged(BluetoothClient bluetoothClient, int i8, int i9) {
        onConnectionStateChanged(bluetoothClient, i9 == 0, i8);
    }

    public void onDataReceive(BluetoothClient bluetoothClient, byte[] bArr) {
    }

    @Deprecated
    public void onError(int i8) {
    }

    @Deprecated
    public void onConnectionStateChanged(BluetoothClient bluetoothClient, boolean z7, int i8) {
    }
}
