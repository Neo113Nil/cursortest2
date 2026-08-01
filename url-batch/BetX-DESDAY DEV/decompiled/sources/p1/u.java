package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements v1.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f3862a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3863b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.f f3864c = new v1.f();

    /* renamed from: d, reason: collision with root package name */
    public final v1.f f3865d = new v1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3866e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3867f;

    public u(w wVar, long j2, boolean z2) {
        this.f3867f = wVar;
        this.f3862a = j2;
        this.f3863b = z2;
    }

    @Override // v1.w
    public final v1.y a() {
        return this.f3867f.f3877k;
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        X0.f.e(fVar, "sink");
        do {
            w wVar = this.f3867f;
            synchronized (wVar) {
                wVar.f3877k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3879m;
                    }
                } finally {
                    wVar.f3877k.k();
                }
            }
            if (i == 0 || this.f3863b) {
                th = null;
            } else {
                th = wVar.f3880n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3879m;
                        X0.e.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3866e) {
                throw new IOException("stream closed");
            }
            v1.f fVar2 = this.f3865d;
            long j4 = fVar2.f4488b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.c(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3871c + j3;
                wVar.f3871c = j5;
                long j6 = j5 - wVar.f3872d;
                if (th == null && j6 >= wVar.f3870b.f3831p.c() / 2) {
                    wVar.f3870b.n(wVar.f3869a, j6);
                    wVar.f3872d = wVar.f3871c;
                }
            } else {
                if (!this.f3863b && th == null) {
                    wVar.k();
                    z2 = true;
                }
                j3 = -1;
            }
        } while (z2);
        if (j3 != -1) {
            return j3;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        w wVar = this.f3867f;
        synchronized (wVar) {
            this.f3866e = true;
            v1.f fVar = this.f3865d;
            j2 = fVar.f4488b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f3867f.a();
    }

    public final void g(long j2) {
        byte[] bArr = j1.b.f2971a;
        this.f3867f.f3870b.k(j2);
    }
}
