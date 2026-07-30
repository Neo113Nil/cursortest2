package com.crrepa.ble.ota.goodix;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.c;
import com.crrepa.l.a;
import com.crrepa.m.b;
import com.crrepa.m.g;

/* loaded from: classes3.dex */
public class BleRestoreGattCallback extends BluetoothGattCallback {
    private CRPBleConnectionStateListener connectionStateListener;
    private g writeDescriptorProxy = new g();

    private void closeBluetoothGatt() {
        b.b(a.b().f());
        a.b().c(null);
    }

    private void connectionStateChange(int i8) {
        CRPBleConnectionStateListener cRPBleConnectionStateListener = this.connectionStateListener;
        if (cRPBleConnectionStateListener != null) {
            cRPBleConnectionStateListener.onConnectionStateChange(i8);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        BleRestoreChangedCharacteristicProxy.getInstance().onCharacteristicChanged(bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
        BleLog.i("Restore onCharacteristicWrite: " + c.c(bluetoothGattCharacteristic.getValue()));
        BleRestoreWriteCharacteristicProxy.getInstance().onCharacteristicWrite();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onConnectionStateChange(bluetoothGatt, i8, i9);
        BleLog.i("Restore BleGattCallback：onConnectionStateChange \nstatus: " + i8 + "\nnewState: " + i9);
        if (i9 == 2) {
            com.crrepa.q.c.c().a(bluetoothGatt);
        } else if (i9 == 0) {
            connectionStateChange(i9);
            closeBluetoothGatt();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @SuppressLint({"MissingPermission"})
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
        BleLog.i("Restore onDescriptorWrite: " + c.c(bluetoothGattDescriptor.getValue()));
        this.writeDescriptorProxy.a(bluetoothGattDescriptor.getCharacteristic());
        if (this.writeDescriptorProxy.a(bluetoothGatt)) {
            bluetoothGatt.requestMtu(250);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onMtuChanged(bluetoothGatt, i8, i9);
        BleRestoreWriteCharacteristicProxy.getInstance().setPackageLength(i8);
        connectionStateChange(2);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
        super.onServicesDiscovered(bluetoothGatt, i8);
        com.crrepa.q.c c8 = com.crrepa.q.c.c();
        if (c8.b(bluetoothGatt.getServices())) {
            this.writeDescriptorProxy.a(c8.d().getNotifyCharacteristicList());
            this.writeDescriptorProxy.a(bluetoothGatt);
        }
    }

    public void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.connectionStateListener = cRPBleConnectionStateListener;
        connectionStateChange(1);
    }
}
