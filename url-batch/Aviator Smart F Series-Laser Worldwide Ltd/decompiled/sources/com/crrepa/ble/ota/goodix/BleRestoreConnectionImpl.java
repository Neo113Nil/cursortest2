package com.crrepa.ble.ota.goodix;

import com.crrepa.ble.conn.listener.CRPBleConnectionStateListener;

/* loaded from: classes3.dex */
public class BleRestoreConnectionImpl implements BleRestoreConnection {
    private BleRestoreGattCallback gattCallback;

    public BleRestoreConnectionImpl(BleRestoreGattCallback bleRestoreGattCallback) {
        this.gattCallback = bleRestoreGattCallback;
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void readBootInfo() {
        BleRestoreChangedCharacteristicProxy.getInstance().setFlashIndex(0);
        BleRestoreWriteCharacteristicProxy.getInstance().insertBleMessage(BleRestoreWriteFormatter.getReadFlashCmd(0));
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void sendBootInfo(byte[] bArr) {
        BleRestoreWriteCharacteristicProxy.getInstance().insertBleMessage(BleRestoreWriteFormatter.getBootInfoCmd(bArr));
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void sendStartInfo(byte[] bArr) {
        BleRestoreWriteCharacteristicProxy.getInstance().insertBleMessage(BleRestoreWriteFormatter.getStartInfoCmd(bArr));
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void setBootInfoListener(BleBootInfoChangeListener bleBootInfoChangeListener) {
        BleRestoreChangedCharacteristicProxy.getInstance().setBootInfoListener(bleBootInfoChangeListener);
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void setConnectionStateListener(CRPBleConnectionStateListener cRPBleConnectionStateListener) {
        this.gattCallback.setConnectionStateListener(cRPBleConnectionStateListener);
    }

    @Override // com.crrepa.ble.ota.goodix.BleRestoreConnection
    public void shutdown() {
        BleRestoreWriteCharacteristicProxy.getInstance().insertBleMessage(BleRestoreWriteFormatter.getShutdownCmd());
    }
}
