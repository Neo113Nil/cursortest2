package com.realsil.sdk.dfu.p;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;

/* loaded from: classes4.dex */
public final class f extends d {
    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private void T() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        M();
        N();
        L();
        O();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    @Override // com.realsil.sdk.dfu.p.d
    public boolean F() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            T();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
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

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            ZLogger.d(this.DBG, "start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.e(String.format("Something error in OTA process, errorCode: 0x%04X, mProcessState=0x%04X", Integer.valueOf(e8), Integer.valueOf(this.mProcessState)));
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
            P();
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
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
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        if (K()) {
            if (this.f15964n) {
                E();
                notifyStateChanged(258);
            } else {
                notifyStateChanged(523);
            }
        }
        closeInputStream(this.mCurBinInputStream);
        ZLogger.v(this.VDBG, "DfuTask complete");
        onDestroy();
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int i() {
        int i8;
        if (!R()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        BaseBinInputStream baseBinInputStream = this.mCurBinInputStream;
        if (baseBinInputStream != null && baseBinInputStream.isTempBufferCheckSupported()) {
            this.mTempBufferSentSize += getDfuProgressInfo().getBytesSent();
        }
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d("no pending image file to upload.");
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
            if (this.f15964n) {
                E();
                i8 = 258;
            } else {
                i8 = 523;
            }
            notifyStateChanged(i8);
            return 3;
        }
        ZLogger.d(String.format("updateMechanism=%d, has pending image file to upload", Integer.valueOf(getOtaDeviceInfo().getUpdateMechanism())));
        if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
            if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                BaseBinInputStream baseBinInputStream2 = this.mNextBinInputStream;
                if (baseBinInputStream2 == null) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    return 2;
                }
                if (a(this.mCurBinInputStream, baseBinInputStream2, this.mNextBinIndex, this.mTempBufferSentSize, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    this.mTempBufferSentSize = 0;
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
        this.mTempBufferSentSize = 0;
        E();
        j();
        return 2;
    }

    @Override // com.realsil.sdk.dfu.p.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }

    @Override // com.realsil.sdk.dfu.p.d
    public void a(DfuException dfuException) {
        int errCode = dfuException.getErrCode();
        if (errCode == 4128) {
            notifyError(errCode, true);
        } else if (errCode == 4097 || errCode == 265) {
            notifyError(errCode, false);
        } else {
            P();
            notifyError(errCode, false);
        }
    }
}
