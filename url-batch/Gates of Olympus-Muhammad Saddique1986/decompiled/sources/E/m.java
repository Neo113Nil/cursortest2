package E;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class m extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f974h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f975i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, V1.d dVar) {
        super(2, dVar);
        this.f975i = pVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((m) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        m mVar = new m(this.f975i, dVar);
        mVar.f974h = obj;
        return mVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f974h;
        p pVar = this.f975i;
        AbstractC0837y.r(interfaceC0835w, null, null, new j(pVar, null), 3);
        AbstractC0837y.r(interfaceC0835w, null, null, new k(pVar, null), 3);
        return AbstractC0837y.r(interfaceC0835w, null, null, new l(pVar, null), 3);
    }
}
