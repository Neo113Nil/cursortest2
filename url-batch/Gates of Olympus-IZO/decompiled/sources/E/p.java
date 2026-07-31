package E;

import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class p extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, P1.d dVar) {
        super(2, dVar);
        this.f679f = qVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        p pVar = new p(this.f679f, dVar);
        pVar.f678e = obj;
        return pVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((p) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        return AbstractC0552y.q((InterfaceC0550w) this.f678e, null, null, new o(this.f679f, null), 3);
    }
}
