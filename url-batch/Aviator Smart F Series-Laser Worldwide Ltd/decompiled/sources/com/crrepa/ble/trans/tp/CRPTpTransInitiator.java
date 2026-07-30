package com.crrepa.ble.trans.tp;

import android.text.TextUtils;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.conn.listener.CRPTransListener;
import com.crrepa.g1.c;
import com.crrepa.l.b;
import com.crrepa.l0.g;
import com.crrepa.l0.i;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPTpTransInitiator extends g {
    private CRPTransListener listener;

    private static class Holder {
        private static final CRPTpTransInitiator INSTANCE = new CRPTpTransInitiator();

        private Holder() {
        }
    }

    private CRPTpTransInitiator() {
    }

    public static CRPTpTransInitiator getInstance() {
        return Holder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendTransLength$0(int i8) {
        com.crrepa.f0.a.a().b();
        setPacketLength(i8);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void onTpFileDownloadComplete(String str, String str2) {
        createFileManager(new File(str), 0);
        setPacketLength(i.a(str2));
        if (this.mTransFileManager == null) {
            onError(1, false);
            return;
        }
        onTransStarting();
        sendTransLength(b.b().a().getTp_bin_offset());
        startTimer();
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

    protected void sendTransLength(int i8) {
        long d8 = this.mTransFileManager.d();
        if (d8 < 0) {
            onError(1, false);
            return;
        }
        byte[] c8 = c.c(d8);
        byte[] c9 = c.c(i8);
        byte[] bArr = new byte[c8.length + c9.length];
        System.arraycopy(c8, 0, bArr, 0, c8.length);
        System.arraycopy(c9, 0, bArr, c8.length, c9.length);
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
        com.crrepa.f0.a.a().b(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.ble.trans.tp.a
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i9) {
                CRPTpTransInitiator.this.lambda$sendTransLength$0(i9);
            }
        });
    }

    public void start(final String str, CRPTransListener cRPTransListener) {
        this.listener = cRPTransListener;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new TPFileDownloader().downloadFile(cRPTransListener, new m4.a() { // from class: com.crrepa.ble.trans.tp.CRPTpTransInitiator.1
            @Override // m4.a
            public void onComplete(String str2) {
                CRPTpTransInitiator.this.onTpFileDownloadComplete(str2, str);
            }
        });
    }
}
