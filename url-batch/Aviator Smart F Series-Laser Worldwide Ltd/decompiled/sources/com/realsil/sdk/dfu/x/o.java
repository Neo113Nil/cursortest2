package com.realsil.sdk.dfu.x;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.Locale;

/* loaded from: classes4.dex */
public class o extends n {
    public o(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    @Override // com.realsil.sdk.dfu.x.n
    public boolean R() {
        int i8;
        if (!a()) {
            i8 = 4128;
        } else {
            if (!getOtaDeviceInfo().isAesEncryptEnabled() || b()) {
                notifyStateChanged(521);
                ZLogger.d(this.DBG, String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
                ZLogger.v(this.DBG, getDfuProgressInfo().toString());
                ZLogger.v(this.DBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
                if (getOtaDeviceInfo().isBufferCheckEnabled() && B()) {
                    this.f15967q = 1;
                } else {
                    this.f15967q = 0;
                }
                ZLogger.v(this.DBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
                getDfuProgressInfo().start();
                j(getDfuProgressInfo().getCurImageId());
                if (!getDfuConfig().isBreakpointResumeEnabled()) {
                    this.mImageUpdateOffset = 0;
                }
                if (getOtaDeviceInfo().reportImageNumberFeatureSupported) {
                    P();
                }
                ZLogger.v(this.DBG, String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
                if (this.mImageUpdateOffset == 0) {
                    b((byte) 1);
                }
                if (this.mImageUpdateOffset >= getDfuProgressInfo().getImageSizeInBytes()) {
                    ZLogger.d(this.VDBG, "Last send reach the bottom");
                } else {
                    f(getDfuProgressInfo().getCurImageId());
                    if (this.f15967q == 1) {
                        c(this.mCurBinInputStream);
                    } else {
                        d(this.mCurBinInputStream);
                    }
                }
                getDfuProgressInfo().sendOver();
                return true;
            }
            i8 = 4113;
        }
        notifyError(i8);
        return false;
    }

    public boolean S() {
        boolean z7 = true;
        boolean z8 = false;
        while (a()) {
            try {
                if (!z()) {
                    return false;
                }
                this.f15975y = true;
                if (z7) {
                    if (!x()) {
                        ZLogger.d("no need to update");
                        return true;
                    }
                    z7 = false;
                }
                y();
                int T = T();
                if (T == 0) {
                    return false;
                }
                if (T == 3) {
                    z8 = true;
                }
                sleepInner(1000L);
                if (z8) {
                    return z8;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else if (errCode == 4097) {
                    notifyError(errCode, false);
                } else {
                    v();
                    notifyError(errCode);
                }
                return z8;
            }
        }
        notifyError(4128);
        return false;
    }

    public final int T() {
        int curImageId;
        byte b8 = 0;
        if (!R()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        if (!getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d("has pending image file to upload");
            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
            return 2;
        }
        ZLogger.d("no pending image file to upload.");
        if (getOtaDeviceInfo().specVersion >= 3) {
            curImageId = getDfuProgressInfo().getCurImageId();
            b8 = 1;
        } else {
            curImageId = getDfuProgressInfo().getCurImageId();
        }
        a(curImageId, b8);
        getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
        return 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (S() != false) goto L15;
     */
    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeOtaProcedure() {
        int innerCheck;
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
        this.mBytesSentBuffer = 0;
        this.P = false;
        if (S()) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                K();
                ZLogger.d(this.DBG, "start to upload secondary bud ...");
                this.otaModeEnabled = true;
                this.otaEnvironmentPrepared = false;
                this.mBytesSentBuffer = 0;
            }
            q();
        }
        closeInputStream(this.mCurBinInputStream);
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
        ZLogger.d("ProcessorXS0011ForceTemp stopped.");
    }
}
