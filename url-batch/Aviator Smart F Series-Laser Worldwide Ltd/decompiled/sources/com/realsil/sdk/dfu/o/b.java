package com.realsil.sdk.dfu.o;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.LeScannerPresenter;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public abstract class b extends com.realsil.sdk.dfu.m.e {

    /* renamed from: f0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16241f0;

    /* renamed from: g0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16242g0;

    /* renamed from: h0, reason: collision with root package name */
    public BluetoothGattCharacteristic f16243h0;

    /* renamed from: i0, reason: collision with root package name */
    public List f16244i0;

    public b(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    public void E() {
        c(new byte[]{4});
    }

    public void F() {
        int i8;
        getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
        if (this.f15964n) {
            E();
            i8 = 258;
        } else {
            i8 = 523;
        }
        notifyStateChanged(i8);
    }

    public int G() {
        if (this.Z == null) {
            ZLogger.w("no mControlPointCharacteristic found");
            return 0;
        }
        ZLogger.d("<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        a(this.Z, new byte[]{9}, false);
        try {
            if (this.DBG) {
                ZLogger.d("... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            }
            byte[] bArr = b(1600L).f16064d;
            if (bArr[0] == 1) {
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
        } catch (DfuException unused) {
            ZLogger.w("Read DFU_REPORT_OTA_FUNCTION_VERSION failed, just think remote is normal function.");
            this.mErrorState = 0;
        }
        return 0;
    }

    public boolean H() {
        return false;
    }

    public abstract boolean I();

    public void J() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        L();
        M();
        K();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    public void K() {
        if (getOtaDeviceInfo().specVersion != 0) {
            List list = this.f16244i0;
            byte[] bArr = null;
            if (list == null || list.size() <= 0) {
                getOtaDeviceInfo().setImageVersionValues(null);
                ZLogger.d(this.DBG, "no ImageVersionCharacteristics to read");
                return;
            }
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16244i0) {
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
        if (this.f16242g0 != null) {
            ZLogger.v("read patch version");
            byte[] a9 = a(this.f16242g0);
            if (a9 != null) {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(a9);
                    wrap.order(ByteOrder.LITTLE_ENDIAN);
                    getOtaDeviceInfo().setPatchVersion(wrap.getInt(0));
                } catch (Exception e8) {
                    ZLogger.e(e8.toString());
                }
            }
        }
        if (this.f16241f0 != null) {
            ZLogger.v("read app version");
            byte[] a10 = a(this.f16241f0);
            if (a10 != null) {
                try {
                    ByteBuffer wrap2 = ByteBuffer.wrap(a10);
                    wrap2.order(ByteOrder.LITTLE_ENDIAN);
                    getOtaDeviceInfo().setAppVersion(wrap2.getInt(0));
                } catch (Exception e9) {
                    ZLogger.e(e9.toString());
                }
            }
        }
        if (this.f16243h0 != null) {
            ZLogger.v("read patch extension version");
            byte[] a11 = a(this.f16243h0);
            if (a11 != null) {
                ByteBuffer wrap3 = ByteBuffer.wrap(a11);
                wrap3.order(ByteOrder.LITTLE_ENDIAN);
                getOtaDeviceInfo().setPatchExtensionVersion(wrap3.getShort(0) & u.MAX_VALUE);
            }
        }
    }

    public boolean L() {
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

    public boolean M() {
        if (this.U == null) {
            return false;
        }
        if (this.VDBG) {
            ZLogger.v("start to read remote dev Mac Addr info");
        }
        return getOtaDeviceInfo().parseDeviceMac(a(this.U));
    }

    public boolean N() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.Z, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.d(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
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
        ZLogger.w(String.format("start dfu failed (0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    public boolean P() {
        if (!C()) {
            return false;
        }
        if (getOtaDeviceInfo().isBufferCheckEnabled()) {
            this.f15967q = G();
        } else {
            this.f15967q = 0;
        }
        if (this.VDBG) {
            ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
        }
        if (H()) {
            Q();
        }
        getDfuProgressInfo().start();
        f(10131);
        g(getDfuProgressInfo().getCurImageId());
        A();
        if (this.mImageUpdateOffset == 0) {
            O();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.VDBG, "Last send reach the bottom");
        } else {
            h(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        i(getDfuProgressInfo().getCurImageId());
        return true;
    }

    public void Q() {
        a((byte) 7);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public void a(int i8, int i9) {
        ZLogger.d("<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)");
        a(this.Z, new byte[]{2, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255)}, false);
    }

    public void b(byte b8) {
        c(new byte[]{4, b8});
    }

    public void c(byte[] bArr) {
        int errCode;
        notifyStateChanged(DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET);
        boolean z7 = false;
        try {
            ZLogger.d("<< OPCODE_DFU_ACTIVE_IMAGE_RESET(0x04)");
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
        ZLogger.d("image active success");
        e(this.mErrorState);
        closeInputStream(this.mCurBinInputStream);
    }

    public boolean d(byte[] bArr, int i8) {
        if (bArr == null) {
            ZLogger.w("buffer == null");
            return false;
        }
        short a8 = com.realsil.sdk.dfu.j.c.a(bArr, i8);
        if (this.TDBG) {
            ZLogger.v(String.format(Locale.US, "bufferCheck (%d) >> (%d) %s", Short.valueOf(a8), Integer.valueOf(i8), DataConverter.bytes2Hex(bArr)));
        }
        if (this.DBG) {
            ZLogger.d("<< OPCODE_DFU_REPORT_BUFFER_CRC(0x0A)");
        }
        a(this.Z, new byte[]{10, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)}, false);
        if (this.VDBG) {
            ZLogger.v("... waiting OPCODE_DFU_REPORT_BUFFER_CRC(0x0A) response");
        }
        byte[] bArr2 = t().f16064d;
        byte b8 = bArr2[0];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(1);
        if (this.DBG) {
            ZLogger.d(String.format(Locale.US, "status:0x%02X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (b8 == 1) {
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            return false;
        }
        throw new OtaException("buffer check failed", b8 | 512);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public boolean e(BluetoothGatt bluetoothGatt) {
        if (!super.e(bluetoothGatt)) {
            return false;
        }
        BluetoothGattService bluetoothGattService = this.R;
        UUID uuid = e.f16247c;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(uuid);
        this.f16242g0 = characteristic;
        if (characteristic == null) {
            ZLogger.d(this.DBG, "OTA_READ_PATCH_CHARACTERISTIC_UUID not found:" + uuid);
        } else if (this.VDBG) {
            ZLogger.d("find OTA_PATCH_VERSION_CHARACTERISTIC_UUID: " + uuid.toString());
        }
        BluetoothGattService bluetoothGattService2 = this.R;
        UUID uuid2 = e.f16248d;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattService2.getCharacteristic(uuid2);
        this.f16241f0 = characteristic2;
        if (characteristic2 == null) {
            ZLogger.d(this.DBG, "OTA_READ_APP_CHARACTERISTIC_UUID not found: " + uuid2);
        } else if (this.VDBG) {
            ZLogger.d("find OTA_APP_VERSION_CHARACTERISTIC_UUID: " + uuid2.toString());
        }
        BluetoothGattService bluetoothGattService3 = this.R;
        UUID uuid3 = e.f16249e;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattService3.getCharacteristic(uuid3);
        this.f16243h0 = characteristic3;
        if (characteristic3 == null) {
            ZLogger.d(this.DBG, "OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID not found:" + uuid3);
        } else if (this.VDBG) {
            ZLogger.d("find OTA_PATCH_EXTENSION_VERSION_CHARACTERISTIC_UUID: " + uuid3.toString());
        }
        this.f16244i0 = new ArrayList();
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
            this.f16244i0.add(characteristic4);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
        int innerCheck;
        super.executeOtaProcedure();
        try {
            innerCheck = innerCheck();
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            notifyError(0);
        }
        if (innerCheck != 0) {
            notifyError(innerCheck);
            return;
        }
        I();
        closeInputStream(this.mCurBinInputStream);
        if (this.DBG) {
            ZLogger.d("ProcessorX0013N stopped");
        }
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    public void f(int i8) {
        BaseBinInputStream baseBinInputStream;
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null) {
            return;
        }
        Iterator<BaseBinInputStream> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                baseBinInputStream = null;
                break;
            } else {
                baseBinInputStream = it.next();
                if (baseBinInputStream.getImageId() == i8) {
                    break;
                }
            }
        }
        if (baseBinInputStream == null) {
            return;
        }
        a(baseBinInputStream.getImageId(), baseBinInputStream.imageVersion);
    }

    public void g(int i8) {
        if (this.DBG) {
            ZLogger.d("<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        }
        a(this.Z, new byte[]{6, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        if (this.DBG) {
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
        String format;
        int i9 = this.mImageUpdateOffset;
        if (i9 == 0) {
            this.mImageUpdateOffset = 12;
            if (this.DBG) {
                format = String.format(Locale.US, "First Packet, mImageUpdateOffset=0x%08X(%d)", 12, Integer.valueOf(this.mImageUpdateOffset));
                ZLogger.v(format);
            }
        } else if (this.DBG) {
            format = String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset));
            ZLogger.v(format);
        }
        a(i8, this.mImageUpdateOffset);
        if (y()) {
            return;
        }
        this.imageFileLoaded = false;
        m();
        alignmentSendBytes(this.mImageUpdateOffset, false);
    }

    public void i(int i8) {
        ZLogger.d(this.DBG, "<< OPCODE_DFU_VALIDATE_FW_IMAGE (0x03)");
        a(this.Z, new byte[]{3, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        byte b8 = b(com.realsil.sdk.dfu.j.c.b(getDfuProgressInfo().getImageSizeInBytes())).f16064d[0];
        if (b8 != 1) {
            ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b8)));
            throw new OtaException("Validate FW failed", b8 | 512);
        }
        if (this.DBG) {
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

    public void a(int i8, long j8) {
        ZLogger.v(String.format("<< OPCODE_DFU_CHECK_IMAGE(0x%02X)", (byte) 13));
        a(this.Z, new byte[]{13, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255)}, false);
        if (this.DBG) {
            ZLogger.v("... Reading OPCODE_DFU_CHECK_IMAGE(0x01) notification");
        }
        byte b8 = t().f16064d[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("0x%02X: check image failed", Byte.valueOf(b8)));
        throw new OtaException("check image failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0043, code lost:
    
        if (y() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
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
                    ZLogger.v(String.format(Locale.US, "mCurrentMaxBufferSize=%d", Integer.valueOf(this.f15968r)));
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

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.v("uploadFirmwareImage");
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
                    ZLogger.w("Error while reading file with size: " + i10);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, i10);
                }
                a(bluetoothGatt, bluetoothGattCharacteristic, bArr, i10, false);
                this.mImageUpdateOffset += i10;
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
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

    public void a(DfuException dfuException) {
        ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + dfuException.toString());
        int errCode = dfuException.getErrCode();
        if (errCode == 4128) {
            notifyError(errCode, true);
            return;
        }
        if (errCode == 4097 || errCode == 265) {
            notifyError(errCode, false);
            return;
        }
        N();
        if (this.mOtaWorkMode == 0) {
            waitUntilDisconnected();
        }
        notifyError(errCode, false);
    }
}
