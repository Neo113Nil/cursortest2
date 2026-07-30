package com.crrepa.m;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.crrepa.ble.util.BleLog;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g extends c {

    /* renamed from: a, reason: collision with root package name */
    private List<BluetoothGattCharacteristic> f13355a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13356b = false;

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        List<BluetoothGattCharacteristic> list = this.f13355a;
        if (list != null) {
            list.remove(bluetoothGattCharacteristic);
        }
    }

    public boolean c() {
        return this.f13356b;
    }

    public void a(List<BluetoothGattCharacteristic> list) {
        this.f13355a = list;
        list.removeAll(Collections.singleton(null));
        this.f13356b = false;
    }

    public void a(boolean z7) {
        this.f13356b = z7;
    }

    public boolean a(BluetoothGatt bluetoothGatt) {
        if (!this.f13355a.isEmpty()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f13355a.get(0);
            BleLog.d("enableNotifyCharacteristic: " + bluetoothGattCharacteristic.getUuid());
            if (!a(bluetoothGatt, bluetoothGattCharacteristic)) {
                return false;
            }
        }
        return this.f13355a.isEmpty();
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor descriptor;
        boolean z7 = false;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && (bluetoothGattCharacteristic.getProperties() | 16) > 0) {
            if (bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true) && (descriptor = bluetoothGattCharacteristic.getDescriptor(a4.a.f86u)) != null) {
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                z7 = bluetoothGatt.writeDescriptor(descriptor);
            }
            if (!z7) {
                c.a();
            }
        }
        return z7;
    }
}
