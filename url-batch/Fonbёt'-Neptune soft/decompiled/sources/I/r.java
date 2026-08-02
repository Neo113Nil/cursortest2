package I;

/* loaded from: classes.dex */
public final class r extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f701i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k0 k0Var, H0.d dVar) {
        super(2, dVar);
        this.f702j = k0Var;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        r rVar = new r(this.f702j, dVar);
        rVar.f701i = obj;
        return rVar;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((r) b((H0.d) obj2, (k0) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        i1.a.G(obj);
        k0 k0Var = (k0) this.f701i;
        return Boolean.valueOf((k0Var instanceof C0069d) && k0Var.f673a <= this.f702j.f673a);
    }
}
