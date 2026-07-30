package com.realsil.sdk.dfu.x;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;

/* loaded from: classes4.dex */
public class m extends n {
    public m(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    @Override // com.realsil.sdk.dfu.x.n
    public boolean R() {
        if (!t()) {
            return false;
        }
        j(getDfuProgressInfo().getCurImageId());
        if (!getDfuConfig().isBreakpointResumeEnabled()) {
            A();
        }
        S();
        getDfuProgressInfo().start();
        if (getOtaDeviceInfo().reportImageNumberFeatureSupported) {
            P();
        }
        if (this.mImageUpdateOffset == 0) {
            if (this.mCurBinInputStream.compressed) {
                b((byte) 3);
            } else {
                Q();
            }
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

    public void S() {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.d(this.VDBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        this.f15967q = (getOtaDeviceInfo().isBufferCheckEnabled() && B()) ? 1 : 0;
        ZLogger.v(this.VDBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r4 == 1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean T() {
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
                    a8 = a((byte) 0);
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
                    a8 = a((byte) 0);
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
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                a(e8);
                return z8;
            }
        }
        notifyError(4128);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (T() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeOtaProcedure() {
        int innerCheck;
        int i8 = 0;
        try {
            innerCheck = innerCheck();
        } catch (DfuException e8) {
            ZLogger.w(e8.toString());
            i8 = e8.getErrCode();
            notifyError(i8);
            ZLogger.v(this.VDBG, "DfuThread stopped");
            if (this.mProcessState == 525) {
            }
        } catch (Exception e9) {
            ZLogger.w(e9.toString());
            notifyError(i8);
            ZLogger.v(this.VDBG, "DfuThread stopped");
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
        this.f15975y = false;
        if (T()) {
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
        ZLogger.v(this.VDBG, "DfuThread stopped");
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }
}
