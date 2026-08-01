package w1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u implements C1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f4162a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4163b;

    /* renamed from: c, reason: collision with root package name */
    public final C1.f f4164c = new C1.f();
    public final C1.f d = new C1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f4166f;

    public u(w wVar, long j2, boolean z2) {
        this.f4166f = wVar;
        this.f4162a = j2;
        this.f4163b = z2;
    }

    @Override // C1.v
    public final C1.x a() {
        return this.f4166f.f4175k;
    }

    @Override // C1.v
    public final long b(C1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        e1.d.e(fVar, "sink");
        do {
            w wVar = this.f4166f;
            synchronized (wVar) {
                wVar.f4175k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f4177m;
                    }
                } finally {
                    wVar.f4175k.k();
                }
            }
            if (i == 0 || this.f4163b) {
                th = null;
            } else {
                th = wVar.f4178n;
                if (th == null) {
                    synchronized (wVar) {
                        int i2 = wVar.f4177m;
                        T0.c.f(i2);
                        th = new A(i2);
                    }
                }
            }
            if (this.f4165e) {
                throw new IOException("stream closed");
            }
            C1.f fVar2 = this.d;
            long j4 = fVar2.f182b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.b(fVar, Math.min(8192L, j4));
                long j5 = wVar.f4170c + j3;
                wVar.f4170c = j5;
                long j6 = j5 - wVar.d;
                if (th == null && j6 >= wVar.f4169b.f4135p.c() / 2) {
                    wVar.f4169b.n(wVar.f4168a, j6);
                    wVar.d = wVar.f4170c;
                }
            } else {
                if (!this.f4163b && th == null) {
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
        w wVar = this.f4166f;
        synchronized (wVar) {
            this.f4165e = true;
            C1.f fVar = this.d;
            j2 = fVar.f182b;
            fVar.o(j2);
            wVar.notifyAll();
        }
        if (j2 > 0) {
            g(j2);
        }
        this.f4166f.a();
    }

    public final void g(long j2) {
        byte[] bArr = q1.b.f3491a;
        this.f4166f.f4169b.k(j2);
    }
}
