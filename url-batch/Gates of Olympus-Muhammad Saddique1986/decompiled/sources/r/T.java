package r;

import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class T extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public float f7991q;

    /* renamed from: r, reason: collision with root package name */
    public float f7992r;

    /* renamed from: s, reason: collision with root package name */
    public float f7993s;

    /* renamed from: t, reason: collision with root package name */
    public float f7994t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7995u;

    @Override // t0.InterfaceC1009w
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        long y02 = y0(p3);
        return O0.a.f(y02) ? O0.a.h(y02) : O2.d.D(y02, interfaceC0884F.U(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        long y02 = y0(p3);
        return O0.a.e(y02) ? O0.a.g(y02) : O2.d.C(y02, interfaceC0884F.V(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        long y02 = y0(p3);
        return O0.a.f(y02) ? O0.a.h(y02) : O2.d.D(y02, interfaceC0884F.O(i3));
    }

    @Override // t0.InterfaceC1009w
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        long y02 = y0(p3);
        return O0.a.e(y02) ? O0.a.g(y02) : O2.d.C(y02, interfaceC0884F.c(i3));
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        int j4;
        int h3;
        int i3;
        int g3;
        long a3;
        long y02 = y0(interfaceC0887I);
        if (this.f7995u) {
            a3 = O2.d.B(j3, y02);
        } else {
            if (O0.e.a(this.f7991q, Float.NaN)) {
                j4 = O0.a.j(j3);
                int h4 = O0.a.h(y02);
                if (j4 > h4) {
                    j4 = h4;
                }
            } else {
                j4 = O0.a.j(y02);
            }
            if (O0.e.a(this.f7993s, Float.NaN)) {
                h3 = O0.a.h(j3);
                int j5 = O0.a.j(y02);
                if (h3 < j5) {
                    h3 = j5;
                }
            } else {
                h3 = O0.a.h(y02);
            }
            if (O0.e.a(this.f7992r, Float.NaN)) {
                i3 = O0.a.i(j3);
                int g4 = O0.a.g(y02);
                if (i3 > g4) {
                    i3 = g4;
                }
            } else {
                i3 = O0.a.i(y02);
            }
            if (O0.e.a(this.f7994t, Float.NaN)) {
                g3 = O0.a.g(j3);
                int i4 = O0.a.i(y02);
                if (g3 < i4) {
                    g3 = i4;
                }
            } else {
                g3 = O0.a.g(y02);
            }
            a3 = O2.d.a(j4, h3, i3, g3);
        }
        AbstractC0893O b3 = interfaceC0884F.b(a3);
        return interfaceC0887I.i0(b3.f8126d, b3.f8127e, S1.v.f4321d, new A.i(b3, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y0(InterfaceC0916m interfaceC0916m) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (O0.e.a(this.f7993s, Float.NaN)) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = interfaceC0916m.l(this.f7993s);
            if (i3 < 0) {
                i3 = 0;
            }
        }
        if (O0.e.a(this.f7994t, Float.NaN)) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = interfaceC0916m.l(this.f7994t);
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (!O0.e.a(this.f7991q, Float.NaN)) {
            i5 = interfaceC0916m.l(this.f7991q);
            if (i5 > i3) {
                i5 = i3;
            }
            if (i5 < 0) {
                i5 = 0;
            }
        }
        i5 = 0;
        if (!O0.e.a(this.f7992r, Float.NaN)) {
            int l3 = interfaceC0916m.l(this.f7992r);
            if (l3 > i4) {
                l3 = i4;
            }
            if (l3 < 0) {
                l3 = 0;
            }
            if (l3 != Integer.MAX_VALUE) {
                i6 = l3;
            }
        }
        return O2.d.a(i5, i3, i6, i4);
    }
}
