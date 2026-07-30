package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl;
import com.crrepa.ble.nrf.dfu.internal.ArchiveInputStream;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.DfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.RemoteDfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.UnknownResponseException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import com.crrepa.ble.nrf.error.LegacyDfuError;
import java.io.InputStream;
import java.util.UUID;

/* loaded from: classes3.dex */
class LegacyDfuImpl extends BaseCustomDfuImpl {
    protected static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    protected static final UUID DEFAULT_DFU_PACKET_UUID;
    protected static final UUID DEFAULT_DFU_SERVICE_UUID;
    protected static final UUID DEFAULT_DFU_VERSION_UUID;
    protected static UUID DFU_CONTROL_POINT_UUID = null;
    protected static UUID DFU_PACKET_UUID = null;
    protected static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    protected static UUID DFU_VERSION_UUID = null;
    private static final byte[] OP_CODE_ACTIVATE_AND_RESET;
    private static final int OP_CODE_ACTIVATE_AND_RESET_KEY = 5;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_COMPLETE;
    private static final int OP_CODE_INIT_DFU_PARAMS_KEY = 2;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_START;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_KEY = 17;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 8;
    private static final byte[] OP_CODE_RECEIVE_FIRMWARE_IMAGE;
    private static final int OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY = 3;
    private static final byte[] OP_CODE_RESET;
    private static final int OP_CODE_RESET_KEY = 6;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 16;
    private static final byte[] OP_CODE_START_DFU;
    private static final int OP_CODE_START_DFU_KEY = 1;
    private static final byte[] OP_CODE_VALIDATE;
    private static final int OP_CODE_VALIDATE_KEY = 4;
    private final LegacyBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private boolean mImageSizeInProgress;
    private BluetoothGattCharacteristic mPacketCharacteristic;

