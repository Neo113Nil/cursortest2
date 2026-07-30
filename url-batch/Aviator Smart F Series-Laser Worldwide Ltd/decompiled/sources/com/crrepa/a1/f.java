package com.crrepa.a1;

import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import java.io.File;

/* loaded from: classes2.dex */
public class f extends com.crrepa.l0.g {

    /* renamed from: a, reason: collision with root package name */
    protected CRPWatchFaceTransListener f10850a;

    protected int a() {
        if (com.crrepa.l.a.b().h()) {
            return com.crrepa.l.a.b().c();
        }
        return 256;
    }

    public void abort() {
        sendFileCheckResult(false);
        release();
    }

    @Override // com.crrepa.l0.g
    public void cancel() {
        release();
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onError(5);
        }
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return 116;
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        onError(3, false);
    }

    protected void onError(int i8, boolean z7) {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onError(i8);
        }
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        onError(2, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onTransCompleted();
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileError() {
        onError(4, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileNull() {
        onError(1, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransStarting() {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onTransProgressStarting();
        }
    }

    public void a(CRPWatchFaceTransListener cRPWatchFaceTransListener) {
        this.f10850a = cRPWatchFaceTransListener;
    }

    public void a(File file) {
        int a8 = a();
        createFileManager(file, 0);
        setPacketLength(a8);
        if (this.mTransFileManager == null) {
            onError(1, false);
        } else {
            startTrans();
            startTimer();
        }
    }

    public void a(boolean z7) {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener != null) {
            cRPWatchFaceTransListener.onInstallStateChange(z7);
        }
    }
}
