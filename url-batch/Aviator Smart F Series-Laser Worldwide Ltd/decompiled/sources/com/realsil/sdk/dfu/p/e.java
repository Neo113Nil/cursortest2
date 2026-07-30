package com.realsil.sdk.dfu.p;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;

/* loaded from: classes4.dex */
public final class e extends d {
    public e(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
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
        if (this.otaModeEnabled) {
            if (TextUtils.isEmpty(this.mOtaDeviceAddress)) {
                p();
            }
            c(this.mOtaDeviceAddress);
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                T();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
        } else {
            d(this.mOtaDeviceAddress);
            int x7 = x();
            if (x7 != 0) {
                throw new OtaException("load ota service failed", x7);
            }
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                T();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
            if (!b(g.f16261e)) {
                notifyError(DfuException.ERROR_ENTER_OTA_MODE_FAILED);
                return false;
            }
            p();
            c(this.mOtaDeviceAddress);
        }
        w();
        this.otaModeEnabled = true;
        return true;
    }

    @Override // com.realsil.sdk.dfu.p.d
    public boolean J() {
        return true;
    }

    @Override // com.realsil.sdk.dfu.p.d
    public void a(DfuException dfuException) {
        int errCode = dfuException.getErrCode();
        if (errCode == 4128) {
            notifyError(errCode, true);
            return;
        }
        if (errCode == 4097 || errCode == 265) {
            notifyError(errCode, false);
            return;
        }
        if (P() && this.mOtaWorkMode == 0) {
            waitUntilDisconnected();
        }
        notifyError(errCode, false);
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
            if (P()) {
                waitUntilDisconnected();
            }
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
        this.otaModeEnabled = false;
        K();
        closeInputStream(this.mCurBinInputStream);
        ZLogger.d(this.DBG, "ProcessorXG0010N stopped");
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int i() {
        BaseBinInputStream baseBinInputStream;
        int i8;
        if (!R()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        BaseBinInputStream baseBinInputStream2 = this.mCurBinInputStream;
        if (baseBinInputStream2 != null && baseBinInputStream2.isTempBufferCheckSupported()) {
            this.mTempBufferSentSize += getDfuProgressInfo().getBytesSent();
        }
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d(this.DBG, "no pending image file to upload.");
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
        ZLogger.d(this.DBG, "has pending image file to upload");
        if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            this.mOtaDeviceAddress = this.mDeviceAddress;
            this.otaModeEnabled = false;
            this.mBytesSentBuffer = 0;
            this.mTempBufferSentSize = 0;
            E();
        } else {
            if (getOtaDeviceInfo().getUpdateMechanism() != 3 || (baseBinInputStream = this.mNextBinInputStream) == null || !a(this.mCurBinInputStream, baseBinInputStream, this.mNextBinIndex, this.mTempBufferSentSize, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                a(getDfuProgressInfo().getCurImageId(), (byte) 0);
                return 2;
            }
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
            this.mOtaDeviceAddress = null;
            this.otaModeEnabled = true;
            this.mBytesSentBuffer = 0;
            this.mTempBufferSentSize = 0;
            b((byte) 1);
        }
        j();
        return 2;
    }

    @Override // com.realsil.sdk.dfu.p.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
