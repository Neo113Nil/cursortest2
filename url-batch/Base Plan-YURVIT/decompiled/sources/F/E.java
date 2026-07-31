package F;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class E extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public Throwable f238i;

    /* renamed from: j, reason: collision with root package name */
    public int f239j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f240k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f241l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p2, int i2, G0.d dVar) {
        super(2, dVar);
        this.f241l = p2;
        this.f242m = i2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        E e2 = new E(this.f241l, this.f242m, dVar);
        e2.f240k = ((Boolean) obj).booleanValue();
        return e2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) b((G0.d) obj2, bool)).m(D0.h.f206a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // I0.b
    public final Object m(Object obj) {
        Throwable th;
        int i2;
        l0 l0Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.f239j;
        P p2 = this.f241l;
        H0.a aVar = H0.a.f511e;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                k0 g2 = p2.g();
                this.f238i = th2;
                this.f240k = z5;
                this.f239j = 2;
                Integer a2 = g2.a();
                if (a2 != aVar) {
                    th = th2;
                    obj = a2;
                    z4 = z5;
                }
            } else {
                th = th2;
                i2 = this.f242m;
                z3 = z5;
            }
        }
        if (z5 == 0) {
            AbstractC0086a.I(obj);
            boolean z6 = this.f240k;
            this.f240k = z6;
            this.f239j = 1;
            obj = P.e(p2, z6, this);
            z5 = z6;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (z5 != 1) {
                if (z5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z7 = this.f240k;
                th = this.f238i;
                AbstractC0086a.I(obj);
                z4 = z7;
                i2 = ((Number) obj).intValue();
                z3 = z4;
                l0Var = new d0(th, i2);
                z2 = z3;
                return new D0.c(l0Var, Boolean.valueOf(z2));
            }
            boolean z8 = this.f240k;
            AbstractC0086a.I(obj);
            z5 = z8;
        }
        l0Var = (l0) obj;
        z2 = z5;
        return new D0.c(l0Var, Boolean.valueOf(z2));
    }
}
