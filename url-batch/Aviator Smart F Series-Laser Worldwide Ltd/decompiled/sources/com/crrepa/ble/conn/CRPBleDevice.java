package com.crrepa.ble.conn;

import android.bluetooth.BluetoothDevice;
import com.crrepa.ble.ota.goodix.BleRestoreConnection;
import com.crrepa.d0.b;

/* loaded from: classes3.dex */
public interface CRPBleDevice {
    CRPBleConnection connect();

    b connectDfu();

    BleRestoreConnection connectRestore();

    void disconnect();

    BluetoothDevice getBluetoothDevice();

    String getMacAddress();

    String getName();

    boolean isConnected();
}
