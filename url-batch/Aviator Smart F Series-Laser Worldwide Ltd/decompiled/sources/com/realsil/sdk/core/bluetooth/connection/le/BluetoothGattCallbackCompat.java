package com.realsil.sdk.core.bluetooth.connection.le;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class BluetoothGattCallbackCompat {
    public void onCharacteristicChanged(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
    }

    public void onCharacteristicRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr, int i8) {
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
    }

    public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i8, int i9, int i10, int i11) {
    }

    public void onDescriptorRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i8, @NonNull byte[] bArr) {
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
    }

    public void onPhyRead(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
    }

    public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i8, int i9, int i10) {
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i8, int i9) {
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i8) {
    }

    public void onServiceChanged(@NonNull BluetoothGatt bluetoothGatt) {
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
    }
}
