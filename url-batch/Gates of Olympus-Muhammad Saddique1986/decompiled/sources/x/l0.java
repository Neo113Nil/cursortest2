package x;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.InterfaceC0142c0;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import p.C0780o0;
import p.C0783q;
import p.InterfaceC0778n0;
import r0.C0929z;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public final class l0 extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f10162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.k f10164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, boolean z3, q.k kVar) {
        super(3);
        this.f10162e = n0Var;
        this.f10163f = z3;
        this.f10164g = kVar;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(805428266);
        boolean z3 = c0167p.k(AbstractC1101g0.f9360l) == O0.k.f3742e;
        n0 n0Var = this.f10162e;
        boolean z4 = ((p.P) n0Var.f10186e.getValue()) == p.P.f7567d || !z3;
        boolean f3 = c0167p.f(n0Var);
        Object G3 = c0167p.G();
        Object obj4 = C0159l.f2829a;
        if (f3 || G3 == obj4) {
            G3 = new C0929z(15, n0Var);
            c0167p.a0(G3);
        }
        InterfaceC0142c0 N3 = C0143d.N((InterfaceC0424c) G3, c0167p);
        Object G4 = c0167p.G();
        if (G4 == obj4) {
            Object c0783q = new C0783q(new C0780o0(N3, 0));
            c0167p.a0(c0783q);
            G4 = c0783q;
        }
        InterfaceC0778n0 interfaceC0778n0 = (InterfaceC0778n0) G4;
        boolean f4 = c0167p.f(interfaceC0778n0) | c0167p.f(n0Var);
        Object G5 = c0167p.G();
        if (f4 || G5 == obj4) {
            G5 = new k0(interfaceC0778n0, n0Var);
            c0167p.a0(G5);
        }
        U.q b3 = androidx.compose.foundation.gestures.a.b(U.n.f4488a, (k0) G5, (p.P) n0Var.f10186e.getValue(), null, this.f10163f && n0Var.f10183b.g() != 0.0f, z4, null, this.f10164g, null);
        c0167p.p(false);
        return b3;
    }
}
