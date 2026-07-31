package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC1837bm;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.yandex.mobile.ads.impl.em, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1909em implements hv {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1837bm f25340a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25341b = 5242880;

    /* renamed from: c, reason: collision with root package name */
    private final int f25342c = 20480;

    /* renamed from: d, reason: collision with root package name */
    private mv f25343d;

    /* renamed from: e, reason: collision with root package name */
    private long f25344e;

    /* renamed from: f, reason: collision with root package name */
    private File f25345f;

    /* renamed from: g, reason: collision with root package name */
    private OutputStream f25346g;

    /* renamed from: h, reason: collision with root package name */
    private long f25347h;

    /* renamed from: i, reason: collision with root package name */
    private long f25348i;

    /* renamed from: j, reason: collision with root package name */
    private hr1 f25349j;

    /* renamed from: com.yandex.mobile.ads.impl.em$a */
    public static final class a extends InterfaceC1837bm.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.em$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1837bm f25350a;

        public final b a(InterfaceC1837bm interfaceC1837bm) {
            this.f25350a = interfaceC1837bm;
            return this;
        }

        public final C1909em a() {
            InterfaceC1837bm interfaceC1837bm = this.f25350a;
            interfaceC1837bm.getClass();
            return new C1909em(interfaceC1837bm);
        }
    }

    public C1909em(InterfaceC1837bm interfaceC1837bm) {
        this.f25340a = (InterfaceC1837bm) C2253tf.a(interfaceC1837bm);
    }

    private void a() {
        OutputStream outputStream = this.f25346g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            u82.a((Closeable) this.f25346g);
            this.f25346g = null;
            File file = this.f25345f;
            this.f25345f = null;
            this.f25340a.a(file, this.f25347h);
        } catch (Throwable th) {
            u82.a((Closeable) this.f25346g);
            this.f25346g = null;
            File file2 = this.f25345f;
            this.f25345f = null;
            file2.delete();
            throw th;
        }
    }

    private void b(mv mvVar) {
        long j4 = mvVar.f29245g;
        long min = j4 != -1 ? Math.min(j4 - this.f25348i, this.f25344e) : -1L;
        InterfaceC1837bm interfaceC1837bm = this.f25340a;
        String str = mvVar.f29246h;
        int i4 = u82.f32873a;
        this.f25345f = interfaceC1837bm.a(str, mvVar.f29244f + this.f25348i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f25345f);
        if (this.f25342c > 0) {
            hr1 hr1Var = this.f25349j;
            if (hr1Var == null) {
                this.f25349j = new hr1(fileOutputStream, this.f25342c);
            } else {
                hr1Var.a(fileOutputStream);
            }
            this.f25346g = this.f25349j;
        } else {
            this.f25346g = fileOutputStream;
        }
        this.f25347h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.hv
    public final void close() {
        if (this.f25343d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e4) {
            throw new a(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hv
    public final void write(byte[] bArr, int i4, int i5) {
        mv mvVar = this.f25343d;
        if (mvVar == null) {
            return;
        }
        int i6 = 0;
        while (i6 < i5) {
            try {
                if (this.f25347h == this.f25344e) {
                    a();
                    b(mvVar);
                }
                int min = (int) Math.min(i5 - i6, this.f25344e - this.f25347h);
                OutputStream outputStream = this.f25346g;
                int i7 = u82.f32873a;
                outputStream.write(bArr, i4 + i6, min);
                i6 += min;
                long j4 = min;
                this.f25347h += j4;
                this.f25348i += j4;
            } catch (IOException e4) {
                throw new a(e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.hv
    public final void a(mv mvVar) {
        mvVar.f29246h.getClass();
        if (mvVar.f29245g == -1 && (mvVar.f29247i & 2) == 2) {
            this.f25343d = null;
            return;
        }
        this.f25343d = mvVar;
        this.f25344e = (mvVar.f29247i & 4) == 4 ? this.f25341b : Long.MAX_VALUE;
        this.f25348i = 0L;
        try {
            b(mvVar);
        } catch (IOException e4) {
            throw new a(e4);
        }
    }
}
