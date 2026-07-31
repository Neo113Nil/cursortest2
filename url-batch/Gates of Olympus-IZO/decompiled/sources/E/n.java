package E;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class n extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, P1.d dVar) {
        super(2, dVar);
        this.f675f = qVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        n nVar = new n(this.f675f, dVar);
        nVar.f674e = obj;
        return nVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((n) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f674e;
        q qVar = this.f675f;
        AbstractC0552y.q(interfaceC0550w, null, null, new k(qVar, null), 3);
        AbstractC0552y.q(interfaceC0550w, null, null, new l(qVar, null), 3);
        return AbstractC0552y.q(interfaceC0550w, null, null, new m(qVar, null), 3);
    }
}
