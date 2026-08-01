package r1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements x1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f3611a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3612b;

    /* renamed from: c, reason: collision with root package name */
    public final x1.f f3613c = new x1.f();
    public final x1.f d = new x1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3615f;

    public u(w wVar, long j2, boolean z2) {
        this.f3615f = wVar;
        this.f3611a = j2;
        this.f3612b = z2;
    }

    @Override // x1.v
    public final x1.x a() {
        return this.f3615f.f3624k;
    }

    @Override // x1.v
    public final long b(x1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        Z0.d.e(fVar, "sink");
        do {
            w wVar = this.f3615f;
            synchronized (wVar) {
                wVar.f3624k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3626m;
                    }
                } finally {
                    wVar.f3624k.k();
                }
            }
            if (i == 0 || this.f3612b) {
                th = null;
            } else {
                th = wVar.f3627n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3626m;
                        V.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3614e) {
                throw new IOException("stream closed");
            }
            x1.f fVar2 = this.d;
            long j4 = fVar2.f4236b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3619c + j3;
                wVar.f3619c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f3618b.f3584p.c() / 2) {
                    wVar.f3618b.n(wVar.f3617a, j6);
                    wVar.d = wVar.f3619c;
                }
            } else {
                if (!this.f3612b && th == null) {
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
        w wVar = this.f3615f;
        synchronized (wVar) {
            this.f3614e = true;
            x1.f fVar = this.d;
            j2 = fVar.f4236b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            f(j2);
        }
        this.f3615f.a();
    }

    public final void f(long j2) {
        byte[] bArr = l1.b.f3252a;
        this.f3615f.f3618b.k(j2);
    }
}
