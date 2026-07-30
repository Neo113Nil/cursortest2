package com.crrepa.d0;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;
import com.crrepa.ble.util.BleLog;

/* loaded from: classes3.dex */
public class d extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    private i f12355a = new i();

    /* renamed from: b, reason: collision with root package name */
    private com.crrepa.m.g f12356b = new com.crrepa.m.g();

    /* renamed from: c, reason: collision with root package name */
    private e f12357c = new e(this.f12355a);

    /* renamed from: d, reason: collision with root package name */
    private CRPBleConnectionStateListener f12358d;

    private void a() {
        com.crrepa.m.b.b(com.crrepa.l.a.b().d());
    }

    public i b() {
        return this.f12355a;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        BleLog.i("HS onCharacteristicChanged: " + com.crrepa.g1.c.c(bluetoothGattCharacteristic.getValue()));
        this.f12357c.a(bluetoothGattCharacteristic);
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
        a.d().f();
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i8, int i9) {
        super.onConnectionStateChange(bluetoothGatt, i8, i9);
        BleLog.i("HS BleGattCallback：onConnectionStateChange \nstatus: " + i8 + "\nnewState: " + i9);
        if (i9 == 2) {
            com.crrepa.q.c.c().a(bluetoothGatt);
        } else if (i9 == 0) {
            a(i9);
            a();
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i8);
        BleLog.i("HS onDescriptorWrite: " + com.crrepa.g1.c.c(bluetoothGattDescriptor.getValue()));
        this.f12356b.a(bluetoothGattDescriptor.getCharacteristic());
        if (this.f12356b.a(bluetoothGatt)) {
            a(2);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i8) {
        super.onServicesDiscovered(bluetoothGatt, i8);
        com.crrepa.q.c c8 = com.crrepa.q.c.c();
        if (c8.a(bluetoothGatt.getServices())) {
            this.f12356b.a(c8.b().a());
            this.f12356b.a(bluetoothGatt);
        }
    }

    private void a(int i8) {
        CRPBleConnectionStateListener cRPBleConnectionStateListener = this.f12358d;
        if (cRPBleConnectionStateListener != null) {
            cRPBleConnectionStateListener.onConnectionStateChange(i8);
        }
    }

    public void a(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.f12358d = cRPBleConnectionStateListener;
        a(1);
    }
}
