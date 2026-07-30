package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1933j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1934k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1935l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1936m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1937n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1938o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(p1.n0 n0Var, p1.n0 n0Var2, int i7, int i8, p1.n0 n0Var3, int i9, int i10, int i11, int i12) {
        super(1);
        this.f1930g = n0Var;
        this.f1931h = n0Var2;
        this.f1932i = i7;
        this.f1933j = i8;
        this.f1934k = n0Var3;
        this.f1935l = i9;
        this.f1936m = i10;
        this.f1937n = i11;
        this.f1938o = i12;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        p1.m0 m0Var = (p1.m0) obj;
        p1.n0 n0Var = this.f1930g;
        if (n0Var != null) {
            p1.m0.f(m0Var, n0Var, (this.f1937n - n0Var.f7063f) / 2, (this.f1938o - n0Var.f7064g) / 2);
        }
        p1.m0.f(m0Var, this.f1931h, this.f1932i, this.f1933j);
        p1.m0.f(m0Var, this.f1934k, this.f1935l, this.f1936m);
        return d6.z.f2639a;
    }
}
