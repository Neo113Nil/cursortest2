package w;

import a.AbstractC0345a;
import p0.InterfaceC0980p;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0.I f11290a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0980p f11291b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0980p f11292c;

    public o0(A0.I i2, InterfaceC0980p interfaceC0980p) {
        this.f11290a = i2;
        this.f11292c = interfaceC0980p;
    }

    public final long a(long j4) {
        Y.d dVar;
        InterfaceC0980p interfaceC0980p = this.f11291b;
        Y.d dVar2 = Y.d.f4373e;
        if (interfaceC0980p != null) {
            if (interfaceC0980p.p()) {
                InterfaceC0980p interfaceC0980p2 = this.f11292c;
                dVar = interfaceC0980p2 != null ? interfaceC0980p2.n(interfaceC0980p, true) : null;
            } else {
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar2 = dVar;
            }
        }
        float d4 = Y.c.d(j4);
        float f4 = dVar2.f4374a;
        if (d4 >= f4) {
            float d5 = Y.c.d(j4);
            f4 = dVar2.f4376c;
            if (d5 <= f4) {
                f4 = Y.c.d(j4);
            }
        }
        float e4 = Y.c.e(j4);
        float f5 = dVar2.f4375b;
        if (e4 >= f5) {
            float e5 = Y.c.e(j4);
            f5 = dVar2.f4377d;
            if (e5 <= f5) {
                f5 = Y.c.e(j4);
            }
        }
        return AbstractC0345a.c(f4, f5);
    }

    public final int b(long j4, boolean z4) {
        if (z4) {
            j4 = a(j4);
        }
        return this.f11290a.f290b.e(d(j4));
    }

    public final boolean c(long j4) {
        long d4 = d(a(j4));
        float e4 = Y.c.e(d4);
        A0.I i2 = this.f11290a;
        int c4 = i2.f290b.c(e4);
        return Y.c.d(d4) >= i2.f(c4) && Y.c.d(d4) <= i2.g(c4);
    }

    public final long d(long j4) {
        InterfaceC0980p interfaceC0980p;
        InterfaceC0980p interfaceC0980p2 = this.f11291b;
        if (interfaceC0980p2 == null) {
            return j4;
        }
        if (!interfaceC0980p2.p()) {
            interfaceC0980p2 = null;
        }
        if (interfaceC0980p2 == null || (interfaceC0980p = this.f11292c) == null) {
            return j4;
        }
        InterfaceC0980p interfaceC0980p3 = interfaceC0980p.p() ? interfaceC0980p : null;
        return interfaceC0980p3 == null ? j4 : interfaceC0980p2.y(interfaceC0980p3, j4);
    }

    public final long e(long j4) {
        InterfaceC0980p interfaceC0980p;
        InterfaceC0980p interfaceC0980p2 = this.f11291b;
        if (interfaceC0980p2 == null) {
            return j4;
        }
        if (!interfaceC0980p2.p()) {
            interfaceC0980p2 = null;
        }
        if (interfaceC0980p2 == null || (interfaceC0980p = this.f11292c) == null) {
            return j4;
        }
        InterfaceC0980p interfaceC0980p3 = interfaceC0980p.p() ? interfaceC0980p : null;
        return interfaceC0980p3 == null ? j4 : interfaceC0980p3.y(interfaceC0980p2, j4);
    }
}
