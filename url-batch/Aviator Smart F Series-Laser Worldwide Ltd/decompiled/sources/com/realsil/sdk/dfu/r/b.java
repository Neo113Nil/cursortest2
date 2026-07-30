package com.realsil.sdk.dfu.r;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.ByteArrayConverter;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public abstract class b extends com.realsil.sdk.dfu.m.e {

    /* renamed from: f0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16269f0;

    /* renamed from: g0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16270g0;

    /* renamed from: h0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16271h0;

    /* renamed from: i0, reason: collision with root package name */
    public List f16272i0;

    public b(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    public void E() {
        c(new byte[]{4});
    }

    public void F() {
        if (getDfuConfig().getActiveImageDelayTime().longValue() > 0) {
            sleepInner(getDfuConfig().getActiveImageDelayTime().longValue());
        }
    }

    public int G() {
        byte[] bArr;
        if (this.Z == null) {
            ZLogger.w("no mControlPointCharacteristic found");
            return 0;
        }
        ZLogger.d("<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        a(this.Z, new byte[]{9}, false);
        try {
            if (this.VDBG) {
                ZLogger.v("... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            }
            bArr = b(1600L).f16064d;
        } catch (DfuException unused) {
            ZLogger.w("Read OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE exception, just think remote is normal function.");
            this.mErrorState = 0;
        }
        if (bArr[0] != 1) {
            ZLogger.d("Read OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE failed, just think remote is normal function.");
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i8 = (((short) (wrap.get(2) & 255)) << 8) | ((short) (wrap.get(1) & 255));
        int i9 = ((short) (wrap.get(3) & 255)) | (((short) (wrap.get(4) & 255)) << 8);
        if (this.DBG) {
            ZLogger.v("maxBufferSize=" + i8 + ", bufferCheckMtuSize=" + i9);
        }
        a(i8);
        d(i9);
        return 1;
    }

    public boolean H() {
        return true;
    }

    public void I() {
        int i8;
        int i9;
        if (getOtaDeviceInfo().specVersion != 0) {
            List list = this.f16272i0;
            byte[] bArr = null;
            if (list == null || list.size() <= 0) {
                getOtaDeviceInfo().setImageVersionValues(null);
                ZLogger.v(this.DBG, "no ImageVersionCharacteristics to read");
                return;
            }
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16272i0) {
                ZLogger.v(this.VDBG ? "read image version : " + bluetoothGattCharacteristic.getUuid().toString() : "read image version");
                byte[] a8 = a(bluetoothGattCharacteristic);
                if (a8 != null) {
                    if (bArr == null) {
                        bArr = a8;
                    } else {
                        byte[] bArr2 = new byte[bArr.length + a8.length];
                        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                        System.arraycopy(a8, 0, bArr2, bArr.length, a8.length);
                        bArr = bArr2;
                    }
                }
            }
            getOtaDeviceInfo().setImageVersionValues(bArr);
            return;
        }
        if (this.f16270g0 != null) {
            ZLogger.v("read patch version");
            byte[] a9 = a(this.f16270g0);
            if (a9 != null) {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(a9);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    if (getOtaDeviceInfo().icType > 3) {
                        if (getOtaDeviceInfo().icType != 5) {
                            if (getOtaDeviceInfo().icType != 9) {
                                if (getOtaDeviceInfo().icType == 12) {
                                }
                            }
                        }
                        i9 = wrap.getInt(0);
                        getOtaDeviceInfo().setPatchVersion(i9);
                    }
                    i9 = wrap.getShort(0) & u.MAX_VALUE;
                    getOtaDeviceInfo().setPatchVersion(i9);
                } catch (Exception e8) {
                    ZLogger.w(e8.toString());
                }
            }
        }
        if (this.f16269f0 != null) {
            ZLogger.v("read app version");
            byte[] a10 = a(this.f16269f0);
            if (a10 != null) {
                try {
                    ByteBuffer wrap2 = ByteBuffer.wrap(a10);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    if (getOtaDeviceInfo().icType > 3) {
                        if (getOtaDeviceInfo().icType != 5) {
                            if (getOtaDeviceInfo().icType != 9) {
                                if (getOtaDeviceInfo().icType == 12) {
                                }
                            }
                        }
                        i8 = wrap2.getInt(0);
                        getOtaDeviceInfo().setAppVersion(i8);
                    }
                    i8 = wrap2.getShort(0) & u.MAX_VALUE;
                    getOtaDeviceInfo().setAppVersion(i8);
                } catch (Exception e9) {
                    ZLogger.e(e9.toString());
                }
            }
        }
        if (this.f16271h0 != null) {
            ZLogger.v("read patch extension version");
            byte[] a11 = a(this.f16271h0);
            if (a11 != null) {
                ByteBuffer wrap3 = ByteBuffer.wrap(a11);
                wrap3.order(ByteOrder.LITTLE_ENDIAN);
                getOtaDeviceInfo().setPatchExtensionVersion(wrap3.getShort(0) & u.MAX_VALUE);
            }
        }
    }

    public boolean J() {
        if (this.T == null) {
            return false;
        }
        if (this.VDBG) {
            ZLogger.v("start to read remote dev info");
        }
        byte[] a8 = a(this.T);
        if (a8 == null) {
            ZLogger.w("Get dev info failed");
            throw new OtaException("get remote dev info failed", 270);
        }
        getOtaDeviceInfo().parseX0000(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        return true;
    }

    public boolean K() {
        if (this.U == null) {
            return false;
        }
        if (this.VDBG) {
            ZLogger.v("start to read remote dev Mac Addr info");
        }
        return getOtaDeviceInfo().parseDeviceMac(a(this.U));
    }

    public void L() {
        ZLogger.d(this.DBG, "<<  OPCODE_DFU_REPORT_CURRENT_BUFFER_SIZE(0x0A)");
        a(this.Z, new byte[]{10}, false);
        byte[] bArr = t().f16064d;
        byte b8 = bArr[0];
        if (b8 != 1) {
            ZLogger.w("Get remote buffer size info failed, status: " + ((int) b8));
            throw new OtaException("Get remote buffer size info failed", b8 | 512);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i8 = wrap.getInt(1);
        ZLogger.v(this.DBG, String.format(Locale.US, "maxBufferCheckSize=(0x%04X, %d)", Integer.valueOf(i8), Integer.valueOf(i8)));
        a(i8);
    }

    public int M() {
        byte b8;
        if (this.Z == null) {
            ZLogger.w("no mControlPointCharacteristic found");
            return 0;
        }
        ZLogger.v("<< OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION(0x09)");
        a(this.Z, new byte[]{9}, false);
        try {
            b8 = b(1600L).f16064d[0];
        } catch (DfuException unused) {
            ZLogger.w("Reading OPCODE_DFU_REPORT_OTA_FUNCTION_VERSION notification failed, just think remote is normal function.");
            this.mErrorState = 0;
        }
        if (b8 == 1) {
            return 1;
        }
        ZLogger.w("reportOtaFunctionVersion failed, status: " + ((int) b8));
        return 0;
    }

    public boolean N() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.Z, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.w(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public void O() {
        ZLogger.v("<< OPCODE_DFU_START_DFU(0x01)");
        byte[] bArr = new byte[16];
        System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
        byte[] bArr2 = new byte[17];
        bArr2[0] = 1;
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            System.arraycopy(this.f15962l.aesEncrypt(bArr, 0, 16), 0, bArr2, 1, 16);
        } else {
            System.arraycopy(bArr, 0, bArr2, 1, 16);
        }
        a(this.Z, bArr2, false);
        if (this.DBG) {
            ZLogger.v("... Reading OPCODE_DFU_START_DFU(0x01) notification");
        }
        byte b8 = t().f16064d[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed(0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    public void P() {
        ZLogger.d("<< OPCODE_DFU_CONNECTION_PARAMETER_UPDATE(0x07)");
        this.f16042c0 = (byte) 7;
        a((byte) 7);
        this.f16042c0 = (byte) -1;
    }

    @Override // com.realsil.sdk.dfu.m.e
    public void a(int i8, int i9) {
        ZLogger.v(this.VDBG, "<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)");
        a(this.Z, new byte[]{2, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255)}, false);
    }

    public void b(byte b8) {
        c(new byte[]{4, b8});
    }

    public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.v("uploadFirmwareImageForBeeUpdate");
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            startSpeedControl();
            if (this.DBG) {
                ZLogger.v(getDfuProgressInfo().toString());
            }
            try {
                if (this.mImageUpdateOffset == 0) {
                    int i9 = this.MAX_PACKET_SIZE;
                    byte[] bArr2 = new byte[i9];
                    baseBinInputStream.read(bArr2, i9 - 12);
                    System.arraycopy(baseBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    System.arraycopy(bArr2, 0, bArr, 12, this.MAX_PACKET_SIZE - 12);
                    read = this.MAX_PACKET_SIZE;
                } else {
                    read = baseBinInputStream.read(bArr, i8);
                }
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    ZLogger.v("reach the end of the file, only read some");
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                int i10 = read;
                if (i10 <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + i10);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, i10);
                }
                a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i10, false);
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0055, code lost:
    
        if (y() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.v(this.DBG, "uploadFirmwareWithBufferCheck ...");
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = 0;
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            int i9 = this.f15968r;
            byte[] bArr = new byte[i9];
            int i10 = i8;
            while (true) {
                if (this.DBG) {
                    ZLogger.v(String.format(Locale.US, "mCurrentMaxBufferSize=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f15968r), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
                }
                if (i10 <= 0) {
                    try {
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                n();
                if (this.mImageUpdateOffset == 0) {
                    read = 12;
                    System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    int i11 = i9 - 12;
                    byte[] bArr2 = new byte[i11];
                    int read2 = this.mCurBinInputStream.read(bArr2, i11);
                    if (read2 > 0) {
                        System.arraycopy(bArr2, 0, bArr, 12, read2);
                        read = read2 + 12;
                    }
                    getDfuProgressInfo().setBytesSent(0);
                } else {
                    read = this.mCurBinInputStream.read(bArr, Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes()));
                }
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(read);
                if (this.DBG) {
                    ZLogger.d(getDfuProgressInfo().toString());
                }
                if (correctBufferCheckSize > 0) {
                    if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                        a(bArr, correctBufferCheckSize);
                    }
                    int i12 = this.f15969s;
                    byte[] bArr3 = new byte[i12];
                    int i13 = 0;
                    while (i13 < correctBufferCheckSize) {
                        int min = Math.min(i12, correctBufferCheckSize - i13);
                        System.arraycopy(bArr, i13, bArr3, 0, min);
                        startSpeedControl();
                        a(bluetoothGatt, bluetoothGattCharacteristic, bArr3, min, false);
                        i13 += min;
                        k();
                        blockSpeedControl();
                    }
                    boolean d8 = d(bArr, correctBufferCheckSize);
                    if (d8) {
                        i10 = 0;
                    } else {
                        getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                        i10++;
                        ZLogger.w("check failed, retransTimes: " + i10);
                    }
                    if (i10 >= 3) {
                        ZLogger.w("Error while buffer check, reach max try times: " + i10 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                        throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                    }
                    if (d8) {
                        break;
                    }
                } else {
                    if (!getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.w("Error while reading file with size: " + correctBufferCheckSize);
                        throw new OtaException("Error while reading file", 257);
                    }
                    ZLogger.d("image file has already been send over");
                }
            }
            i8 = i10;
        }
    }

    @Override // com.realsil.sdk.dfu.m.e
    public boolean e(BluetoothGatt bluetoothGatt) {
        if (!super.e(bluetoothGatt)) {
            return false;
        }
        BluetoothGattService bluetoothGattService = this.R;
        UUID uuid = h.f16279c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.f16270g0 = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.DBG, "OTA_READ_PATCH_CHARACTERISTIC_UUID not found:" + uuid);
        } else if (this.VDBG) {
            ZLogger.v("find OTA_PATCH_VERSION_CHARACTERISTIC_UUID: " + uuid.toString());
        }
        BluetoothGattService bluetoothGattService2 = this.R;
        UUID uuid2 = h.f16280d;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.f16269f0 = characteristic2;
        if (characteristic2 == null) {
            ZLogger.d(this.VDBG, "OTA_READ_APP_CHARACTERISTIC_UUID not found: " + uuid2);
        } else if (this.VDBG) {
            ZLogger.v("find OTA_APP_VERSION_CHARACTERISTIC_UUID: " + uuid2.toString());
        }
        BluetoothGattService bluetoothGattService3 = this.R;
        UUID uuid3 = h.f16281e;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.f16271h0 = characteristic3;
        if (characteristic3 == null) {
            ZLogger.d(this.VDBG, "OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID not found:" + uuid3);
        } else if (this.VDBG) {
            ZLogger.v("find OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID: " + uuid3.toString());
        }
        this.f16272i0 = new ArrayList();
        for (int i8 = 65504; i8 < 65519; i8++) {
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic4 = this.R.getCharacteristic(fromShortValue);
            if (characteristic4 == null) {
                if (!this.VDBG) {
                    return true;
                }
                ZLogger.v("not found image version characteristic:" + fromShortValue.toString());
                return true;
            }
            if (this.VDBG) {
                ZLogger.v("find image version characteristic: " + fromShortValue.toString());
            }
            this.f16272i0.add(characteristic4);
        }
        return true;
    }

    public boolean f(int i8) {
        ZLogger.d(String.format("<< OPCODE_DFU_CHECK_CURRENT_BUFFER(0x0B) , crc=0x%04X", Integer.valueOf(i8)));
        a(this.Z, new byte[]{11}, false);
        if (this.DBG) {
            ZLogger.d("... waiting CHECK_CURRENT_BUFFER response");
        }
        byte[] bArr = t().f16064d;
        byte b8 = bArr[0];
        if (b8 == 1) {
            short s7 = ByteArrayConverter.toShort(bArr, 1, 0);
            if (s7 == i8) {
                return true;
            }
            ZLogger.w(this.DBG, "CRC check error, local: " + i8 + ", remote : " + ((int) s7));
        } else {
            ZLogger.w("check current buffer failed, status: " + ((int) b8));
        }
        return false;
    }

    public void g(int i8) {
        if (this.VDBG) {
            ZLogger.d("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        }
        a(this.Z, new byte[]{6, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        if (this.TDBG) {
            ZLogger.v("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
        }
        com.realsil.sdk.dfu.t.d a8 = com.realsil.sdk.dfu.t.d.a(t());
        if (a8.b() != 1) {
            String format = String.format("0x%02X, Get target image info failed", Byte.valueOf(a8.b()));
            ZLogger.e(format);
            throw new OtaException(format, a8.b() | 512);
        }
        ZLogger.v(this.VDBG, a8.toString());
        this.mImageUpdateOffset = a8.c();
        this.mImageBufferCheckOffset = a8.a();
    }

    public void h(int i8) {
        if (this.mImageUpdateOffset == 0) {
            this.mImageUpdateOffset = 12;
            if (this.VDBG) {
                ZLogger.v(String.format(Locale.US, "skip image header (%d)", 12));
            }
        }
        a(i8, this.mImageUpdateOffset);
        if (!y()) {
            this.imageFileLoaded = false;
            m();
            if (getOtaDeviceInfo().specVersion >= 1) {
                alignmentSendBytesCompat(this.mImageUpdateOffset, false);
            } else {
                alignmentSendBytes(this.mImageUpdateOffset, false);
            }
        }
        if (this.VDBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
    }

    public void i(int i8) {
        int i9 = this.mImageUpdateOffset;
        if (i9 == 0) {
            i9 = 12;
        }
        a(i8, i9);
        if (getDfuProgressInfo().getBytesSent() != this.mImageUpdateOffset) {
            ZLogger.v(this.VDBG, "mBytesSent != mImageUpdateOffset, reload image bin file");
            this.imageFileLoaded = false;
            m();
            alignmentSendBytes(this.mImageUpdateOffset, false);
        }
        if (this.DBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
    }

    public void j(int i8) {
        ZLogger.d(this.DBG, "<< OPCODE_DFU_VALIDATE_FW_IMAGE (0x03)");
        a(this.Z, new byte[]{3, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        byte b8 = b((getOtaDeviceInfo().icType == 5 || getOtaDeviceInfo().icType == 9 || getOtaDeviceInfo().icType == 12) ? com.realsil.sdk.dfu.j.c.b(getDfuProgressInfo().getImageSizeInBytes()) : 10000).f16064d[0];
        if (b8 != 1) {
            ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b8)));
            throw new OtaException("Validate FW failed", b8 | 512);
        }
        if (this.VDBG) {
            ZLogger.d("Validate FW success");
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void notifyError(int i8, boolean z7) {
        if (this.mAborted) {
            i8 = 4128;
        }
        if (i8 != 4128) {
            notifyStateChanged(260, true);
        }
        ZLogger.v(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i8), Boolean.valueOf(z7)));
        if (z7) {
            N();
        }
        LeScannerPresenter leScannerPresenter = this.E;
        if (leScannerPresenter != null) {
            leScannerPresenter.stopScan();
        }
        closeInputStream(this.mCurBinInputStream);
        if (getDfuConfig().isErrorActionEnabled(1)) {
            e(i8);
        }
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onError(i8);
        }
        this.mAborted = true;
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int i8;
        if (this.DBG) {
            ZLogger.d(String.format(Locale.US, "updateImageWithCheckBufferForBee1, packetSize=%d, mCurrentMaxBufferSize=%d", Integer.valueOf(this.MAX_PACKET_SIZE), Integer.valueOf(this.f15968r)));
        }
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i9 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i9];
        byte[] bArr2 = new byte[this.f15968r];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            if (H()) {
                a(baseBinInputStream);
            }
            if (this.DBG) {
                ZLogger.v(getDfuProgressInfo().toString());
            }
            try {
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(baseBinInputStream.read(bArr2));
                byte[] bArr3 = new byte[this.f15968r];
                int i10 = 0;
                while (true) {
                    int i11 = 0;
                    while (i11 < correctBufferCheckSize) {
                        int min = Math.min(i9, correctBufferCheckSize - i11);
                        System.arraycopy(bArr2, i11, bArr, 0, min);
                        if (getOtaDeviceInfo().isAesEncryptEnabled() && min >= 16) {
                            System.arraycopy(this.f15962l.aesEncrypt(bArr, 0, 16), 0, bArr, 0, 16);
                        } else if (min <= 0) {
                            ZLogger.e("Error while reading file with bufferSize= " + min);
                            throw new OtaException("Error while reading file", 257);
                        }
                        System.arraycopy(bArr, 0, bArr3, i11, min);
                        a(bluetoothGatt, bluetoothGattCharacteristic, bArr, min, false);
                        k();
                        i11 += min;
                    }
                    if (this.VDBG) {
                        ZLogger.v("pos: " + i11 + ", checkImageBufferSize: " + correctBufferCheckSize);
                    }
                    boolean f8 = f(com.realsil.sdk.dfu.a.a.a(bArr2, 0, correctBufferCheckSize));
                    if (f8) {
                        i8 = i10;
                    } else {
                        getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                        i8 = i10 + 1;
                        ZLogger.w("check failed, retransBufferCheckTimes: " + i8);
                    }
                    a(f8);
                    if (i8 >= 3) {
                        ZLogger.w("Error while buffer check, reach max try times: " + i8 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                        throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                    }
                    if (f8) {
                        break;
                    } else {
                        i10 = i8;
                    }
                }
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            a(baseBinInputStream);
            if (this.DBG) {
                ZLogger.v(getDfuProgressInfo().toString());
            }
            startSpeedControl();
            try {
                int read = baseBinInputStream.read(bArr, i8);
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    if (this.DBG) {
                        ZLogger.v("reach the end of the file, only read some");
                    }
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                int i9 = read;
                if (i9 <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.d("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + i9);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, i9);
                }
                a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i9, false);
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    public void c(byte[] bArr) {
        int errCode;
        notifyStateChanged(DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET);
        boolean z7 = false;
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)");
            z7 = a(this.Z, bArr, false);
            errCode = 0;
        } catch (DfuException e8) {
            if (e8.getErrCode() == 4128) {
                errCode = 4128;
            } else if (getDfuConfig().isWaitActiveCmdAckEnabled()) {
                ZLogger.w("active cmd has no response, notify error");
                errCode = e8.getErrCode();
            } else {
                ZLogger.d(this.DBG, "active cmd has no response, ignore");
                errCode = 0;
                z7 = true;
            }
        }
        if (!z7) {
            throw new OtaException(errCode);
        }
        ZLogger.d(this.DBG, "image active success");
        e(this.mErrorState);
        closeInputStream(this.mCurBinInputStream);
    }

    public boolean d(byte[] bArr, int i8) {
        if (bArr == null) {
            ZLogger.w(this.VDBG, "buffer == null");
            return false;
        }
        short a8 = com.realsil.sdk.dfu.j.c.a(bArr, i8);
        if (this.TDBG) {
            ZLogger.v(String.format(Locale.US, "bufferCheck (%d) >> (%d) %s", Short.valueOf(a8), Integer.valueOf(i8), DataConverter.bytes2Hex(bArr)));
        }
        a(this.Z, new byte[]{10, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)}, false);
        byte[] bArr2 = t().f16064d;
        byte b8 = bArr2[0];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(1);
        if (this.VDBG) {
            ZLogger.v(String.format(Locale.US, "status:0x%02X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (b8 == 1) {
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            return false;
        }
        throw new OtaException("buffer check failed", b8 | 512);
    }

    public void a(boolean z7) {
        ZLogger.d("<< OPCODE_DFU_ENSURE_CURRENT_BUFFER(0x0C)");
        a(this.Z, new byte[]{12, !z7 ? 1 : 0}, false);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public synchronized void b(j jVar) {
        try {
            int i8 = jVar.f16062b;
            if (i8 == 7) {
                a(jVar);
                return;
            }
            if (i8 == 8) {
                updateRemoteState(jVar.f16063c >= 1 ? jVar.f16064d[0] : (byte) 0);
                return;
            }
            synchronized (this.f15965o) {
                this.J = jVar;
                this.L = true;
                this.f15965o.notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
