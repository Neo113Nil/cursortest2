package com.realsil.sdk.dfu.r;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;

/* loaded from: classes4.dex */
public class c extends b {
    public c(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean R() {
        int i8;
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
            i8 = 4097;
        } else {
            if (b(h.f16285i)) {
                p();
                c(this.mOtaDeviceAddress);
                w();
                this.otaModeEnabled = true;
                return true;
            }
            i8 = DfuException.ERROR_ENTER_OTA_MODE_FAILED;
        }
        notifyError(i8);
        return false;
    }

    private boolean S() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = false;
        boolean z7 = false;
        while (a()) {
            try {
                if (!(this.otaModeEnabled ? Q() : R()) || !U()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.v("no pending image file to upload.");
                    getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                    if (this.f15964n) {
                        F();
                        E();
                        notifyStateChanged(258);
                    } else {
                        notifyStateChanged(523);
                    }
                    z7 = true;
                } else {
                    ZLogger.v("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = false;
                        this.mBytesSentBuffer = 0;
                        F();
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                        this.mOtaDeviceAddress = null;
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        F();
                        b((byte) 1);
                    }
                    j();
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else {
                    if (errCode != 4097 && errCode != 265 && N()) {
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

    private void T() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        J();
        K();
        I();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    private boolean U() {
        if (!C()) {
            return false;
        }
        if (getOtaDeviceInfo().icType <= 3) {
            this.f15967q = M();
            if (this.VDBG) {
                ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
            }
            if (this.f15967q == 1) {
                L();
            }
        } else {
            if (getOtaDeviceInfo().isBufferCheckEnabled()) {
                this.f15967q = G();
            } else {
                this.f15967q = 0;
            }
            if (this.VDBG) {
                ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
            }
        }
        P();
        getDfuProgressInfo().start();
        g(getDfuProgressInfo().getCurImageId());
        A();
        if (this.mImageUpdateOffset == 0) {
            O();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.d("Last send reach the bottom");
        } else if (getOtaDeviceInfo().icType <= 3) {
            i(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        } else {
            h(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                d(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                c(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        getDfuProgressInfo().sendOver();
        j(getDfuProgressInfo().getCurImageId());
        return true;
    }

    public final boolean Q() {
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
        w();
        this.otaModeEnabled = true;
        return true;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            if (this.DBG) {
                ZLogger.d("start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            }
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.e("Something error in OTA process, errorCode: " + e8 + "mProcessState" + this.mProcessState);
                notifyError(e8, true);
                return false;
            }
        }
        if (z7) {
            try {
                F();
                E();
                notifyStateChanged(258);
            } catch (DfuException e9) {
                notifyError(e9.getErrCode());
            }
        } else {
            if (N()) {
                waitUntilDisconnected();
            }
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
        super.executeOtaProcedure();
        int innerCheck = innerCheck();
        if (innerCheck != 0) {
            notifyError(innerCheck);
            return;
        }
        try {
            S();
            closeInputStream(this.mCurBinInputStream);
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            notifyError(0);
        }
        if (this.DBG) {
            ZLogger.d("ProcessorXG0000N stopped");
        }
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.r.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
