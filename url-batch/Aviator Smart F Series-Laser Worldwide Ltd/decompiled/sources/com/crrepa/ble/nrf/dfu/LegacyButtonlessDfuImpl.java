package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.preference.PreferenceManager;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.DfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import java.util.UUID;

/* loaded from: classes3.dex */
class LegacyButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private int mVersion;
    protected static UUID DFU_SERVICE_UUID = LegacyDfuImpl.DEFAULT_DFU_SERVICE_UUID;
    protected static UUID DFU_CONTROL_POINT_UUID = LegacyDfuImpl.DEFAULT_DFU_CONTROL_POINT_UUID;
    protected static UUID DFU_VERSION_UUID = LegacyDfuImpl.DEFAULT_DFU_VERSION_UUID;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1, 4};

    LegacyButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private String getVersionFeatures(int i8) {
        return i8 != 0 ? i8 != 1 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? i8 != 8 ? "Unknown version" : "Bootloader from SDK 9.0 or newer. Signature supported" : "Bootloader from SDK 8.0 or newer. SHA-256 used instead of CRC-16 in the Init Packet" : "Bootloader from SDK 8.0 or newer. Bond sharing supported" : "Bootloader from SDK 7.0 or newer. No bond sharing" : "Application with Legacy buttonless update from SDK 7.0 or newer" : "Bootloader from SDK 6.1 or older";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[EDGE_INSN: B:21:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:13:0x0046->B:36:0x0063], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readVersion(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (bluetoothGattCharacteristic == null) {
            return 0;
        }
        this.mReceivedData = null;
        this.mError = 0;
        logi("Reading DFU version number...");
        this.mService.sendLogBroadcast(1, "Reading DFU version number...");
        bluetoothGattCharacteristic.setValue((byte[]) null);
        this.mService.sendLogBroadcast(0, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mRequestCompleted) {
                            if (bluetoothGattCharacteristic.getValue() == null) {
                            }
                            if (this.mPaused) {
                                break;
                            }
                            this.mRequestCompleted = false;
                            this.mLock.wait();
                        }
                        if (this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mRequestCompleted = false;
                            this.mLock.wait();
                        }
                        if (this.mPaused) {
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to read version number", this.mError);
        }
        if (this.mConnected) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        throw new DeviceDisconnectedException("Unable to read version number: device disconnected");
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        int i8;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID);
        this.mControlPointCharacteristic = characteristic;
        if (characteristic == null) {
            return false;
        }
        this.mProgressInfo.setProgress(-2);
        this.mService.waitFor(1000);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_VERSION_UUID);
        if (characteristic2 != null) {
            i8 = readVersion(bluetoothGatt, characteristic2);
            this.mVersion = i8;
            int i9 = i8 & 15;
            int i10 = i8 >> 8;
            logi("Version number read: " + i10 + "." + i9 + " -> " + getVersionFeatures(i8));
            DfuBaseService dfuBaseService = this.mService;
            StringBuilder sb = new StringBuilder();
            sb.append("Version number read: ");
            sb.append(i10);
            sb.append(".");
            sb.append(i9);
            dfuBaseService.sendLogBroadcast(10, sb.toString());
        } else {
            logi("No DFU Version characteristic found -> " + getVersionFeatures(0));
            this.mService.sendLogBroadcast(10, "DFU Version characteristic not found");
            i8 = 0;
        }
        boolean z7 = PreferenceManager.getDefaultSharedPreferences(this.mService).getBoolean(DfuSettingsConstants.SETTINGS_ASSUME_DFU_NODE, false);
        if (intent.hasExtra(DfuBaseService.EXTRA_FORCE_DFU)) {
            z7 = intent.getBooleanExtra(DfuBaseService.EXTRA_FORCE_DFU, false);
        }
        boolean z8 = bluetoothGatt.getServices().size() > 3;
        if (i8 == 0 && z8) {
            logi("Additional services found -> Bootloader from SDK 6.1. Updating SD and BL supported, extended init packet not supported");
        }
        return i8 == 1 || (!z7 && i8 == 0 && z8);
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public void performDfu(Intent intent) {
        logw("Application with legacy buttonless update found");
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        enableCCCD(this.mControlPointCharacteristic, 1);
        this.mService.sendLogBroadcast(10, "Notifications enabled");
        this.mService.waitFor(1000);
        this.mProgressInfo.setProgress(-3);
        logi("Sending Start DFU command (Op Code = 1, Upload Mode = 4)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
        this.mService.sendLogBroadcast(10, "Jump to bootloader sent (Op Code = 1, Upload Mode = 4)");
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        BluetoothGatt bluetoothGatt = this.mGatt;
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi("Starting service that will connect to the DFU bootloader");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, this.mVersion == 0);
    }
}
