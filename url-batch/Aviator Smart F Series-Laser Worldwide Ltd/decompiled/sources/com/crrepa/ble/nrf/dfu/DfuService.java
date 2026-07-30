package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.content.Intent;
import java.io.InputStream;

/* loaded from: classes3.dex */
interface DfuService extends DfuCallback {
    boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i8, InputStream inputStream, InputStream inputStream2);

    boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt);

    void performDfu(Intent intent);

    void release();
}
