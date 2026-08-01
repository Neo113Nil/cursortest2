package G1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements M1.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f437a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f438b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.f f439c = new M1.f();

    /* renamed from: d, reason: collision with root package name */
    public final M1.f f440d = new M1.f();
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f441f;

    public w(y yVar, long j, boolean z2) {
        this.f441f = yVar;
        this.f437a = j;
        this.f438b = z2;
    }

    public final void a(long j) {
        byte[] bArr = A1.c.f19a;
        this.f441f.f444b.B(j);
    }

    @Override // M1.v
    public final M1.x b() {
        return this.f441f.f450k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        y yVar = this.f441f;
        synchronized (yVar) {
            this.e = true;
            M1.f fVar = this.f440d;
            j = fVar.f827b;
            fVar.G(j);
            yVar.notifyAll();
        }
        if (j > 0) {
            a(j);
        }
        this.f441f.a();
    }

    @Override // M1.v
    public final long h(M1.f fVar, long j) {
        int i;
        Throwable th;
        boolean z2;
        long j2;
        j1.h.e(fVar, "sink");
        do {
            y yVar = this.f441f;
            synchronized (yVar) {
                yVar.f450k.h();
                try {
                    synchronized (yVar) {
                        i = yVar.f452m;
                    }
                } finally {
                    yVar.f450k.k();
                }
            }
            if (i == 0 || this.f438b) {
                th = null;
            } else {
                th = yVar.f453n;
                if (th == null) {
                    synchronized (yVar) {
                        int i2 = yVar.f452m;
                        AbstractC0001b.h(i2);
                        th = new E(i2);
                    }
                }
            }
            if (this.e) {
                throw new IOException("stream closed");
            }
            M1.f fVar2 = this.f440d;
            long j3 = fVar2.f827b;
            z2 = false;
            if (j3 > 0) {
                j2 = fVar2.h(fVar, Math.min(8192L, j3));
                long j4 = yVar.f445c + j2;
                yVar.f445c = j4;
                long j5 = j4 - yVar.f446d;
                if (th == null && j5 >= yVar.f444b.f407p.a() / 2) {
                    yVar.f444b.F(yVar.f443a, j5);
                    yVar.f446d = yVar.f445c;
                }
            } else {
                if (!this.f438b && th == null) {
                    yVar.k();
                    z2 = true;
                }
                j2 = -1;
            }
        } while (z2);
        if (j2 != -1) {
            return j2;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }
}
