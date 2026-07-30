package com.crrepa.a1;

import android.text.TextUtils;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class d extends f {

    /* renamed from: c, reason: collision with root package name */
    private static final int f10837c = 8192;

    /* renamed from: b, reason: collision with root package name */
    private String f10838b;

    private byte[] b() {
        if (TextUtils.isEmpty(this.f10838b)) {
            return null;
        }
        return this.f10838b.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.crrepa.a1.f
    protected int a() {
        return 8192;
    }

    @Override // com.crrepa.a1.f
    public void abort() {
        release();
        sendBleMessage(com.crrepa.f.g.a(getCmd(), new byte[]{5}));
    }

    @Override // com.crrepa.a1.f, com.crrepa.l0.g
    public int getCmd() {
        return -73;
    }

    @Override // com.crrepa.l0.g
    protected byte[] getTransBytes(int i8) {
        com.crrepa.l0.h hVar = this.mTransFileManager;
        return hVar.a(i8, hVar.b());
    }

    @Override // com.crrepa.l0.g
    protected void onProgressChanged(long j8) {
        CRPWatchFaceTransListener cRPWatchFaceTransListener = this.f10850a;
        if (cRPWatchFaceTransListener == null) {
            return;
        }
        cRPWatchFaceTransListener.onTransProgressChanged((int) j8);
    }

    @Override // com.crrepa.l0.g
    protected void sendFileCheckResult(boolean z7) {
        byte[] bArr = new byte[1];
        if (z7) {
            bArr[0] = 3;
        } else {
            bArr[0] = 4;
        }
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    @Override // com.crrepa.l0.g
    protected void startTrans() {
        long d8 = this.mTransFileManager.d();
        if (d8 < 0) {
            onTransFileError();
            return;
        }
        BleLog.d("file name: " + this.f10838b);
        byte[] b8 = b();
        byte[] bArr = new byte[b8.length + 7];
        bArr[0] = 0;
        bArr[1] = 3;
        byte[] b9 = com.crrepa.g1.c.b(d8);
        System.arraycopy(b9, 0, bArr, 2, b9.length);
        System.arraycopy(b8, 0, bArr, 6, b8.length);
        BleLog.d("file name bytes: " + com.crrepa.g1.c.c(bArr));
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    @Override // com.crrepa.a1.f
    public void a(File file) {
        if (file != null) {
            this.f10838b = file.getName();
        }
        super.a(file);
    }
}
