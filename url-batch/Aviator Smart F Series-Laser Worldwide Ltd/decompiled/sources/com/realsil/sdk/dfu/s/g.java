package com.realsil.sdk.dfu.s;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord;
import com.realsil.sdk.core.bluetooth.scanner.compat.CompatScanFilter;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class g extends h {

    /* renamed from: h0, reason: collision with root package name */
    public boolean f16292h0;

    public g(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private void d(ScannerParams scannerParams) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(527);
        this.mErrorState = 0;
        this.C = false;
        b(scannerParams);
        try {
            synchronized (this.B) {
                try {
                    if (this.mErrorState == 0 && !this.C) {
                        this.B.wait(31000L);
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("findRemoteDevice interrupted, e = " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0 && !this.C) {
            ZLogger.w("didn't find the secondary bud device");
            this.mErrorState = DfuException.ERROR_CANNOT_FIND_DEVICE;
        }
        if (this.mErrorState != 0) {
            throw new OtaException("Error while scan remote device", this.mErrorState);
        }
    }

    @Override // com.realsil.sdk.dfu.s.h
    public boolean G() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            X();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    @Override // com.realsil.sdk.dfu.s.h
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
    }

    public void W() {
        if (getOtaDeviceInfo().specVersion < 5) {
            if (getOtaDeviceInfo().getRwsUpdateFlag() != 0) {
                throw new OtaException("rws state not ready", 282);
            }
        } else if (this.f16292h0 && !getOtaDeviceInfo().isRwsSecondaryBud()) {
            throw new OtaException("role swap failed, not target bud", 283);
        }
    }

    public void X() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        P();
        if (getOtaDeviceInfo().isRwsEnabled()) {
            W();
        }
        Q();
        O();
        R();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    public boolean Y() {
        int i8;
        E();
        notifyStateChanged(DfuConstants.PROGRESS_HAND_OVER_PROCESSING);
        ZLogger.d(this.DBG, "wait master to handover ...");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new CompatScanFilter.Builder().setManufacturerData(getDfuConfig().getManufacturerId(), getOtaDeviceInfo().getRwsBdAddr()).build());
        ScannerParams q8 = q();
        q8.setScanFilters(arrayList);
        d(q8);
        ZLogger.d(this.DBG, "start to upload secondary bud ...");
        this.otaModeEnabled = true;
        this.otaEnvironmentPrepared = false;
        this.mBytesSentBuffer = 0;
        this.f16292h0 = true;
        boolean K = K();
        if (!K) {
            return K;
        }
        if (this.f15964n) {
            E();
            i8 = 258;
        } else {
            i8 = 523;
        }
        notifyStateChanged(i8);
        return K;
    }

    public boolean Z() {
        byte b8;
        if (!C()) {
            return false;
        }
        F();
        S();
        getDfuProgressInfo().start();
        i(getDfuProgressInfo().getCurImageId());
        A();
        if (getOtaDeviceInfo().reportImageNumberFeatureSupported) {
            D();
        }
        if (this.mImageUpdateOffset == 0) {
            if (this.mOtaWorkMode == 23) {
                b8 = 2;
            } else if (this.mCurBinInputStream.compressed) {
                b8 = 3;
            } else {
                U();
            }
            c(b8);
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.d("Last send reach the bottom");
        } else {
            j(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.d
    public void a(ExtendedBluetoothDevice extendedBluetoothDevice) {
        BluetoothDevice device = extendedBluetoothDevice.getDevice();
        SpecScanRecord parseFromBytes = SpecScanRecord.parseFromBytes(extendedBluetoothDevice.getScanRecord());
        if (this.mProcessState == 515) {
            String str = this.mDeviceAddress;
            if (str == null || !str.equals(device.getAddress())) {
                return;
            }
        } else {
            if (this.mProcessState != 527) {
                ZLogger.d(this.VDBG, "ignore process state: " + this.mProcessState);
                return;
            }
            if (!a(parseFromBytes)) {
                return;
            }
        }
        this.mOtaDeviceName = extendedBluetoothDevice.getName();
        this.mOtaDeviceAddress = device.getAddress();
        ZLogger.d(this.DBG, "find target device: name=" + this.mOtaDeviceName + " addr=" + this.mOtaDeviceAddress);
        v();
        synchronized (this.B) {
            this.C = true;
            this.B.notifyAll();
        }
    }

    @Override // com.realsil.sdk.dfu.s.h, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ boolean activeImage(boolean z7) {
        return super.activeImage(z7);
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
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        this.f16292h0 = false;
        if (K()) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                Y();
            } else if (this.f15964n) {
                E();
                notifyStateChanged(258);
            } else {
                notifyStateChanged(523);
            }
        }
        closeInputStream(this.mCurBinInputStream);
        ZLogger.d(this.DBG, "ProcessorXG0010S stopped");
        onDestroy();
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int i() {
        if (!Z()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d(this.DBG, "no pending image file to upload.");
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
            return 3;
        }
        ZLogger.d(this.DBG, "has pending image file to upload");
        if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
            if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                BaseBinInputStream baseBinInputStream = this.mNextBinInputStream;
                if (baseBinInputStream == null) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    return 2;
                }
                if (a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    b((byte) 1);
                }
            }
            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
            return 2;
        }
        a(getDfuProgressInfo().getCurImageId(), (byte) 1);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        this.mBytesSentBuffer = 0;
        E();
        j();
        return 2;
    }

    @Override // com.realsil.sdk.dfu.s.h, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
