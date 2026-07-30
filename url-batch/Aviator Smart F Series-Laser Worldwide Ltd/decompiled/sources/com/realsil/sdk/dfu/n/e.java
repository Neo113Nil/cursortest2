package com.realsil.sdk.dfu.n;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
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
import com.realsil.sdk.dfu.m.i;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.m.k;
import com.realsil.sdk.dfu.m.l;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class e extends com.realsil.sdk.dfu.m.e {

    /* renamed from: f0, reason: collision with root package name */
    public List f16231f0;

    public e(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
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

    public void G() {
        byte[] hex2Bytes = DataConverter.hex2Bytes(DfuUtils.genNonceHexString(16));
        byte[] aesEncrypt = this.f15962l.aesEncrypt(hex2Bytes, 0, hex2Bytes.length);
        byte[] a8 = d.a(hex2Bytes);
        byte[] aesEncrypt2 = this.f15962l.aesEncrypt(a8, 0, a8.length);
        k a9 = new k.b().a(hex2Bytes, aesEncrypt).b(a8, aesEncrypt2).a();
        if (this.VDBG) {
            ZLogger.v("originData:\n" + DataConverter.bytes2Hex(hex2Bytes));
            ZLogger.v("targetData:\n" + DataConverter.bytes2Hex(a8));
        }
        a(this.Z, a9.a(), false);
        if (this.DBG) {
            ZLogger.v("... Reading OPCODE_DFU_HANDSHAKE notification");
        }
        i a10 = i.a(t());
        if (a10 == null || a10.a() != 1) {
            ZLogger.w("hand shake failed");
            throw new OtaException("hand shake failed", DfuException.ERROR_DFU_HAND_SHAKE_FAILED);
        }
        byte[] bArr = a10.f16060b;
        if (bArr == null || bArr.length <= 0) {
            ZLogger.w("hand shake failed, invalid response");
            throw new OtaException("hand shake failed", DfuException.ERROR_DFU_HAND_SHAKE_FAILED);
        }
        if (Arrays.equals(bArr, aesEncrypt2)) {
            ZLogger.d(this.DBG, "hand shake OK");
        } else {
            ZLogger.w("hand shake failed, conflict data");
            throw new OtaException("hand shake failed", DfuException.ERROR_DFU_HAND_SHAKE_FAILED);
        }
    }

    public final boolean H() {
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null) {
            return false;
        }
        Iterator<BaseBinInputStream> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        int binId = it.next().getBinId();
        return binId == 517 || binId == 519;
    }

    public boolean I() {
        return getOtaDeviceInfo().isHandShakeSupported();
    }

    public boolean J() {
        return getOtaDeviceInfo().specVersion == 2 || getOtaDeviceInfo().specVersion == 4;
    }

    public boolean K() {
        return false;
    }

    public abstract boolean L();

    public void M() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        O();
        P();
        N();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    public void N() {
        List list = this.f16231f0;
        byte[] bArr = null;
        if (list == null || list.size() <= 0) {
            getOtaDeviceInfo().setImageVersionValues(null);
            ZLogger.v(this.VDBG, "no ImageVersionCharacteristics to read");
            return;
        }
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16231f0) {
            ZLogger.v(this.DBG ? "read image version : " + bluetoothGattCharacteristic.getUuid().toString() : "read image version");
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
    }

    public boolean O() {
        if (this.T == null) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("start to read remote dev info");
        }
        byte[] a8 = a(this.T);
        if (a8 == null) {
            ZLogger.w("Get dev info failed");
            throw new OtaException("get remote dev info failed", 270);
        }
        getOtaDeviceInfo().parseX0012(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        return true;
    }

    public boolean P() {
        if (this.U == null) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("start to read remote dev Mac Addr info");
        }
        return getOtaDeviceInfo().parseDeviceMac(a(this.U));
    }

    public int Q() {
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

    public boolean R() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.Z, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.w(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public boolean S() {
        if (!C()) {
            return false;
        }
        if (I()) {
            G();
        }
        if (this.DBG) {
            ZLogger.d("isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        }
        if (getOtaDeviceInfo().isBufferCheckEnabled()) {
            this.f15967q = Q();
        } else {
            this.f15967q = 0;
        }
        if (this.DBG) {
            ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
        }
        if (K()) {
            T();
        }
        getDfuProgressInfo().start();
        if (J()) {
            f(getDfuProgressInfo().getCurImageId());
        }
        g(getDfuProgressInfo().getCurImageId());
        A();
        if (this.mImageUpdateOffset == 0) {
            ZLogger.v(this.DBG, String.format("specVersion=0x%04X, compressed=%b", Integer.valueOf(getOtaDeviceInfo().specVersion), Boolean.valueOf(this.mCurBinInputStream.compressed)));
            if (getOtaDeviceInfo().specVersion < 5 || !this.mCurBinInputStream.compressed) {
                c((byte) 0);
            } else {
                c((byte) 4);
            }
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.d(this.DBG, "Last send reach the bottom");
        } else {
            h(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        notifyProcessChanged();
        i(getDfuProgressInfo().getCurImageId());
        return true;
    }

    public void T() {
        a((byte) 7);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public void a(int i8, int i9) {
        ZLogger.d("<< OPCODE_DFU_RECEIVE_FW_IMAGE (0x02)");
        a(this.Z, new byte[]{2, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255)}, false);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            if (this.VDBG) {
                ZLogger.v("start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            }
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.w("Something error in OTA process, errorCode: " + e8 + "mProcessState" + this.mProcessState);
                notifyError(e8, true);
                return false;
            }
        }
        if (z7) {
            try {
                E();
                notifyStateChanged(258);
            } catch (DfuException e9) {
                ZLogger.w(e9.toString());
                notifyError(e9.getErrCode());
            }
        } else {
            if (R() && this.mOtaWorkMode == 0) {
                waitUntilDisconnected();
            }
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    public void b(byte b8) {
        c(new byte[]{4, b8});
    }

    public void c(byte b8) {
        ZLogger.v(this.DBG, String.format("<< OPCODE_DFU_START_DFU(%d)", Byte.valueOf(b8)));
        byte[] bArr = new byte[16];
        System.arraycopy(this.mCurBinInputStream.getDfuHeader(), 0, bArr, 0, 12);
        bArr[12] = b8;
        byte[] bArr2 = new byte[17];
        bArr2[0] = 1;
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            System.arraycopy(this.f15962l.aesEncrypt(bArr, 0, 16), 0, bArr2, 1, 16);
        } else {
            System.arraycopy(bArr, 0, bArr2, 1, 16);
        }
        a(this.Z, bArr2, false);
        if (this.VDBG) {
            ZLogger.v("... Reading OPCODE_DFU_START_DFU(0x01) notification");
        }
        byte b9 = t().f16064d[0];
        if (b9 != 1) {
            if (b9 == 2) {
                throw new OtaException("start dfu failed", b9 | 512);
            }
            ZLogger.w(String.format("0x%02X(not supported), start dfu failed", Byte.valueOf(b9)));
            throw new OtaException("start dfu failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
        }
    }

    public boolean d(byte[] bArr, int i8) {
        if (bArr == null) {
            ZLogger.w("buffer == null");
            return false;
        }
        if (this.TDBG) {
            ZLogger.v(String.format(Locale.US, "bufferCheck (%d) >> (%d) %s", Integer.valueOf(i8), Integer.valueOf(bArr.length), DataConverter.bytes2Hex(bArr)));
        }
        l a8 = new l.b().a(bArr, i8).a();
        if (this.DBG) {
            ZLogger.d("<< " + a8.toString());
        }
        i a9 = i.a(a(a8.b(), a8.a()));
        if (a9 == null) {
            return false;
        }
        byte a10 = a9.a();
        ByteBuffer wrap = ByteBuffer.wrap(a9.f16060b);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(0);
        if (this.DBG) {
            ZLogger.d(String.format(Locale.US, "status:0x%02X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(a10), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (a10 == 1) {
            return true;
        }
        if (a10 == 5 || a10 == 6) {
            return false;
        }
        throw new OtaException("DFU_STATUS_FLASH_ERASE_ERROR", a10 | 512);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean e() {
        return getOtaDeviceInfo().specVersion < 4;
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
        L();
        closeInputStream(this.mCurBinInputStream);
        if (this.DBG) {
            ZLogger.d("GattDfuTaskX0000 stopped");
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
            ZLogger.d("... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
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
        if (this.mImageUpdateOffset == 0 && e()) {
            this.mImageUpdateOffset = 12;
            if (this.VDBG) {
                ZLogger.v(String.format(Locale.US, "skip image header (%d)", 12));
            }
        }
        b(i8, this.mImageUpdateOffset);
    }

    public void i(int i8) {
        ZLogger.d(this.DBG, "<< OPCODE_DFU_VALIDATE_FW_IMAGE (0x03)");
        a(this.Z, new byte[]{3, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        byte b8 = b((getOtaDeviceInfo().icType == 5 || getOtaDeviceInfo().icType == 9 || getOtaDeviceInfo().icType == 12) ? com.realsil.sdk.dfu.j.c.b(getDfuProgressInfo().getImageSizeInBytes()) : 10000).f16064d[0];
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
            R();
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

    private void a(int i8, long j8) {
        ZLogger.v(String.format("<< OPCODE_DFU_CHECK_IMAGE(0x%02X)", (byte) 13));
        a(this.Z, new byte[]{13, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255)}, false);
        if (this.DBG) {
            ZLogger.v("... Reading OPCODE_DFU_CHECK_IMAGE notification");
        }
        byte b8 = t().f16064d[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("0x%02X: check image failed", Byte.valueOf(b8)));
        throw new OtaException("check image failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
    }

    public void b(int i8, int i9) {
        a(i8, i9);
        if (!y()) {
            this.imageFileLoaded = false;
            m();
            alignmentSendBytesCompat(this.mImageUpdateOffset, false);
        }
        if (this.VDBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
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

    @Override // com.realsil.sdk.dfu.m.e
    public boolean e(BluetoothGatt bluetoothGatt) {
        if (!super.e(bluetoothGatt)) {
            return false;
        }
        this.f16231f0 = new ArrayList();
        for (int i8 = 65504; i8 < 65519; i8++) {
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic = this.R.getCharacteristic(fromShortValue);
            if (characteristic == null) {
                if (!this.VDBG) {
                    return true;
                }
                ZLogger.v("not found image version characteristic:" + fromShortValue.toString());
                return true;
            }
            if (this.VDBG) {
                ZLogger.v("find image version characteristic: " + fromShortValue.toString());
            }
            this.f16231f0.add(characteristic);
        }
        return true;
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.v(this.DBG, "uploadFirmwareImageForBeeUpdate");
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
                if (getDfuProgressInfo().getBytesSent() == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0040, code lost:
    
        if (y() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int min;
        BaseBinInputStream baseBinInputStream2;
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
                    ZLogger.v(String.format(Locale.US, "uploadFirmwareWithBufferCheck.<%d> mCurrentMaxBufferSize=%d", Integer.valueOf(i10), Integer.valueOf(this.f15968r)));
                }
                if (i10 <= 0) {
                    try {
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                n();
                int i11 = this.mImageUpdateOffset;
                int i12 = 12;
                if (i11 == 0) {
                    System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    int i13 = i9 - 12;
                    byte[] bArr2 = new byte[i13];
                    int read = this.mCurBinInputStream.read(bArr2, i13);
                    if (read > 0) {
                        System.arraycopy(bArr2, 0, bArr, 12, read);
                        i12 = read + 12;
                    }
                } else {
                    if (i11 == 12) {
                        min = i9 - 12;
                        baseBinInputStream2 = this.mCurBinInputStream;
                    } else {
                        min = Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes());
                        baseBinInputStream2 = this.mCurBinInputStream;
                    }
                    i12 = baseBinInputStream2.read(bArr, min);
                }
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(i12);
                if (this.DBG) {
                    ZLogger.d(getDfuProgressInfo().toString());
                }
                if (correctBufferCheckSize > 0) {
                    if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                        a(bArr, correctBufferCheckSize);
                    }
                    int i14 = this.f15969s;
                    byte[] bArr3 = new byte[i14];
                    int i15 = 0;
                    while (i15 < correctBufferCheckSize) {
                        int min2 = Math.min(i14, correctBufferCheckSize - i15);
                        System.arraycopy(bArr, i15, bArr3, 0, min2);
                        a(bluetoothGatt, bluetoothGattCharacteristic, bArr3, min2, false);
                        i15 += min2;
                        k();
                        if (getDfuConfig().getBufferCheckConfig().getPacketInterval() > 0) {
                            sleepInner(getDfuConfig().getBufferCheckConfig().getPacketInterval());
                        }
                    }
                    boolean d8 = d(bArr, correctBufferCheckSize);
                    if (d8) {
                        i10 = 0;
                    } else {
                        getDfuProgressInfo().addBytesSent(-correctBufferCheckSize);
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
                    ZLogger.i("image file has already been send over");
                }
            }
            i8 = i10;
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
        R();
        if (this.mOtaWorkMode == 0) {
            waitUntilDisconnected();
        }
        notifyError(errCode, false);
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

    public boolean a(BaseBinInputStream baseBinInputStream, BaseBinInputStream baseBinInputStream2, int i8, int i9, int i10) {
        int remainSizeInBytes;
        int i11 = baseBinInputStream2.tempBufferCheckUpgradeOrder;
        if (i11 == 0) {
            if (baseBinInputStream == null || baseBinInputStream.tempBufferCheckUpgradeOrder == i11) {
                return false;
            }
            ZLogger.v(this.DBG, "update order type changed");
            return true;
        }
        if (i11 == 1 || !H()) {
            remainSizeInBytes = baseBinInputStream2.remainSizeInBytes();
        } else if (i8 >= 0 && i8 < this.pendingImageInputStreams.size()) {
            remainSizeInBytes = 0;
            while (i8 < this.pendingImageInputStreams.size()) {
                BaseBinInputStream baseBinInputStream3 = this.pendingImageInputStreams.get(i8);
                if (baseBinInputStream3.tempBufferCheckUpgradeOrder != baseBinInputStream2.tempBufferCheckUpgradeOrder) {
                    break;
                }
                remainSizeInBytes += baseBinInputStream3.remainSizeInBytes();
                i8++;
            }
        } else {
            remainSizeInBytes = 0;
        }
        ZLogger.v(this.DBG, String.format(Locale.US, "totalRemainSize=%d, mBytesSentBuffer=%d, bufferSize=%d", Integer.valueOf(remainSizeInBytes), Integer.valueOf(i9), Integer.valueOf(i10)));
        return remainSizeInBytes + i9 > i10;
    }
}
