package com.crrepa.o0;

import androidx.annotation.NonNull;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPEpoType;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.c;
import com.crrepa.l0.g;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private CRPFileTransListener f13470a;

    /* renamed from: b, reason: collision with root package name */
    private CRPEpoType f13471b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static a f13472a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a a() {
        return b.f13472a;
    }

    private void onError(int i8, boolean z7) {
        CRPFileTransListener cRPFileTransListener = this.f13470a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }

    public void abort() {
        if (isStarted()) {
            sendFileCheckResult(false);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void checkFileCRC(int i8) {
        int c8 = this.mTransFileManager.c();
        BleLog.i("receiveCRC: " + i8);
        BleLog.i("calcFileCrc: " + c8);
        boolean z7 = i8 == c8;
        sendFileCheckResult(z7);
        if (z7) {
            transComplete();
        } else {
            onCrcFail();
        }
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return -77;
    }

    @Override // com.crrepa.l0.g
    @NonNull
    protected byte[] getFileSizeBytes(long j8) {
        byte[] bArr = new byte[6];
        bArr[0] = 3;
        bArr[1] = this.f13471b.getValue();
        byte[] c8 = c.c(j8);
        System.arraycopy(c8, 0, bArr, 2, c8.length);
        return bArr;
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        onError(3, false);
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        onError(2, true);
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13470a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPFileTransListener cRPFileTransListener = this.f13470a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
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
        CRPFileTransListener cRPFileTransListener = this.f13470a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    @Override // com.crrepa.l0.g
    protected void sendFileCheckResult(boolean z7) {
        BleLog.d("sendFileCheckResult: " + z7);
        CRPEpoType cRPEpoType = this.f13471b;
        if (cRPEpoType == null) {
            BleLog.d("epoType is null");
            return;
        }
        byte[] bArr = new byte[6];
        bArr[0] = 3;
        bArr[1] = cRPEpoType.getValue();
        if (!z7) {
            Arrays.fill(bArr, 2, 6, (byte) -1);
        }
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13470a = cRPFileTransListener;
    }

    public void a(CRPEpoType cRPEpoType, File file) {
        if (cRPEpoType == null) {
            onError(1, false);
            return;
        }
        this.f13471b = cRPEpoType;
        int c8 = com.crrepa.l.a.b().h() ? com.crrepa.l.a.b().c() : 256;
        createFileManager(file, 0);
        setPacketLength(c8);
        if (this.mTransFileManager == null) {
            onError(1, false);
            return;
        }
        onTransStarting();
        startTrans();
        startTimer();
    }
}
