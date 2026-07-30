package com.crrepa.ble.ota.goodix;

import a4.a;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.crrepa.ble.util.BleLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class BleRestoreDeviceServices {
    private BluetoothGattCharacteristic notifyCharacteristic;
    private BluetoothGattCharacteristic writeCharacteristic;

    public BleRestoreDeviceServices(List<BluetoothGattService> list) {
        Iterator<BluetoothGattService> it = list.iterator();
        while (it.hasNext()) {
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : it.next().getCharacteristics()) {
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                BleLog.i("uuid: " + uuid.toString());
                if (a.C.equals(uuid)) {
                    this.notifyCharacteristic = bluetoothGattCharacteristic;
                } else if (a.D.equals(uuid)) {
                    this.writeCharacteristic = bluetoothGattCharacteristic;
                }
            }
        }
    }

    public BluetoothGattCharacteristic getNotifyCharacteristic() {
        return this.notifyCharacteristic;
    }

    public List<BluetoothGattCharacteristic> getNotifyCharacteristicList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.notifyCharacteristic);
        return arrayList;
    }

    public BluetoothGattCharacteristic getWriteCharacteristic() {
        return this.writeCharacteristic;
    }

    public boolean isOrderly() {
        return (this.notifyCharacteristic == null || this.writeCharacteristic == null) ? false : true;
    }
}
