package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements M1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f452a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f453b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.f f454c = new M1.f();
    public final M1.f d = new M1.f();

    /* renamed from: e, reason: collision with root package name */
    public boolean f455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f456f;

    public w(y yVar, long j2, boolean z2) {
        this.f456f = yVar;
        this.f452a = j2;
        this.f453b = z2;
    }

    public final void a(long j2) {
        byte[] bArr = A1.c.f13a;
        this.f456f.f459b.p(j2);
    }

    @Override // M1.v
    public final M1.x b() {
        return this.f456f.f465k;
    }

    @Override // M1.v
    public final long c(M1.f fVar, long j2) {
        int i;
        Throwable th;
        boolean z2;
        long j3;
        k1.e.e(fVar, "sink");
        do {
            y yVar = this.f456f;
            synchronized (yVar) {
                yVar.f465k.h();
                try {
                    synchronized (yVar) {
                        i = yVar.f467m;
                    }
                } finally {
                    yVar.f465k.k();
                }
            }
            if (i == 0 || this.f453b) {
                th = null;
            } else {
                th = yVar.f468n;
                if (th == null) {
                    synchronized (yVar) {
                        int i2 = yVar.f467m;
                        AbstractC0001b.h(i2);
                        th = new E(i2);
                    }
                }
            }
            if (this.f455e) {
                throw new IOException("stream closed");
            }
            M1.f fVar2 = this.d;
            long j4 = fVar2.f799b;
            z2 = false;
            if (j4 > 0) {
                j3 = fVar2.c(fVar, Math.min(8192L, j4));
                long j5 = yVar.f460c + j3;
                yVar.f460c = j5;
                long j6 = j5 - yVar.d;
                if (th == null && j6 >= yVar.f459b.f425p.a() / 2) {
                    yVar.f459b.t(yVar.f458a, j6);
                    yVar.d = yVar.f460c;
                }
            } else {
                if (!this.f453b && th == null) {
                    yVar.k();
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
        y yVar = this.f456f;
        synchronized (yVar) {
            this.f455e = true;
            M1.f fVar = this.d;
            j2 = fVar.f799b;
            fVar.u(j2);
            yVar.notifyAll();
        }
        if (j2 > 0) {
            a(j2);
        }
        this.f456f.a();
    }
}
