package com.crrepa.d0;

import android.bluetooth.BluetoothGattCharacteristic;
import com.crrepa.ble.util.BleLog;
import java.util.UUID;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private i f12359a;

    public e(i iVar) {
        this.f12359a = iVar;
    }

    public void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        BleLog.i("onCharacteristicChanged: " + uuid.toString());
        this.f12359a.a(bluetoothGattCharacteristic.getValue(), a4.a.A.equals(uuid) ? 1 : 2);
    }
}
