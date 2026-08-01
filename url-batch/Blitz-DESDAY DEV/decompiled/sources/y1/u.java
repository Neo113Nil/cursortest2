package y1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements E1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4277a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4278b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.f f4279c = new E1.f();
    public final E1.f d = new E1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f4281f;

    public u(w wVar, long j2, boolean z2) {
        this.f4281f = wVar;
        this.f4277a = j2;
        this.f4278b = z2;
    }

    @Override // E1.v
    public final E1.x a() {
        return this.f4281f.f4290k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        w wVar = this.f4281f;
        synchronized (wVar) {
            this.f4280e = true;
            E1.f fVar = this.d;
            j2 = fVar.f202b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f4281f.a();
    }

    @Override // E1.v
    public final long d(E1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        g1.d.e(fVar, "sink");
        do {
            w wVar = this.f4281f;
            synchronized (wVar) {
                wVar.f4290k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f4292m;
                    }
                } finally {
                    wVar.f4290k.k();
                }
            }
            if (i == 0 || this.f4278b) {
                th = null;
            } else {
                th = wVar.f4293n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f4292m;
                        X0.a.g(i2);
                        th = new A(i2);
                    }
                }
            }
            if (this.f4280e) {
                throw new IOException("stream closed");
            }
            E1.f fVar2 = this.d;
            long j4 = fVar2.f202b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.d(fVar, Math.min(8192L, j4));
                long j5 = wVar.f4285c + j3;
                wVar.f4285c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f4284b.f4250p.f() / 2) {
                    wVar.f4284b.n(wVar.f4283a, j6);
                    wVar.d = wVar.f4285c;
                }
            } else {
                if (!this.f4278b && th == null) {
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

    public final void g(long j2) {
        byte[] bArr = s1.b.f3607a;
        this.f4281f.f4284b.k(j2);
    }
}
