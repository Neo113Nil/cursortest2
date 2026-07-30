package D;

import u0.C0247g;

/* loaded from: classes.dex */
public final class r extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m0 m0Var, w0.d dVar) {
        super(2, dVar);
        this.f259j = m0Var;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        r rVar = new r(this.f259j, dVar);
        rVar.f258i = obj;
        return rVar;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) b((m0) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        o.g.z(obj);
        m0 m0Var = (m0) this.f258i;
        return Boolean.valueOf((m0Var instanceof C0003d) && m0Var.f243a <= this.f259j.f243a);
    }
}
