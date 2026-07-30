package com.crrepa.h;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.os.Build;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.ota.goodix.BleRestoreConnection;
import com.crrepa.ble.ota.goodix.BleRestoreConnectionImpl;
import com.crrepa.ble.ota.goodix.BleRestoreGattCallback;

/* loaded from: classes3.dex */
public class b implements i0.a {

    /* renamed from: a, reason: collision with root package name */
    private Context f12939a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothDevice f12940b;

    /* renamed from: c, reason: collision with root package name */
    private a f12941c = new a();

    public b(Context context, BluetoothDevice bluetoothDevice) {
        this.f12939a = context;
        this.f12940b = bluetoothDevice;
    }

    private BluetoothGatt a(BluetoothGattCallback bluetoothGattCallback) {
        BluetoothGatt connectGatt;
        if (Build.VERSION.SDK_INT < 23) {
            return this.f12940b.connectGatt(this.f12939a, false, bluetoothGattCallback);
        }
        connectGatt = this.f12940b.connectGatt(this.f12939a, false, bluetoothGattCallback, 2);
        return connectGatt;
    }

    @Override // i0.a
    public void disconnect() {
        com.crrepa.m.c.a();
    }

    @Override // i0.a
    public CRPBleConnection a(d dVar) {
        com.crrepa.l.a.b().a(a((BluetoothGattCallback) dVar));
        this.f12941c.a(dVar);
        return this.f12941c;
    }

    @Override // i0.a
    public BleRestoreConnection a(BleRestoreGattCallback bleRestoreGattCallback) {
        com.crrepa.l.a.b().c(a((BluetoothGattCallback) bleRestoreGattCallback));
        return new BleRestoreConnectionImpl(bleRestoreGattCallback);
    }

    @Override // i0.a
    public com.crrepa.d0.b a(com.crrepa.d0.d dVar) {
        com.crrepa.l.a.b().b(a((BluetoothGattCallback) dVar));
        return new com.crrepa.d0.c(dVar);
    }
}
