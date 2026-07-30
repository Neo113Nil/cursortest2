package com.crrepa.ble.ota.goodix;

import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;

/* loaded from: classes3.dex */
public interface BleRestoreConnection {
    void readBootInfo();

    void sendBootInfo(byte[] bArr);

    void sendStartInfo(byte[] bArr);

    void setBootInfoListener(BleBootInfoChangeListener bleBootInfoChangeListener);

    void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener);

    void shutdown();
}
