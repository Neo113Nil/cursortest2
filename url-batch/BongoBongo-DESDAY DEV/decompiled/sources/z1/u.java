package z1;

import Z.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements F1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4508b;

    /* renamed from: c, reason: collision with root package name */
    public final F1.f f4509c = new F1.f();
    public final F1.f d = new F1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f4511f;

    public u(w wVar, long j2, boolean z2) {
        this.f4511f = wVar;
        this.f4507a = j2;
        this.f4508b = z2;
    }

    @Override // F1.v
    public final F1.x a() {
        return this.f4511f.f4521k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        w wVar = this.f4511f;
        synchronized (wVar) {
            this.f4510e = true;
            F1.f fVar = this.d;
            j2 = fVar.f247b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f4511f.a();
    }

    @Override // F1.v
    public final long d(F1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        h1.d.e(fVar, "sink");
        do {
            w wVar = this.f4511f;
            synchronized (wVar) {
                wVar.f4521k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f4523m;
                    }
                } finally {
                    wVar.f4521k.k();
                }
            }
            if (i == 0 || this.f4508b) {
                th = null;
            } else {
                th = wVar.f4524n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f4523m;
                        V.g(i2);
                        th = new A(i2);
                    }
                }
            }
            if (this.f4510e) {
                throw new IOException("stream closed");
            }
            F1.f fVar2 = this.d;
            long j4 = fVar2.f247b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.d(fVar, Math.min(8192L, j4));
                long j5 = wVar.f4515c + j3;
                wVar.f4515c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f4514b.f4479p.c() / 2) {
                    wVar.f4514b.n(wVar.f4513a, j6);
                    wVar.d = wVar.f4515c;
                }
            } else {
                if (!this.f4508b && th == null) {
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
        byte[] bArr = t1.b.f3898a;
        this.f4511f.f4514b.k(j2);
    }
}
