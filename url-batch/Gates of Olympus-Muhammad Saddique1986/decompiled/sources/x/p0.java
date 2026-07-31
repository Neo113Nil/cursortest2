package x;

import a0.C0238c;
import a0.C0239d;
import r0.InterfaceC0919p;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0.H f10230a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0919p f10231b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0919p f10232c;

    public p0(C0.H h3, InterfaceC0919p interfaceC0919p) {
        this.f10230a = h3;
        this.f10232c = interfaceC0919p;
    }

    public final long a(long j3) {
        C0239d c0239d;
        InterfaceC0919p interfaceC0919p = this.f10231b;
        C0239d c0239d2 = C0239d.f4723e;
        if (interfaceC0919p != null) {
            if (interfaceC0919p.o()) {
                InterfaceC0919p interfaceC0919p2 = this.f10232c;
                c0239d = interfaceC0919p2 != null ? interfaceC0919p2.B(interfaceC0919p, true) : null;
            } else {
                c0239d = c0239d2;
            }
            if (c0239d != null) {
                c0239d2 = c0239d;
            }
        }
        float d3 = C0238c.d(j3);
        float f3 = c0239d2.f4724a;
        if (d3 >= f3) {
            float d4 = C0238c.d(j3);
            f3 = c0239d2.f4726c;
            if (d4 <= f3) {
                f3 = C0238c.d(j3);
            }
        }
        float e3 = C0238c.e(j3);
        float f4 = c0239d2.f4725b;
        if (e3 >= f4) {
            float e4 = C0238c.e(j3);
            f4 = c0239d2.f4727d;
            if (e4 <= f4) {
                f4 = C0238c.e(j3);
            }
        }
        return l0.c.e(f3, f4);
    }

    public final int b(long j3, boolean z3) {
        if (z3) {
            j3 = a(j3);
        }
        return this.f10230a.f558b.e(d(j3));
    }

    public final boolean c(long j3) {
        long d3 = d(a(j3));
        float e3 = C0238c.e(d3);
        C0.H h3 = this.f10230a;
        int c2 = h3.f558b.c(e3);
        return C0238c.d(d3) >= h3.f(c2) && C0238c.d(d3) <= h3.g(c2);
    }

    public final long d(long j3) {
        InterfaceC0919p interfaceC0919p;
        InterfaceC0919p interfaceC0919p2 = this.f10231b;
        if (interfaceC0919p2 == null) {
            return j3;
        }
        if (!interfaceC0919p2.o()) {
            interfaceC0919p2 = null;
        }
        if (interfaceC0919p2 == null || (interfaceC0919p = this.f10232c) == null) {
            return j3;
        }
        InterfaceC0919p interfaceC0919p3 = interfaceC0919p.o() ? interfaceC0919p : null;
        return interfaceC0919p3 == null ? j3 : interfaceC0919p2.P(interfaceC0919p3, j3);
    }

    public final long e(long j3) {
        InterfaceC0919p interfaceC0919p;
        InterfaceC0919p interfaceC0919p2 = this.f10231b;
        if (interfaceC0919p2 == null) {
            return j3;
        }
        if (!interfaceC0919p2.o()) {
            interfaceC0919p2 = null;
        }
        if (interfaceC0919p2 == null || (interfaceC0919p = this.f10232c) == null) {
            return j3;
        }
        InterfaceC0919p interfaceC0919p3 = interfaceC0919p.o() ? interfaceC0919p : null;
        return interfaceC0919p3 == null ? j3 : interfaceC0919p3.P(interfaceC0919p2, j3);
    }
}
