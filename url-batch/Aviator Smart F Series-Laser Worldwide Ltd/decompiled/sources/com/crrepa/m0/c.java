package com.crrepa.m0;

import com.crrepa.ble.util.BleLog;
import com.crrepa.l0.g;
import com.crrepa.m.f;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.m0.b f13359a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13360a = new c();

        private b() {
        }
    }

    private c() {
    }

    public static c a() {
        return b.f13360a;
    }

    private void onError(int i8, boolean z7) {
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }

    public void abort() {
        sendFileCheckResult(false);
        release();
    }

    public void b() {
        f.e().a(com.crrepa.m0.a.a());
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return -9;
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
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
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
    }

    @Override // com.crrepa.l0.g
    protected void sendFileCheckResult(boolean z7) {
        BleLog.d("sendFileCheckResult: " + z7);
        byte[] bArr = new byte[4];
        if (!z7) {
            Arrays.fill(bArr, (byte) -1);
        }
        byte[] bArr2 = new byte[5];
        bArr2[0] = 1;
        System.arraycopy(bArr, 0, bArr2, 1, 4);
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr2));
    }

    @Override // com.crrepa.l0.g
    protected void startTrans() {
        long d8 = this.mTransFileManager.d();
        if (d8 < 0) {
            onTransFileError();
            return;
        }
        byte[] bArr = new byte[5];
        bArr[0] = 1;
        byte[] fileSizeBytes = getFileSizeBytes(d8);
        System.arraycopy(fileSizeBytes, 0, bArr, 1, fileSizeBytes.length);
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    public void a(com.crrepa.m0.b bVar) {
    }

    public void a(File file) {
        int c8 = com.crrepa.l.a.b().c();
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

    public void a(boolean z7) {
    }
}
