package com.crrepa.ble.nrf.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.baidu.ar.auth.FeatureCodes;
import com.crrepa.ble.nrf.dfu.BaseDfuImpl;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.DfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.HexFileValidationException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.CRC32;

/* loaded from: classes3.dex */
abstract class BaseCustomDfuImpl extends BaseDfuImpl {
    private boolean mFirmwareUploadInProgress;
    private boolean mInitPacketInProgress;
    protected final int mPacketsBeforeNotification;
    protected int mPacketsSentSinceNotification;
    protected boolean mRemoteErrorOccurred;

    protected class BaseCustomBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        protected BaseCustomBluetoothCallback() {
            super();
        }

        protected void handleNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
            BaseCustomDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
            BaseCustomDfuImpl.this.mFirmwareUploadInProgress = false;
        }

        protected void handlePacketReceiptNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BaseCustomDfuImpl baseCustomDfuImpl;
            int i8;
            if (!BaseCustomDfuImpl.this.mFirmwareUploadInProgress) {
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
                return;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(BaseCustomDfuImpl.this.getDfuServiceUUID()).getCharacteristic(BaseCustomDfuImpl.this.getPacketCharacteristicUUID());
            try {
                BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                baseCustomDfuImpl2.mPacketsSentSinceNotification = 0;
                baseCustomDfuImpl2.waitIfPaused();
                BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl3.mAborted && baseCustomDfuImpl3.mError == 0 && !baseCustomDfuImpl3.mRemoteErrorOccurred && !baseCustomDfuImpl3.mResetRequestSent) {
                    boolean isComplete = baseCustomDfuImpl3.mProgressInfo.isComplete();
                    boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                    if (!isComplete && !isObjectComplete) {
                        int availableObjectSizeIsBytes = BaseCustomDfuImpl.this.mProgressInfo.getAvailableObjectSizeIsBytes();
                        BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                        byte[] bArr = baseCustomDfuImpl4.mBuffer;
                        if (availableObjectSizeIsBytes < bArr.length) {
                            bArr = new byte[availableObjectSizeIsBytes];
                        }
                        BaseCustomDfuImpl.this.writePacket(bluetoothGatt, characteristic, bArr, baseCustomDfuImpl4.mFirmwareStream.read(bArr));
                        return;
                    }
                    BaseCustomDfuImpl.this.mFirmwareUploadInProgress = false;
                    BaseCustomDfuImpl.this.notifyLock();
                    return;
                }
                baseCustomDfuImpl3.mFirmwareUploadInProgress = false;
                BaseCustomDfuImpl.this.mService.sendLogBroadcast(15, "Upload terminated");
            } catch (HexFileValidationException unused) {
                BaseCustomDfuImpl.this.loge("Invalid HEX file");
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                i8 = 4099;
                baseCustomDfuImpl.mError = i8;
            } catch (IOException e8) {
                BaseCustomDfuImpl.this.loge("Error while reading the input stream", e8);
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                i8 = 4100;
                baseCustomDfuImpl.mError = i8;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            BaseCustomDfuImpl baseCustomDfuImpl;
            BaseCustomDfuImpl baseCustomDfuImpl2;
            int i9;
            if (i8 != 0) {
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl.mResetRequestSent) {
                    baseCustomDfuImpl.loge("Characteristic write error: " + i8);
                    baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                    i9 = i8 | 16384;
                    baseCustomDfuImpl2.mError = i9;
                    BaseCustomDfuImpl.this.notifyLock();
                }
            } else {
                if (bluetoothGattCharacteristic.getUuid().equals(BaseCustomDfuImpl.this.getPacketCharacteristicUUID())) {
                    if (BaseCustomDfuImpl.this.mInitPacketInProgress) {
                        BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
                        BaseCustomDfuImpl.this.mInitPacketInProgress = false;
                    } else if (BaseCustomDfuImpl.this.mFirmwareUploadInProgress) {
                        BaseCustomDfuImpl.this.mProgressInfo.addBytesSent(bluetoothGattCharacteristic.getValue().length);
                        BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                        int i10 = baseCustomDfuImpl3.mPacketsSentSinceNotification + 1;
                        baseCustomDfuImpl3.mPacketsSentSinceNotification = i10;
                        int i11 = baseCustomDfuImpl3.mPacketsBeforeNotification;
                        boolean z7 = i11 > 0 && i10 == i11;
                        boolean isComplete = baseCustomDfuImpl3.mProgressInfo.isComplete();
                        boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                        if (z7) {
                            return;
                        }
                        if (isComplete || isObjectComplete) {
                            BaseCustomDfuImpl.this.mFirmwareUploadInProgress = false;
                        } else {
                            try {
                                BaseCustomDfuImpl.this.waitIfPaused();
                                BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                                if (!baseCustomDfuImpl4.mAborted && baseCustomDfuImpl4.mError == 0 && !baseCustomDfuImpl4.mRemoteErrorOccurred && !baseCustomDfuImpl4.mResetRequestSent) {
                                    int availableObjectSizeIsBytes = baseCustomDfuImpl4.mProgressInfo.getAvailableObjectSizeIsBytes();
                                    BaseCustomDfuImpl baseCustomDfuImpl5 = BaseCustomDfuImpl.this;
                                    byte[] bArr = baseCustomDfuImpl5.mBuffer;
                                    if (availableObjectSizeIsBytes < bArr.length) {
                                        bArr = new byte[availableObjectSizeIsBytes];
                                    }
                                    BaseCustomDfuImpl.this.writePacket(bluetoothGatt, bluetoothGattCharacteristic, bArr, baseCustomDfuImpl5.mFirmwareStream.read(bArr));
                                    return;
                                }
                                baseCustomDfuImpl4.mFirmwareUploadInProgress = false;
                                BaseCustomDfuImpl.this.mService.sendLogBroadcast(15, "Upload terminated");
                                BaseCustomDfuImpl.this.notifyLock();
                                return;
                            } catch (HexFileValidationException unused) {
                                BaseCustomDfuImpl.this.loge("Invalid HEX file");
                                baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                                i9 = 4099;
                            } catch (IOException e8) {
                                BaseCustomDfuImpl.this.loge("Error while reading the input stream", e8);
                                baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                                i9 = 4100;
                            }
                        }
                    } else {
                        onPacketCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i8);
                    }
                    BaseCustomDfuImpl.this.notifyLock();
                }
                BaseCustomDfuImpl.this.mService.sendLogBroadcast(5, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
            }
            baseCustomDfuImpl.mRequestCompleted = true;
            BaseCustomDfuImpl.this.notifyLock();
        }

        protected void onPacketCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r9 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r9 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    BaseCustomDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        int i8 = 0;
        int i9 = 12;
        if (intent.hasExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED)) {
            boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED, Build.VERSION.SDK_INT < 23);
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE, 12);
            if (intExtra >= 0 && intExtra <= 65535) {
                i9 = intExtra;
            }
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(dfuBaseService);
            boolean z7 = defaultSharedPreferences.getBoolean(DfuSettingsConstants.SETTINGS_PACKET_RECEIPT_NOTIFICATION_ENABLED, Build.VERSION.SDK_INT < 23);
            try {
                int parseInt = Integer.parseInt(defaultSharedPreferences.getString(DfuSettingsConstants.SETTINGS_NUMBER_OF_PACKETS, String.valueOf(12)));
                if (parseInt >= 0 && parseInt <= 65535) {
                    i9 = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        this.mPacketsBeforeNotification = i8;
    }

    private void writeInitPacket(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (bArr.length != i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            bArr = bArr2;
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mInitPacketInProgress = true;
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(bArr);
        logi("Sending init packet (Value = " + parse(bArr) + ")");
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid());
        this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mInitPacketInProgress && this.mConnected && this.mError == 0) {
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
        if (this.mError != 0) {
            throw new DfuException("Unable to write Init DFU Parameters", this.mError);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Init DFU Parameters: device disconnected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writePacket(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i8) {
        if (i8 <= 0) {
            return;
        }
        if (bArr.length != i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            bArr = bArr2;
        }
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(bArr);
        bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    protected void finalize(Intent intent, boolean z7) {
        boolean z8;
        boolean z9 = false;
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_KEEP_BOND, false);
        this.mService.refreshDeviceCache(this.mGatt, z7 || !booleanExtra);
        this.mService.close(this.mGatt);
        if (this.mGatt.getDevice().getBondState() == 12) {
            boolean booleanExtra2 = intent.getBooleanExtra(DfuBaseService.EXTRA_RESTORE_BOND, false);
            if (booleanExtra2 || !booleanExtra) {
                removeBond();
                this.mService.waitFor(2000);
                z8 = true;
            } else {
                z8 = false;
            }
            if (!booleanExtra2 || (this.mFileType & 4) <= 0) {
                z9 = z8;
            } else {
                createBond();
            }
        }
        if (this.mProgressInfo.isLastPart()) {
            if (!z9) {
                this.mService.waitFor(FeatureCodes.POSE);
            }
            this.mProgressInfo.setProgress(-6);
            return;
        }
        logi("Starting service that will upload application");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        intent2.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, DfuBaseService.MIME_TYPE_ZIP);
        intent2.putExtra(DfuBaseService.EXTRA_FILE_TYPE, 4);
        intent2.putExtra(DfuBaseService.EXTRA_PART_CURRENT, this.mProgressInfo.getCurrentPart() + 1);
        intent2.putExtra(DfuBaseService.EXTRA_PARTS_TOTAL, this.mProgressInfo.getTotalParts());
        restartService(intent2, true);
    }

    protected abstract UUID getControlPointCharacteristicUUID();

    protected abstract UUID getDfuServiceUUID();

    protected abstract UUID getPacketCharacteristicUUID();

    protected void uploadFirmwareImage(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mFirmwareUploadInProgress = true;
        this.mPacketsSentSinceNotification = 0;
        byte[] bArr = this.mBuffer;
        try {
            int read = this.mFirmwareStream.read(bArr);
            this.mService.sendLogBroadcast(1, "Sending firmware to characteristic " + bluetoothGattCharacteristic.getUuid() + "...");
            writePacket(this.mGatt, bluetoothGattCharacteristic, bArr, read);
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (this.mFirmwareUploadInProgress && this.mReceivedData == null && this.mConnected && this.mError == 0) {
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
            if (this.mError != 0) {
                throw new DfuException("Uploading Firmware Image failed", this.mError);
            }
            if (!this.mConnected) {
                throw new DeviceDisconnectedException("Uploading Firmware Image failed: device disconnected");
            }
        } catch (HexFileValidationException unused) {
            throw new DfuException("HEX file not valid", 4099);
        } catch (IOException unused2) {
            throw new DfuException("Error while reading file", 4100);
        }
    }

    protected void writeInitData(BluetoothGattCharacteristic bluetoothGattCharacteristic, CRC32 crc32) {
        try {
            byte[] bArr = this.mBuffer;
            while (true) {
                int read = this.mInitPacketStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    return;
                }
                writeInitPacket(bluetoothGattCharacteristic, bArr, read);
                if (crc32 != null) {
                    crc32.update(bArr, 0, read);
                }
            }
        } catch (IOException e8) {
            loge("Error while reading Init packet file", e8);
            throw new DfuException("Error while reading Init packet file", 4098);
        }
    }
}
