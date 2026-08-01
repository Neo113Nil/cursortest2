package a4;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x implements g4.v {

    /* renamed from: f, reason: collision with root package name */
    public final long f233f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f234g;
    public final g4.f h = new g4.f();
    public final g4.f i = new g4.f();

    /* renamed from: j, reason: collision with root package name */
    public boolean f235j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z f236k;

    public x(z zVar, long j2, boolean z4) {
        this.f236k = zVar;
        this.f233f = j2;
        this.f234g = z4;
    }

    @Override // g4.v
    public final g4.x a() {
        return this.f236k.f245k;
    }

    @Override // g4.v
    public final long c(long j2, g4.f fVar) {
        int i;
        Throwable th;
        boolean z4;
        long j4;
        do {
            z zVar = this.f236k;
            synchronized (zVar) {
                zVar.f245k.h();
                try {
                    synchronized (zVar) {
                        i = zVar.f247m;
                    }
                } finally {
                    zVar.f245k.k();
                }
            }
            if (i == 0 || this.f234g) {
                th = null;
            } else {
                th = zVar.f248n;
                if (th == null) {
                    synchronized (zVar) {
                        int i4 = zVar.f247m;
                        b.h(i4);
                        th = new f0(i4);
                    }
                }
            }
            if (this.f235j) {
                throw new IOException("stream closed");
            }
            g4.f fVar2 = this.i;
            long j5 = fVar2.f1935g;
            z4 = false;
            if (j5 > 0) {
                j4 = fVar2.c(Math.min(8192L, j5), fVar);
                long j6 = zVar.f240c + j4;
                zVar.f240c = j6;
                long j7 = j6 - zVar.d;
                if (th == null && j7 >= zVar.f239b.f213u.c() / 2) {
                    zVar.f239b.t(zVar.f238a, j7);
                    zVar.d = zVar.f240c;
                }
            } else {
                if (!this.f234g && th == null) {
                    try {
                        zVar.wait();
                        z4 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j4 = -1;
            }
        } while (z4);
        if (j4 != -1) {
            return j4;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        z zVar = this.f236k;
        synchronized (zVar) {
            this.f235j = true;
            g4.f fVar = this.i;
            j2 = fVar.f1935g;
            fVar.skip(j2);
            zVar.notifyAll();
        }
        if (j2 > 0) {
            m(j2);
        }
        this.f236k.a();
    }

    public final void m(long j2) {
        byte[] bArr = u3.b.f3581a;
        this.f236k.f239b.q(j2);
    }
}
