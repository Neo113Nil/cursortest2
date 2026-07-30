package com.realsil.sdk.dfu.n;

import android.content.Context;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.util.Locale;

/* loaded from: classes4.dex */
public class g extends e {
    public g(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean U() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            M();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    @Override // com.realsil.sdk.dfu.n.e
    public boolean L() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
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
                    ZLogger.v(this.DBG, String.format(Locale.US, "has pending image file to upload(%d)", Integer.valueOf(getOtaDeviceInfo().getUpdateMechanism())));
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(this.mCurBinInputStream, baseBinInputStream, this.mNextBinIndex, this.mTempBufferSentSize, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
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
