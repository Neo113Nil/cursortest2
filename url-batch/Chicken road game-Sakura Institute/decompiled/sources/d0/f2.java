package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1951g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1952h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1953i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1954j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1955k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1958n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1959o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f1960p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f1961q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1962r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f1963s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1964t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p1.h0 f1965u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p1.n0 n0Var, boolean z8, float f9, p1.n0 n0Var2, int i7, float f10, float f11, p1.n0 n0Var3, int i8, float f12, p1.n0 n0Var4, int i9, float f13, int i10, p1.h0 h0Var) {
        super(1);
        this.f1951g = n0Var;
        this.f1952h = z8;
        this.f1953i = f9;
        this.f1954j = n0Var2;
        this.f1955k = i7;
        this.f1956l = f10;
        this.f1957m = f11;
        this.f1958n = n0Var3;
        this.f1959o = i8;
        this.f1960p = f12;
        this.f1961q = n0Var4;
        this.f1962r = i9;
        this.f1963s = f13;
        this.f1964t = i10;
        this.f1965u = h0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        p1.m0 m0Var = (p1.m0) obj;
        float f9 = this.f1960p;
        float f10 = this.f1957m;
        p1.n0 n0Var = this.f1951g;
        if (n0Var != null) {
            p1.m0.f(m0Var, n0Var, (this.f1964t - n0Var.f7063f) / 2, t6.a.O((f9 - this.f1965u.y(g2.f1986f)) + f10));
        }
        if (this.f1952h || this.f1953i != 0.0f) {
            p1.m0.f(m0Var, this.f1954j, this.f1955k, t6.a.O(this.f1956l + f10));
        }
        p1.m0.f(m0Var, this.f1958n, this.f1959o, t6.a.O(f9 + f10));
        p1.m0.f(m0Var, this.f1961q, this.f1962r, t6.a.O(this.f1963s + f10));
        return d6.z.f2639a;
    }
}
