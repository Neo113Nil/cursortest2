package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.n0[] f7332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f7333h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7334i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.h0 f7335j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f7336k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p1.n0[] n0VarArr, s sVar, int i7, p1.h0 h0Var, int[] iArr) {
        super(1);
        this.f7332g = n0VarArr;
        this.f7333h = sVar;
        this.f7334i = i7;
        this.f7335j = h0Var;
        this.f7336k = iArr;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        p1.m0 m0Var = (p1.m0) obj;
        p1.n0[] n0VarArr = this.f7332g;
        int length = n0VarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            p1.n0 n0Var = n0VarArr[i7];
            int i9 = i8 + 1;
            r6.k.c(n0Var);
            Object g9 = n0Var.g();
            k0 k0Var = g9 instanceof k0 ? (k0) g9 : null;
            m2.k layoutDirection = this.f7335j.getLayoutDirection();
            v vVar = k0Var != null ? k0Var.f7299c : null;
            int i10 = this.f7334i;
            p1.m0.d(m0Var, n0Var, vVar != null ? vVar.a(i10 - n0Var.f7063f, layoutDirection) : this.f7333h.f7340b.a(0, i10 - n0Var.f7063f, layoutDirection), this.f7336k[i8]);
            i7++;
            i8 = i9;
        }
        return d6.z.f2639a;
    }
}
