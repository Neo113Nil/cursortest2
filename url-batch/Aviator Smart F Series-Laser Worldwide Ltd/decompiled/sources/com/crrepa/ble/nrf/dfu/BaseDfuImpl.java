package com.crrepa.ble.nrf.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.crrepa.ble.nrf.dfu.DfuCallback;
import com.crrepa.ble.nrf.dfu.internal.ArchiveInputStream;
import com.crrepa.ble.nrf.dfu.internal.exception.DeviceDisconnectedException;
import com.crrepa.ble.nrf.dfu.internal.exception.DfuException;
import com.crrepa.ble.nrf.dfu.internal.exception.UploadAbortedException;
import com.crrepa.ble.nrf.dfu.internal.scanner.BootloaderScannerFactory;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.UUID;

/* loaded from: classes3.dex */
abstract class BaseDfuImpl implements DfuService {
    protected static final int INDICATIONS = 2;
    protected static final int MAX_PACKET_SIZE_DEFAULT = 20;
    protected static final int NOTIFICATIONS = 1;
    private static final String TAG = "DfuImpl";
    protected boolean mAborted;
    protected int mError;
    protected int mFileType;
    protected InputStream mFirmwareStream;
    protected BluetoothGatt mGatt;
    protected int mImageSizeInBytes;
    protected int mInitPacketSizeInBytes;
    protected InputStream mInitPacketStream;
    protected boolean mPaused;
    protected DfuProgressInfo mProgressInfo;
    protected boolean mRequestCompleted;
    protected boolean mResetRequestSent;
    protected DfuBaseService mService;
    protected static final UUID GENERIC_ATTRIBUTE_SERVICE_UUID = new UUID(26392574038016L, -9223371485494954757L);
    protected static final UUID SERVICE_CHANGED_UUID = new UUID(46200963207168L, -9223371485494954757L);
    protected static final UUID CLIENT_CHARACTERISTIC_CONFIG = new UUID(45088566677504L, -9223371485494954757L);
    protected static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    protected final Object mLock = new Object();
    protected byte[] mReceivedData = null;
    protected byte[] mBuffer = new byte[20];
    protected boolean mConnected = true;

    protected class BaseBluetoothGattCallback extends DfuCallback.DfuGattCallback {
        protected BaseBluetoothGattCallback() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            if (i8 == 0) {
                baseDfuImpl.mService.sendLogBroadcast(5, "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value (0x): " + parse(bluetoothGattCharacteristic));
                BaseDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
                BaseDfuImpl.this.mRequestCompleted = true;
            } else {
                baseDfuImpl.loge("Characteristic read error: " + i8);
                BaseDfuImpl.this.mError = i8 | 16384;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            if (i8 != 0) {
                BaseDfuImpl.this.loge("Descriptor read error: " + i8);
                BaseDfuImpl.this.mError = i8 | 16384;
            } else if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(bluetoothGattDescriptor.getUuid())) {
                BaseDfuImpl.this.mService.sendLogBroadcast(5, "Read Response received from descr." + bluetoothGattDescriptor.getCharacteristic().getUuid() + ", value (0x): " + parse(bluetoothGattDescriptor));
                if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                    BaseDfuImpl.this.mRequestCompleted = true;
                } else {
                    BaseDfuImpl.this.loge("Unknown descriptor read");
                }
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i8) {
            DfuBaseService dfuBaseService;
            StringBuilder sb;
            String str;
            if (i8 != 0) {
                BaseDfuImpl.this.loge("Descriptor write error: " + i8);
                BaseDfuImpl.this.mError = i8 | 16384;
            } else if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(bluetoothGattDescriptor.getUuid())) {
                BaseDfuImpl.this.mService.sendLogBroadcast(5, "Data written to descr." + bluetoothGattDescriptor.getCharacteristic().getUuid() + ", value (0x): " + parse(bluetoothGattDescriptor));
                if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                    dfuBaseService = BaseDfuImpl.this.mService;
                    sb = new StringBuilder();
                    str = "Indications enabled for ";
                } else {
                    dfuBaseService = BaseDfuImpl.this.mService;
                    sb = new StringBuilder();
                    str = "Notifications enabled for ";
                }
                sb.append(str);
                sb.append(bluetoothGattDescriptor.getCharacteristic().getUuid());
                dfuBaseService.sendLogBroadcast(1, sb.toString());
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // com.crrepa.ble.nrf.dfu.DfuCallback.DfuGattCallback
        public void onDisconnected() {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            baseDfuImpl.mConnected = false;
            baseDfuImpl.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i8, int i9) {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            if (i9 == 0) {
                baseDfuImpl.mService.sendLogBroadcast(5, "MTU changed to: " + i8);
                int i10 = i8 + (-3);
                BaseDfuImpl baseDfuImpl2 = BaseDfuImpl.this;
                if (i10 > baseDfuImpl2.mBuffer.length) {
                    baseDfuImpl2.mBuffer = new byte[i10];
                }
                baseDfuImpl2.logw("MTU changed to: " + i8);
            } else {
                baseDfuImpl.logw("Changing MTU failed: " + i9 + " (mtu: " + i8 + ")");
            }
            BaseDfuImpl baseDfuImpl3 = BaseDfuImpl.this;
            baseDfuImpl3.mRequestCompleted = true;
            baseDfuImpl3.notifyLock();
        }

