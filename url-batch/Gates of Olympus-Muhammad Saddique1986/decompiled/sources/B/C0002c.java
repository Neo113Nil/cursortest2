package B;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import r.AbstractC0856c;
import r.C0855b;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: B.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.q f369g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0013n f370h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0002c(long j3, boolean z3, U.q qVar, InterfaceC0013n interfaceC0013n) {
        super(2);
        this.f367e = j3;
        this.f368f = z3;
        this.f369g = qVar;
        this.f370h = interfaceC0013n;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            long j3 = this.f367e;
            I.W w2 = C0159l.f2829a;
            InterfaceC0013n interfaceC0013n = this.f370h;
            boolean z3 = this.f368f;
            if (j3 != 9205357640488583168L) {
                c0167p.Q(-837727128);
                C0855b c0855b = z3 ? AbstractC0856c.f8036b : AbstractC0856c.f8035a;
                U.q g3 = androidx.compose.foundation.layout.c.g(this.f369g, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), 0.0f, 0.0f, 12);
                r.Q a3 = r.P.a(c0855b, U.b.f4470m, c0167p, 0);
                int i3 = c0167p.f2864P;
                InterfaceC0164n0 m3 = c0167p.m();
                U.q d3 = U.a.d(c0167p, g3);
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
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                    A.k.o(i3, c0167p, i3, c0995h);
                }
                C0143d.R(c0167p, C0996i.f8755c, d3);
                U.n nVar = U.n.f4488a;
                boolean h3 = c0167p.h(interfaceC0013n);
                Object G3 = c0167p.G();
                if (h3 || G3 == w2) {
                    G3 = new C0001b(interfaceC0013n, 0);
                    c0167p.a0(G3);
                }
                AbstractC0508a.i(nVar, (InterfaceC0422a) G3, z3, c0167p, 6);
                c0167p.p(true);
                c0167p.p(false);
            } else {
                c0167p.Q(-836867312);
                boolean h4 = c0167p.h(interfaceC0013n);
                Object G4 = c0167p.G();
                if (h4 || G4 == w2) {
                    G4 = new C0001b(interfaceC0013n, 1);
                    c0167p.a0(G4);
                }
                AbstractC0508a.i(this.f369g, (InterfaceC0422a) G4, z3, c0167p, 0);
                c0167p.p(false);
            }
        }
        return R1.y.f4171a;
    }
}
