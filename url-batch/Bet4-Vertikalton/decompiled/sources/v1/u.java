package v1;

import Y.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements B1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4134a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4135b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.f f4136c = new B1.f();
    public final B1.f d = new B1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f4138f;

    public u(w wVar, long j2, boolean z2) {
        this.f4138f = wVar;
        this.f4134a = j2;
        this.f4135b = z2;
    }

    @Override // B1.v
    public final B1.x a() {
        return this.f4138f.f4147k;
    }

    @Override // B1.v
    public final long c(B1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        d1.d.e(fVar, "sink");
        do {
            w wVar = this.f4138f;
            synchronized (wVar) {
                wVar.f4147k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f4149m;
                    }
                } finally {
                    wVar.f4147k.k();
                }
            }
            if (i == 0 || this.f4135b) {
                th = null;
            } else {
                th = wVar.f4150n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f4149m;
                        V.g(i2);
                        th = new A(i2);
                    }
                }
            }
            if (this.f4137e) {
                throw new IOException("stream closed");
            }
            B1.f fVar2 = this.d;
            long j4 = fVar2.f69b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.c(fVar, Math.min(8192L, j4));
                long j5 = wVar.f4142c + j3;
                wVar.f4142c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f4141b.f4107p.c() / 2) {
                    wVar.f4141b.n(wVar.f4140a, j6);
                    wVar.d = wVar.f4142c;
                }
            } else {
                if (!this.f4135b && th == null) {
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
        w wVar = this.f4138f;
        synchronized (wVar) {
            this.f4137e = true;
            B1.f fVar = this.d;
            j2 = fVar.f69b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f4138f.a();
    }

    public final void g(long j2) {
        byte[] bArr = p1.b.f3455a;
        this.f4138f.f4141b.k(j2);
    }
}
