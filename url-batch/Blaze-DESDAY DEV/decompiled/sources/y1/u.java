package y1;

import Y.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements E1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4306a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final E1.f f4308c = new E1.f();
    public final E1.f d = new E1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f4310f;

    public u(w wVar, long j2, boolean z2) {
        this.f4310f = wVar;
        this.f4306a = j2;
        this.f4307b = z2;
    }

    @Override // E1.v
    public final E1.x a() {
        return this.f4310f.f4319k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        w wVar = this.f4310f;
        synchronized (wVar) {
            this.f4309e = true;
            E1.f fVar = this.d;
            j2 = fVar.f203b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f4310f.a();
    }

    @Override // E1.v
    public final long d(E1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        g1.d.e(fVar, "sink");
        do {
            w wVar = this.f4310f;
            synchronized (wVar) {
                wVar.f4319k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f4321m;
                    }
                } finally {
                    wVar.f4319k.k();
                }
            }
            if (i == 0 || this.f4307b) {
                th = null;
            } else {
                th = wVar.f4322n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f4321m;
                        V.g(i2);
                        th = new A(i2);
                    }
                }
            }
            if (this.f4309e) {
                throw new IOException("stream closed");
            }
            E1.f fVar2 = this.d;
            long j4 = fVar2.f203b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.d(fVar, Math.min(8192L, j4));
                long j5 = wVar.f4314c + j3;
                wVar.f4314c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f4313b.f4279p.c() / 2) {
                    wVar.f4313b.n(wVar.f4312a, j6);
                    wVar.d = wVar.f4314c;
                }
            } else {
                if (!this.f4307b && th == null) {
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
        byte[] bArr = s1.b.f3721a;
        this.f4310f.f4313b.k(j2);
    }
}
