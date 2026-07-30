package com.crrepa.l0;

import android.graphics.Bitmap;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.util.BleLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f13151k = 30;

    /* renamed from: l, reason: collision with root package name */
    private static final String f13152l = "crrepa";

    /* renamed from: m, reason: collision with root package name */
    private static final String f13153m = "wf";

    /* renamed from: a, reason: collision with root package name */
    protected CRPFileTransListener f13154a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f13155b;

    /* renamed from: d, reason: collision with root package name */
    protected int f13157d;

    /* renamed from: i, reason: collision with root package name */
    protected Bitmap[] f13162i;

    /* renamed from: c, reason: collision with root package name */
    private int f13156c = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f13158e = 30;

    /* renamed from: f, reason: collision with root package name */
    private Timer f13159f = new Timer();

    /* renamed from: g, reason: collision with root package name */
    private int f13160g = 0;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f13161h = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13163j = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.i();
            b bVar = b.this;
            byte[] b8 = bVar.b(bVar.f13161h, bVar.f13162i);
            if (b8 == null) {
                b.this.f(1);
                return;
            }
            com.crrepa.o.a.c().a(b.this);
            b.this.c(b8);
            b.this.i(b8.length);
            b.this.n();
            b.this.m();
            b.this.d(true);
        }
    }

    /* renamed from: com.crrepa.l0.b$b, reason: collision with other inner class name */
    class C0224b extends TimerTask {
        C0224b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BleLog.d("timer run--------------");
            b.this.f();
        }
    }

    public b() {
        this.f13157d = com.crrepa.l.a.b().h() ? com.crrepa.l.a.b().c() : 256;
    }

    private int d() {
        byte[] a8 = e.a(c(), e.f13178a);
        return com.crrepa.g1.c.b(a8[0], a8[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        int i8 = this.f13160g;
        if (i8 < this.f13158e) {
            this.f13160g = i8 + 1;
        } else {
            f(2);
        }
    }

    private void g(int i8) {
        this.f13157d = i8;
        this.f13156c = (this.f13155b.length / i8) + 1;
    }

    private synchronized void k() {
        this.f13160g = 0;
    }

    public void b() {
        j();
        f(4);
    }

    public abstract byte[] b(boolean z7, Bitmap[] bitmapArr);

    protected int c(int i8) {
        return i8 * this.f13157d;
    }

    protected File e() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.crrepa.g1.d.a().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(f13152l);
        sb.append(str);
        sb.append("wf");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    protected void h() {
        CRPFileTransListener cRPFileTransListener = this.f13154a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
        j();
    }

    protected void i() {
        CRPFileTransListener cRPFileTransListener = this.f13154a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    public void j() {
        this.f13155b = null;
        n();
        d(false);
    }

    public void l() {
        new Thread(new a()).start();
    }

    protected void m() {
        k();
        if (this.f13159f == null) {
            this.f13159f = new Timer();
        }
        this.f13159f.schedule(new C0224b(), 1000L, 1000L);
    }

    protected void n() {
        Timer timer = this.f13159f;
        if (timer != null) {
            timer.cancel();
            this.f13159f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i8) {
        com.crrepa.f0.a.a().b();
        g(i8);
    }

    private boolean g() {
        return this.f13163j;
    }

    private void h(int i8) {
        int c8 = c(i8);
        int i9 = this.f13157d + c8;
        BleLog.d("sendBitmapBytes start = " + c8 + ", end = " + i9);
        byte[] c9 = c();
        if (c9 == null) {
            return;
        }
        int length = c9.length;
        if (length < i9) {
            i9 = length;
        }
        int i10 = i9 - c8;
        byte[] bArr = new byte[i10];
        System.arraycopy(c9, c8, bArr, 0, i10);
        b(i.a(bArr, this.f13157d));
    }

    public void a() {
        j();
        b(false);
    }

    protected void b(boolean z7) {
        a(a(z7));
    }

    public void c(boolean z7) {
        this.f13161h = z7;
    }

    protected void e(int i8) {
        int i9;
        CRPFileTransListener cRPFileTransListener = this.f13154a;
        if (cRPFileTransListener == null || (i9 = this.f13156c) == 0) {
            return;
        }
        cRPFileTransListener.onTransProgressChanged((i8 * 100) / i9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13154a;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
        j();
    }

    protected void i(int i8) {
        BleLog.d("sendBitmapSize: " + i8);
        a(b(i8));
        com.crrepa.f0.a.a().b(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.l0.a
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i9) {
                b.this.d(i9);
            }
        });
    }

    public void j(int i8) {
        this.f13158e = i8;
    }

    private void a(int i8) {
        int d8 = d();
        BleLog.i("transFileCrc: " + i8);
        BleLog.i("calcFileCrc: " + d8);
        boolean z7 = i8 == d8;
        b(z7);
        if (z7) {
            h();
        } else {
            f(3);
        }
    }

    private void b(byte[] bArr) {
        BleLog.d("sendWatchFaceMessage: " + bArr.length);
        com.crrepa.m.f.e().d(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        this.f13155b = bArr;
        this.f13156c = (bArr.length / this.f13157d) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z7) {
        this.f13163j = z7;
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13154a = cRPFileTransListener;
    }

    protected byte[] b(int i8) {
        return com.crrepa.f.g.a(110, com.crrepa.g1.c.c(i8));
    }

    public byte[] c() {
        return this.f13155b;
    }

    public void a(com.crrepa.y0.a aVar) {
        if (!g()) {
            a();
            return;
        }
        k();
        if (aVar.d()) {
            a(aVar.a());
            return;
        }
        int b8 = aVar.b();
        if (b8 >= 0) {
            h(b8);
            e(b8);
        }
    }

    protected void a(byte[] bArr) {
        com.crrepa.m.f.e().c(bArr);
    }

    public void a(Bitmap... bitmapArr) {
        this.f13162i = bitmapArr;
    }

    public byte[] a(boolean z7) {
        byte[] bArr = new byte[4];
        if (!z7) {
            Arrays.fill(bArr, (byte) -1);
        }
        return com.crrepa.f.g.a(110, bArr);
    }

    protected byte[] a(boolean z7, Bitmap[] bitmapArr) {
        ArrayList<byte[]> arrayList = new ArrayList();
        int i8 = 0;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                byte[] f8 = b4.b.a(bitmap, z7).f();
                i8 += f8.length;
                arrayList.add(f8);
            }
        }
        if (i8 == 0) {
            return null;
        }
        byte[] bArr = new byte[i8];
        int i9 = 0;
        for (byte[] bArr2 : arrayList) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i9, length);
            i9 = length;
        }
        return bArr;
    }
}
