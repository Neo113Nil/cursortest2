package j3;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u implements p3.t {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2472f;
    public final p3.f g = new p3.f();
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f2473i;

    public u(x xVar, boolean z3) {
        this.f2473i = xVar;
        this.f2472f = z3;
    }

    @Override // p3.t
    public final p3.x a() {
        return this.f2473i.f2487l;
    }

    @Override // p3.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        x xVar = this.f2473i;
        byte[] bArr = d3.c.f1490a;
        synchronized (xVar) {
            if (this.h) {
                return;
            }
            synchronized (xVar) {
                z3 = xVar.f2488m == 0;
            }
            x xVar2 = this.f2473i;
            if (!xVar2.f2485j.f2472f) {
                if (this.g.g > 0) {
                    while (this.g.g > 0) {
                        m(true);
                    }
                } else if (z3) {
                    xVar2.f2480b.r(xVar2.f2479a, true, null, 0L);
                }
            }
            synchronized (this.f2473i) {
                this.h = true;
            }
            this.f2473i.f2480b.flush();
            this.f2473i.a();
        }
    }

    @Override // p3.t
    public final void e(long j4, p3.f fVar) {
        byte[] bArr = d3.c.f1490a;
        p3.f fVar2 = this.g;
        fVar2.e(j4, fVar);
        while (fVar2.g >= 16384) {
            m(false);
        }
    }

    @Override // p3.t, java.io.Flushable
    public final void flush() {
        x xVar = this.f2473i;
        byte[] bArr = d3.c.f1490a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.g.g > 0) {
            m(false);
            this.f2473i.f2480b.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void m(boolean z3) {
        long min;
        boolean z4;
        x xVar = this.f2473i;
        synchronized (xVar) {
            xVar.f2487l.h();
            while (xVar.f2482e >= xVar.f2483f && !this.f2472f && !this.h) {
                try {
                    synchronized (xVar) {
                        int i4 = xVar.f2488m;
                        if (i4 != 0) {
                            break;
                        }
                        try {
                            xVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    xVar.f2487l.k();
                    throw th;
                }
            }
            xVar.f2487l.k();
            xVar.b();
            min = Math.min(xVar.f2483f - xVar.f2482e, this.g.g);
            xVar.f2482e += min;
            z4 = z3 && min == this.g.g;
        }
        this.f2473i.f2487l.h();
        try {
            x xVar2 = this.f2473i;
            xVar2.f2480b.r(xVar2.f2479a, z4, this.g, min);
        } finally {
            this.f2473i.f2487l.k();
        }
    }
}
