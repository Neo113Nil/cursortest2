package com.crrepa.l0;

import android.text.TextUtils;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public abstract class d extends g {

    /* renamed from: g, reason: collision with root package name */
    private static final int f13168g = 256;

    /* renamed from: h, reason: collision with root package name */
    private static final int f13169h = 8192;

    /* renamed from: i, reason: collision with root package name */
    private static final int f13170i = 255;

    /* renamed from: a, reason: collision with root package name */
    protected CRPFileTransListener f13171a;

    /* renamed from: b, reason: collision with root package name */
    private String f13172b;

    /* renamed from: c, reason: collision with root package name */
    private File f13173c;

    /* renamed from: d, reason: collision with root package name */
    private String f13174d;

    /* renamed from: e, reason: collision with root package name */
    private int f13175e = 8192;

    /* renamed from: f, reason: collision with root package name */
    private final com.crrepa.k0.c f13176f = com.crrepa.k0.c.c();

    class a implements com.crrepa.k0.b {
        a() {
        }

        @Override // com.crrepa.k0.b
        public void onConnectionStateChanged(int i8) {
            d.this.resetTimer();
            if (i8 != 2) {
                if (i8 == 0) {
                    d.this.onTransFileError();
                }
            } else {
                d dVar = d.this;
                dVar.createFileManager(dVar.f13173c, 0);
                d dVar2 = d.this;
                dVar2.setPacketLength(dVar2.f13175e);
                d.this.sendFile(0);
            }
        }

        @Override // com.crrepa.k0.b
        public void onReceiveData(byte[] bArr) {
        }
    }

    private void c() {
        sendBleMessage(com.crrepa.f.g.a(getCmd(), new byte[]{5}));
    }

    public void abort() {
        c();
        release();
    }

    public abstract byte b();

    @Override // com.crrepa.l0.g
    public int getCmd() {
        return -73;
    }

    @Override // com.crrepa.l0.g
    protected void onCrcFail() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(3);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTimeoutError() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(2);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTransChanged(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressChanged(i8);
        }
    }

    @Override // com.crrepa.l0.g
    protected void onTransComplete() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileError() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(4);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTransFileNull() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(1);
        }
        release();
    }

    @Override // com.crrepa.l0.g
    protected void onTransStarting() {
        CRPFileTransListener cRPFileTransListener = this.f13171a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    @Override // com.crrepa.l0.g
    protected void release() {
        BleLog.d("release");
        super.release();
        this.f13172b = null;
        this.f13173c = null;
        this.f13176f.b();
    }

    @Override // com.crrepa.l0.g
    protected void sendFile(int i8) {
        try {
            BleLog.d("sendFile offset: " + i8);
            byte[] transBytes = getTransBytes(i8);
            int i9 = 0;
            while (i9 < transBytes.length) {
                int i10 = i9 + 256;
                int length = transBytes.length < i10 ? transBytes.length - i9 : 256;
                BleLog.d("sendFile length: " + length);
                byte[] bArr = new byte[length];
                System.arraycopy(transBytes, i9, bArr, 0, length);
                this.f13176f.a(bArr);
                i9 = i10;
            }
            resetTimer();
            int packetLength = (int) ((((i8 * getPacketLength()) + transBytes.length) * 100) / this.f13173c.length());
            BleLog.d("file send percent: " + packetLength);
            if (packetLength < 100) {
                onTransChanged(packetLength);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            onTransFileError();
        }
    }

    @Override // com.crrepa.l0.g
    protected void sendFileCheckResult(boolean z7) {
        BleLog.d("sendFileCheckResult: " + z7);
        byte[] bArr = new byte[1];
        if (z7) {
            bArr[0] = 3;
        } else {
            bArr[0] = 4;
        }
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    @Override // com.crrepa.l0.g
    public void transFileIndex(com.crrepa.y0.a aVar) {
        BleLog.d("transFileIndex: " + aVar);
        if (this.f13173c == null) {
            BleLog.e("transFileIndex: file is null");
            return;
        }
        if (aVar.d()) {
            resetTimer();
            checkFileCRC(aVar.a());
        } else if (aVar.b() == 0) {
            a();
        } else {
            sendFile(aVar.b() / getPacketLength());
        }
    }

    private void a() {
        resetTimer();
        onTransStarting();
        this.f13176f.a(this.f13172b, false, new a());
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13171a = cRPFileTransListener;
    }

    private void a(File file) {
        if (TextUtils.isEmpty(this.f13174d)) {
            this.f13174d = file.getName();
        }
        byte[] a8 = com.crrepa.g1.c.a(this.f13174d, 255, StandardCharsets.UTF_8);
        if (com.crrepa.g1.c.h(a8)) {
            onTransFileNull();
            return;
        }
        byte[] b8 = com.crrepa.g1.c.b(file.length());
        byte[] bArr = new byte[a8.length + b8.length + 2];
        bArr[0] = 0;
        bArr[1] = b();
        System.arraycopy(b8, 0, bArr, 2, b8.length);
        System.arraycopy(a8, 0, bArr, b8.length + 2, a8.length);
        sendBleMessage(com.crrepa.f.g.a(getCmd(), bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, int i8) {
        com.crrepa.f0.a.a().b();
        this.f13175e = i8;
        a(file);
        startTimer();
    }

    public void a(String str, final File file, String str2) {
        if (TextUtils.isEmpty(str) || file == null || !file.exists()) {
            onTransFileNull();
            return;
        }
        this.f13172b = str;
        this.f13173c = file;
        this.f13174d = str2;
        com.crrepa.f0.a.a().a(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.l0.c
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i8) {
                d.this.a(file, i8);
            }
        });
    }
}
