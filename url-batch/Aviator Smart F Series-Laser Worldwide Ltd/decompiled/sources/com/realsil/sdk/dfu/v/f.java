package com.realsil.sdk.dfu.v;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import java.io.IOException;

/* loaded from: classes4.dex */
public class f extends e {
    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private void c(BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.d(this.DBG, "uploadFirmwareImage");
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            startSpeedControl();
            ZLogger.v(getDfuProgressInfo().toString());
            try {
                if (getDfuProgressInfo().getBytesSent() == 0) {
                    int i9 = this.MAX_PACKET_SIZE;
                    byte[] bArr2 = new byte[i9];
                    baseBinInputStream.read(bArr2, i9 - 12);
                    System.arraycopy(baseBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    System.arraycopy(bArr2, 0, bArr, 12, this.MAX_PACKET_SIZE - 12);
                    read = this.MAX_PACKET_SIZE;
                    getDfuProgressInfo().setBytesSent(0);
                } else {
                    read = baseBinInputStream.read(bArr, i8);
                }
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    ZLogger.v(this.DBG, "reach the end of the file, only read some");
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                if (read <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + read);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    b(bArr, read);
                }
                if (a(com.realsil.sdk.dfu.u.d.a(1539, getDfuConfig().getSppConfig().getDataWriteType(), bArr, read), false)) {
                    getDfuProgressInfo().addBytesSent(read);
                    notifyProcessChanged();
                }
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    @Override // com.realsil.sdk.dfu.v.e
    public boolean C() {
        return true;
    }

    @Override // com.realsil.sdk.dfu.v.e
    public boolean L() {
        if (!t()) {
            return false;
        }
        g(getDfuProgressInfo().getCurImageId());
        if (!getDfuConfig().isBreakpointResumeEnabled()) {
            z();
        }
        M();
        getDfuProgressInfo().start();
        J();
        if (this.mImageUpdateOffset == 0) {
            K();
        }
        if (this.mImageUpdateOffset < getDfuProgressInfo().getImageSizeInBytes()) {
            f(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                b(this.mCurBinInputStream);
            } else {
                c(this.mCurBinInputStream);
            }
        } else if (this.VDBG) {
            ZLogger.d("Last send reach the bottom");
        }
        getDfuProgressInfo().sendOver();
        return true;
    }

    public void M() {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.v(this.VDBG, "isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        this.f15967q = (getOtaDeviceInfo().isBufferCheckEnabled() && A()) ? 1 : 0;
        ZLogger.v(this.VDBG, "mRemoteOtaFunctionInfo=" + this.f15967q);
    }

    public boolean N() {
        boolean z7 = false;
        while (a()) {
            try {
                if (!y()) {
                    return false;
                }
                this.f15975y = true;
                int i8 = i();
                if (i8 == 0) {
                    return false;
                }
                if (i8 == 3) {
                    z7 = true;
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                a(e8);
                return z7;
            }
        }
        notifyError(4128);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
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
            ZLogger.v(this.VDBG, "DfuTask complete");
            if (this.mProcessState == 525) {
            }
        } catch (Exception e9) {
            ZLogger.w(e9.toString());
            notifyError(i8);
            ZLogger.v(this.VDBG, "DfuTask complete");
            if (this.mProcessState == 525) {
            }
        }
        if (innerCheck != 0) {
            notifyError(innerCheck);
            return;
        }
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = false;
        this.mBytesSentBuffer = 0;
        this.f15975y = false;
        if (N()) {
            q();
        }
        closeInputStream(this.mCurBinInputStream);
        ZLogger.v(this.VDBG, "DfuTask complete");
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.v.e, com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.k.b
    public void l() {
        int maxFileCount = getDfuProgressInfo().getMaxFileCount();
        int pendingUpdateImageFileIndex = getDfuProgressInfo().getPendingUpdateImageFileIndex();
        BaseBinInputStream baseBinInputStream = this.pendingImageInputStreams.get(pendingUpdateImageFileIndex);
        this.mCurBinInputStream = baseBinInputStream;
        if (baseBinInputStream != null) {
            ZLogger.v(this.VDBG, "loadCurrentImageFile, mCurBinInputStream.getTotalImageSize()=" + this.mCurBinInputStream.getTotalImageSize());
            getDfuProgressInfo().initialize(this.mCurBinInputStream, getDfuConfig().isThroughputEnabled());
        }
        int i8 = pendingUpdateImageFileIndex + 1;
        if (i8 < maxFileCount) {
            this.mNextBinInputStream = this.pendingImageInputStreams.get(i8);
            this.mNextBinIndex = i8;
        } else {
            this.mNextBinInputStream = null;
            this.mNextBinIndex = -1;
        }
    }

    @Override // com.realsil.sdk.dfu.v.e
    public boolean y() {
        boolean y7 = super.y();
        if (!y7) {
            return false;
        }
        if (!this.otaModeEnabled) {
            if (!B()) {
                notifyError(DfuException.ERROR_ENTER_OTA_MODE_FAILED);
                return false;
            }
            ZLogger.d(this.DBG, "wait device to reboot ...");
            sleepInner(getDfuConfig().getHandoverTimeout() * 1000);
            for (int i8 = 0; i8 < 3; i8++) {
                sleepInner(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                if (a(this.mOtaDeviceAddress, 1) == 0 && (y7 = x())) {
                    break;
                }
            }
            if (!y7) {
                throw new OtaException("enter normal ota mode failed", 283);
            }
        }
        this.otaModeEnabled = true;
        return true;
    }
}
