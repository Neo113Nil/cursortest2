package E;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class o extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f979i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, V1.d dVar) {
        super(2, dVar);
        this.f979i = pVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((o) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        o oVar = new o(this.f979i, dVar);
        oVar.f978h = obj;
        return oVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        return AbstractC0837y.r((InterfaceC0835w) this.f978h, null, null, new n(this.f979i, null), 3);
    }
}
