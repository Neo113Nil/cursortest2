package com.realsil.sdk.dfu.o;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;

/* loaded from: classes4.dex */
public class c extends b {
    public c(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean R() {
        if (this.otaModeEnabled) {
            if (TextUtils.isEmpty(this.mOtaDeviceAddress)) {
                p();
            }
            c(this.mOtaDeviceAddress);
            if (this.otaEnvironmentPrepared) {
                l();
            } else {
                J();
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
                J();
            }
            if (this.mCurBinInputStream == null) {
                notifyError(4097);
                return false;
            }
            if (!b(e.f16253i)) {
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

    @Override // com.realsil.sdk.dfu.o.b
    public boolean H() {
        return true;
    }

    @Override // com.realsil.sdk.dfu.o.b
    public boolean I() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = false;
        boolean z7 = false;
        while (a()) {
            try {
                if (!R() || !P()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.v("no pending image file to upload.");
                    F();
                    z7 = true;
                } else {
                    ZLogger.v("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = false;
                        this.mBytesSentBuffer = 0;
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                        this.mOtaDeviceAddress = null;
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
                ZLogger.w("Something error in OTA process, errorCode: " + e8 + "mProcessState" + this.mProcessState);
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
            if (N()) {
                waitUntilDisconnected();
            }
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.o.b, com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void executeOtaProcedure() {
        super.executeOtaProcedure();
    }

    @Override // com.realsil.sdk.dfu.o.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
