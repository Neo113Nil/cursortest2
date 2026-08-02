package I;

/* loaded from: classes.dex */
public final class E extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f520i;

    /* renamed from: j, reason: collision with root package name */
    public int f521j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f522k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f523l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f524m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p2, int i2, H0.d dVar) {
        super(2, dVar);
        this.f523l = p2;
        this.f524m = i2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        E e2 = new E(this.f523l, this.f524m, dVar);
        e2.f522k = ((Boolean) obj).booleanValue();
        return e2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) b((H0.d) obj2, bool)).l(F0.h.f469a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // J0.b
    public final Object l(Object obj) {
        Throwable th;
        int i2;
        boolean z2;
        k0 k0Var;
        boolean z3;
        I0.a aVar = I0.a.f733e;
        boolean z4 = this.f521j;
        P p2 = this.f523l;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                j0 g2 = p2.g();
                this.f520i = th2;
                this.f522k = z4;
                this.f521j = 2;
                Integer a2 = g2.a();
                if (a2 == aVar) {
                    return aVar;
                }
                z2 = z4;
                th = th2;
                obj = a2;
            } else {
                boolean z5 = z4;
                th = th2;
                i2 = this.f524m;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            i1.a.G(obj);
            boolean z6 = this.f522k;
            this.f522k = z6;
            this.f521j = 1;
            obj = P.f(p2, z6, this);
            z4 = z6;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f522k;
                th = this.f520i;
                i1.a.G(obj);
                i2 = ((Number) obj).intValue();
                d0 d0Var = new d0(th, i2);
                z3 = z2;
                k0Var = d0Var;
                return new F0.c(k0Var, Boolean.valueOf(z3));
            }
            boolean z7 = this.f522k;
            i1.a.G(obj);
            z4 = z7;
        }
        k0Var = (k0) obj;
        z3 = z4;
        return new F0.c(k0Var, Boolean.valueOf(z3));
    }
}
