package com.crrepa.q0;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.q0.i;
import java.io.File;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f13698i = {"_thumb.bin", "_prev.bin"};

    /* renamed from: a, reason: collision with root package name */
    private com.crrepa.s0.c f13699a;

    /* renamed from: b, reason: collision with root package name */
    private CRPFileTransListener f13700b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap[] f13701c;

    /* renamed from: d, reason: collision with root package name */
    private File f13702d;

    /* renamed from: e, reason: collision with root package name */
    private String f13703e;

    /* renamed from: f, reason: collision with root package name */
    private int f13704f;

    /* renamed from: g, reason: collision with root package name */
    private int f13705g;

    /* renamed from: h, reason: collision with root package name */
    private int f13706h;

    class a implements CRPWatchFaceTransListener {
        a() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            i.this.b(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            i iVar = i.this;
            i.a(iVar, iVar.f13699a.a());
            i.c(i.this);
            d4.a.a(new Runnable() { // from class: com.crrepa.q0.h
                @Override // java.lang.Runnable
                public final void run() {
                    i.a.this.a();
                }
            }, 1000L);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            i.this.c(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            i.this.d();
        }
    }

    class b implements PicZipEventCallback {
        b() {
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            BleLog.d("compressRets: " + bArr.length);
            File cacheDir = com.crrepa.g1.d.a().getCacheDir();
            i iVar = i.this;
            File file = new File(cacheDir, iVar.a(iVar.f13704f));
            com.crrepa.g1.h.a(bArr, file);
            i.this.a(file);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final i f13709a = new i(null);

        private c() {
        }
    }

    private i() {
        this.f13704f = 0;
        this.f13705g = 0;
        this.f13706h = 0;
    }

    static /* synthetic */ int a(i iVar, long j8) {
        int i8 = (int) (iVar.f13706h + j8);
        iVar.f13706h = i8;
        return i8;
    }

    static /* synthetic */ int c(i iVar) {
        int i8 = iVar.f13704f;
        iVar.f13704f = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Bitmap[] bitmapArr = this.f13701c;
        int length = bitmapArr.length;
        int i8 = this.f13704f;
        if (length > i8) {
            com.crrepa.u0.c.a().a(new b());
            com.crrepa.u0.c.a().a(this.f13701c[this.f13704f]);
        } else if (i8 != bitmapArr.length || this.f13702d == null) {
            b();
        } else {
            BleLog.d("sendVideoFile");
            a(this.f13702d);
        }
    }

    /* synthetic */ i(a aVar) {
        this();
    }

    private int a(File file, Bitmap... bitmapArr) {
        int i8 = 0;
        for (Bitmap bitmap : bitmapArr) {
            i8 += com.crrepa.u0.a.a(bitmap.getWidth(), bitmap.getHeight());
        }
        return file != null ? i8 + ((int) file.length()) : i8;
    }

    protected void b() {
        CRPFileTransListener cRPFileTransListener = this.f13700b;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
    }

    protected void c() {
        CRPFileTransListener cRPFileTransListener = this.f13700b;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    public static i a() {
        return c.f13709a;
    }

    protected void b(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13700b;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
    }

    protected void c(int i8) {
        if (this.f13700b != null) {
            long a8 = this.f13699a.a() + this.f13706h;
            BleLog.i("onTransChanged percent: " + i8);
            BleLog.i("onTransChanged getTransIndex: " + this.f13699a.a());
            BleLog.i("onTransChanged transSize: " + a8);
            BleLog.i("onTransChanged totalFileSize: " + this.f13705g);
            int i9 = (int) ((a8 * 100) / ((long) this.f13705g));
            BleLog.i("onTransChanged: " + i9);
            this.f13700b.onTransProgressChanged(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i8) {
        String str = this.f13703e;
        File file = this.f13702d;
        if (file != null) {
            str = file.getName();
        }
        if (str.contains(".")) {
            str = str.substring(0, str.lastIndexOf("."));
        }
        return str + f13698i[i8];
    }

    private void a(int i8, int i9) {
        byte[] bArr = new byte[6];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        bArr[5] = (byte) i9;
        com.crrepa.m.f.e().c(com.crrepa.f.g.a(-76, bArr));
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13700b = cRPFileTransListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        com.crrepa.s0.c a8 = com.crrepa.s0.d.a().a((byte) 12);
        this.f13699a = a8;
        a8.a(new a());
        this.f13699a.a(file);
    }

    public void a(File file, Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            b(1);
            return;
        }
        this.f13702d = file;
        this.f13701c = new Bitmap[]{bitmap2, bitmap};
        this.f13705g = a(file, bitmap, bitmap2);
        BleLog.d("video watchface totalFileSize: " + this.f13705g);
        this.f13706h = 0;
        int length = this.f13701c.length;
        if (file != null) {
            length++;
        }
        BleLog.d("video watchface file count: " + length);
        a(this.f13705g, length);
        c();
        this.f13704f = 0;
        d();
    }

    public void a(String str, Bitmap bitmap) {
        if (TextUtils.isEmpty(str) || bitmap == null) {
            b(1);
            return;
        }
        this.f13702d = null;
        this.f13703e = str;
        this.f13701c = new Bitmap[]{bitmap};
        this.f13705g = com.crrepa.u0.a.a(bitmap.getWidth(), bitmap.getHeight());
        BleLog.d("video watchface totalFileSize: " + this.f13705g);
        this.f13706h = 0;
        a(this.f13705g, this.f13701c.length);
        c();
        this.f13704f = 0;
        d();
    }
}
