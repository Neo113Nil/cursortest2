package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class r extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f422i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f423j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l0 l0Var, G0.d dVar) {
        super(2, dVar);
        this.f423j = l0Var;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        r rVar = new r(this.f423j, dVar);
        rVar.f422i = obj;
        return rVar;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((r) b((G0.d) obj2, (l0) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        AbstractC0086a.I(obj);
        l0 l0Var = (l0) this.f422i;
        return Boolean.valueOf((l0Var instanceof C0022d) && l0Var.f398a <= this.f423j.f398a);
    }
}
