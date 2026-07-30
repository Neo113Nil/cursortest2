package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl;
import com.crrepa.ble.nrf.dfu.BaseDfuImpl;
import com.crrepa.ble.nrf.dfu.internal.ArchiveInputStream;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.RemoteDfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.RemoteDfuExtendedErrorException;
import com.crrepa.ble.nrf.dfu.internal.exception.UnknownResponseException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import com.crrepa.ble.nrf.error.SecureDfuError;
import com.realsil.sdk.dfu.i.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
class SecureDfuImpl extends BaseCustomDfuImpl {
    protected static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    protected static final UUID DEFAULT_DFU_PACKET_UUID;
    protected static final UUID DEFAULT_DFU_SERVICE_UUID;
    protected static UUID DFU_CONTROL_POINT_UUID = null;
    protected static UUID DFU_PACKET_UUID = null;
    protected static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final int MAX_ATTEMPTS = 3;
    private static final int OBJECT_COMMAND = 1;
    private static final int OBJECT_DATA = 2;
    private static final byte[] OP_CODE_CALCULATE_CHECKSUM;
    private static final int OP_CODE_CALCULATE_CHECKSUM_KEY = 3;
    private static final byte[] OP_CODE_CREATE_COMMAND;
    private static final byte[] OP_CODE_CREATE_DATA;
    private static final int OP_CODE_CREATE_KEY = 1;
    private static final byte[] OP_CODE_EXECUTE;
    private static final int OP_CODE_EXECUTE_KEY = 4;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 2;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 96;
    private static final byte[] OP_CODE_SELECT_OBJECT;
    private static final int OP_CODE_SELECT_OBJECT_KEY = 6;
    private final SecureBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private BluetoothGattCharacteristic mPacketCharacteristic;

    private class ObjectChecksum {
        protected int CRC32;
        protected int offset;

        private ObjectChecksum() {
        }
    }

    private class ObjectInfo extends ObjectChecksum {
        protected int maxSize;

        private ObjectInfo() {
            super();
        }
    }

