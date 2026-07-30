package com.realsil.sdk.dfu.n;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;

/* loaded from: classes4.dex */
public class f extends e {
    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean U() {
        if (this.mOtaWorkMode == 0) {
            if (this.otaModeEnabled) {
                if (TextUtils.isEmpty(this.mOtaDeviceAddress)) {
                    p();
                }
                c(this.mOtaDeviceAddress);
                if (this.otaEnvironmentPrepared) {
                    l();
                } else {
                    M();
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
                    M();
                }
                if (this.mCurBinInputStream == null) {
                    notifyError(4097);
                    return false;
                }
                if (!b(h.f16240i)) {
                    notifyError(DfuException.ERROR_ENTER_OTA_MODE_FAILED);
                    return false;
                }
                p();
                c(this.mOtaDeviceAddress);
            }
            w();
            this.otaModeEnabled = true;
        } else {
            d(this.mOtaDeviceAddress);
            w();
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                M();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.n.e
    public boolean K() {
        return true;
    }

    @Override // com.realsil.sdk.dfu.n.e
    public boolean L() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = this.mOtaWorkMode != 0;
        boolean z7 = false;
        while (a()) {
            try {
                if (!U() || !S()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                BaseBinInputStream baseBinInputStream2 = this.mCurBinInputStream;
                if (baseBinInputStream2 != null && baseBinInputStream2.isTempBufferCheckSupported()) {
                    this.mTempBufferSentSize += getDfuProgressInfo().getBytesSent();
                }
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.d("no pending image file to upload.");
                    F();
                    z7 = true;
                } else {
                    ZLogger.v("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = this.mOtaWorkMode != 0;
                        this.mBytesSentBuffer = 0;
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(this.mCurBinInputStream, baseBinInputStream, this.mNextBinIndex, this.mTempBufferSentSize, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                        if (this.mOtaWorkMode == 0) {
                            this.mOtaDeviceAddress = null;
                        }
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        b((byte) 1);
                    }
                    j();
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                a(e8);
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    @Override // com.realsil.sdk.dfu.n.e, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ boolean activeImage(boolean z7) {
        return super.activeImage(z7);
    }

    @Override // com.realsil.sdk.dfu.n.e, com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void executeOtaProcedure() {
        super.executeOtaProcedure();
    }

    @Override // com.realsil.sdk.dfu.n.e, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
