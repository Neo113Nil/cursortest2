package k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.n0[] f5208g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f5209h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5210i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5211j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p1.n0[] n0VarArr, h hVar, int i7, int i8) {
        super(1);
        this.f5208g = n0VarArr;
        this.f5209h = hVar;
        this.f5210i = i7;
        this.f5211j = i8;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        p1.m0 m0Var = (p1.m0) obj;
        for (p1.n0 n0Var : this.f5208g) {
            if (n0Var != null) {
                long a3 = this.f5209h.f5220a.f5240b.a(j1.c.G(n0Var.f7063f, n0Var.f7064g), j1.c.G(this.f5210i, this.f5211j), m2.k.f6322f);
                p1.m0.d(m0Var, n0Var, (int) (a3 >> 32), (int) (a3 & 4294967295L));
            }
        }
        return d6.z.f2639a;
    }
}
