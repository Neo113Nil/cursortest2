package I;

/* loaded from: classes.dex */
public final class M extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f555i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f556j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f557k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p2, H0.d dVar) {
        super(2, dVar);
        this.f557k = p2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        M m2 = new M(this.f557k, dVar);
        m2.f556j = obj;
        return m2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((M) b((H0.d) obj2, (c0) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f555i;
        if (i2 == 0) {
            i1.a.G(obj);
            c0 c0Var = (c0) this.f556j;
            this.f555i = 1;
            if (P.b(this.f557k, c0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
