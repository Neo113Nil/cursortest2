package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import java.util.UUID;

/* loaded from: classes3.dex */
class ExperimentalButtonlessDfuImpl extends ButtonlessDfuImpl {
    protected static final UUID DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
    protected static final UUID DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID;
    protected static UUID EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID;
    protected static UUID EXPERIMENTAL_BUTTONLESS_DFU_UUID;
    private BluetoothGattCharacteristic mButtonlessDfuCharacteristic;

    static {
        UUID uuid = new UUID(-8196551313441075360L, -6937650605005804976L);
        DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8196551313441075360L, -6937650605005804976L);
        DEFAULT_EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
        EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID = uuid;
        EXPERIMENTAL_BUTTONLESS_DFU_UUID = uuid2;
    }

    ExperimentalButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected BluetoothGattCharacteristic getButtonlessDfuCharacteristic() {
        return this.mButtonlessDfuCharacteristic;
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected int getResponseType() {
        return 1;
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(EXPERIMENTAL_BUTTONLESS_DFU_SERVICE_UUID);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(EXPERIMENTAL_BUTTONLESS_DFU_UUID);
        this.mButtonlessDfuCharacteristic = characteristic;
        return characteristic != null;
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl, com.crrepa.ble.nrf.dfu.DfuService
    public void performDfu(Intent intent) {
        logi("Experimental buttonless service found -> SDK 12.x");
        super.performDfu(intent);
    }

    @Override // com.crrepa.ble.nrf.dfu.ButtonlessDfuImpl
    protected boolean shouldScanForBootloader() {
        return true;
    }
}
