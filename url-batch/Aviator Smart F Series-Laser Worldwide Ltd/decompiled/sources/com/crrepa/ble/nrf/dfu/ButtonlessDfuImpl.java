package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.RemoteDfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.UnknownResponseException;

/* loaded from: classes3.dex */
abstract class ButtonlessDfuImpl extends BaseButtonlessDfuImpl {
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final int ERROR_OPERATION_FAILED = 4;
    private static final int ERROR_OP_CODE_NOT_SUPPORTED = 2;
    private static final byte[] OP_CODE_ENTER_BOOTLOADER = {1};
    private static final int OP_CODE_ENTER_BOOTLOADER_KEY = 1;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 32;

    ButtonlessDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
    }

    private int getStatusCode(byte[] bArr, int i8) {
        byte b8;
        if (bArr != null && bArr.length >= 3 && bArr[0] == 32 && bArr[1] == i8 && ((b8 = bArr[2]) == 1 || b8 == 2 || b8 == 4)) {
            return b8;
        }
        throw new UnknownResponseException("Invalid response received", bArr, 32, i8);
    }

    private static String parse(int i8) {
        int i9 = i8 & (-8193);
        if (i9 == 2) {
            return "REMOTE DFU OP CODE NOT SUPPORTED";
        }
        if (i9 == 4) {
            return "REMOTE DFU OPERATION FAILED";
        }
        return "UNKNOWN (" + i8 + ")";
    }

    protected abstract BluetoothGattCharacteristic getButtonlessDfuCharacteristic();

    protected abstract int getResponseType();

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public void performDfu(Intent intent) {
        DfuBaseService dfuBaseService;
        int i8;
        byte[] bArr;
        this.mProgressInfo.setProgress(-2);
        this.mService.waitFor(1000);
        BluetoothGatt bluetoothGatt = this.mGatt;
        this.mService.sendLogBroadcast(15, "Application with buttonless update found");
        this.mService.sendLogBroadcast(1, "Jumping to the DFU Bootloader...");
        BluetoothGattCharacteristic buttonlessDfuCharacteristic = getButtonlessDfuCharacteristic();
        int responseType = getResponseType();
        enableCCCD(buttonlessDfuCharacteristic, getResponseType());
        DfuBaseService dfuBaseService2 = this.mService;
        StringBuilder sb = new StringBuilder();
        sb.append(responseType == 2 ? "Indications" : "Notifications");
        sb.append(" enabled");
        dfuBaseService2.sendLogBroadcast(10, sb.toString());
        this.mService.waitFor(1000);
        try {
            this.mProgressInfo.setProgress(-3);
            logi("Sending Enter Bootloader (Op Code = 1)");
            writeOpCode(buttonlessDfuCharacteristic, OP_CODE_ENTER_BOOTLOADER, true);
            this.mService.sendLogBroadcast(10, "Enter bootloader sent (Op Code = 1)");
            try {
                bArr = readNotificationResponse();
            } catch (DeviceDisconnectedException unused) {
                bArr = this.mReceivedData;
            }
            if (bArr != null) {
                int statusCode = getStatusCode(bArr, 1);
                logi("Response received (Op Code = " + ((int) bArr[1]) + ", Status = " + statusCode + ")");
                this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) bArr[1]) + ", Status = " + statusCode + ")");
                if (statusCode != 1) {
                    throw new RemoteDfuException("Device returned error after sending Enter Bootloader", statusCode);
                }
                this.mService.waitUntilDisconnected();
            } else {
                logi("Device disconnected before receiving notification");
            }
            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
            finalize(intent, false, shouldScanForBootloader());
        } catch (RemoteDfuException e8) {
            i8 = e8.getErrorNumber() | 8192;
            loge(e8.getMessage());
            this.mService.sendLogBroadcast(20, String.format("Remote DFU error: %s", parse(i8)));
            dfuBaseService = this.mService;
            dfuBaseService.terminateConnection(bluetoothGatt, i8);
        } catch (UnknownResponseException e9) {
            loge(e9.getMessage());
            this.mService.sendLogBroadcast(20, e9.getMessage());
            dfuBaseService = this.mService;
            i8 = 4104;
            dfuBaseService.terminateConnection(bluetoothGatt, i8);
        }
    }

    protected abstract boolean shouldScanForBootloader();
}
