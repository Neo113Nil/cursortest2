package com.realsil.sdk.dfu.q;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;

/* loaded from: classes4.dex */
public final class e extends d {
    public e(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean N() {
        if (this.otaModeEnabled) {
            if (TextUtils.isEmpty(this.mOtaDeviceAddress)) {
                p();
            }
            c(this.mOtaDeviceAddress);
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                P();
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
                P();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
            if (!b(g.f16268d)) {
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

    private boolean O() {
        DfuProgressInfo dfuProgressInfo;
        boolean z7 = false;
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
                    if (this.f15964n) {
                        E();
                        notifyStateChanged(258);
                    } else {
                        notifyStateChanged(523);
                    }
                    z7 = true;
                } else {
                    ZLogger.d("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = false;
                        this.mBytesSentBuffer = 0;
                        E();
                    } else {
                        if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                            BaseBinInputStream baseBinInputStream = this.mNextBinInputStream;
                            if (baseBinInputStream == null) {
                                dfuProgressInfo = getDfuProgressInfo();
                            } else if (a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                                ZLogger.d("make device to enter the ota advertiser mode, and let the app continue update image");
                                a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                                this.mOtaDeviceAddress = null;
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
                    if (errCode != 4097 && errCode != 265 && L() && this.mOtaWorkMode == 0) {
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

    private void P() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        H();
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
        R();
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

    private void R() {
        a((byte) 7);
    }

    @Override // com.realsil.sdk.dfu.q.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
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
        O();
        closeInputStream(this.mCurBinInputStream);
        ZLogger.d(this.DBG, "ProcessorXG0010N stopped");
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.q.d, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
