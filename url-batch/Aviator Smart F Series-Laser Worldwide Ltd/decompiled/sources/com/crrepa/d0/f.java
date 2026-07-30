package com.crrepa.d0;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private BluetoothGattCharacteristic f12360a;

    /* renamed from: b, reason: collision with root package name */
    private BluetoothGattCharacteristic f12361b;

    /* renamed from: c, reason: collision with root package name */
    private BluetoothGattCharacteristic f12362c;

    /* renamed from: d, reason: collision with root package name */
    private BluetoothGattCharacteristic f12363d;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothGattCharacteristic f12364e;

    /* renamed from: f, reason: collision with root package name */
    private BluetoothGattCharacteristic f12365f;

    public f(List<BluetoothGattService> list) {
        Iterator<BluetoothGattService> it = list.iterator();
        while (it.hasNext()) {
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : it.next().getCharacteristics()) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                BleLog.i("uuid: " + uuid.toString());
                if (a4.a.A.equals(uuid)) {
                    this.f12360a = bluetoothGattCharacteristic;
                } else if (a4.a.B.equals(uuid)) {
                    this.f12361b = bluetoothGattCharacteristic;
                } else if (a4.a.f101z.equals(uuid)) {
                    this.f12362c = bluetoothGattCharacteristic;
                } else if (a4.a.f92w.equals(uuid)) {
                    this.f12363d = bluetoothGattCharacteristic;
                } else if (a4.a.f95x.equals(uuid)) {
                    this.f12364e = bluetoothGattCharacteristic;
                } else if (a4.a.f98y.equals(uuid)) {
                    this.f12365f = bluetoothGattCharacteristic;
                }
            }
        }
    }

    public List<BluetoothGattCharacteristic> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f12360a);
        arrayList.add(this.f12361b);
        return arrayList;
    }

    public BluetoothGattCharacteristic b() {
        return this.f12360a;
    }

    public BluetoothGattCharacteristic c() {
        return this.f12361b;
    }

    public BluetoothGattCharacteristic d() {
        return this.f12362c;
    }

    public BluetoothGattCharacteristic e() {
        return this.f12363d;
    }

    public BluetoothGattCharacteristic f() {
        return this.f12364e;
    }

    public BluetoothGattCharacteristic g() {
        return this.f12365f;
    }

    public boolean h() {
        return (this.f12360a == null || this.f12361b == null || this.f12363d == null || this.f12364e == null) ? false : true;
    }
}
