package com.realsil.sdk.dfu.s;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.ParcelUuid;
import com.realsil.sdk.core.bluetooth.compat.BluetoothUuidCompat;
import com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.f;
import com.realsil.sdk.dfu.m.p;
import com.realsil.sdk.dfu.m.q;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.s.b;
import com.realsil.sdk.dfu.s.c;
import com.realsil.sdk.dfu.t.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import y5.u;

/* loaded from: classes4.dex */
public abstract class h extends com.realsil.sdk.dfu.m.e {

    /* renamed from: f0, reason: collision with root package name */
    public List f16293f0;

    /* renamed from: g0, reason: collision with root package name */
    public List f16294g0;

    public h(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    public void E() {
        c(new byte[]{4});
    }

    public void F() {
        byte[] bArr;
        int i8;
        if (getOtaDeviceInfo().specVersion < 6) {
            return;
        }
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null || list.size() <= 0) {
            bArr = null;
            i8 = 0;
        } else {
            bArr = new byte[this.pendingImageInputStreams.size() * 6];
            i8 = 0;
            for (BaseBinInputStream baseBinInputStream : this.pendingImageInputStreams) {
                if (baseBinInputStream.getPubKeyHash() != null && baseBinInputStream.getPubKeyHash().length == 4) {
                    int i9 = i8 * 6;
                    bArr[i9] = (byte) (baseBinInputStream.getImageId() & 255);
                    bArr[i9 + 1] = (byte) ((baseBinInputStream.getImageId() >> 8) & 255);
                    System.arraycopy(baseBinInputStream.getPubKeyHash(), 0, bArr, i9 + 2, 4);
                    i8++;
                }
            }
        }
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        a(this.Z, new b.C0329b().a(i8, bArr).a().a(), false);
        if (this.DBG) {
            ZLogger.d("... waiting OPCODE_DFU_CHECK_PUB_KEYS response");
        }
        com.realsil.sdk.dfu.m.j t7 = t();
        if (t7 == null || t7.f16063c <= 0 || t7.f16064d[0] != 1) {
            ZLogger.w("check pub key failed");
            throw new OtaException("ERROR_DFU_PUB_KEYS_CONFLICT", DfuException.ERROR_DFU_PUB_KEYS_CONFLICT);
        }
    }

    public abstract boolean G();

