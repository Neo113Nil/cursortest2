package q;

import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import r0.InterfaceC1081w;
import z2.C1412P;

/* loaded from: classes.dex */
public final class i0 extends S.n implements InterfaceC1081w {

    /* renamed from: t, reason: collision with root package name */
    public float f9260t;

    /* renamed from: u, reason: collision with root package name */
    public float f9261u;

    /* renamed from: v, reason: collision with root package name */
    public float f9262v;

    /* renamed from: w, reason: collision with root package name */
    public float f9263w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9264x;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long B0(InterfaceC0977m interfaceC0977m) {
        int i2;
        int i4;
        int i5;
        int i6 = 0;
        if (M0.e.a(this.f9262v, Float.NaN)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = interfaceC0977m.l(this.f9262v);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (M0.e.a(this.f9263w, Float.NaN)) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = interfaceC0977m.l(this.f9263w);
            if (i4 < 0) {
                i4 = 0;
            }
        }
        if (!M0.e.a(this.f9260t, Float.NaN)) {
            i5 = interfaceC0977m.l(this.f9260t);
            if (i5 > i2) {
                i5 = i2;
            }
            if (i5 < 0) {
                i5 = 0;
            }
        }
        i5 = 0;
        if (!M0.e.a(this.f9261u, Float.NaN)) {
            int l4 = interfaceC0977m.l(this.f9261u);
            if (l4 > i4) {
                l4 = i4;
            }
            if (l4 < 0) {
                l4 = 0;
            }
            if (l4 != Integer.MAX_VALUE) {
                i6 = l4;
            }
        }
        return u3.d.a(i5, i2, i6, i4);
    }

    @Override // r0.InterfaceC1081w
    public final int b(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        long B02 = B0(o4);
        return M0.a.g(B02) ? M0.a.i(B02) : u3.d.s(B02, interfaceC0944E.X(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int c(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        long B02 = B0(o4);
        return M0.a.g(B02) ? M0.a.i(B02) : u3.d.s(B02, interfaceC0944E.S(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int d(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        long B02 = B0(o4);
        return M0.a.f(B02) ? M0.a.h(B02) : u3.d.r(B02, interfaceC0944E.Z(i2));
    }

    @Override // r0.InterfaceC1081w
    public final int f(r0.O o4, InterfaceC0944E interfaceC0944E, int i2) {
        long B02 = B0(o4);
        return M0.a.f(B02) ? M0.a.h(B02) : u3.d.r(B02, interfaceC0944E.b(i2));
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        int k4;
        int i2;
        int j5;
        int h4;
        long a4;
        InterfaceC0946G t4;
        long B02 = B0(interfaceC0947H);
        if (this.f9264x) {
            a4 = u3.d.q(j4, B02);
        } else {
            if (M0.e.a(this.f9260t, Float.NaN)) {
                k4 = M0.a.k(j4);
                int i4 = M0.a.i(B02);
                if (k4 > i4) {
                    k4 = i4;
                }
            } else {
                k4 = M0.a.k(B02);
            }
            if (M0.e.a(this.f9262v, Float.NaN)) {
                i2 = M0.a.i(j4);
                int k5 = M0.a.k(B02);
                if (i2 < k5) {
                    i2 = k5;
                }
            } else {
                i2 = M0.a.i(B02);
            }
            if (M0.e.a(this.f9261u, Float.NaN)) {
                j5 = M0.a.j(j4);
                int h5 = M0.a.h(B02);
                if (j5 > h5) {
                    j5 = h5;
                }
            } else {
                j5 = M0.a.j(B02);
            }
            if (M0.e.a(this.f9263w, Float.NaN)) {
                h4 = M0.a.h(j4);
                int j6 = M0.a.j(B02);
                if (h4 < j6) {
                    h4 = j6;
                }
            } else {
                h4 = M0.a.h(B02);
            }
            a4 = u3.d.a(k4, i2, j5, h4);
        }
        AbstractC0954O a5 = interfaceC0944E.a(a4);
        t4 = interfaceC0947H.t(a5.f9005d, a5.f9006e, C1412P.c(), new P0.n(a5, 7));
        return t4;
    }
}