    protected class LegacyBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        protected LegacyBluetoothCallback() {
            super();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() == 17) {
                LegacyDfuImpl.this.mProgressInfo.setBytesReceived(bluetoothGattCharacteristic.getIntValue(20, 1).intValue());
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
            } else if (!LegacyDfuImpl.this.mRemoteErrorOccurred) {
                if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                    LegacyDfuImpl.this.mRemoteErrorOccurred = true;
                }
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
            }
            LegacyDfuImpl.this.notifyLock();
        }

        @Override // com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl.BaseCustomBluetoothCallback
        protected void onPacketCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            if (LegacyDfuImpl.this.mImageSizeInProgress) {
                LegacyDfuImpl.this.mService.sendLogBroadcast(5, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
                LegacyDfuImpl.this.mImageSizeInProgress = false;
            }
        }
    }

    static {
        UUID uuid = new UUID(23296205844446L, 1523193452336828707L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(23300500811742L, 1523193452336828707L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(23304795779038L, 1523193452336828707L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        UUID uuid4 = new UUID(23313385713630L, 1523193452336828707L);
        DEFAULT_DFU_VERSION_UUID = uuid4;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        DFU_VERSION_UUID = uuid4;
        OP_CODE_START_DFU = new byte[]{1, 0};
        OP_CODE_INIT_DFU_PARAMS = new byte[]{2};
        OP_CODE_INIT_DFU_PARAMS_START = new byte[]{2, 0};
        OP_CODE_INIT_DFU_PARAMS_COMPLETE = new byte[]{2, 1};
        OP_CODE_RECEIVE_FIRMWARE_IMAGE = new byte[]{3};
        OP_CODE_VALIDATE = new byte[]{4};
        OP_CODE_ACTIVATE_AND_RESET = new byte[]{5};
        OP_CODE_RESET = new byte[]{6};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{8, 0, 0};
    }

    LegacyDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new LegacyBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i8) {
        byte b8;
        if (bArr == null || bArr.length != 3 || bArr[0] != 16 || bArr[1] != i8 || (b8 = bArr[2]) < 1 || b8 > 6) {
            throw new UnknownResponseException("Invalid response received", bArr, 16, i8);
        }
        return b8;
    }

    private int readVersion(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        return 0;
    }

    private void resetAndRestart(BluetoothGatt bluetoothGatt, Intent intent) {
        this.mService.sendLogBroadcast(15, "Last upload interrupted. Restarting device...");
        this.mProgressInfo.setProgress(-5);
        logi("Sending Reset command (Op Code = 6)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
        this.mService.sendLogBroadcast(10, "Reset request sent");
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi("Restarting the service");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, false);
    }

    private void setNumberOfPackets(byte[] bArr, int i8) {
        bArr[1] = (byte) (i8 & 255);
        bArr[2] = (byte) ((i8 >> 8) & 255);
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(new byte[4]);
        bluetoothGattCharacteristic.setValue(i8, 20, 0);
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid());
        this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mImageSizeInProgress && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        } else {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to write Image Size", this.mError);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Image Size: device disconnected");
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        byte b8 = bArr[0];
        writeOpCode(bluetoothGattCharacteristic, bArr, b8 == 6 || b8 == 5);
    }

    @Override // com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl
    protected UUID getControlPointCharacteristicUUID() {
        return DFU_CONTROL_POINT_UUID;
    }

    @Override // com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl
    protected UUID getDfuServiceUUID() {
        return DFU_SERVICE_UUID;
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuCallback
    public BaseCustomDfuImpl.BaseCustomBluetoothCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    @Override // com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl
    protected UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null) {
            return false;
        }
        this.mControlPointCharacteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID);
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(DFU_PACKET_UUID);
        this.mPacketCharacteristic = characteristic;
        return (this.mControlPointCharacteristic == null || characteristic == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0677 A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x068d A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TRY_LEAVE, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03f7 A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ab A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04bb A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0587 A[Catch: UnknownResponseException -> 0x01dc, UploadAbortedException -> 0x01e4, RemoteDfuException -> 0x03eb, TryCatch #3 {UnknownResponseException -> 0x01dc, blocks: (B:43:0x01d8, B:49:0x021f, B:58:0x022f, B:61:0x025b, B:115:0x0316, B:67:0x03f3, B:69:0x03f7, B:71:0x0402, B:72:0x0472, B:75:0x04a1, B:76:0x04a8, B:77:0x0445, B:79:0x04ab, B:86:0x04bb, B:87:0x04f7, B:89:0x0516, B:90:0x0529, B:92:0x0587, B:94:0x063b, B:97:0x066a, B:100:0x066f, B:101:0x0676, B:102:0x0677, B:103:0x067e, B:106:0x0680, B:107:0x0686, B:108:0x04b7, B:109:0x0327, B:111:0x032b, B:112:0x032e, B:121:0x033f, B:125:0x0349, B:127:0x03e7, B:132:0x0687, B:133:0x068c, B:135:0x068d, B:148:0x033a, B:156:0x01fa, B:159:0x01fe, B:160:0x0201), top: B:31:0x011c }] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.crrepa.ble.nrf.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void performDfu(Intent intent) {
        String str;
        String str2;
        UploadAbortedException uploadAbortedException;
        String str3;
        String str4;
        BluetoothGatt bluetoothGatt;
        UnknownResponseException unknownResponseException;
        String str5;
        String str6;
        BluetoothGatt bluetoothGatt2;
        int i8;
        BluetoothGatt bluetoothGatt3;
        DfuBaseService dfuBaseService;
        BluetoothGatt bluetoothGatt4;
        RemoteDfuException remoteDfuException;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        BluetoothGatt bluetoothGatt5;
        String str7;
        RemoteDfuException remoteDfuException2;
        boolean z7;
        String str8;
        int i15;
        int statusCode;
        int i16;
        String str9;
        ?? r52;
        RemoteDfuException remoteDfuException3;
        String str10;
        String str11;
        int statusCode2;
        byte[] bArr;
        int statusCode3;
        Intent intent2 = intent;
        ?? r62 = "b)";
        logw("Legacy DFU bootloader found");
        this.mProgressInfo.setProgress(-2);
        this.mService.waitFor(1000);
        BluetoothGatt bluetoothGatt6 = this.mGatt;
        int readVersion = readVersion(bluetoothGatt6.getService(DFU_SERVICE_UUID).getCharacteristic(DFU_VERSION_UUID));
        if (readVersion >= 5 && this.mInitPacketStream == null) {
            logw("Init packet not set for the DFU Bootloader version " + readVersion);
            this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
            this.mService.terminateConnection(bluetoothGatt6, 4107);
            return;
        }
        try {
            try {
                try {
                    enableCCCD(this.mControlPointCharacteristic, 1);
                    this.mService.sendLogBroadcast(10, "Notifications enabled");
                    this.mService.waitFor(1000);
                    int i17 = this.mFileType;
                    if ((i17 & 1) > 0) {
                        try {
                            i9 = this.mImageSizeInBytes;
                        } catch (RemoteDfuException e8) {
                            remoteDfuException = e8;
                            str5 = "Reset request sent";
                            str6 = "Sending Reset command (Op Code = 6)";
                            bluetoothGatt4 = bluetoothGatt6;
                            i8 = remoteDfuException.getErrorNumber() | 8192;
                            loge(remoteDfuException.getMessage());
                            this.mService.sendLogBroadcast(20, String.format("Remote DFU error: %s", LegacyDfuError.parse(i8)));
                            logi(str6);
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, str5);
                            dfuBaseService = this.mService;
                            bluetoothGatt3 = bluetoothGatt4;
                            dfuBaseService.terminateConnection(bluetoothGatt3, i8);
                            return;
                        } catch (UnknownResponseException e9) {
                            unknownResponseException = e9;
                            str3 = "Reset request sent";
                            str4 = "Sending Reset command (Op Code = 6)";
                            bluetoothGatt = bluetoothGatt6;
                            loge(unknownResponseException.getMessage());
                            this.mService.sendLogBroadcast(20, unknownResponseException.getMessage());
                            logi(str4);
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, str3);
                            i8 = 4104;
                            dfuBaseService = this.mService;
                            bluetoothGatt3 = bluetoothGatt;
                            dfuBaseService.terminateConnection(bluetoothGatt3, i8);
                            return;
                        } catch (UploadAbortedException e10) {
                            uploadAbortedException = e10;
                            str = "Reset request sent";
                            str2 = "Sending Reset command (Op Code = 6)";
                            logi(str2);
                            this.mAborted = false;
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, str);
                            throw uploadAbortedException;
                        }
                    } else {
                        i9 = 0;
                    }
                    int i18 = (i17 & 2) > 0 ? this.mImageSizeInBytes : 0;
                    int i19 = i17 & 4;
                    if (i19 > 0) {
                        i10 = i9;
                        i11 = this.mImageSizeInBytes;
                    } else {
                        i10 = i9;
                        i11 = 0;
                    }
                    InputStream inputStream = this.mFirmwareStream;
                    int i20 = i18;
                    if (inputStream instanceof ArchiveInputStream) {
                        ArchiveInputStream archiveInputStream = (ArchiveInputStream) inputStream;
                        if (archiveInputStream.isSecureDfuRequired()) {
                            loge("Secure DFU is required to upload selected firmware");
                            this.mService.sendLogBroadcast(20, "The device does not support given firmware.");
                            logi("Sending Reset command (Op Code = 6)");
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                            this.mService.sendLogBroadcast(10, "Reset request sent");
                            this.mService.terminateConnection(bluetoothGatt6, 4099);
                            return;
                        }
                        int softDeviceImageSize = archiveInputStream.softDeviceImageSize();
                        int bootloaderImageSize = archiveInputStream.bootloaderImageSize();
                        str6 = "Sending Reset command (Op Code = 6)";
                        i13 = archiveInputStream.applicationImageSize();
                        i12 = softDeviceImageSize;
                        str5 = "Reset request sent";
                        i14 = bootloaderImageSize;
                    } else {
                        i12 = i10;
                        i13 = i11;
                        str5 = "Reset request sent";
                        str6 = "Sending Reset command (Op Code = 6)";
                        i14 = i20;
                    }
                    try {
                        try {
                            try {
                                try {
                                    bArr = OP_CODE_START_DFU;
                                } catch (UnknownResponseException e11) {
                                    e = e11;
                                }
                            } catch (UnknownResponseException e12) {
                                e = e12;
                                r62 = bluetoothGatt6;
                                unknownResponseException = e;
                                str3 = str5;
                                str4 = str6;
                                bluetoothGatt = r62;
                                loge(unknownResponseException.getMessage());
                                this.mService.sendLogBroadcast(20, unknownResponseException.getMessage());
                                logi(str4);
                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                this.mService.sendLogBroadcast(10, str3);
                                i8 = 4104;
                                dfuBaseService = this.mService;
                                bluetoothGatt3 = bluetoothGatt;
                                dfuBaseService.terminateConnection(bluetoothGatt3, i8);
                                return;
                            }
                            try {
                                bArr[1] = (byte) i17;
                                StringBuilder sb = new StringBuilder();
                                try {
                                    sb.append("Sending Start DFU command (Op Code = 1, Upload Mode = ");
                                    sb.append(i17);
                                    sb.append(")");
                                    logi(sb.toString());
                                    writeOpCode(this.mControlPointCharacteristic, bArr);
                                    this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1, Upload Mode = " + i17 + ")");
                                    logi("Sending image size array to DFU Packet (" + i12 + "b, " + i14 + "b, " + i13 + "b)");
                                    writeImageSize(this.mPacketCharacteristic, i12, i14, i13);
                                    this.mService.sendLogBroadcast(10, "Firmware image size sent (" + i12 + "b, " + i14 + "b, " + i13 + "b)");
                                    byte[] readNotificationResponse = readNotificationResponse();
                                    statusCode3 = getStatusCode(readNotificationResponse, 1);
                                    this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) readNotificationResponse[1]) + " Status = " + statusCode3 + ")");
                                } catch (RemoteDfuException e13) {
                                    e = e13;
                                    intent2 = intent;
                                    str7 = "Starting DFU failed";
                                    bluetoothGatt5 = bluetoothGatt6;
                                } catch (UnknownResponseException e14) {
                                    e = e14;
                                    r62 = bluetoothGatt6;
                                    unknownResponseException = e;
                                    str3 = str5;
                                    str4 = str6;
                                    bluetoothGatt = r62;
                                    loge(unknownResponseException.getMessage());
                                    this.mService.sendLogBroadcast(20, unknownResponseException.getMessage());
                                    logi(str4);
                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                    this.mService.sendLogBroadcast(10, str3);
                                    i8 = 4104;
                                    dfuBaseService = this.mService;
                                    bluetoothGatt3 = bluetoothGatt;
                                    dfuBaseService.terminateConnection(bluetoothGatt3, i8);
                                    return;
                                }
                            } catch (RemoteDfuException e15) {
                                e = e15;
                                intent2 = intent;
                                bluetoothGatt5 = bluetoothGatt6;
                                str7 = "Starting DFU failed";
                                remoteDfuException2 = e;
                                bluetoothGatt2 = bluetoothGatt5;
                                try {
                                    str9 = "Firmware image size sent (";
                                    r52 = 3;
                                    try {
                                    } catch (RemoteDfuException e16) {
                                        e = e16;
                                    }
                                } catch (RemoteDfuException e17) {
                                    e = e17;
                                    str9 = "Firmware image size sent (";
                                }
                                if (remoteDfuException2.getErrorNumber() == 3 || i19 <= 0 || (i17 & 3) <= 0) {
                                    throw remoteDfuException2;
                                }
                                try {
                                    this.mRemoteErrorOccurred = false;
                                    logw("DFU target does not support (SD/BL)+App update");
                                    this.mService.sendLogBroadcast(15, "DFU target does not support (SD/BL)+App update");
                                    i17 &= -5;
                                    this.mFileType = i17;
                                    byte[] bArr2 = OP_CODE_START_DFU;
                                    bArr2[1] = (byte) i17;
                                    this.mProgressInfo.setTotalPart(2);
                                    ((ArchiveInputStream) this.mFirmwareStream).setContentType(i17);
                                    str11 = str7;
                                    try {
                                        this.mService.sendLogBroadcast(1, "Sending only SD/BL");
                                        logi("Resending Start DFU command (Op Code = 1, Upload Mode = " + i17 + ")");
                                        writeOpCode(this.mControlPointCharacteristic, bArr2);
                                        this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1, Upload Mode = " + i17 + ")");
                                        logi("Sending image size array to DFU Packet: [" + i12 + "b, " + i14 + "b, 0b]");
                                        writeImageSize(this.mPacketCharacteristic, i12, i14, 0);
                                        this.mService.sendLogBroadcast(10, "Firmware image size sent [" + i12 + "b, " + i14 + "b, 0b]");
                                        byte[] readNotificationResponse2 = readNotificationResponse();
                                        statusCode2 = getStatusCode(readNotificationResponse2, 1);
                                        this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) readNotificationResponse2[1]) + " Status = " + statusCode2 + ")");
                                    } catch (RemoteDfuException e18) {
                                        e = e18;
                                        r52 = str11;
                                        remoteDfuException3 = e;
                                        str10 = r52;
                                        try {
                                            if (remoteDfuException3.getErrorNumber() != 3) {
                                            }
                                        } catch (RemoteDfuException e19) {
                                            e = e19;
                                            remoteDfuException = e;
                                            bluetoothGatt4 = bluetoothGatt2;
                                            i8 = remoteDfuException.getErrorNumber() | 8192;
                                            loge(remoteDfuException.getMessage());
                                            this.mService.sendLogBroadcast(20, String.format("Remote DFU error: %s", LegacyDfuError.parse(i8)));
                                            logi(str6);
                                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                                            this.mService.sendLogBroadcast(10, str5);
                                            dfuBaseService = this.mService;
                                            bluetoothGatt3 = bluetoothGatt4;
                                            dfuBaseService.terminateConnection(bluetoothGatt3, i8);
                                            return;
                                        }
                                    }
                                } catch (RemoteDfuException e20) {
                                    e = e20;
                                    r52 = str7;
                                    remoteDfuException3 = e;
                                    str10 = r52;
                                    if (remoteDfuException3.getErrorNumber() != 3) {
                                    }
                                }
                                if (statusCode2 == 2) {
                                    try {
                                        resetAndRestart(bluetoothGatt2, intent2);
                                        return;
                                    } catch (RemoteDfuException e21) {
                                        remoteDfuException3 = e21;
                                        str10 = str11;
                                        if (remoteDfuException3.getErrorNumber() != 3) {
                                            throw remoteDfuException3;
                                        }
                                        if (i17 != 4) {
                                            throw remoteDfuException3;
                                        }
                                        this.mRemoteErrorOccurred = false;
                                        logw("DFU target does not support DFU v.2");
                                        this.mService.sendLogBroadcast(15, "DFU target does not support DFU v.2");
                                        this.mService.sendLogBroadcast(1, "Switching to DFU v.1");
                                        logi("Resending Start DFU command (Op Code = 1)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_START_DFU);
                                        this.mService.sendLogBroadcast(10, "DFU Start sent (Op Code = 1)");
                                        logi("Sending application image size to DFU Packet: " + this.mImageSizeInBytes + " bytes");
                                        writeImageSize(this.mPacketCharacteristic, this.mImageSizeInBytes);
                                        this.mService.sendLogBroadcast(10, str9 + this.mImageSizeInBytes + " bytes)");
                                        byte[] readNotificationResponse3 = readNotificationResponse();
                                        int statusCode4 = getStatusCode(readNotificationResponse3, 1);
                                        DfuBaseService dfuBaseService2 = this.mService;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Response received (Op Code = ");
                                        sb2.append((int) readNotificationResponse3[1]);
                                        str8 = ", Status = ";
                                        sb2.append(str8);
                                        sb2.append(statusCode4);
                                        sb2.append(")");
                                        dfuBaseService2.sendLogBroadcast(10, sb2.toString());
                                        if (statusCode4 == 2) {
                                            resetAndRestart(bluetoothGatt2, intent2);
                                            return;
                                        }
                                        if (statusCode4 != 1) {
                                            throw new RemoteDfuException(str10, statusCode4);
                                        }
                                        z7 = false;
                                        if (this.mInitPacketStream != null) {
                                        }
                                        if (!z7) {
                                        }
                                        i15 = this.mPacketsBeforeNotification;
                                        if (i15 > 0) {
                                        }
                                        logi("Sending Receive Firmware Image request (Op Code = 3)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                        this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        this.mProgressInfo.setBytesSent(0);
                                        try {
                                            logi("Uploading firmware...");
                                            this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                            uploadFirmwareImage(this.mPacketCharacteristic);
                                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                            byte[] readNotificationResponse4 = readNotificationResponse();
                                            statusCode = getStatusCode(readNotificationResponse4, 3);
                                            logi("Response received (Op Code = " + ((int) readNotificationResponse4[0]) + ", Req Op Code = " + ((int) readNotificationResponse4[1]) + str8 + ((int) readNotificationResponse4[2]) + ")");
                                            DfuBaseService dfuBaseService3 = this.mService;
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Response received (Op Code = ");
                                            sb3.append((int) readNotificationResponse4[1]);
                                            sb3.append(str8);
                                            sb3.append(statusCode);
                                            sb3.append(")");
                                            dfuBaseService3.sendLogBroadcast(10, sb3.toString());
                                            if (statusCode != 1) {
                                            }
                                        } catch (DeviceDisconnectedException e22) {
                                            loge("Disconnected while sending data");
                                            throw e22;
                                        }
                                    }
                                } else {
                                    if (statusCode2 != 1) {
                                        throw new RemoteDfuException(str11, statusCode2);
                                    }
                                    str8 = ", Status = ";
                                    z7 = true;
                                    if (this.mInitPacketStream != null) {
                                    }
                                    if (!z7) {
                                        i15 = 10;
                                        if (i15 > 0) {
                                        }
                                        logi("Sending Receive Firmware Image request (Op Code = 3)");
                                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                        this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                        this.mProgressInfo.setBytesSent(0);
                                        logi("Uploading firmware...");
                                        this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                        uploadFirmwareImage(this.mPacketCharacteristic);
                                        long elapsedRealtime22 = SystemClock.elapsedRealtime();
                                        byte[] readNotificationResponse42 = readNotificationResponse();
                                        statusCode = getStatusCode(readNotificationResponse42, 3);
                                        logi("Response received (Op Code = " + ((int) readNotificationResponse42[0]) + ", Req Op Code = " + ((int) readNotificationResponse42[1]) + str8 + ((int) readNotificationResponse42[2]) + ")");
                                        DfuBaseService dfuBaseService32 = this.mService;
                                        StringBuilder sb32 = new StringBuilder();
                                        sb32.append("Response received (Op Code = ");
                                        sb32.append((int) readNotificationResponse42[1]);
                                        sb32.append(str8);
                                        sb32.append(statusCode);
                                        sb32.append(")");
                                        dfuBaseService32.sendLogBroadcast(10, sb32.toString());
                                        if (statusCode != 1) {
                                        }
                                    }
                                    i15 = this.mPacketsBeforeNotification;
                                    if (i15 > 0) {
                                    }
                                    logi("Sending Receive Firmware Image request (Op Code = 3)");
                                    writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                                    this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                                    long elapsedRealtime32 = SystemClock.elapsedRealtime();
                                    this.mProgressInfo.setBytesSent(0);
                                    logi("Uploading firmware...");
                                    this.mService.sendLogBroadcast(10, "Uploading firmware...");
                                    uploadFirmwareImage(this.mPacketCharacteristic);
                                    long elapsedRealtime222 = SystemClock.elapsedRealtime();
                                    byte[] readNotificationResponse422 = readNotificationResponse();
                                    statusCode = getStatusCode(readNotificationResponse422, 3);
                                    logi("Response received (Op Code = " + ((int) readNotificationResponse422[0]) + ", Req Op Code = " + ((int) readNotificationResponse422[1]) + str8 + ((int) readNotificationResponse422[2]) + ")");
                                    DfuBaseService dfuBaseService322 = this.mService;
                                    StringBuilder sb322 = new StringBuilder();
                                    sb322.append("Response received (Op Code = ");
                                    sb322.append((int) readNotificationResponse422[1]);
                                    sb322.append(str8);
                                    sb322.append(statusCode);
                                    sb322.append(")");
                                    dfuBaseService322.sendLogBroadcast(10, sb322.toString());
                                    if (statusCode != 1) {
                                    }
                                }
                            }
                        } catch (RemoteDfuException e23) {
                            e = e23;
                        }
                        if (statusCode3 == 2) {
                            intent2 = intent;
                            BluetoothGatt bluetoothGatt7 = bluetoothGatt6;
                            try {
                                resetAndRestart(bluetoothGatt7, intent2);
                                return;
                            } catch (RemoteDfuException e24) {
                                remoteDfuException2 = e24;
                                str7 = "Starting DFU failed";
                                bluetoothGatt2 = bluetoothGatt7;
                                str9 = "Firmware image size sent (";
                                r52 = 3;
                                if (remoteDfuException2.getErrorNumber() == 3) {
                                }
                                throw remoteDfuException2;
                            }
                        }
                        intent2 = intent;
                        bluetoothGatt5 = bluetoothGatt6;
                        if (statusCode3 != 1) {
                            try {
                                str7 = "Starting DFU failed";
                                try {
                                    throw new RemoteDfuException(str7, statusCode3);
                                } catch (RemoteDfuException e25) {
                                    e = e25;
                                    remoteDfuException2 = e;
                                    bluetoothGatt2 = bluetoothGatt5;
                                    str9 = "Firmware image size sent (";
                                    r52 = 3;
                                    if (remoteDfuException2.getErrorNumber() == 3) {
                                    }
                                    throw remoteDfuException2;
                                }
                            } catch (RemoteDfuException e26) {
                                e = e26;
                                str7 = "Starting DFU failed";
                                remoteDfuException2 = e;
                                bluetoothGatt2 = bluetoothGatt5;
                                str9 = "Firmware image size sent (";
                                r52 = 3;
                                if (remoteDfuException2.getErrorNumber() == 3) {
                                }
                                throw remoteDfuException2;
                            }
                        }
                        str8 = ", Status = ";
                        z7 = true;
                        if (this.mInitPacketStream != null) {
                            this.mService.sendLogBroadcast(10, "Writing Initialize DFU Parameters...");
                            if (z7) {
                                logi("Sending the Initialize DFU Parameters START (Op Code = 2, Value = 0)");
                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_START);
                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                writeInitData(this.mPacketCharacteristic, null);
                                logi("Sending the Initialize DFU Parameters COMPLETE (Op Code = 2, Value = 1)");
                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS_COMPLETE);
                                this.mService.sendLogBroadcast(10, "Initialize DFU Parameters completed");
                            } else {
                                logi("Sending the Initialize DFU Parameters (Op Code = 2)");
                                writeOpCode(this.mControlPointCharacteristic, OP_CODE_INIT_DFU_PARAMS);
                                logi("Sending " + this.mInitPacketSizeInBytes + " bytes of init packet");
                                writeInitData(this.mPacketCharacteristic, null);
                            }
                            byte[] readNotificationResponse5 = readNotificationResponse();
                            int statusCode5 = getStatusCode(readNotificationResponse5, 2);
                            this.mService.sendLogBroadcast(10, "Response received (Op Code = " + ((int) readNotificationResponse5[1]) + str8 + statusCode5 + ")");
                            if (statusCode5 != 1) {
                                throw new RemoteDfuException("Device returned error after sending init packet", statusCode5);
                            }
                        }
                        if (!z7 && ((i16 = this.mPacketsBeforeNotification) <= 0 || i16 > 10)) {
                            i15 = 10;
                            if (i15 > 0) {
                                logi("Sending the number of packets before notifications (Op Code = 8, Value = " + i15 + ")");
                                byte[] bArr3 = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
                                setNumberOfPackets(bArr3, i15);
                                writeOpCode(this.mControlPointCharacteristic, bArr3);
                                this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 8) sent (Value = " + i15 + ")");
                            }
                            logi("Sending Receive Firmware Image request (Op Code = 3)");
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                            this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                            long elapsedRealtime322 = SystemClock.elapsedRealtime();
                            this.mProgressInfo.setBytesSent(0);
                            logi("Uploading firmware...");
                            this.mService.sendLogBroadcast(10, "Uploading firmware...");
                            uploadFirmwareImage(this.mPacketCharacteristic);
                            long elapsedRealtime2222 = SystemClock.elapsedRealtime();
                            byte[] readNotificationResponse4222 = readNotificationResponse();
                            statusCode = getStatusCode(readNotificationResponse4222, 3);
                            logi("Response received (Op Code = " + ((int) readNotificationResponse4222[0]) + ", Req Op Code = " + ((int) readNotificationResponse4222[1]) + str8 + ((int) readNotificationResponse4222[2]) + ")");
                            DfuBaseService dfuBaseService3222 = this.mService;
                            StringBuilder sb3222 = new StringBuilder();
                            sb3222.append("Response received (Op Code = ");
                            sb3222.append((int) readNotificationResponse4222[1]);
                            sb3222.append(str8);
                            sb3222.append(statusCode);
                            sb3222.append(")");
                            dfuBaseService3222.sendLogBroadcast(10, sb3222.toString());
                            if (statusCode != 1) {
                                throw new RemoteDfuException("Device returned error after sending file", statusCode);
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Transfer of ");
                            sb4.append(this.mProgressInfo.getBytesSent());
                            sb4.append(" bytes has taken ");
                            long j8 = elapsedRealtime2222 - elapsedRealtime322;
                            sb4.append(j8);
                            sb4.append(" ms");
                            logi(sb4.toString());
                            this.mService.sendLogBroadcast(10, "Upload completed in " + j8 + " ms");
                            logi("Sending Validate request (Op Code = 4)");
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_VALIDATE);
                            this.mService.sendLogBroadcast(10, "Validate request sent");
                            byte[] readNotificationResponse6 = readNotificationResponse();
                            int statusCode6 = getStatusCode(readNotificationResponse6, 4);
                            logi("Response received (Op Code = " + ((int) readNotificationResponse6[0]) + ", Req Op Code = " + ((int) readNotificationResponse6[1]) + str8 + ((int) readNotificationResponse6[2]) + ")");
                            DfuBaseService dfuBaseService4 = this.mService;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Response received (Op Code = ");
                            sb5.append((int) readNotificationResponse6[1]);
                            sb5.append(str8);
                            sb5.append(statusCode6);
                            sb5.append(")");
                            dfuBaseService4.sendLogBroadcast(10, sb5.toString());
                            if (statusCode6 != 1) {
                                throw new RemoteDfuException("Device returned validation error", statusCode6);
                            }
                            this.mProgressInfo.setProgress(-5);
                            logi("Sending Activate and Reset request (Op Code = 5)");
                            writeOpCode(this.mControlPointCharacteristic, OP_CODE_ACTIVATE_AND_RESET);
                            this.mService.sendLogBroadcast(10, "Activate and Reset request sent");
                            this.mService.waitUntilDisconnected();
                            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
                            finalize(intent2, readVersion == 5);
                            return;
                        }
                        i15 = this.mPacketsBeforeNotification;
                        if (i15 > 0) {
                        }
                        logi("Sending Receive Firmware Image request (Op Code = 3)");
                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RECEIVE_FIRMWARE_IMAGE);
                        this.mService.sendLogBroadcast(10, "Receive Firmware Image request sent");
                        long elapsedRealtime3222 = SystemClock.elapsedRealtime();
                        this.mProgressInfo.setBytesSent(0);
                        logi("Uploading firmware...");
                        this.mService.sendLogBroadcast(10, "Uploading firmware...");
                        uploadFirmwareImage(this.mPacketCharacteristic);
                        long elapsedRealtime22222 = SystemClock.elapsedRealtime();
                        byte[] readNotificationResponse42222 = readNotificationResponse();
                        statusCode = getStatusCode(readNotificationResponse42222, 3);
                        logi("Response received (Op Code = " + ((int) readNotificationResponse42222[0]) + ", Req Op Code = " + ((int) readNotificationResponse42222[1]) + str8 + ((int) readNotificationResponse42222[2]) + ")");
                        DfuBaseService dfuBaseService32222 = this.mService;
                        StringBuilder sb32222 = new StringBuilder();
                        sb32222.append("Response received (Op Code = ");
                        sb32222.append((int) readNotificationResponse42222[1]);
                        sb32222.append(str8);
                        sb32222.append(statusCode);
                        sb32222.append(")");
                        dfuBaseService32222.sendLogBroadcast(10, sb32222.toString());
                        if (statusCode != 1) {
                        }
                    } catch (UploadAbortedException e27) {
                        e = e27;
                        uploadAbortedException = e;
                        str = str5;
                        str2 = str6;
                        logi(str2);
                        this.mAborted = false;
                        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
                        this.mService.sendLogBroadcast(10, str);
                        throw uploadAbortedException;
                    }
                } catch (UnknownResponseException e28) {
                    e = e28;
                    str5 = "Reset request sent";
                    str6 = "Sending Reset command (Op Code = 6)";
                } catch (UploadAbortedException e29) {
                    e = e29;
                    str5 = "Reset request sent";
                    str6 = "Sending Reset command (Op Code = 6)";
                }
            } catch (RemoteDfuException e30) {
                e = e30;
                str5 = "Reset request sent";
                str6 = "Sending Reset command (Op Code = 6)";
                bluetoothGatt2 = bluetoothGatt6;
            }
        } catch (UnknownResponseException e31) {
            str3 = "Reset request sent";
            str4 = "Sending Reset command (Op Code = 6)";
            bluetoothGatt = bluetoothGatt6;
            unknownResponseException = e31;
        } catch (UploadAbortedException e32) {
            str = "Reset request sent";
            str2 = "Sending Reset command (Op Code = 6)";
            uploadAbortedException = e32;
        }
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8, int i9, int i10) {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(new byte[12]);
        bluetoothGattCharacteristic.setValue(i8, 20, 0);
        bluetoothGattCharacteristic.setValue(i9, 20, 4);
        bluetoothGattCharacteristic.setValue(i10, 20, 8);
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid());
        this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mImageSizeInProgress && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        } else {
                            this.mLock.wait();
                        }
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to write Image Sizes", this.mError);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Image Sizes: device disconnected");
        }
    }
}