    public boolean H() {
        if (this.Z == null) {
            ZLogger.w(this.DBG, "no mControlPointCharacteristic found");
            return false;
        }
        ZLogger.d(this.DBG, "<< OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE(0x09)");
        a(this.Z, new byte[]{9}, false);
        try {
            ZLogger.d(this.DBG, "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            com.realsil.sdk.dfu.m.h a8 = com.realsil.sdk.dfu.m.h.a(getOtaDeviceInfo().protocolType, getOtaDeviceInfo().specVersion, b(1600L));
            if (a8 != null && a8.a()) {
                a(a8.f16056b);
                if (a8.f16057c) {
                    d(a8.f16058d);
                }
            }
            return true;
        } catch (DfuException unused) {
            ZLogger.w("enableBufferCheck failed, just think remote is normal function.");
            this.mErrorState = 0;
            return false;
        }
    }

    public int I() {
        int i8;
        if (!getOtaDeviceInfo().isBankEnabled() || getOtaDeviceInfo().specVersion < 4) {
            return 0;
        }
        ZLogger.d(String.format(Locale.US, "binId=0x%04X, activeCompareVersionFlag=%d, inactiveCompareVersionFlag=%d", Integer.valueOf(this.mCurBinInputStream.getBinId()), Integer.valueOf(this.mCurBinInputStream.getActiveCompareVersionFlag()), Integer.valueOf(this.mCurBinInputStream.getInactiveVersionCompFlag())));
        if (!b(this.mCurBinInputStream)) {
            return 0;
        }
        byte a8 = a(getDfuProgressInfo().getCurImageId(), this.mCurBinInputStream.getSha256());
        if ((a8 & 1) == 1) {
            ZLogger.d(this.DBG, "current image's sha256 is same as the inactive bank image, need to skip");
            i8 = 1;
        } else {
            i8 = 0;
        }
        if ((a8 & 2) == 2) {
            if (h(getDfuProgressInfo().getBinId())) {
                ZLogger.d(this.DBG, "current image's sha256 is same as the active bank image, need to copy");
                return i8 | 2;
            }
            ZLogger.v(this.DBG, String.format("0x%04X not support copy image", Integer.valueOf(getDfuProgressInfo().getBinId())));
        }
        return i8;
    }

    public boolean J() {
        return getOtaDeviceInfo().isBankEnabled() && getOtaDeviceInfo().specVersion >= 5 && b(10128);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r2 == 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean K() {
        int N;
        boolean z7 = false;
        while (a()) {
            try {
                if (!G()) {
                    return false;
                }
                B();
                F();
                int I = I();
                if (I == 2) {
                    N = L();
                } else if (I == 1) {
                    N = N();
                    if (N == 1) {
                        ZLogger.d("validate failed during skip, switch to push flow");
                    }
                    if (N == 0) {
                        return false;
                    }
                    if (N == 3) {
                        if (J()) {
                            M();
                        }
                        z7 = true;
                    }
                    sleepInner(1000L);
                    if (z7) {
                        return z7;
                    }
                } else if (I == 3) {
                    N = N();
                    if (N == 1) {
                        ZLogger.d("validate failed during skip, switch to copy flow");
                        N = L();
                        if (N == 1) {
                            ZLogger.d("validate failed during copy, switch to push flow");
                        }
                    }
                    if (N == 0) {
                    }
                }
                N = i();
                if (N == 0) {
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else {
                    if (errCode != 4097 && errCode != 265 && T() && this.mOtaWorkMode == 0) {
                        waitUntilDisconnected();
                    }
                    notifyError(errCode, false);
                }
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    public int L() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(521);
        getDfuProgressInfo().start();
        if (this.DBG) {
            ZLogger.v("processCopyProcedure ...");
            ZLogger.v(getDfuProgressInfo().toString());
        }
        try {
            f(getDfuProgressInfo().getCurImageId());
            getDfuProgressInfo().sendOver();
            notifyProcessChanged();
            this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
            if (getDfuProgressInfo().isLastImageFile()) {
                ZLogger.v(this.VDBG, "no pendding image file to upload");
                getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                return 3;
            }
            ZLogger.d(this.DBG, "has pending image file to upload");
            if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
                if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                    this.mOtaDeviceAddress = null;
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    b((byte) 1);
                }
                return 2;
            }
            this.mOtaDeviceAddress = this.mDeviceAddress;
            this.otaModeEnabled = false;
            this.mBytesSentBuffer = 0;
            E();
            j();
            return 2;
        } catch (DfuException unused) {
            return 1;
        }
    }

    public void M() {
        if (c(10132)) {
            g(10132);
        }
        if (c(10133)) {
            g(10133);
        }
        if (c(10134)) {
            g(10134);
        }
        if (c(10135)) {
            g(10135);
        }
        if (c(10136)) {
            g(10136);
        }
        if (c(10137)) {
            g(10137);
        }
        if (c(10138)) {
            g(10138);
        }
        if (c(10139)) {
            g(10139);
        }
    }

    public int N() {
        BaseBinInputStream baseBinInputStream;
        if (!a()) {
            notifyError(4128);
            return 0;
        }
        notifyStateChanged(521);
        ZLogger.d(this.DBG, String.format("otaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
        ZLogger.v(getDfuProgressInfo().toString());
        getDfuProgressInfo().start();
        i(getDfuProgressInfo().getCurImageId());
        A();
        ZLogger.v(this.DBG, String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        if (this.mImageUpdateOffset == 0) {
            if (this.mCurBinInputStream.compressed) {
                c((byte) 3);
            } else {
                U();
            }
        }
        if (this.mImageUpdateOffset >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.VDBG, "Last send reach the bottom");
        } else {
            j(getDfuProgressInfo().getCurImageId());
        }
        getDfuProgressInfo().sendOver();
        notifyProcessChanged();
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d("no pending image file to upload.");
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
            return 3;
        }
        ZLogger.d(this.DBG, "has pending image file to upload");
        if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            this.mOtaDeviceAddress = this.mDeviceAddress;
            this.otaModeEnabled = false;
            this.mBytesSentBuffer = 0;
            E();
        } else {
            if (getOtaDeviceInfo().getUpdateMechanism() != 3 || (baseBinInputStream = this.mNextBinInputStream) == null || !a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                a(getDfuProgressInfo().getCurImageId(), (byte) 0);
                return 2;
            }
            ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            this.mOtaDeviceAddress = null;
            this.otaModeEnabled = true;
            this.mBytesSentBuffer = 0;
            b((byte) 1);
        }
        j();
        return 2;
    }

    public void O() {
        boolean z7;
        String format;
        byte[] bArr = null;
        if (getOtaDeviceInfo().specVersion < 4) {
            List list = this.f16293f0;
            if (list == null || list.size() <= 0) {
                z7 = this.DBG;
                format = "no ImageVersionCharacteristics to read";
                ZLogger.d(z7, format);
            } else {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16293f0) {
                    if (this.VDBG) {
                        ZLogger.v("read active image version : " + bluetoothGattCharacteristic.getUuid().toString());
                    }
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
            }
        } else {
            BluetoothGattService bluetoothGattService = this.R;
            if (bluetoothGattService != null) {
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(BluetoothUuidCompat.fromShortValue(65504));
                if (characteristic != null) {
                    if (this.VDBG) {
                        ZLogger.v("read active image version : " + characteristic.getUuid().toString());
                    }
                    byte[] a9 = a(characteristic);
                    if (a9 != null) {
                        bArr = a9;
                    }
                } else {
                    z7 = this.DBG;
                    format = String.format("not found active image characteristic：0x%04X", 65504);
                    ZLogger.d(z7, format);
                }
            } else {
                ZLogger.w(this.DBG, "ota gatt service is null");
            }
        }
        getOtaDeviceInfo().setImageVersionValues(bArr);
    }

    public boolean P() {
        if (this.T == null) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("start to read remote device info");
        }
        byte[] a8 = a(this.T);
        if (a8 == null) {
            if (this.DBG) {
                ZLogger.v("read device info failed");
            }
            throw new OtaException("read remote device info failed", 270);
        }
        getOtaDeviceInfo().parseX0010(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        return true;
    }

    public boolean Q() {
        if (this.U == null) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("start to read remote dev Mac Addr info");
        }
        return getOtaDeviceInfo().parseDeviceMacV2(a(this.U));
    }

    public void R() {
        boolean z7;
        String format;
        byte[] bArr = null;
        if (getOtaDeviceInfo().specVersion < 4) {
            List list = this.f16294g0;
            if (list == null || list.size() <= 0) {
                z7 = this.DBG;
                format = "no ImageSectionCharacteristics to read";
                ZLogger.d(z7, format);
            } else {
                for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16294g0) {
                    if (this.VDBG) {
                        ZLogger.v("read image section size : " + bluetoothGattCharacteristic.getUuid().toString());
                    }
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
            }
        } else {
            BluetoothGattService bluetoothGattService = this.R;
            if (bluetoothGattService != null) {
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(BluetoothUuidCompat.fromShortValue(65524));
                if (characteristic != null) {
                    if (this.VDBG) {
                        ZLogger.v("read image section size : " + characteristic.getUuid().toString());
                    }
                    byte[] a9 = a(characteristic);
                    if (a9 != null) {
                        bArr = a9;
                    }
                } else {
                    z7 = this.DBG;
                    format = String.format("not found image section size characteristic：0x%04X", 65524);
                    ZLogger.d(z7, format);
                }
            } else {
                ZLogger.w(this.DBG, "ota gatt service is null");
            }
        }
        getOtaDeviceInfo().setImageSectionSizeValues(bArr);
    }

    public void S() {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.d(this.DBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        this.f15967q = (getOtaDeviceInfo().isBufferCheckEnabled() && H()) ? 1 : 0;
        ZLogger.v(this.VDBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
    }

    public boolean T() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.Z, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.d(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public void U() {
        c((byte) 0);
    }

    public void V() {
        a((byte) 7);
    }

    public final byte a(int i8, byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            ZLogger.v("invalid sha256:" + DataConverter.bytes2Hex(bArr));
            return (byte) 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c.C0331c(i8, bArr));
        c a8 = new c.b().a(new c.b().a(arrayList).a()).a();
        if (this.DBG) {
            ZLogger.v(a8.toString());
        }
        a(this.Z, a8.a(), false);
        if (this.VDBG) {
            ZLogger.d("... waiting OPCODE_DFU_CHECK_IMAGE response");
        }
        com.realsil.sdk.dfu.m.i a9 = com.realsil.sdk.dfu.m.i.a(t());
        if (a9 == null || a9.a() != 1) {
            return (byte) 0;
        }
        com.realsil.sdk.dfu.t.a a10 = com.realsil.sdk.dfu.t.a.a(a9.f16060b);
        if (this.DBG) {
            ZLogger.v(a10.toString());
        }
        return a9.a();
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            ZLogger.d(this.DBG, "start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.w(String.format("Something error in OTA process, errorCode: 0x%04X, mProcessState=0x%04X", Integer.valueOf(e8), Integer.valueOf(this.mProcessState)));
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
            if (T()) {
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
        int i8 = this.mCurBinInputStream.getCtrlHeaderLength() + 1 > 16 ? 32 : 16;
        byte[] bArr = new byte[i8];
        System.arraycopy(this.mCurBinInputStream.getDfuHeader(), 0, bArr, 0, this.mCurBinInputStream.getCtrlHeaderLength());
        bArr[this.mCurBinInputStream.getCtrlHeaderLength()] = b8;
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            a(bArr, i8);
        }
        p.b bVar = new p.b(getOtaDeviceInfo().specVersion);
        bVar.a(bArr);
        p a8 = bVar.a();
        if (this.VDBG) {
            ZLogger.d(a8.toString());
        }
        a(this.Z, a8.a(), false);
        if (this.VDBG) {
            ZLogger.v("... Reading OPCODE_DFU_START_DFU(0x01) notification");
        }
        byte b9 = t().f16064d[0];
        if (b9 != 1) {
            throw new OtaException("start dfu failed", b9 | 512);
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
        short a8 = com.realsil.sdk.dfu.j.c.a(bArr, i8);
        if (this.VDBG) {
            ZLogger.d("<< OPCODE_DFU_REPORT_BUFFER_CRC(0x0A)");
        }
        a(this.Z, new byte[]{10, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)}, false);
        if (this.DEBUG_DEV) {
            ZLogger.v("... waiting OPCODE_DFU_REPORT_BUFFER_CRC(0x0A) response");
        }
        byte[] bArr2 = t().f16064d;
        byte b8 = bArr2[0];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(1);
        if (this.VDBG) {
            ZLogger.d(String.format(Locale.US, "status:0x%04X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (b8 == 1) {
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            return false;
        }
        throw new OtaException("buffer check failed", b8 | 512);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean e() {
        return getOtaDeviceInfo().specVersion < 2;
    }

    public void f(int i8) {
        com.realsil.sdk.dfu.m.f a8 = new f.b().a(i8).a();
        if (this.DBG) {
            ZLogger.d(a8.toString());
        }
        a(this.Z, a8.a(), false);
        if (this.VDBG) {
            ZLogger.v("... Reading copy image notification");
        }
        byte b8 = t().f16064d[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("copyImage failed, status=0x%02X", Byte.valueOf(b8)));
        throw new OtaException("copyImage failed", DfuException.ERROR_DFU_COPY_IMAGE_FAILED);
    }

    public final boolean g(int i8) {
        notifyStateChanged(521);
        getDfuProgressInfo().start();
        if (this.VDBG) {
            ZLogger.v(String.format("forceCopyProcedure, imageId=0x%04X", Integer.valueOf(i8)));
            ZLogger.v(getDfuProgressInfo().toString());
        }
        f(i8);
        getDfuProgressInfo().sendOver();
        notifyProcessChanged();
        return true;
    }

    public boolean h(int i8) {
        return i8 == 1024 || i8 == 1040 || i8 == 1280 || i8 == 1538 || i8 == 2304;
    }

    public void i(int i8) {
        int i9;
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.v(this.VDBG, "<< OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06)");
        a(this.Z, new byte[]{6, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}, false);
        ZLogger.v(this.VDBG, "... Reading OPCODE_DFU_REPORT_TARGET_IMAGE_INFO(0x06) notification");
        com.realsil.sdk.dfu.m.j t7 = t();
        int i10 = t7 != null ? t7.f16063c : 0;
        if (i10 > 0) {
            byte[] bArr = t7.f16064d;
            if (bArr[0] == 1) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                if (i10 >= 11) {
                    i9 = wrap.getInt(1);
                    this.mImageUpdateOffset = wrap.getInt(5);
                    this.mImageBufferCheckOffset = wrap.getShort(9) & u.MAX_VALUE;
                } else if (i10 >= 9) {
                    i9 = wrap.getShort(1) & u.MAX_VALUE;
                    this.mImageUpdateOffset = wrap.getInt(5);
                    this.mImageBufferCheckOffset = 0;
                } else {
                    this.mImageUpdateOffset = 0;
                    this.mImageBufferCheckOffset = 0;
                    i9 = 0;
                }
                ZLogger.v(this.VDBG, String.format(Locale.US, "mOriginalFwVersion=%d, mImageUpdateOffset=0x%08X(%d), mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageBufferCheckOffset), Integer.valueOf(this.mImageBufferCheckOffset)));
                return;
            }
        }
        ZLogger.w(String.format("0x%04X, Get target image info failed", Integer.valueOf(DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED)));
        throw new OtaException("Get target image info failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
    }

    public void j(int i8) {
        if (this.mImageUpdateOffset == 0 && e()) {
            this.mImageUpdateOffset = 12;
            ZLogger.v(String.format(Locale.US, "skip image header (%d)", 12));
        }
        a(i8, this.mImageUpdateOffset);
        if (y()) {
            return;
        }
        this.imageFileLoaded = false;
        m();
        alignmentSendBytes(this.mImageUpdateOffset, false);
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
            T();
        }
        this.E.stopScan();
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

    public void a(int i8, byte b8) {
        q a8 = new q.b(getOtaDeviceInfo().protocolType, getOtaDeviceInfo().specVersion).a(i8).a(b8).a();
        if (this.DBG) {
            ZLogger.d(a8.toString());
        }
        a(this.Z, a8.a(), false);
        byte b9 = b(com.realsil.sdk.dfu.j.c.c(getDfuProgressInfo().getImageSizeInBytes())).f16064d[0];
        if (b9 != 1) {
            ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b9)));
            throw new OtaException("Validate FW failed", b9 | 512);
        }
        if (this.VDBG) {
            ZLogger.d("Validate FW success");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0050, code lost:
    
        if (y() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int min;
        BaseBinInputStream baseBinInputStream2;
        byte[] bArr;
        ZLogger.v(this.DBG, "uploadFirmwareWithBufferCheck");
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = 0;
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            byte[] bArr2 = new byte[this.f15968r];
            int i9 = i8;
            while (true) {
                ZLogger.v(this.DBG, String.format(Locale.US, "mCurrentMaxBufferSize=%d, mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.f15968r), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
                if (i9 <= 0) {
                    try {
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                n();
                int i10 = this.mImageUpdateOffset;
                int i11 = 12;
                if (i10 == 0) {
                    int i12 = this.f15968r - this.mImageBufferCheckOffset;
                    byte[] bArr3 = new byte[i12];
                    System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr3, 0, 12);
                    int i13 = i12 - 12;
                    byte[] bArr4 = new byte[i13];
                    int read = this.mCurBinInputStream.read(bArr4, i13);
                    if (read > 0) {
                        System.arraycopy(bArr4, 0, bArr3, 12, read);
                        i11 = read + 12;
                    }
                    getDfuProgressInfo().setBytesSent(0);
                    bArr = bArr3;
                } else {
                    if (i10 == 12) {
                        min = bArr2.length - 12;
                        baseBinInputStream2 = this.mCurBinInputStream;
                    } else {
                        min = Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes());
                        baseBinInputStream2 = this.mCurBinInputStream;
                    }
                    i11 = baseBinInputStream2.read(bArr2, min);
                    bArr = bArr2;
                }
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(i11);
                if (this.DBG) {
                    ZLogger.d(getDfuProgressInfo().toString());
                }
                if (correctBufferCheckSize > 0) {
                    if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                        a(bArr, correctBufferCheckSize);
                    }
                    int i14 = this.f15969s;
                    byte[] bArr5 = new byte[i14];
                    int i15 = 0;
                    while (i15 < correctBufferCheckSize) {
                        int min2 = Math.min(i14, correctBufferCheckSize - i15);
                        System.arraycopy(bArr, i15, bArr5, 0, min2);
                        a(bluetoothGatt, bluetoothGattCharacteristic, bArr5, min2, false);
                        i15 += min2;
                        k();
                    }
                    boolean d8 = d(bArr, correctBufferCheckSize);
                    if (d8) {
                        i9 = 0;
                    } else {
                        getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                        i9++;
                        ZLogger.d("check failed, re-transTimes: " + i9);
                    }
                    if (i9 >= 3) {
                        ZLogger.w("Error while buffer check, reach max try times: " + i9 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                        throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                    }
                    if (d8) {
                        break;
                    } else {
                        bArr2 = bArr;
                    }
                } else {
                    if (!getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.w("Error while reading file with size: " + correctBufferCheckSize);
                        throw new OtaException("Error while reading file", 257);
                    }
                    ZLogger.i("image file has already been send over");
                }
            }
            i8 = i9;
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
        ZLogger.i("image active success");
        e(this.mErrorState);
        closeInputStream(this.mCurBinInputStream);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public boolean e(BluetoothGatt bluetoothGatt) {
        if (!super.e(bluetoothGatt)) {
            return false;
        }
        this.f16293f0 = new ArrayList();
        int i8 = 65504;
        while (true) {
            if (i8 >= 65519) {
                break;
            }
            UUID fromShortValue = BluetoothUuidCompat.fromShortValue(i8);
            BluetoothGattCharacteristic characteristic = this.R.getCharacteristic(fromShortValue);
            if (characteristic != null) {
                if (this.VDBG) {
                    ZLogger.v("find image version characteristic: " + fromShortValue.toString());
                }
                this.f16293f0.add(characteristic);
                i8++;
            } else if (this.VDBG) {
                ZLogger.v("not found image version characteristic:" + fromShortValue.toString());
            }
        }
        this.f16294g0 = new ArrayList();
        for (int i9 = 65524; i9 < 65526; i9++) {
            UUID fromShortValue2 = BluetoothUuidCompat.fromShortValue(i9);
            BluetoothGattCharacteristic characteristic2 = this.R.getCharacteristic(fromShortValue2);
            if (characteristic2 == null) {
                if (!this.VDBG) {
                    return true;
                }
                ZLogger.v("not found image session size characteristic:" + fromShortValue2.toString());
                return true;
            }
            if (this.VDBG) {
                ZLogger.v("find image session size characteristic: " + fromShortValue2.toString());
            }
            this.f16294g0.add(characteristic2);
        }
        return true;
    }

    public void a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int read;
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
            if (this.VDBG) {
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
                        ZLogger.d("image file has already been send over");
                        return;
                    }
                    ZLogger.w("Error while reading file with size: " + i10);
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

    @Override // com.realsil.sdk.dfu.m.e
    public synchronized void b(com.realsil.sdk.dfu.m.j jVar) {
        try {
            int i8 = jVar.f16062b;
            if (i8 == 7) {
                a(jVar);
                return;
            }
            if (i8 == 8) {
                byte[] bArr = jVar.f16064d;
                updateRemoteState(bArr.length >= 1 ? bArr[0] : (byte) 0);
            } else {
                synchronized (this.f15965o) {
                    this.J = jVar;
                    this.L = true;
                    this.f15965o.notifyAll();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean a(SpecScanRecord specScanRecord) {
        List<ParcelUuid> serviceUuids;
        if (specScanRecord == null) {
            ZLogger.d(this.DBG, "ignore , specScanRecord is null");
            return false;
        }
        ZLogger.v(specScanRecord.toString());
        byte[] manufacturerSpecificData = specScanRecord.getManufacturerSpecificData(getDfuConfig().getManufacturerId());
        if (manufacturerSpecificData == null) {
            return false;
        }
        ZLogger.v(this.TDBG, "manufacturerSpecificData=" + DataConverter.bytes2Hex(manufacturerSpecificData));
        ZLogger.v(this.TDBG, "rwsBdAddr= " + DataConverter.bytes2Hex(getOtaDeviceInfo().getRwsBdAddr()));
        boolean equals = Arrays.equals(manufacturerSpecificData, getOtaDeviceInfo().getRwsBdAddr());
        if (equals) {
            return (getOtaDeviceInfo().specVersion < 5 || (serviceUuids = specScanRecord.getServiceUuids()) == null) ? equals : serviceUuids.contains(ParcelUuid.fromString("020002fd-3c17-d293-8e48-14fe2e4da212"));
        }
        ZLogger.v(this.VDBG, "not the same device");
        return false;
    }

    public boolean b(BaseBinInputStream baseBinInputStream) {
        byte b8 = baseBinInputStream.icType;
        return ((b8 == 11 || b8 == 17 || b8 == 19) && baseBinInputStream.getBinId() == 520) || this.mCurBinInputStream.getActiveCompareVersionFlag() == 0 || this.mCurBinInputStream.getInactiveVersionCompFlag() == 0;
    }
}
