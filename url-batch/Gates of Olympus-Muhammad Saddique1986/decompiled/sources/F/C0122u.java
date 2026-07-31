package F;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import r.AbstractC0864k;
import r.C0858e;
import s0.C0962h;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122u extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r.X f1818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f1819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1 f1820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Q.a f1821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0.K f1822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.a f1824k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122u(r.X x3, float f3, y1 y1Var, Q.a aVar, C0.K k3, InterfaceC0426e interfaceC0426e, Q.a aVar2) {
        super(2);
        this.f1818e = x3;
        this.f1819f = f3;
        this.f1820g = y1Var;
        this.f1821h = aVar;
        this.f1822i = k3;
        this.f1823j = interfaceC0426e;
        this.f1824k = aVar2;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            U.n nVar = U.n.f4488a;
            C0962h c0962h = r.a0.f8028a;
            U.q f3 = androidx.compose.foundation.layout.c.f(AbstractC0508a.v(U.a.b(nVar, new B.h0(6, this.f1818e))), 0.0f, this.f1819f, 1);
            boolean f4 = c0167p.f(null);
            Object G3 = c0167p.G();
            if (f4 || G3 == C0159l.f2829a) {
                G3 = new C0120t();
                c0167p.a0(G3);
            }
            C0120t c0120t = (C0120t) G3;
            y1 y1Var = this.f1820g;
            long j3 = y1Var.f1904c;
            C0858e c0858e = AbstractC0864k.f8055e;
            Q.a aVar = this.f1824k;
            AbstractC0132z.c(f3, c0120t, j3, y1Var.f1905d, y1Var.f1906e, this.f1821h, this.f1822i, c0858e, c0858e, this.f1823j, aVar, c0167p, 113246208, 3126);
        }
        return R1.y.f4171a;
    }
}
