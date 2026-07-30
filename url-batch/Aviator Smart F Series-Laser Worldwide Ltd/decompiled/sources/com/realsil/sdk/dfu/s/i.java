package com.realsil.sdk.dfu.s;

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
public final class i extends h {
    public i(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private void W() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        P();
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

    private boolean X() {
        byte b8;
        if (!C()) {
            return false;
        }
        S();
        V();
        getDfuProgressInfo().start();
        i(getDfuProgressInfo().getCurImageId());
        A();
        if (getOtaDeviceInfo().reportImageNumberFeatureSupported) {
            D();
        }
        if (this.mImageUpdateOffset == 0) {
            if (this.mOtaWorkMode == 22) {
                b8 = 2;
            } else if (this.mCurBinInputStream.compressed) {
                b8 = 3;
            } else {
                U();
            }
            c(b8);
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v("Last send reach the bottom");
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

    @Override // com.realsil.sdk.dfu.s.h
    public boolean G() {
        if (this.otaModeEnabled) {
            if (TextUtils.isEmpty(this.mOtaDeviceAddress)) {
                p();
            }
            c(this.mOtaDeviceAddress);
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                W();
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
                W();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
            if (!b(j.f16299e)) {
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

    @Override // com.realsil.sdk.dfu.s.h
    public /* bridge */ /* synthetic */ boolean J() {
        return super.J();
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
        if (!X()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
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

    @Override // com.realsil.sdk.dfu.s.h, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
