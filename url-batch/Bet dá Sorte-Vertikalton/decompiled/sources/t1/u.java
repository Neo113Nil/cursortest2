package t1;

import X.V;
import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements z1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f3914a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3915b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.f f3916c = new z1.f();
    public final z1.f d = new z1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f3917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f3918f;

    public u(w wVar, long j2, boolean z2) {
        this.f3918f = wVar;
        this.f3914a = j2;
        this.f3915b = z2;
    }

    @Override // z1.v
    public final z1.x a() {
        return this.f3918f.f3927k;
    }

    @Override // z1.v
    public final long b(z1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        b1.d.e(fVar, "sink");
        do {
            w wVar = this.f3918f;
            synchronized (wVar) {
                wVar.f3927k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f3929m;
                    }
                } finally {
                    wVar.f3927k.k();
                }
            }
            if (i == 0 || this.f3915b) {
                th = null;
            } else {
                th = wVar.f3930n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f3929m;
                        V.f(i2);
                        th = new B(i2);
                    }
                }
            }
            if (this.f3917e) {
                throw new IOException("stream closed");
            }
            z1.f fVar2 = this.d;
            long j4 = fVar2.f4269b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f3922c + j3;
                wVar.f3922c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f3921b.f3887p.c() / 2) {
                    wVar.f3921b.n(wVar.f3920a, j6);
                    wVar.d = wVar.f3922c;
                }
            } else {
                if (!this.f3915b && th == null) {
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
        w wVar = this.f3918f;
        synchronized (wVar) {
            this.f3917e = true;
            z1.f fVar = this.d;
            j2 = fVar.f4269b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f3918f.a();
    }

    public final void g(long j2) {
        byte[] bArr = n1.b.f3319a;
        this.f3918f.f3921b.k(j2);
    }
}
