package com.crrepa.ble.trans.ui;

import com.crrepa.ble.conn.listener.CRPTransListener;
import com.crrepa.l0.g;
import com.crrepa.l0.i;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPUiTransInitiator extends g {
    private CRPTransListener listener;

    private static class Holder {
        private static final CRPUiTransInitiator INSTANCE = new CRPUiTransInitiator();

        private Holder() {
        }
    }

    private CRPUiTransInitiator() {
    }

    public static CRPUiTransInitiator getInstance() {
        return Holder.INSTANCE;
    }

    private void onError(int i8, boolean z7) {
        CRPTransListener cRPTransListener = this.listener;
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
        return 108;
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
        CRPTransListener cRPTransListener = this.listener;
        if (cRPTransListener != null) {
            cRPTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPTransListener cRPTransListener = this.listener;
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
        CRPTransListener cRPTransListener = this.listener;
        if (cRPTransListener != null) {
            cRPTransListener.onTransProgressStarting();
        }
    }

    public void setListener(CRPTransListener cRPTransListener) {
        this.listener = cRPTransListener;
    }

    public void start(File file, int i8, String str) {
        createFileManager(file, i8);
        setPacketLength(i.a(str));
        if (this.mTransFileManager == null) {
            onError(1, false);
            return;
        }
        onTransStarting();
        startTrans();
        startTimer();
    }
}
