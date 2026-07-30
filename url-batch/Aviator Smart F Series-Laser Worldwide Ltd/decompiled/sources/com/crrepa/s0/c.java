package com.crrepa.s0;

import android.text.TextUtils;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.l0.g;
import com.crrepa.l0.h;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class c extends g {

    /* renamed from: f, reason: collision with root package name */
    private static final int f13779f = 160;

    /* renamed from: a, reason: collision with root package name */
    protected CRPFileTransListener f13780a;

    /* renamed from: b, reason: collision with root package name */
    private a f13781b;

    /* renamed from: c, reason: collision with root package name */
    protected String f13782c;

    /* renamed from: d, reason: collision with root package name */
    protected long f13783d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected final byte f13784e;

    public interface a {
        void a();
    }

    protected c(byte b8) {
        this.f13784e = b8;
    }

    public long a() {
        return this.f13783d;
    }

    public void abort() {
        release();
        sendBleMessage(com.crrepa.f.g.a(getCmd(), new byte[]{5}));
    }

    @Override // com.crrepa.l0.g
    protected void checkFileCRC(int i8) {
        int c8 = this.mTransFileManager.c();
        BleLog.i("receiveCRC: " + i8);
        BleLog.i("calcFileCrc: " + c8);
        final boolean z7 = i8 == c8;
        sendFileCheckResult(z7);
        if (this.f13784e != 8) {
            d4.a.a(new Runnable() { // from class: com.crrepa.s0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(z7);
                }
            }, 1000L);
        } else if (z7) {
            transComplete();
        } else {
            onCrcFail();
        }
    }

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return -73;
    }

    @Override // com.crrepa.l0.g
    protected byte[] getTransBytes(int i8) {
        h hVar = this.mTransFileManager;
        return hVar.a(i8, hVar.b());
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        a(false, 3);
    }

    @Override // com.crrepa.l0.g
    protected void onProgressChanged(long j8) {
        if (this.mTransFileManager == null) {
            return;
        }
        this.f13783d = j8;
        onTransChanged((int) ((j8 * 100) / r0.d()));
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        a(true, 2);
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13780a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPFileTransListener cRPFileTransListener = this.f13780a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
        a aVar = this.f13781b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileError() {
        a(true, 4);
    }

    @Override // com.crrepa.l0.g
    public void onTransFileNull() {
        a(false, 1);
    }

    @Override // com.crrepa.l0.g
    protected void onTransStarting() {
        CRPFileTransListener cRPFileTransListener = this.f13780a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    @Override // com.crrepa.l0.g
    protected void sendFileCheckResult(boolean z7) {
        BleLog.d("sendFileCheckResult: " + z7);
        if (this.mTransFileManager != null) {
            this.f13783d = r0.d();
        }
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
        onTransStarting();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i8) {
        com.crrepa.f0.a.a().b();
        setPacketLength(i8);
        startTrans();
        startTimer();
    }

    protected void b() {
        h hVar = this.mTransFileManager;
        if (hVar == null) {
            BleLog.e("startTrans: mTransFileManager is null!");
            return;
        }
        long d8 = hVar.d();
        if (d8 < 0) {
            onTransFileError();
            return;
        }
        byte[] a8 = com.crrepa.g1.c.a(this.f13782c, 160, StandardCharsets.UTF_8);
        int length = !com.crrepa.g1.c.h(a8) ? a8.length : 0;
        byte[] bArr = new byte[length + 7];
        bArr[0] = 0;
        bArr[1] = this.f13784e;
        byte[] b8 = com.crrepa.g1.c.b(d8);
        System.arraycopy(b8, 0, bArr, 2, b8.length);
        if (length > 0) {
            System.arraycopy(a8, 0, bArr, 6, a8.length);
        }
        com.crrepa.o.a.c().a(this);
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13780a = cRPFileTransListener;
    }

    public void a(a aVar) {
        this.f13781b = aVar;
    }

    public void a(File file) {
        a(file, (String) null);
    }

    public void a(File file, String str) {
        if (file == null || !file.exists()) {
            onTransFileNull();
            return;
        }
        this.f13783d = 0L;
        if (TextUtils.isEmpty(str)) {
            str = file.getName();
        }
        this.f13782c = str;
        createFileManager(file, 0);
        if (this.mTransFileManager != null) {
            com.crrepa.f0.a.a().a(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.s0.a
                @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
                public final void onPackageLength(int i8) {
                    c.this.a(i8);
                }
            });
        } else {
            a(false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z7) {
        if (z7) {
            transComplete();
        } else {
            onCrcFail();
        }
    }

    protected void a(boolean z7, int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13780a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
        if (z7) {
            sendFileCheckResult(false);
        }
        release();
    }
}
