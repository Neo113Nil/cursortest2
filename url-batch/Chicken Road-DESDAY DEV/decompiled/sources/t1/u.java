package t1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements z1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f3832a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.f f3834c = new z1.f();
    public final z1.f d = new z1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3836f;

    public u(w wVar, long j2, boolean z2) {
        this.f3836f = wVar;
        this.f3832a = j2;
        this.f3833b = z2;
    }

    @Override // z1.v
    public final z1.x a() {
        return this.f3836f.f3845k;
    }

    @Override // z1.v
    public final long b(z1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        b1.d.e(fVar, "sink");
        do {
            w wVar = this.f3836f;
            synchronized (wVar) {
                wVar.f3845k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3847m;
                    }
                } finally {
                    wVar.f3845k.k();
                }
            }
            if (i == 0 || this.f3833b) {
                th = null;
            } else {
                th = wVar.f3848n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3847m;
                        V.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3835e) {
                throw new IOException("stream closed");
            }
            z1.f fVar2 = this.d;
            long j4 = fVar2.f4268b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3840c + j3;
                wVar.f3840c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f3839b.f3805p.c() / 2) {
                    wVar.f3839b.n(wVar.f3838a, j6);
                    wVar.d = wVar.f3840c;
                }
            } else {
                if (!this.f3833b && th == null) {
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
        w wVar = this.f3836f;
        synchronized (wVar) {
            this.f3835e = true;
            z1.f fVar = this.d;
            j2 = fVar.f4268b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f3836f.a();
    }

    public final void g(long j2) {
        byte[] bArr = n1.b.f3286a;
        this.f3836f.f3839b.k(j2);
    }
}
