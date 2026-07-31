package H2;

import N2.C0150f;
import N2.H;

/* loaded from: classes.dex */
public final class u implements N2.D {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2024d;

    /* renamed from: e, reason: collision with root package name */
    public final C0150f f2025e = new C0150f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f2026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f2027g;

    public u(x xVar, boolean z3) {
        this.f2027g = xVar;
        this.f2024d = z3;
    }

    public final void a(boolean z3) {
        long min;
        boolean z4;
        x xVar = this.f2027g;
        synchronized (xVar) {
            xVar.f2046l.h();
            while (xVar.f2039e >= xVar.f2040f && !this.f2024d && !this.f2026f) {
                try {
                    synchronized (xVar) {
                        int i3 = xVar.f2047m;
                        if (i3 != 0) {
                            break;
                        } else {
                            xVar.k();
                        }
                    }
                } finally {
                    xVar.f2046l.k();
                }
            }
            xVar.f2046l.k();
            xVar.b();
            min = Math.min(xVar.f2040f - xVar.f2039e, this.f2025e.f2929e);
            xVar.f2039e += min;
            z4 = z3 && min == this.f2025e.f2929e;
        }
        this.f2027g.f2046l.h();
        try {
            x xVar2 = this.f2027g;
            xVar2.f2036b.j(xVar2.f2035a, z4, this.f2025e, min);
        } finally {
            xVar = this.f2027g;
        }
    }

    @Override // N2.D
    public final H c() {
        return this.f2027g.f2046l;
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        x xVar = this.f2027g;
        byte[] bArr = B2.c.f415a;
        synchronized (xVar) {
            if (this.f2026f) {
                return;
            }
            synchronized (xVar) {
                z3 = xVar.f2047m == 0;
            }
            x xVar2 = this.f2027g;
            if (!xVar2.f2044j.f2024d) {
                if (this.f2025e.f2929e > 0) {
                    while (this.f2025e.f2929e > 0) {
                        a(true);
                    }
                } else if (z3) {
                    xVar2.f2036b.j(xVar2.f2035a, true, null, 0L);
                }
            }
            synchronized (this.f2027g) {
                this.f2026f = true;
            }
            this.f2027g.f2036b.flush();
            this.f2027g.a();
        }
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        x xVar = this.f2027g;
        byte[] bArr = B2.c.f415a;
        synchronized (xVar) {
            xVar.b();
        }
        while (this.f2025e.f2929e > 0) {
            a(false);
            this.f2027g.f2036b.flush();
        }
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        byte[] bArr = B2.c.f415a;
        C0150f c0150f2 = this.f2025e;
        c0150f2.g(c0150f, j3);
        while (c0150f2.f2929e >= 16384) {
            a(false);
        }
    }
}
