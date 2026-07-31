package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import e2.InterfaceC0426e;
import r.AbstractC0864k;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: F.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102j0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q.a f1607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q.a f1608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102j0(boolean z3, Q.a aVar, Q.a aVar2) {
        super(2);
        this.f1606e = z3;
        this.f1607f = aVar;
        this.f1608g = aVar2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = this.f1606e;
            U.q i3 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.layout.c.k(U.n.f4488a, z3 ? AbstractC0110n0.f1693d : H.g.f2398c, 0.0f, 0.0f, 14), z3 ? AbstractC0110n0.f1690a : 0, 0.0f, z3 ? AbstractC0110n0.f1692c : 0, 10);
            U.h hVar = U.b.f4471n;
            boolean z4 = this.f1606e;
            r.Q a3 = r.P.a(z4 ? AbstractC0864k.f8051a : AbstractC0864k.f8055e, hVar, c0167p, 48);
            int i4 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, i3);
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
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i4))) {
                A.k.o(i4, c0167p, i4, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            this.f1607f.h(c0167p, 0);
            androidx.compose.animation.a.b(z4, null, AbstractC0110n0.f1695f, AbstractC0110n0.f1694e, null, Q.f.b(176242764, new B.h0(1, this.f1608g), c0167p), c0167p, 1600518);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
