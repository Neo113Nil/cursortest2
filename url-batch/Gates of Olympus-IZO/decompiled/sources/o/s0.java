package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class s0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M f6617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(M m3, P1.d dVar) {
        super(2, dVar);
        this.f6617e = m3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new s0(this.f6617e, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        s0 s0Var = (s0) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        s0Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        M m3 = this.f6617e;
        m3.f6456f = true;
        m3.f6457g.e(null);
        return L1.z.f2729a;
    }
}
