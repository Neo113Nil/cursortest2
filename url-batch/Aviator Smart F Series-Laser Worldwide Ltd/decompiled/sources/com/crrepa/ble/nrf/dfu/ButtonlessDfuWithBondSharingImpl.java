package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import java.util.UUID;

/* loaded from: classes3.dex */
class ButtonlessDfuWithBondSharingImpl extends ButtonlessDfuImpl {
    protected static UUID BUTTONLESS_DFU_SERVICE_UUID;
    protected static UUID BUTTONLESS_DFU_UUID;
    protected static final UUID DEFAULT_BUTTONLESS_DFU_SERVICE_UUID;
    protected static final UUID DEFAULT_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = SecureDfuImpl.DEFAULT_DFU_SERVICE_UUID;
        DEFAULT_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989228746813600L, -6937650605005804976L);
        DEFAULT_BUTTONLESS_DFU_UUID = uuid2;
        BUTTONLESS_DFU_SERVICE_UUID = uuid;
        BUTTONLESS_DFU_UUID = uuid2;
    }

    ButtonlessDfuWithBondSharingImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected int getResponseType() {
        return 2;
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(BUTTONLESS_DFU_UUID);
        this.mButtonlessDfuCharacteristic = characteristic;
        return characteristic != null;
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl, com.crrepa.ble.nrf.dfu.DfuService
    public void performDfu(Intent intent) {
        logi("Buttonless service with bond sharing found -> SDK 14 or newer");
        if (isBonded()) {
            super.performDfu(intent);
            return;
        }
        logw("Device is not paired, cancelling DFU");
        this.mService.sendLogBroadcast(15, "Device is not bonded");
        this.mService.terminateConnection(this.mGatt, 4110);
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected boolean shouldScanForBootloader() {
        return false;
    }
}
