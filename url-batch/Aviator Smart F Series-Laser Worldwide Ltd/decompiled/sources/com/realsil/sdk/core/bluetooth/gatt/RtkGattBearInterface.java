package com.realsil.sdk.core.bluetooth.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;

/* loaded from: classes4.dex */
public abstract class RtkGattBearInterface {
    public abstract BluetoothGatt connect(Context context, BluetoothDevice bluetoothDevice, boolean z7, int i8, int i9, BluetoothGattCallback bluetoothGattCallback);
}
