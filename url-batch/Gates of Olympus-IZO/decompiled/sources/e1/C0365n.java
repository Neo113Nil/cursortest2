package e1;

import k2.m0;
import n2.InterfaceC0701g;

/* renamed from: e1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365n extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f4727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0365n(m0 m0Var, P1.d dVar) {
        super(2, dVar);
        this.f4727e = m0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0365n(this.f4727e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0365n c0365n = (C0365n) create((InterfaceC0701g) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0365n.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        this.f4727e.p();
        return L1.z.f2729a;
    }
}
