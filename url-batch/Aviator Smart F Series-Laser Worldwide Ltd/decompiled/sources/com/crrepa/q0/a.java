package com.crrepa.q0;

import android.graphics.Bitmap;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f13634i = {"ai_watch_face.bin", "ai_watch_face_thumb.bin"};

    /* renamed from: a, reason: collision with root package name */
    private int f13635a;

    /* renamed from: b, reason: collision with root package name */
    private float f13636b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap[] f13637c;

    /* renamed from: d, reason: collision with root package name */
    private CRPFileTransListener f13638d;

    /* renamed from: e, reason: collision with root package name */
    private com.crrepa.s0.c f13639e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13640f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13641g;

    /* renamed from: h, reason: collision with root package name */
    private int f13642h;

    /* renamed from: com.crrepa.q0.a$a, reason: collision with other inner class name */
    class C0238a implements CRPWatchFaceTransListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13643a;

        C0238a(boolean z7) {
            this.f13643a = z7;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            a.this.a(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted preview: " + this.f13643a);
            if (this.f13643a) {
                a.this.f13641g = false;
                a.this.e();
            } else {
                a.c(a.this);
                a.this.b();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            a.this.b(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }
    }

    private static class b implements PicZipEventCallback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f13645a;

        public b(a aVar) {
            this.f13645a = new WeakReference<>(aVar);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            boolean z7;
            BleLog.d("compressRets: " + bArr.length);
            a aVar = this.f13645a.get();
            if (aVar == null) {
                BleLog.e("AiWatchFaceHisiliconTrainsInitiator is null!");
                return;
            }
            File file = new File(com.crrepa.g1.d.a().getCacheDir(), a.f13634i[aVar.f13635a]);
            if (file.exists()) {
                file.delete();
            }
            com.crrepa.g1.h.a(bArr, file);
            if (aVar.f13641g && aVar.f13642h == bArr.length) {
                z7 = true;
            } else if (!aVar.f13640f) {
                return;
            } else {
                z7 = false;
            }
            aVar.a(z7, file);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13646a = new a(null);

        private c() {
        }
    }

    private a() {
        this.f13635a = 0;
        this.f13636b = 0.0f;
        this.f13640f = false;
        this.f13641g = false;
        this.f13642h = 0;
    }

    private int a(Bitmap... bitmapArr) {
        int i8 = 0;
        for (Bitmap bitmap : bitmapArr) {
            i8 += com.crrepa.u0.a.a(bitmap.getWidth(), bitmap.getHeight());
        }
        return i8;
    }

    static /* synthetic */ int c(a aVar) {
        int i8 = aVar.f13635a;
        aVar.f13635a = i8 + 1;
        return i8;
    }

    protected void f() {
        CRPFileTransListener cRPFileTransListener = this.f13638d;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    public synchronized void g() {
        try {
            if (!this.f13640f && !this.f13641g) {
                Bitmap[] bitmapArr = this.f13637c;
                if (bitmapArr == null) {
                    a(1);
                } else {
                    this.f13640f = true;
                    this.f13636b = 100.0f / bitmapArr.length;
                    int a8 = a(bitmapArr);
                    BleLog.d("photo watchface totalFileSize: " + a8);
                    a(a8, this.f13637c.length);
                    this.f13639e = com.crrepa.s0.d.a().a((byte) 14);
                    f();
                    com.crrepa.u0.c.a().a(new b(this));
                    b();
                }
                return;
            }
            BleLog.d("start: AiWatchFaceHisiliconTrainsInitiator is running");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* synthetic */ a(C0238a c0238a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Bitmap[] bitmapArr = this.f13637c;
        if (bitmapArr == null) {
            BleLog.e("bitmapArray is null");
            return;
        }
        if (bitmapArr.length <= this.f13635a) {
            this.f13637c = null;
            this.f13640f = false;
            e();
        } else {
            BleLog.d("compressPhotoWatchFace: " + this.f13635a);
            com.crrepa.u0.c.a().a(this.f13637c[this.f13635a]);
        }
    }

    public static a c() {
        return c.f13646a;
    }

    protected void a(int i8) {
        this.f13640f = false;
        this.f13641g = false;
        CRPFileTransListener cRPFileTransListener = this.f13638d;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
    }

    public boolean d() {
        return this.f13640f;
    }

    protected void e() {
        CRPFileTransListener cRPFileTransListener = this.f13638d;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
    }

    private void a(int i8, int i9) {
        byte[] bArr = new byte[6];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        bArr[5] = (byte) i9;
        com.crrepa.m.f.e().c(com.crrepa.f.g.a(-76, bArr));
    }

    protected void b(int i8) {
        if (this.f13638d != null) {
            float f8 = this.f13635a;
            float f9 = this.f13636b;
            int i9 = (int) ((f8 * f9) + ((i8 / 100.0f) * f9));
            BleLog.i("onTransChanged: " + i9);
            this.f13638d.onTransProgressChanged(i9);
        }
    }

    public void a(Bitmap bitmap) {
        if (this.f13640f || this.f13641g) {
            BleLog.d("startPreview: AiWatchFaceHisiliconTrainsInitiator is running");
            return;
        }
        if (bitmap == null) {
            a(1);
            return;
        }
        this.f13641g = true;
        this.f13636b = 100.0f;
        this.f13639e = com.crrepa.s0.d.a().a((byte) 13);
        f();
        this.f13635a = 0;
        this.f13642h = com.crrepa.u0.a.a(bitmap.getWidth(), bitmap.getHeight());
        BleLog.d("previewSize: " + this.f13642h);
        com.crrepa.u0.c.a().a(new b(this));
        com.crrepa.u0.c.a().a(bitmap);
    }

    public void a(Bitmap bitmap, Bitmap bitmap2) {
        if (this.f13640f) {
            BleLog.d("setWatchFaceInfo: AiWatchFaceHisiliconTrainsInitiator is running");
        } else {
            if (bitmap == null || bitmap2 == null) {
                return;
            }
            this.f13637c = new Bitmap[]{bitmap, bitmap2};
            this.f13635a = 0;
        }
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13638d = cRPFileTransListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z7, File file) {
        BleLog.e("sendPhotoWatchFace preview: " + z7);
        this.f13639e.a(new C0238a(z7));
        this.f13639e.a(file);
    }
}
