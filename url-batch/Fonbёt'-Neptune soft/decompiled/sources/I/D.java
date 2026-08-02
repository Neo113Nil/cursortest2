package I;

/* loaded from: classes.dex */
public final class D extends J0.g implements P0.l {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f517i;

    /* renamed from: j, reason: collision with root package name */
    public int f518j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f519k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p2, H0.d dVar) {
        super(1, dVar);
        this.f519k = p2;
    }

    @Override // P0.l
    public final Object i(Object obj) {
        return new D(this.f519k, (H0.d) obj).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        Throwable th;
        k0 k0Var;
        I0.a aVar = I0.a.f733e;
        int i2 = this.f518j;
        P p2 = this.f519k;
        try {
        } catch (Throwable th2) {
            j0 g2 = p2.g();
            this.f517i = th2;
            this.f518j = 2;
            Integer a2 = g2.a();
            if (a2 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            i1.a.G(obj);
            this.f518j = 1;
            obj = P.f(p2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f517i;
                i1.a.G(obj);
                k0Var = new d0(th, ((Number) obj).intValue());
                return new F0.c(k0Var, Boolean.TRUE);
            }
            i1.a.G(obj);
        }
        k0Var = (k0) obj;
        return new F0.c(k0Var, Boolean.TRUE);
    }
}
