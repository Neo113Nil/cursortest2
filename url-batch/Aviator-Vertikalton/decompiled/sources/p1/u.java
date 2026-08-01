package p1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements v1.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f3858a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3859b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.f f3860c = new v1.f();

    /* renamed from: d, reason: collision with root package name */
    public final v1.f f3861d = new v1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3863f;

    public u(w wVar, long j2, boolean z2) {
        this.f3863f = wVar;
        this.f3858a = j2;
        this.f3859b = z2;
    }

    @Override // v1.w
    public final v1.y a() {
        return this.f3863f.f3873k;
    }

    @Override // v1.w
    public final long c(v1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        X0.f.e(fVar, "sink");
        do {
            w wVar = this.f3863f;
            synchronized (wVar) {
                wVar.f3873k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3875m;
                    }
                } finally {
                    wVar.f3873k.k();
                }
            }
            if (i == 0 || this.f3859b) {
                th = null;
            } else {
                th = wVar.f3876n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3875m;
                        X0.e.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3862e) {
                throw new IOException("stream closed");
            }
            v1.f fVar2 = this.f3861d;
            long j4 = fVar2.f4484b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.c(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3867c + j3;
                wVar.f3867c = j5;
                long j6 = j5 - wVar.f3868d;
                if (th == null && j6 >= wVar.f3866b.f3827p.c() / 2) {
                    wVar.f3866b.n(wVar.f3865a, j6);
                    wVar.f3868d = wVar.f3867c;
                }
            } else {
                if (!this.f3859b && th == null) {
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
        w wVar = this.f3863f;
        synchronized (wVar) {
            this.f3862e = true;
            v1.f fVar = this.f3861d;
            j2 = fVar.f4484b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f3863f.a();
    }

    public final void g(long j2) {
        byte[] bArr = j1.b.f2967a;
        this.f3863f.f3866b.k(j2);
    }
}
