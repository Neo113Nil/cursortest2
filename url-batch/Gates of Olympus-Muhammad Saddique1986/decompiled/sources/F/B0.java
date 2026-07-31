package F;

import I.C0143d;
import I.C0156j0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.C0610F;
import n.C0694u;
import r.AbstractC0864k;
import r.InterfaceC0849K;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1124s0;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1118a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1119b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1120c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1121d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1122e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f1123f = 280;

    static {
        float f3 = 48;
        f1118a = f3;
        f1119b = f3;
    }

    public static final void a(U.q qVar, C0610F c0610f, InterfaceC0142c0 interfaceC0142c0, n.y0 y0Var, b0.Q q3, long j3, float f3, float f4, C0694u c0694u, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        Boolean bool;
        boolean z3;
        boolean z4;
        m.t0 j4;
        boolean z5;
        m.t0 j5;
        int i5;
        c0167p.S(-151448888);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? c0167p.f(c0610f) : c0167p.h(c0610f) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(interfaceC0142c0) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(y0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.f(q3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.e(j3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0167p.c(f3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= c0167p.c(f4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= c0167p.f(c0694u) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= c0167p.h(aVar) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && c0167p.x()) {
            c0167p.L();
        } else {
            m.l0 c2 = m.r0.c(c0610f, "DropDownMenu", c0167p, (((i4 >> 3) & 14) | 48) & 126);
            m.u0 u0Var = m.v0.f6899a;
            boolean booleanValue = ((Boolean) c2.f6836a.a()).booleanValue();
            c0167p.Q(2139028452);
            float f5 = booleanValue ? 1.0f : 0.8f;
            c0167p.p(false);
            Float valueOf = Float.valueOf(f5);
            C0156j0 c0156j0 = c2.f6839d;
            boolean booleanValue2 = ((Boolean) c0156j0.getValue()).booleanValue();
            c0167p.Q(2139028452);
            float f6 = booleanValue2 ? 1.0f : 0.8f;
            c0167p.p(false);
            Float valueOf2 = Float.valueOf(f6);
            m.g0 f7 = c2.f();
            c0167p.Q(1033023423);
            Boolean bool2 = Boolean.FALSE;
            Boolean bool3 = Boolean.TRUE;
            if (f7.a(bool2, bool3)) {
                bool = bool2;
                z3 = false;
                j4 = AbstractC0620e.j(120, 0, AbstractC0639y.f6910b, 2);
                z4 = true;
            } else {
                bool = bool2;
                z3 = false;
                z4 = true;
                j4 = AbstractC0620e.j(1, 74, null, 4);
            }
            c0167p.p(z3);
            Boolean bool4 = bool;
            boolean z6 = z4;
            m.i0 b3 = m.r0.b(c2, valueOf, valueOf2, j4, u0Var, c0167p, 0);
            boolean booleanValue3 = ((Boolean) c2.f6836a.a()).booleanValue();
            c0167p.Q(-249413128);
            float f8 = booleanValue3 ? 1.0f : 0.0f;
            c0167p.p(false);
            Float valueOf3 = Float.valueOf(f8);
            boolean booleanValue4 = ((Boolean) c0156j0.getValue()).booleanValue();
            c0167p.Q(-249413128);
            float f9 = booleanValue4 ? 1.0f : 0.0f;
            c0167p.p(false);
            Float valueOf4 = Float.valueOf(f9);
            m.g0 f10 = c2.f();
            c0167p.Q(-1355418157);
            if (f10.a(bool4, bool3)) {
                z5 = false;
                j5 = AbstractC0620e.j(30, 0, null, 6);
            } else {
                z5 = false;
                j5 = AbstractC0620e.j(75, 0, null, 6);
            }
            c0167p.p(z5);
            boolean z7 = z5;
            m.i0 b4 = m.r0.b(c2, valueOf3, valueOf4, j5, u0Var, c0167p, 0);
            boolean booleanValue5 = ((Boolean) c0167p.k(AbstractC1124s0.f9521a)).booleanValue();
            U.n nVar = U.n.f4488a;
            boolean g3 = c0167p.g(booleanValue5) | c0167p.f(b3) | (((i4 & 112) == 32 || ((i4 & 64) != 0 && c0167p.h(c0610f))) ? z6 : z7) | c0167p.f(b4);
            if ((i4 & 896) == 256) {
                z7 = z6;
            }
            boolean z8 = z7 | g3;
            Object G3 = c0167p.G();
            if (z8 || G3 == C0159l.f2829a) {
                i5 = i4;
                Object c0129x0 = new C0129x0(booleanValue5, c0610f, interfaceC0142c0, b3, b4);
                c0167p.a0(c0129x0);
                G3 = c0129x0;
            } else {
                i5 = i4;
            }
            int i6 = i5 >> 9;
            int i7 = i5 >> 6;
            r1.a(androidx.compose.ui.graphics.a.a(nVar, (InterfaceC0424c) G3), q3, j3, 0L, f3, f4, c0694u, Q.f.b(1573559053, new C0131y0(qVar, y0Var, aVar, 0), c0167p), c0167p, (i6 & 896) | (i6 & 112) | 12582912 | (57344 & i7) | (458752 & i7) | (i7 & 3670016), 8);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0133z0(qVar, c0610f, interfaceC0142c0, y0Var, q3, j3, f3, f4, c0694u, aVar, i3);
        }
    }

    public static final void b(Q.a aVar, InterfaceC0422a interfaceC0422a, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, boolean z3, C0127w0 c0127w0, InterfaceC0849K interfaceC0849K, q.k kVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-1564716777);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(interfaceC0426e) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.h(interfaceC0426e2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0167p.f(c0127w0) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0167p.f(interfaceC0849K) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0167p.f(kVar) ? 67108864 : 33554432;
        }
        if ((i4 & 38347923) == 38347922 && c0167p.x()) {
            c0167p.L();
        } else {
            U.q e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.k(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.c(qVar, kVar, e1.a(true, 0.0f, c0167p, 6, 6), z3, null, interfaceC0422a, 24), 1.0f), f1122e, f1119b, f1123f, 8), interfaceC0849K);
            r.Q a3 = r.P.a(AbstractC0864k.f8051a, U.b.f4471n, c0167p, 48);
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, e3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, a3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            x1.a(((A1) c0167p.k(B1.f1124a)).f1112m, Q.f.b(1065051884, new A0(interfaceC0426e, c0127w0, z3, interfaceC0426e2, aVar), c0167p), c0167p, 48);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0115q(aVar, interfaceC0422a, qVar, interfaceC0426e, interfaceC0426e2, z3, c0127w0, interfaceC0849K, kVar, i3, 1);
        }
    }
}
