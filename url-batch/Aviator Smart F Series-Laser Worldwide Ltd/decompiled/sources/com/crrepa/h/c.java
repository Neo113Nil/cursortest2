package com.crrepa.h;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.conn.CRPBleDevice;
import com.crrepa.ble.ota.goodix.BleRestoreConnection;
import com.crrepa.ble.ota.goodix.BleRestoreGattCallback;

/* loaded from: classes3.dex */
public class c implements CRPBleDevice {

    /* renamed from: a, reason: collision with root package name */
    private BluetoothDevice f12942a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothManager f12943b;

    /* renamed from: c, reason: collision with root package name */
    private i0.a f12944c;

    /* renamed from: d, reason: collision with root package name */
    private d f12945d = new d();

    public c(Context context, BluetoothDevice bluetoothDevice, BluetoothManager bluetoothManager) {
        this.f12942a = bluetoothDevice;
        this.f12943b = bluetoothManager;
        this.f12944c = new b(context, bluetoothDevice);
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public CRPBleConnection connect() {
        com.crrepa.g1.d.a(this.f12942a.getAddress());
        return this.f12944c.a(this.f12945d);
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public com.crrepa.d0.b connectDfu() {
        return this.f12944c.a(new com.crrepa.d0.d());
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public BleRestoreConnection connectRestore() {
        return this.f12944c.a(new BleRestoreGattCallback());
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public void disconnect() {
        this.f12944c.disconnect();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f12942a.equals(((c) obj).getBluetoothDevice());
        }
        return false;
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public BluetoothDevice getBluetoothDevice() {
        return this.f12942a;
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    public String getMacAddress() {
        return this.f12942a.getAddress();
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    @SuppressLint({"MissingPermission"})
    public String getName() {
        return this.f12942a.getName();
    }

    public int hashCode() {
        return this.f12942a.hashCode();
    }

    @Override // com.crrepa.ble.conn.CRPBleDevice
    @SuppressLint({"MissingPermission"})
    public boolean isConnected() {
        return this.f12943b.getConnectionState(this.f12942a, 7) == 2;
    }
}
