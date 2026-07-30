package com.realsil.sdk.dfu.x;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;

/* loaded from: classes4.dex */
public class q extends n {
    public q(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
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
                if (this.DBG) {
                    ZLogger.d(String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
                }
                ZLogger.v(getDfuProgressInfo().toString());
                j(getDfuProgressInfo().getCurImageId());
                if (!getDfuConfig().isBreakpointResumeEnabled()) {
                    A();
                }
                ZLogger.v(this.DBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
                if (getOtaDeviceInfo().isBufferCheckEnabled() && B()) {
                    this.f15967q = 1;
                } else {
                    this.f15967q = 0;
                }
                ZLogger.v(this.DBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
                getDfuProgressInfo().start();
                if (getOtaDeviceInfo().reportImageNumberFeatureSupported) {
                    P();
                }
                if (this.mImageUpdateOffset == 0) {
                    b((byte) 2);
                }
                if (this.mImageUpdateOffset < getDfuProgressInfo().getImageSizeInBytes()) {
                    f(getDfuProgressInfo().getCurImageId());
                    if (this.f15967q == 1) {
                        c(this.mCurBinInputStream);
                    } else {
                        d(this.mCurBinInputStream);
                    }
                } else if (this.VDBG) {
                    ZLogger.d("Last send reach the bottom");
                }
                getDfuProgressInfo().sendOver();
                return true;
            }
            i8 = 4113;
        }
        notifyError(i8);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r4 == 1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean S() {
        int a8;
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
                int E = E();
                if (E == 2) {
                    a8 = I();
                } else if (E == 1) {
                    a8 = a((byte) 2);
                    if (a8 == 1) {
                        ZLogger.d("validate failed during skip, switch to push flow");
                    }
                    if (a8 == 0) {
                        return false;
                    }
                    if (a8 == 3) {
                        if (F()) {
                            J();
                        }
                        z8 = true;
                    }
                    sleepInner(1000L);
                    if (z8) {
                        return z8;
                    }
                } else if (E == 3) {
                    a8 = a((byte) 2);
                    if (a8 == 1) {
                        ZLogger.d("validate failed during skip, switch to copy flow");
                        a8 = I();
                        if (a8 == 1) {
                            ZLogger.d("validate failed during copy, switch to push flow");
                        }
                    }
                    if (a8 == 0) {
                    }
                }
                a8 = i();
                if (a8 == 0) {
                }
            } catch (DfuException e8) {
                ZLogger.e(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (S() != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeOtaProcedure() {
        int innerCheck;
        int i8 = 0;
        try {
            try {
                try {
                    innerCheck = innerCheck();
                } catch (Exception e8) {
                    ZLogger.e(e8.toString());
                    notifyError(i8);
                    closeInputStream(this.mCurBinInputStream);
                    ZLogger.d(this.DBG, "DfuThread stopped");
                    if (this.mProcessState == 525) {
                    }
                }
            } catch (DfuException e9) {
                ZLogger.w(e9.toString());
                i8 = e9.getErrCode();
                notifyError(i8);
                closeInputStream(this.mCurBinInputStream);
                ZLogger.d(this.DBG, "DfuThread stopped");
                if (this.mProcessState == 525) {
                }
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
            ZLogger.d(this.DBG, "DfuThread stopped");
            if (this.mProcessState == 525) {
                notifyStateChanged(259);
            }
        } finally {
            closeInputStream(this.mCurBinInputStream);
        }
    }
}
