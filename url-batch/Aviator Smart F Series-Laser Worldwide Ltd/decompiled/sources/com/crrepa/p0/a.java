package com.crrepa.p0;

import com.crrepa.ble.conn.listener.CRPTransListener;
import com.crrepa.l0.g;
import java.io.File;

/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private CRPTransListener f13611a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13612a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a a() {
        return b.f13612a;
    }

    private void onError(int i8, boolean z7) {
        CRPTransListener cRPTransListener = this.f13611a;
        if (cRPTransListener != null) {
            cRPTransListener.onError(i8);
        }
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }

    public void abort() {
        sendFileCheckResult(false);
        release();
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return 96;
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        onError(2, false);
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        onError(4, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPTransListener cRPTransListener = this.f13611a;
        if (cRPTransListener != null) {
            cRPTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPTransListener cRPTransListener = this.f13611a;
        if (cRPTransListener != null) {
            cRPTransListener.onTransCompleted();
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileError() {
        onError(2, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileNull() {
        onError(1, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransStarting() {
        CRPTransListener cRPTransListener = this.f13611a;
        if (cRPTransListener != null) {
            cRPTransListener.onTransProgressStarting();
        }
    }

    public void setListener(CRPTransListener cRPTransListener) {
        this.f13611a = cRPTransListener;
    }

    public void a(File file, int i8) {
        createFileManager(file, i8);
        setPacketLength(com.crrepa.l.a.b().c());
        if (this.mTransFileManager == null) {
            onError(1, false);
            return;
        }
        onTransStarting();
        startTrans();
        startTimer();
    }
}
