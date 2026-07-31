package B;

import I.C0159l;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;

/* renamed from: B.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0422a f414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f415f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0009j(InterfaceC0422a interfaceC0422a, boolean z3) {
        super(3);
        this.f414e = interfaceC0422a;
        this.f415f = z3;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        U.q qVar = (U.q) obj;
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(-196777734);
        long j3 = ((j0) c0167p.k(k0.f418a)).f416a;
        boolean e3 = c0167p.e(j3);
        InterfaceC0422a interfaceC0422a = this.f414e;
        boolean f3 = e3 | c0167p.f(interfaceC0422a);
        boolean z3 = this.f415f;
        boolean g3 = f3 | c0167p.g(z3);
        Object G3 = c0167p.G();
        if (g3 || G3 == C0159l.f2829a) {
            G3 = new C0008i(j3, interfaceC0422a, z3);
            c0167p.a0(G3);
        }
        U.q b3 = androidx.compose.ui.draw.a.b(qVar, (InterfaceC0424c) G3);
        c0167p.p(false);
        return b3;
    }
}
