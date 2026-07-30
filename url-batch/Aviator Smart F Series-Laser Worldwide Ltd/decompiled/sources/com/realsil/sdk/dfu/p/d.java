package com.realsil.sdk.dfu.p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
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
import com.realsil.sdk.dfu.m.h;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.m.p;
import com.realsil.sdk.dfu.m.q;
import com.realsil.sdk.dfu.model.DfuConfig;
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
public abstract class d extends com.realsil.sdk.dfu.m.e {

    /* renamed from: f0, reason: collision with root package name */
    public List f16254f0;

    /* renamed from: g0, reason: collision with root package name */
    public List f16255g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f16256h0;

    public d(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.f16256h0 = 0;
    }

    private boolean I() {
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

    private void S() {
        a((byte) 7);
    }

    public void E() {
        c(new byte[]{4, 0});
    }

    public abstract boolean F();

    public boolean G() {
        if (this.Z == null) {
            ZLogger.w(this.DBG, "no mControlPointCharacteristic found");
            return false;
        }
        try {
            h a8 = h.a(getOtaDeviceInfo().protocolType, getOtaDeviceInfo().specVersion, a((byte) 9, new byte[]{9}, 1600L));
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

    public void H() {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.d(this.DBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        this.f15967q = (getOtaDeviceInfo().isBufferCheckEnabled() && G()) ? 1 : 0;
        ZLogger.v(this.VDBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
    }

    public boolean J() {
        return false;
    }

    public boolean K() {
        int i8;
        boolean z7 = false;
        while (a()) {
            try {
                if (!F() || (i8 = i()) == 0) {
                    return false;
                }
                if (i8 == 3) {
                    z7 = true;
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                a(e8);
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    public void L() {
        List list = this.f16254f0;
        if (list == null || list.size() <= 0) {
            ZLogger.d(this.DBG, "no ImageVersionCharacteristics to read");
            getOtaDeviceInfo().setImageVersionValues(null);
            return;
        }
        getOtaDeviceInfo().setImageVersionValues(null);
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16254f0) {
            if (this.VDBG) {
                ZLogger.v("read image version : " + bluetoothGattCharacteristic.getUuid().toString());
            }
            byte[] a8 = a(bluetoothGattCharacteristic);
            if (a8 != null) {
                getOtaDeviceInfo().appendImageVersionBytes(a8);
            }
        }
    }

    public boolean M() {
        if (this.T == null) {
            return false;
        }
        if (this.VDBG) {
            ZLogger.v("start to read remote device info");
        }
        byte[] a8 = a(this.T);
        if (a8 == null) {
            if (this.DBG) {
                ZLogger.v("read device info failed");
            }
            throw new OtaException("read remote device info failed", 270);
        }
        getOtaDeviceInfo().parseX0014(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        return true;
    }

    public boolean N() {
        if (this.U == null) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("start to read remote dev Mac Addr info");
        }
        return getOtaDeviceInfo().parseDeviceMacV2(a(this.U));
    }

    public void O() {
        List list = this.f16255g0;
        byte[] bArr = null;
        if (list == null || list.size() <= 0) {
            ZLogger.d(this.DBG, "no ImageSectionCharacteristics to read");
            getOtaDeviceInfo().setImageSectionSizeValues(null);
            return;
        }
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : this.f16255g0) {
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
        getOtaDeviceInfo().setImageSectionSizeValues(bArr);
    }

    public boolean P() {
        try {
            ZLogger.d(this.DBG, "<< OPCODE_DFU_RESET_SYSTEM (0x05)");
            return a(this.Z, new byte[]{5}, true);
        } catch (DfuException e8) {
            ZLogger.w(String.format("Send OPCODE_DFU_RESET_SYSTEM failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public void Q() {
        int i8 = this.mCurBinInputStream.getCtrlHeaderLength() + 1 > 16 ? 32 : 16;
        byte[] bArr = new byte[i8];
        System.arraycopy(this.mCurBinInputStream.getDfuHeader(), 0, bArr, 0, this.mCurBinInputStream.getCtrlHeaderLength());
        int ctrlHeaderLength = this.mCurBinInputStream.getCtrlHeaderLength();
        if (getOtaDeviceInfo().specVersion >= 4 && this.mCurBinInputStream.compressed) {
            bArr[ctrlHeaderLength] = 3;
        }
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            a(bArr, i8);
        }
        p.b bVar = new p.b(getOtaDeviceInfo().specVersion);
        bVar.a(bArr);
        p a8 = bVar.a();
        if (this.VDBG) {
            ZLogger.v(a8.toString());
        }
        byte b8 = a(a8.b(), a8.a()).f16064d[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed (0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    public boolean R() {
        if (!C()) {
            return false;
        }
        H();
        if (J()) {
            S();
        }
        getDfuProgressInfo().start();
        f(getDfuProgressInfo().getCurImageId());
        A();
        if (getOtaDeviceInfo().specVersion >= 1) {
            D();
        }
        if (this.mImageUpdateOffset == 0) {
            Q();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.DBG, "Last send reach the bottom");
        } else {
            g(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        return true;
    }

    public void a(int i8, byte b8) {
        a(new q.b(getOtaDeviceInfo().protocolType, getOtaDeviceInfo().specVersion).a(i8).a(b8).a());
    }

    public abstract void a(DfuException dfuException);

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
        ZLogger.i(this.DBG, "image active success");
        e(this.mErrorState);
        closeInputStream(this.mCurBinInputStream);
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
        if (this.DBG) {
            ZLogger.d("<< OPCODE_DFU_REPORT_BUFFER_CRC(0x0A)");
        }
        byte[] bArr2 = a((byte) 10, new byte[]{10, (byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)}).f16064d;
        byte b8 = bArr2[0];
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        this.mImageUpdateOffset = wrap.getInt(1);
        if (this.VDBG) {
            ZLogger.d(String.format(Locale.US, "status:0x%02X, mImageUpdateOffset=0x%08X(%d)", Byte.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        }
        if (b8 == 1) {
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            return false;
        }
        throw new OtaException("DFU_STATUS_FLASH_ERASE_ERROR", b8 | 512);
    }

    @Override // com.realsil.sdk.dfu.m.e
    public boolean e(BluetoothGatt bluetoothGatt) {
        if (!super.e(bluetoothGatt)) {
            return false;
        }
        this.f16254f0 = new ArrayList();
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
                this.f16254f0.add(characteristic);
                i8++;
            } else if (this.VDBG) {
                ZLogger.v("not found image version characteristic:" + fromShortValue.toString());
            }
        }
        this.f16255g0 = new ArrayList();
        for (int i9 = 65524; i9 < 65526; i9++) {
            UUID fromShortValue2 = BluetoothUuidCompat.fromShortValue(i9);
            BluetoothGattCharacteristic characteristic2 = this.R.getCharacteristic(fromShortValue2);
            if (characteristic2 == null) {
                if (!this.DBG) {
                    return true;
                }
                ZLogger.d("not found image session size characteristic:" + fromShortValue2.toString());
                return true;
            }
            if (this.TDBG) {
                ZLogger.v("find image session size characteristic: " + fromShortValue2.toString());
            }
            this.f16255g0.add(characteristic2);
        }
        return true;
    }

    public void f(int i8) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        com.realsil.sdk.dfu.t.d a8 = com.realsil.sdk.dfu.t.d.a(a((byte) 6, new byte[]{6, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255)}));
        if (a8.b() != 1) {
            String format = String.format("0x%02X, Get target image info failed", Byte.valueOf(a8.b()));
            ZLogger.e(format);
            throw new OtaException(format, a8.b() | 512);
        }
        ZLogger.v(this.VDBG, a8.toString());
        this.mImageUpdateOffset = a8.c();
        this.mImageBufferCheckOffset = a8.a();
    }

    public void g(int i8) {
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
            P();
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

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x004d, code lost:
    
        if (y() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BaseBinInputStream baseBinInputStream) {
        int min;
        BaseBinInputStream baseBinInputStream2;
        ZLogger.v(this.DBG, String.format("uploadFirmwareWithBufferCheck,MaxBufferSize=%d,MtuSize=%d", Integer.valueOf(this.f15968r), Integer.valueOf(this.f15969s)));
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
                if (this.TDBG) {
                    ZLogger.v(getDfuProgressInfo().toString());
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
                    getDfuProgressInfo().setBytesSent(0);
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
                if (this.VDBG) {
                    ZLogger.v(getDfuProgressInfo().toString());
                }
                if (correctBufferCheckSize > 0) {
                    if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                        a(bArr, correctBufferCheckSize);
                    }
                    int i14 = this.f15969s;
                    byte[] bArr3 = new byte[i14];
                    int i15 = 0;
                    while (i15 < correctBufferCheckSize) {
                        ZLogger.v(this.DBG, "pos: " + i15 + ", checkImageBufferSize=" + correctBufferCheckSize);
                        int min2 = Math.min(i14, correctBufferCheckSize - i15);
                        ZLogger.v(this.DBG, "bufferSize: " + min2);
                        System.arraycopy(bArr, i15, bArr3, 0, min2);
                        a(bluetoothGatt, bluetoothGattCharacteristic, bArr3, min2, false);
                        i15 += min2;
                        k();
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
                    ZLogger.d(this.DBG, "image file has already been send over");
                }
            }
        }
    }

    public void a(q qVar) {
        if (this.VDBG) {
            ZLogger.d(qVar.toString());
        }
        byte b8 = a(qVar.c(), qVar.a()).f16064d[0];
        if (b8 != 1) {
            ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b8)));
            throw new OtaException("Validate FW failed", b8 | 512);
        }
        if (this.VDBG) {
            ZLogger.d("Validate FW success");
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
                try {
                    byte b8 = this.f16042c0;
                    if (b8 == -1) {
                        this.J = jVar;
                        this.L = true;
                    } else if (b8 == jVar.f16062b) {
                        this.J = jVar;
                        this.f16042c0 = (byte) -1;
                        this.L = true;
                    }
                    this.f15965o.notifyAll();
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean a(SpecScanRecord specScanRecord) {
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
            List<ParcelUuid> serviceUuids = specScanRecord.getServiceUuids();
            return serviceUuids != null ? serviceUuids.contains(ParcelUuid.fromString("020002fd-3c17-d293-8e48-14fe2e4da212")) : equals;
        }
        ZLogger.v(this.VDBG, "not the same device");
        return false;
    }

    public boolean a(BaseBinInputStream baseBinInputStream, BaseBinInputStream baseBinInputStream2, int i8, int i9, int i10) {
        int remainSizeInBytes;
        int i11 = baseBinInputStream2.tempBufferCheckUpgradeOrder;
        if (i11 == 0) {
            return (baseBinInputStream == null || baseBinInputStream.tempBufferCheckUpgradeOrder == i11) ? false : true;
        }
        if (i11 == 1 || !I()) {
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
