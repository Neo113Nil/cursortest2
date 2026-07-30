package com.crrepa.q0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import com.crrepa.ble.conn.listener.CRPGalleryTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    private static final String f13664j = "crrepa";

    /* renamed from: k, reason: collision with root package name */
    private static final String f13665k = "gallery";

    /* renamed from: l, reason: collision with root package name */
    private static final String f13666l = ".bin";

    /* renamed from: a, reason: collision with root package name */
    private final List<File> f13667a;

    /* renamed from: b, reason: collision with root package name */
    private CRPGalleryTransListener f13668b;

    /* renamed from: c, reason: collision with root package name */
    private String f13669c;

    /* renamed from: d, reason: collision with root package name */
    private com.crrepa.s0.c f13670d;

    /* renamed from: e, reason: collision with root package name */
    private int f13671e;

    /* renamed from: f, reason: collision with root package name */
    private int f13672f;

    /* renamed from: g, reason: collision with root package name */
    private int f13673g;

    /* renamed from: h, reason: collision with root package name */
    private int f13674h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13675i;

    class a implements PicZipEventCallback {
        a() {
        }

        @Override // com.compress.api.PicZipEventCallback
        public void compressRets(int i8, int i9, int i10, byte[] bArr) {
            BleLog.d("compressRets: " + bArr.length);
            File b8 = d.this.b();
            com.crrepa.g1.h.a(bArr, b8);
            d.this.a(b8);
        }

        @Override // com.compress.api.PicZipEventCallback
        public void deCompressRets(int i8, int i9, DecompressRet decompressRet) {
        }
    }

    class b implements CRPWatchFaceTransListener {
        b() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            d.this.a(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            d dVar = d.this;
            d.a(dVar, dVar.f13670d.a());
            d.this.g();
            d.c(d.this);
            d.this.e();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            d.this.b(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final d f13678a = new d(null);

        private c() {
        }
    }

    private d() {
        this.f13667a = new ArrayList();
        this.f13671e = 0;
        this.f13672f = 0;
        this.f13675i = false;
    }

    static /* synthetic */ int a(d dVar, long j8) {
        int i8 = (int) (dVar.f13672f + j8);
        dVar.f13672f = i8;
        return i8;
    }

    static /* synthetic */ int c(d dVar) {
        int i8 = dVar.f13674h;
        dVar.f13674h = i8 + 1;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f13675i) {
            BleLog.e("the file trans aborted!");
            return;
        }
        if (this.f13667a.isEmpty()) {
            d();
            return;
        }
        File remove = this.f13667a.remove(0);
        if (remove == null || !remove.exists()) {
            g();
            return;
        }
        this.f13669c = remove.getName();
        com.crrepa.u0.c.a().a(BitmapFactory.decodeFile(remove.getAbsolutePath()));
    }

    protected File b() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getCacheDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f13664j);
        sb.append(str);
        sb.append(f13665k);
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.f13669c.contains(".")) {
            StringBuilder sb3 = new StringBuilder();
            String str2 = this.f13669c;
            sb3.append(str2.substring(0, str2.lastIndexOf(".")));
            sb3.append(f13666l);
            this.f13669c = sb3.toString();
        }
        return new File(sb2, this.f13669c);
    }

    protected void d() {
        CRPGalleryTransListener cRPGalleryTransListener = this.f13668b;
        if (cRPGalleryTransListener != null) {
            cRPGalleryTransListener.onTransProgressChanged(100);
            this.f13668b.onTransCompleted();
        }
    }

    protected void e() {
        CRPGalleryTransListener cRPGalleryTransListener = this.f13668b;
        if (cRPGalleryTransListener != null) {
            cRPGalleryTransListener.onTransPhotoChanged(this.f13673g, this.f13674h);
        }
    }

    protected void f() {
        CRPGalleryTransListener cRPGalleryTransListener = this.f13668b;
        if (cRPGalleryTransListener != null) {
            cRPGalleryTransListener.onTransProgressStarting();
        }
    }

    /* synthetic */ d(a aVar) {
        this();
    }

    private int a(List<File> list) {
        Iterator<File> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(it.next().getAbsolutePath());
            i8 += com.crrepa.u0.a.a(decodeFile.getWidth(), decodeFile.getHeight());
        }
        return i8;
    }

    public static d c() {
        return c.f13678a;
    }

    protected void b(int i8) {
        if (this.f13668b != null) {
            long a8 = this.f13670d.a() + this.f13672f;
            BleLog.i("onTransChanged percent: " + i8);
            BleLog.i("onTransChanged getTransIndex: " + this.f13670d.a());
            BleLog.i("onTransChanged transSize: " + a8);
            BleLog.i("onTransChanged totalFileSize: " + this.f13671e);
            int i9 = (int) ((a8 * 100) / ((long) this.f13671e));
            BleLog.i("onTransChanged: " + i9);
            this.f13668b.onTransProgressChanged(i9);
        }
    }

    public void a() {
        com.crrepa.s0.c cVar = this.f13670d;
        if (cVar != null) {
            cVar.abort();
        }
        this.f13667a.clear();
    }

    protected void a(int i8) {
        this.f13675i = true;
        CRPGalleryTransListener cRPGalleryTransListener = this.f13668b;
        if (cRPGalleryTransListener != null) {
            cRPGalleryTransListener.onError(i8);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) {
        this.f13670d.a(new b());
        this.f13670d.a(file);
    }

    public void a(List<File> list, CRPGalleryTransListener cRPGalleryTransListener) {
        if (cRPGalleryTransListener == null) {
            return;
        }
        if (list == null || list.isEmpty()) {
            a(1);
            return;
        }
        this.f13670d = com.crrepa.s0.d.a().a((byte) 17);
        this.f13668b = cRPGalleryTransListener;
        this.f13667a.clear();
        this.f13667a.addAll(list);
        this.f13673g = this.f13667a.size();
        this.f13674h = 0;
        this.f13671e = a(this.f13667a);
        this.f13672f = 0;
        this.f13675i = false;
        BleLog.d("gallery totalFileSize: " + this.f13671e);
        a(this.f13671e, this.f13667a.size());
        com.crrepa.u0.c.a().a(new a());
        f();
        g();
    }
}
