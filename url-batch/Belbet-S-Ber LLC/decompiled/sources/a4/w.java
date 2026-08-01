package a4;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w implements g4.t {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f231f;

    /* renamed from: g, reason: collision with root package name */
    public final g4.f f232g = new g4.f();
    public boolean h;
    public final /* synthetic */ z i;

    public w(z zVar, boolean z4) {
        this.i = zVar;
        this.f231f = z4;
    }

    @Override // g4.t
    public final g4.x a() {
        return this.i.f246l;
    }

    @Override // g4.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z4;
        z zVar = this.i;
        byte[] bArr = u3.b.f3581a;
        synchronized (zVar) {
            if (this.h) {
                return;
            }
            synchronized (zVar) {
                z4 = zVar.f247m == 0;
            }
            z zVar2 = this.i;
            if (!zVar2.f244j.f231f) {
                if (this.f232g.f1935g > 0) {
                    while (this.f232g.f1935g > 0) {
                        m(true);
                    }
                } else if (z4) {
                    zVar2.f239b.r(zVar2.f238a, true, null, 0L);
                }
            }
            synchronized (this.i) {
                this.h = true;
            }
            this.i.f239b.flush();
            this.i.a();
        }
    }

    @Override // g4.t
    public final void f(long j2, g4.f fVar) {
        byte[] bArr = u3.b.f3581a;
        g4.f fVar2 = this.f232g;
        fVar2.f(j2, fVar);
        while (fVar2.f1935g >= 16384) {
            m(false);
        }
    }

    @Override // g4.t, java.io.Flushable
    public final void flush() {
        z zVar = this.i;
        byte[] bArr = u3.b.f3581a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f232g.f1935g > 0) {
            m(false);
            this.i.f239b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void m(boolean z4) {
        long min;
        boolean z5;
        z zVar = this.i;
        synchronized (zVar) {
            zVar.f246l.h();
            while (zVar.f241e >= zVar.f242f && !this.f231f && !this.h) {
                try {
                    synchronized (zVar) {
                        int i = zVar.f247m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            zVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    zVar.f246l.k();
                    throw th;
                }
            }
            zVar.f246l.k();
            zVar.b();
            min = Math.min(zVar.f242f - zVar.f241e, this.f232g.f1935g);
            zVar.f241e += min;
            z5 = z4 && min == this.f232g.f1935g;
        }
        this.i.f246l.h();
        try {
            z zVar2 = this.i;
            zVar2.f239b.r(zVar2.f238a, z5, this.f232g, min);
        } finally {
            this.i.f246l.k();
        }
    }
}
