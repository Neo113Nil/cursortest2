package com.realsil.sdk.core.bluetooth.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.os.Build;

/* loaded from: classes4.dex */
public final class RtkGattBearInterfaceImpl extends RtkGattBearInterface {
    @Override // com.realsil.sdk.core.bluetooth.gatt.RtkGattBearInterface
    public BluetoothGatt connect(Context context, BluetoothDevice bluetoothDevice, boolean z7, int i8, int i9, BluetoothGattCallback bluetoothGattCallback) {
        BluetoothGatt connectGatt;
        BluetoothGatt connectGatt2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            connectGatt2 = bluetoothDevice.connectGatt(context, z7, bluetoothGattCallback, i8, i9);
            return connectGatt2;
        }
        if (i10 < 23) {
            return bluetoothDevice.connectGatt(context, z7, bluetoothGattCallback);
        }
        connectGatt = bluetoothDevice.connectGatt(context, z7, bluetoothGattCallback, i8);
        return connectGatt;
    }
}