        protected String parse(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return parse(bluetoothGattCharacteristic.getValue());
        }

        protected String parse(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return parse(bluetoothGattDescriptor.getValue());
        }

        private String parse(byte[] bArr) {
            int length;
            if (bArr == null || (length = bArr.length) == 0) {
                return "";
            }
            char[] cArr = new char[(length * 3) - 1];
            for (int i8 = 0; i8 < length; i8++) {
                byte b8 = bArr[i8];
                int i9 = i8 * 3;
                char[] cArr2 = BaseDfuImpl.HEX_ARRAY;
                cArr[i9] = cArr2[(b8 & 255) >>> 4];
                cArr[i9 + 1] = cArr2[b8 & 15];
                if (i8 != length - 1) {
                    cArr[i9 + 2] = '-';
                }
            }
            return new String(cArr);
        }
    }

    BaseDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        this.mService = dfuBaseService;
        this.mProgressInfo = dfuBaseService.mProgressInfo;
    }

    private boolean createBondApi18(BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod("createBond", new Class[0]);
            if (method != null) {
                this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond() (hidden)");
                return ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue();
            }
        } catch (Exception e8) {
            Log.w(TAG, "An exception occurred while creating bond", e8);
        }
        return false;
    }

    private boolean isServiceChangedCCCDEnabled() {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattDescriptor descriptor;
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        BluetoothGatt bluetoothGatt = this.mGatt;
        BluetoothGattService service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) == null || (descriptor = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG)) == null) {
            return false;
        }
        this.mRequestCompleted = false;
        this.mError = 0;
        logi("Reading Service Changed CCCD value...");
        this.mService.sendLogBroadcast(1, "Reading Service Changed CCCD value...");
        this.mService.sendLogBroadcast(0, "gatt.readDescriptor(" + descriptor.getUuid() + ")");
        bluetoothGatt.readDescriptor(descriptor);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to read Service Changed CCCD", this.mError);
        }
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
        }
        if (descriptor.getValue() == null || descriptor.getValue().length != 2) {
            return false;
        }
        byte b8 = descriptor.getValue()[0];
        byte[] bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
        return b8 == bArr[0] && descriptor.getValue()[1] == bArr[1];
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuController
    public void abort() {
        this.mPaused = false;
        this.mAborted = true;
        notifyLock();
    }

    @SuppressLint({"NewApi"})
    protected boolean createBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        if (device.getBondState() == 12) {
            return true;
        }
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Starting pairing...");
        this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond()");
        boolean createBond = device.createBond();
        try {
            synchronized (this.mLock) {
                while (!this.mRequestCompleted && !this.mAborted) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        return createBond;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
    
        if (r5 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
    
        if (r10.mConnected == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        if (r10.mError == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r10.mLock.wait();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (r4.getValue() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        if (r4.getValue().length != 2) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        if (r4.getValue()[0] <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fa, code lost:
    
        if (r4.getValue()[1] != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        if (r10.mPaused == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        throw r12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e3 -> B:31:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ea -> B:31:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f2 -> B:31:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00fa -> B:31:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d8 -> B:35:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void enableCCCD(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i8) {
        BluetoothGatt bluetoothGatt = this.mGatt;
        String str = i8 == 1 ? "notifications" : "indications";
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to set " + str + " state: device disconnected");
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG);
        boolean z7 = descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0 && descriptor.getValue()[1] == 0;
        if (z7) {
            return;
        }
        logi("Enabling " + str + "...");
        this.mService.sendLogBroadcast(1, "Enabling " + str + " for " + bluetoothGattCharacteristic.getUuid());
        this.mService.sendLogBroadcast(0, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        descriptor.setValue(i8 == 1 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        DfuBaseService dfuBaseService = this.mService;
        StringBuilder sb = new StringBuilder();
        sb.append("gatt.writeDescriptor(");
        sb.append(descriptor.getUuid());
        sb.append(i8 == 1 ? ", value=0x01-00)" : ", value=0x02-00)");
        dfuBaseService.sendLogBroadcast(0, sb.toString());
        bluetoothGatt.writeDescriptor(descriptor);
        try {
            synchronized (this.mLock) {
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to set " + str + " state", this.mError);
        }
        if (this.mConnected) {
            return;
        }
        throw new DeviceDisconnectedException("Unable to set " + str + " state: device disconnected");
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i8, InputStream inputStream, InputStream inputStream2) {
        int i9;
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        this.mGatt = bluetoothGatt;
        this.mFileType = i8;
        this.mFirmwareStream = inputStream;
        this.mInitPacketStream = inputStream2;
        int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_PART_CURRENT, 1);
        int intExtra2 = intent.getIntExtra(DfuBaseService.EXTRA_PARTS_TOTAL, 1);
        if (i8 > 4) {
            logw("DFU target does not support (SD/BL)+App update, splitting into 2 parts");
            this.mService.sendLogBroadcast(15, "Sending system components");
            int i10 = this.mFileType & (-5);
            this.mFileType = i10;
            ((ArchiveInputStream) this.mFirmwareStream).setContentType(i10);
            intExtra2 = 2;
        }
        if (intExtra == 2) {
            this.mService.sendLogBroadcast(15, "Sending application");
        }
        int i11 = 0;
        try {
            i9 = inputStream2.available();
        } catch (Exception unused) {
            i9 = 0;
        }
        this.mInitPacketSizeInBytes = i9;
        try {
            i11 = inputStream.available();
        } catch (Exception unused2) {
        }
        this.mImageSizeInBytes = i11;
        this.mProgressInfo.init(i11, intExtra, intExtra2);
        if (Build.VERSION.SDK_INT < 23 && bluetoothGatt.getDevice().getBondState() == 12 && (service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID)) != null && (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) != null) {
            if (!isServiceChangedCCCDEnabled()) {
                enableCCCD(characteristic, 2);
            }
            this.mService.sendLogBroadcast(10, "Service Changed indications enabled");
        }
        return true;
    }

    protected boolean isBonded() {
        return this.mGatt.getDevice().getBondState() == 12;
    }

    void loge(String str) {
        Log.e(TAG, str);
    }

    void logi(String str) {
        if (DfuBaseService.DEBUG) {
            Log.i(TAG, str);
        }
    }

    void logw(String str) {
        if (DfuBaseService.DEBUG) {
            Log.w(TAG, str);
        }
    }

    protected void notifyLock() {
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuCallback
    public void onBondStateChanged(int i8) {
        this.mRequestCompleted = true;
        notifyLock();
    }

    protected String parse(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        char[] cArr = new char[(length * 3) - 1];
        for (int i8 = 0; i8 < length; i8++) {
            byte b8 = bArr[i8];
            int i9 = i8 * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[i9] = cArr2[(b8 & 255) >>> 4];
            cArr[i9 + 1] = cArr2[b8 & 15];
            if (i8 != length - 1) {
                cArr[i9 + 2] = '-';
            }
        }
        return new String(cArr);
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuController
    public void pause() {
        this.mPaused = true;
    }

    protected byte[] readNotificationResponse() {
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (this.mReceivedData == null && this.mConnected && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                        if (!this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
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
            throw new DfuException("Unable to write Op Code", this.mError);
        }
        if (this.mConnected) {
            return this.mReceivedData;
        }
        throw new DeviceDisconnectedException("Unable to write Op Code: device disconnected");
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuService
    public void release() {
        this.mService = null;
    }

    protected boolean removeBond() {
        Exception e8;
        BluetoothDevice device = this.mGatt.getDevice();
        boolean z7 = true;
        if (device.getBondState() == 10) {
            return true;
        }
        this.mService.sendLogBroadcast(1, "Removing bond information...");
        try {
            Method method = device.getClass().getMethod("removeBond", new Class[0]);
            if (method != null) {
                this.mRequestCompleted = false;
                this.mService.sendLogBroadcast(0, "gatt.getDevice().removeBond() (hidden)");
                boolean booleanValue = ((Boolean) method.invoke(device, new Object[0])).booleanValue();
                try {
                    try {
                        synchronized (this.mLock) {
                            while (!this.mRequestCompleted && !this.mAborted) {
                                try {
                                    this.mLock.wait();
                                } finally {
                                }
                            }
                        }
                    } catch (InterruptedException e9) {
                        loge("Sleeping interrupted", e9);
                    }
                } catch (Exception e10) {
                    e8 = e10;
                    z7 = booleanValue;
                    Log.w(TAG, "An exception occurred while removing bond information", e8);
                    return z7;
                }
            }
        } catch (Exception e11) {
            e8 = e11;
            z7 = false;
        }
        return z7;
    }

    @RequiresApi(api = 21)
    protected void requestMtu(int i8) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Requesting new MTU...");
        this.mService.sendLogBroadcast(0, "gatt.requestMtu(" + i8 + ")");
        if (this.mGatt.requestMtu(i8)) {
            try {
                synchronized (this.mLock) {
                    while (true) {
                        try {
                            if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
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
            if (!this.mConnected) {
                throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
            }
        }
    }

    protected void restartService(Intent intent, boolean z7) {
        String str;
        String str2;
        if (z7) {
            this.mService.sendLogBroadcast(1, "Scanning for the DFU Bootloader...");
            str = BootloaderScannerFactory.getScanner().searchFor(this.mGatt.getDevice().getAddress());
            logi("Scanning for new address finished with: " + str);
            DfuBaseService dfuBaseService = this.mService;
            if (str != null) {
                str2 = "DFU Bootloader found with address " + str;
            } else {
                str2 = "DFU Bootloader not found. Trying the same address...";
            }
            dfuBaseService.sendLogBroadcast(5, str2);
        } else {
            str = null;
        }
        if (str != null) {
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, str);
        }
        this.mService.startService(intent);
    }

    @Override // com.crrepa.ble.nrf.dfu.DfuController
    public void resume() {
        this.mPaused = false;
        notifyLock();
    }

    protected void waitIfPaused() {
        try {
            synchronized (this.mLock) {
                while (this.mPaused) {
                    try {
                        this.mLock.wait();
                    } finally {
                    }
                }
            }
        } catch (InterruptedException e8) {
            loge("Sleeping interrupted", e8);
        }
    }

    protected void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z7) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mRequestCompleted = false;
        this.mResetRequestSent = z7;
        bluetoothGattCharacteristic.setWriteType(2);
        bluetoothGattCharacteristic.setValue(bArr);
        this.mService.sendLogBroadcast(1, "Writing to characteristic " + bluetoothGattCharacteristic.getUuid());
        this.mService.sendLogBroadcast(0, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
        try {
            synchronized (this.mLock) {
                while (true) {
                    try {
                        if (!this.mRequestCompleted && this.mConnected && this.mError == 0) {
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
        boolean z8 = this.mResetRequestSent;
        if (!z8 && this.mError != 0) {
            throw new DfuException("Unable to write Op Code " + ((int) bArr[0]), this.mError);
        }
        if (z8 || this.mConnected) {
            return;
        }
        throw new DeviceDisconnectedException("Unable to write Op Code " + ((int) bArr[0]) + ": device disconnected");
    }

    void loge(String str, Throwable th) {
        Log.e(TAG, str, th);
    }
}