    protected class SecureBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        protected SecureBluetoothCallback() {
            super();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            SecureDfuImpl secureDfuImpl;
            if (bluetoothGattCharacteristic.getValue() == null || bluetoothGattCharacteristic.getValue().length < 3) {
                SecureDfuImpl.this.loge("Empty response: " + parse(bluetoothGattCharacteristic));
                secureDfuImpl = SecureDfuImpl.this;
                secureDfuImpl.mError = 4104;
            } else {
                if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() != 96) {
                    SecureDfuImpl.this.loge("Invalid response: " + parse(bluetoothGattCharacteristic));
                    SecureDfuImpl.this.mError = 4104;
                } else if (bluetoothGattCharacteristic.getIntValue(17, 1).intValue() == 3) {
                    SecureDfuImpl.this.mProgressInfo.setBytesReceived(bluetoothGattCharacteristic.getIntValue(20, 3).intValue());
                    handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
                } else if (!SecureDfuImpl.this.mRemoteErrorOccurred) {
                    if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                        SecureDfuImpl.this.mRemoteErrorOccurred = true;
                    }
                    handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
                }
                secureDfuImpl = SecureDfuImpl.this;
            }
            secureDfuImpl.notifyLock();
        }
    }

    static {
        UUID uuid = new UUID(279658205548544L, -9223371485494954757L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989241631715488L, -6937650605005804976L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(-8157989237336748192L, -6937650605005804976L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        OP_CODE_CREATE_COMMAND = new byte[]{1, 1, 0, 0, 0, 0};
        OP_CODE_CREATE_DATA = new byte[]{1, 2, 0, 0, 0, 0};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{2, 0, 0};
        OP_CODE_CALCULATE_CHECKSUM = new byte[]{3};
        OP_CODE_EXECUTE = new byte[]{4};
        OP_CODE_SELECT_OBJECT = new byte[]{6, 0};
    }

    SecureDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new SecureBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i8) {
        byte b8;
        if (bArr != null && bArr.length >= 3 && bArr[0] == 96 && bArr[1] == i8 && ((b8 = bArr[2]) == 1 || b8 == 2 || b8 == 3 || b8 == 4 || b8 == 5 || b8 == 7 || b8 == 8 || b8 == 10 || b8 == 11)) {
            return b8;
        }
        throw new UnknownResponseException("Invalid response received", bArr, 96, i8);
    }

    private ObjectChecksum readChecksum() {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_CALCULATE_CHECKSUM);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 3);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Receiving Checksum failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Receiving Checksum failed", statusCode);
        }
        ObjectChecksum objectChecksum = new ObjectChecksum();
        objectChecksum.offset = this.mControlPointCharacteristic.getIntValue(20, 3).intValue();
        objectChecksum.CRC32 = this.mControlPointCharacteristic.getIntValue(20, 7).intValue();
        return objectChecksum;
    }

    private ObjectInfo selectObject(int i8) {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read object info: device disconnected");
        }
        byte[] bArr = OP_CODE_SELECT_OBJECT;
        bArr[1] = (byte) i8;
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 6);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Selecting object failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Selecting object failed", statusCode);
        }
        ObjectInfo objectInfo = new ObjectInfo();
        objectInfo.maxSize = this.mControlPointCharacteristic.getIntValue(20, 3).intValue();
        objectInfo.offset = this.mControlPointCharacteristic.getIntValue(20, 7).intValue();
        objectInfo.CRC32 = this.mControlPointCharacteristic.getIntValue(20, 11).intValue();
        return objectInfo;
    }

    private void sendFirmware(BluetoothGatt bluetoothGatt) {
        int i8;
        String str;
        DfuBaseService dfuBaseService;
        boolean z7;
        String str2;
        boolean z8;
        boolean z9;
        int i9 = this.mPacketsBeforeNotification;
        String str3 = ")";
        if (i9 > 0) {
            setPacketReceiptNotifications(i9);
            this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = " + i9 + ")");
        }
        logi("Setting object to Data (Op Code = 6, Type = 2)");
        ObjectInfo selectObject = selectObject(2);
        Locale locale = Locale.US;
        logi(String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mService.sendLogBroadcast(10, String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mProgressInfo.setMaxObjectSizeInBytes(selectObject.maxSize);
        int i10 = this.mImageSizeInBytes;
        int i11 = selectObject.maxSize;
        int i12 = ((i10 + i11) - 1) / i11;
        int i13 = selectObject.offset;
        if (i13 > 0) {
            try {
                i8 = i13 / i11;
                int i14 = i11 * i8;
                int i15 = i13 - i14;
                if (i15 == 0) {
                    i14 -= i11;
                } else {
                    i11 = i15;
                }
                int i16 = i14;
                if (i16 > 0) {
                    this.mFirmwareStream.read(new byte[i16]);
                    this.mFirmwareStream.mark(selectObject.maxSize);
                }
                this.mFirmwareStream.read(new byte[i11]);
                if (((int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & a.INVALID_VERSION_32)) == selectObject.CRC32) {
                    logi(selectObject.offset + " bytes of data sent before, CRC match");
                    this.mService.sendLogBroadcast(10, selectObject.offset + " bytes of data sent before, CRC match");
                    this.mProgressInfo.setBytesSent(selectObject.offset);
                    this.mProgressInfo.setBytesReceived(selectObject.offset);
                    if (i11 != selectObject.maxSize || selectObject.offset >= this.mImageSizeInBytes) {
                        z7 = true;
                    } else {
                        logi("Executing data object (Op Code = 4)");
                        writeExecute();
                        dfuBaseService = this.mService;
                        str = "Data object executed";
                    }
                } else {
                    logi(selectObject.offset + " bytes sent before, CRC does not match");
                    this.mService.sendLogBroadcast(15, selectObject.offset + " bytes sent before, CRC does not match");
                    this.mProgressInfo.setBytesSent(i16);
                    this.mProgressInfo.setBytesReceived(i16);
                    selectObject.offset -= i11;
                    selectObject.CRC32 = 0;
                    this.mFirmwareStream.reset();
                    logi("Resuming from byte " + selectObject.offset + "...");
                    DfuBaseService dfuBaseService2 = this.mService;
                    str = "Resuming from byte " + selectObject.offset + "...";
                    dfuBaseService = dfuBaseService2;
                }
                dfuBaseService.sendLogBroadcast(10, str);
                z7 = false;
            } catch (IOException e8) {
                loge("Error while reading firmware stream", e8);
                this.mService.terminateConnection(bluetoothGatt, 4100);
                return;
            }
        } else {
            this.mProgressInfo.setBytesSent(0);
            z7 = false;
            i8 = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (selectObject.offset < this.mImageSizeInBytes) {
            loop0: while (true) {
                int i17 = 1;
                while (this.mProgressInfo.getAvailableObjectSizeIsBytes() > 0) {
                    if (z7) {
                        str2 = str3;
                        this.mService.sendLogBroadcast(10, "Resuming uploading firmware...");
                        z8 = false;
                    } else {
                        int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Creating Data object (Op Code = 1, Type = 2, Size = ");
                        sb.append(availableObjectSizeIsBytes);
                        sb.append(") (");
                        int i18 = i8 + 1;
                        sb.append(i18);
                        sb.append("/");
                        sb.append(i12);
                        sb.append(str3);
                        logi(sb.toString());
                        writeCreateRequest(2, availableObjectSizeIsBytes);
                        DfuBaseService dfuBaseService3 = this.mService;
                        StringBuilder sb2 = new StringBuilder();
                        str2 = str3;
                        sb2.append("Data object (");
                        sb2.append(i18);
                        sb2.append("/");
                        sb2.append(i12);
                        sb2.append(") created");
                        dfuBaseService3.sendLogBroadcast(10, sb2.toString());
                        this.mService.sendLogBroadcast(10, "Uploading firmware...");
                        z8 = z7;
                    }
                    try {
                        logi("Uploading firmware...");
                        uploadFirmwareImage(this.mPacketCharacteristic);
                        logi("Sending Calculate Checksum command (Op Code = 3)");
                        ObjectChecksum readChecksum = readChecksum();
                        Locale locale2 = Locale.US;
                        logi(String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                        z9 = z8;
                        this.mService.sendLogBroadcast(10, String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                        int bytesSent = this.mProgressInfo.getBytesSent() - readChecksum.offset;
                        if (bytesSent > 0) {
                            logw(bytesSent + " bytes were lost!");
                            this.mService.sendLogBroadcast(15, bytesSent + " bytes were lost");
                            try {
                                this.mFirmwareStream.reset();
                                this.mFirmwareStream.read(new byte[selectObject.maxSize - bytesSent]);
                                this.mProgressInfo.setBytesSent(readChecksum.offset);
                            } catch (IOException e9) {
                                loge("Error while reading firmware stream", e9);
                                this.mService.terminateConnection(bluetoothGatt, 4100);
                                return;
                            }
                        }
                        int crc32 = (int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & a.INVALID_VERSION_32);
                        if (crc32 != readChecksum.CRC32) {
                            String format = String.format(locale2, "CRC does not match! Expected %08X but found %08X.", Integer.valueOf(crc32), Integer.valueOf(readChecksum.CRC32));
                            if (i17 >= 3) {
                                loge(format);
                                this.mService.sendLogBroadcast(20, format);
                                this.mService.terminateConnection(bluetoothGatt, 4109);
                                return;
                            }
                            i17++;
                            String str4 = format + String.format(locale2, " Retrying...(%d/%d)", Integer.valueOf(i17), 3);
                            logi(str4);
                            this.mService.sendLogBroadcast(15, str4);
                            try {
                                this.mFirmwareStream.reset();
                                this.mProgressInfo.setBytesSent(((ArchiveInputStream) this.mFirmwareStream).getBytesRead());
                                z7 = z9;
                                str3 = str2;
                            } catch (IOException e10) {
                                loge("Error while resetting the firmware stream", e10);
                                this.mService.terminateConnection(bluetoothGatt, 4100);
                                return;
                            }
                        } else if (bytesSent > 0) {
                            str3 = str2;
                            z7 = true;
                        }
                    } catch (DeviceDisconnectedException e11) {
                        loge("Disconnected while sending data");
                        throw e11;
                    }
                }
                logi("Executing data object (Op Code = 4)");
                writeExecute();
                this.mService.sendLogBroadcast(10, "Data object executed");
                i8++;
                this.mFirmwareStream.mark(0);
                z7 = z9;
                str3 = str2;
            }
        } else {
            logi("Executing data object (Op Code = 4)");
            writeExecute();
            this.mService.sendLogBroadcast(10, "Data object executed");
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Transfer of ");
        sb3.append(this.mProgressInfo.getBytesSent() - selectObject.offset);
        sb3.append(" bytes has taken ");
        long j8 = elapsedRealtime2 - elapsedRealtime;
        sb3.append(j8);
        sb3.append(" ms");
        logi(sb3.toString());
        this.mService.sendLogBroadcast(10, "Upload completed in " + j8 + " ms");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void sendInitPacket(BluetoothGatt bluetoothGatt) {
        boolean z7;
        boolean z8;
        CRC32 crc32 = new CRC32();
        logi("Setting object to Command (Op Code = 6, Type = 1)");
        ObjectInfo selectObject = selectObject(1);
        Locale locale = Locale.US;
        logi(String.format(locale, "Command object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mService.sendLogBroadcast(10, String.format(locale, "Command object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        int i8 = this.mInitPacketSizeInBytes;
        int i9 = selectObject.offset;
        String str = "Error while resetting the init packet stream";
        long j8 = a.INVALID_VERSION_32;
        if (i9 > 0 && i9 <= i8) {
            try {
                byte[] bArr = new byte[i9];
                this.mInitPacketStream.read(bArr);
                crc32.update(bArr);
            } catch (IOException e8) {
                e = e8;
                z7 = false;
            }
            if (selectObject.CRC32 == ((int) (crc32.getValue() & a.INVALID_VERSION_32))) {
                logi("Init packet CRC is the same");
                if (selectObject.offset != this.mInitPacketSizeInBytes) {
                    logi("-> " + selectObject.offset + " bytes of Init packet were sent before");
                    try {
                        this.mService.sendLogBroadcast(10, "Resuming sending Init packet...");
                        z7 = false;
                        z8 = true;
                    } catch (IOException e9) {
                        e = e9;
                        z7 = false;
                        z8 = true;
                        loge("Error while reading " + selectObject.offset + " bytes from the init packet stream", e);
                        this.mInitPacketStream.reset();
                        crc32.reset();
                        selectObject.offset = 0;
                        if (!z7) {
                        }
                        logi("Executing init packet (Op Code = 4)");
                        writeExecute();
                        this.mService.sendLogBroadcast(10, "Command object executed");
                    }
                    if (!z7) {
                    }
                    logi("Executing init packet (Op Code = 4)");
                    writeExecute();
                    this.mService.sendLogBroadcast(10, "Command object executed");
                }
                logi("-> Whole Init packet was sent before");
                try {
                    this.mService.sendLogBroadcast(10, "Received CRC match Init packet");
                    z7 = true;
                    z8 = false;
                } catch (IOException e10) {
                    e = e10;
                    z7 = true;
                    z8 = false;
                    loge("Error while reading " + selectObject.offset + " bytes from the init packet stream", e);
                    try {
                        this.mInitPacketStream.reset();
                        crc32.reset();
                        selectObject.offset = 0;
                        if (!z7) {
                        }
                        logi("Executing init packet (Op Code = 4)");
                        writeExecute();
                        this.mService.sendLogBroadcast(10, "Command object executed");
                    } catch (IOException e11) {
                        loge("Error while resetting the init packet stream", e11);
                        this.mService.terminateConnection(bluetoothGatt, 4100);
                        return;
                    }
                }
                if (!z7) {
                    setPacketReceiptNotifications(0);
                    this.mService.sendLogBroadcast(10, "Packet Receipt Notif disabled (Op Code = 2, Value = 0)");
                    int i10 = 1;
                    int i11 = 3;
                    while (i10 <= i11) {
                        if (!z8) {
                            logi("Creating Init packet object (Op Code = 1, Type = 1, Size = " + this.mInitPacketSizeInBytes + ")");
                            writeCreateRequest(1, this.mInitPacketSizeInBytes);
                            this.mService.sendLogBroadcast(10, "Command object created");
                        }
                        logi("Sending " + (this.mInitPacketSizeInBytes - selectObject.offset) + " bytes of init packet...");
                        writeInitData(this.mPacketCharacteristic, crc32);
                        String str2 = str;
                        int value = (int) (crc32.getValue() & j8);
                        DfuBaseService dfuBaseService = this.mService;
                        Locale locale2 = Locale.US;
                        dfuBaseService.sendLogBroadcast(10, String.format(locale2, "Command object sent (CRC = %08X)", Integer.valueOf(value)));
                        logi("Sending Calculate Checksum command (Op Code = 3)");
                        ObjectChecksum readChecksum = readChecksum();
                        this.mService.sendLogBroadcast(10, String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                        logi(String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                        if (value == readChecksum.CRC32) {
                            break;
                        }
                        if (i10 >= 3) {
                            loge("CRC does not match!");
                            this.mService.sendLogBroadcast(20, "CRC does not match!");
                            this.mService.terminateConnection(bluetoothGatt, 4109);
                            return;
                        }
                        i10++;
                        logi("CRC does not match! Retrying...(" + i10 + "/3)");
                        this.mService.sendLogBroadcast(15, "CRC does not match! Retrying...(" + i10 + "/3)");
                        try {
                            selectObject.offset = 0;
                            selectObject.CRC32 = 0;
                            this.mInitPacketStream.reset();
                            crc32.reset();
                            str = str2;
                            i11 = 3;
                            z8 = false;
                            j8 = a.INVALID_VERSION_32;
                        } catch (IOException e12) {
                            loge(str2, e12);
                            this.mService.terminateConnection(bluetoothGatt, 4100);
                            return;
                        }
                    }
                }
                logi("Executing init packet (Op Code = 4)");
                writeExecute();
                this.mService.sendLogBroadcast(10, "Command object executed");
            }
            this.mInitPacketStream.reset();
            crc32.reset();
            selectObject.offset = 0;
        }
        z7 = false;
        z8 = false;
        if (!z7) {
        }
        logi("Executing init packet (Op Code = 4)");
        writeExecute();
        this.mService.sendLogBroadcast(10, "Command object executed");
    }

    private void setNumberOfPackets(byte[] bArr, int i8) {
        bArr[1] = (byte) (i8 & 255);
        bArr[2] = (byte) ((i8 >> 8) & 255);
    }

    private void setObjectSize(byte[] bArr, int i8) {
        bArr[2] = (byte) (i8 & 255);
        bArr[3] = (byte) ((i8 >> 8) & 255);
        bArr[4] = (byte) ((i8 >> 16) & 255);
        bArr[5] = (byte) ((i8 >> 24) & 255);
    }

    private void setPacketReceiptNotifications(int i8) {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        logi("Sending the number of packets before notifications (Op Code = 2, Value = " + i8 + ")");
        byte[] bArr = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
        setNumberOfPackets(bArr, i8);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 2);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Sending the number of packets failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Sending the number of packets failed", statusCode);
        }
    }

    private void writeCreateRequest(int i8, int i9) {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to create object: device disconnected");
        }
        byte[] bArr = i8 == 1 ? OP_CODE_CREATE_COMMAND : OP_CODE_CREATE_DATA;
        setObjectSize(bArr, i9);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 1);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Creating Command object failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Creating Command object failed", statusCode);
        }
    }

    private void writeExecute() {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_EXECUTE);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 4);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Executing object failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Executing object failed", statusCode);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        writeOpCode(bluetoothGattCharacteristic, bArr, false);
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
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    @Override // com.crrepa.ble.nrf.dfu.BaseCustomDfuImpl
    protected UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // com.crrepa.ble.nrf.dfu.BaseDfuImpl, com.crrepa.ble.nrf.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i8, InputStream inputStream, InputStream inputStream2) {
        if (inputStream2 != null) {
            return super.initialize(intent, bluetoothGatt, i8, inputStream, inputStream2);
        }
        this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
        this.mService.terminateConnection(bluetoothGatt, 4107);
        return false;
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

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public void performDfu(Intent intent) {
        DfuBaseService dfuBaseService;
        int i8;
        logw("Secure DFU bootloader found");
        this.mProgressInfo.setProgress(-2);
        this.mService.waitFor(1000);
        BluetoothGatt bluetoothGatt = this.mGatt;
        logi("Requesting MTU = 517");
        requestMtu(517);
        try {
            enableCCCD(this.mControlPointCharacteristic, 1);
            this.mService.sendLogBroadcast(10, "Notifications enabled");
            this.mService.waitFor(1000);
            sendInitPacket(bluetoothGatt);
            sendFirmware(bluetoothGatt);
            this.mProgressInfo.setProgress(-5);
            this.mService.waitUntilDisconnected();
            this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
            finalize(intent, false);
        } catch (RemoteDfuException e8) {
            i8 = e8.getErrorNumber() | 8192;
            loge(e8.getMessage());
            this.mService.sendLogBroadcast(20, String.format("Remote DFU error: %s", SecureDfuError.parse(i8)));
            if (e8 instanceof RemoteDfuExtendedErrorException) {
                RemoteDfuExtendedErrorException remoteDfuExtendedErrorException = (RemoteDfuExtendedErrorException) e8;
                logi("Extended Error details: " + SecureDfuError.parseExtendedError(remoteDfuExtendedErrorException.getExtendedErrorNumber()));
                this.mService.sendLogBroadcast(20, "Details: " + SecureDfuError.parseExtendedError(remoteDfuExtendedErrorException.getExtendedErrorNumber()) + " (Code = " + remoteDfuExtendedErrorException.getExtendedErrorNumber() + ")");
            }
            dfuBaseService = this.mService;
            dfuBaseService.terminateConnection(bluetoothGatt, i8);
        } catch (UnknownResponseException e9) {
            loge(e9.getMessage());
            this.mService.sendLogBroadcast(20, e9.getMessage());
            dfuBaseService = this.mService;
            i8 = 4104;
            dfuBaseService.terminateConnection(bluetoothGatt, i8);
        } catch (UploadAbortedException e10) {
            throw e10;
        }
    }
}
