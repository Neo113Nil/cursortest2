package com.realsil.sdk.dfu.q;

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
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f extends d {
    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean N() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            P();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    private boolean O() {
        DfuProgressInfo dfuProgressInfo;
        while (a()) {
            try {
                if (!N() || !Q()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.d("no pending image file to upload.");
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                    return true;
                }
                ZLogger.d("has pending image file to upload");
                if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    this.mOtaDeviceAddress = this.mDeviceAddress;
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    E();
                } else {
                    if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                        BaseBinInputStream baseBinInputStream = this.mNextBinInputStream;
                        if (baseBinInputStream == null) {
                            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                            sleepInner(1000L);
                        } else if (a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                            ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                            this.otaModeEnabled = true;
                            this.mBytesSentBuffer = 0;
                            b((byte) 1);
                        } else {
                            dfuProgressInfo = getDfuProgressInfo();
                        }
                    } else {
                        dfuProgressInfo = getDfuProgressInfo();
                    }
                    a(dfuProgressInfo.getCurImageId(), (byte) 0);
                    sleepInner(1000L);
                }
                j();
                sleepInner(1000L);
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else {
                    if (errCode != 4097 && errCode != 265) {
                        L();
                    }
                    notifyError(errCode, false);
                }
                return false;
            }
        }
        notifyError(4128, true);
        return false;
    }

    private void P() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        H();
        if (getOtaDeviceInfo().isRwsEnabled() && getOtaDeviceInfo().getRwsUpdateFlag() != 0) {
            throw new OtaException("rws state not ready", 282);
        }
        I();
        G();
        J();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d(this.DBG, "Ota Environment prepared.");
    }

    private boolean Q() {
        if (!C()) {
            return false;
        }
        K();
        getDfuProgressInfo().start();
        f(getDfuProgressInfo().getCurImageId());
        A();
        D();
        if (this.mImageUpdateOffset == 0) {
            M();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.VDBG, "Last send reach the bottom");
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
                ZLogger.d("ignore process state: " + this.mProcessState);
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

    @Override // com.realsil.sdk.dfu.q.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ boolean activeImage(boolean z7) {
        return super.activeImage(z7);
    }

    public void d(ScannerParams scannerParams) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r6.f15964n == false) goto L21;
     */
    @Override // com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        if (O()) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                E();
                notifyStateChanged(DfuConstants.PROGRESS_HAND_OVER_PROCESSING);
                ZLogger.d(this.DBG, "wait master to handover ...");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new CompatScanFilter.Builder().setManufacturerData(getDfuConfig().getManufacturerId(), getOtaDeviceInfo().getRwsBdAddr()).build());
                ScannerParams q8 = q();
                q8.setScanFilters(arrayList);
                d(q8);
                ZLogger.d("start to upload secondary bud ...");
                this.otaModeEnabled = true;
                this.otaEnvironmentPrepared = false;
                this.mBytesSentBuffer = 0;
                if (O()) {
                    if (!this.f15964n) {
                        notifyStateChanged(523);
                    }
                    E();
                    notifyStateChanged(258);
                }
            }
        }
        closeInputStream(this.mCurBinInputStream);
        ZLogger.d(this.DBG, "ProcessorXG0010S stopped");
        onDestroy();
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.q.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
