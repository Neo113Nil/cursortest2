package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s2 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2383j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2384k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2387n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2388o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2389p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2390q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t2 f2391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p1.h0 f2392s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(int i7, int i8, p1.n0 n0Var, p1.n0 n0Var2, p1.n0 n0Var3, p1.n0 n0Var4, p1.n0 n0Var5, p1.n0 n0Var6, p1.n0 n0Var7, p1.n0 n0Var8, p1.n0 n0Var9, t2 t2Var, p1.h0 h0Var) {
        super(1);
        this.f2380g = i7;
        this.f2381h = i8;
        this.f2382i = n0Var;
        this.f2383j = n0Var2;
        this.f2384k = n0Var3;
        this.f2385l = n0Var4;
        this.f2386m = n0Var5;
        this.f2387n = n0Var6;
        this.f2388o = n0Var7;
        this.f2389p = n0Var8;
        this.f2390q = n0Var9;
        this.f2391r = t2Var;
        this.f2392s = h0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        float f9;
        int i7;
        p1.m0 m0Var = (p1.m0) obj;
        t2 t2Var = this.f2391r;
        float f10 = t2Var.f2404c;
        boolean z8 = t2Var.f2403b;
        p1.h0 h0Var = this.f2392s;
        float a3 = h0Var.a();
        m2.k layoutDirection = h0Var.getLayoutDirection();
        q.h0 h0Var2 = t2Var.f2405d;
        float f11 = r2.f2358a;
        p1.m0.e(m0Var, this.f2389p, 0L);
        float f12 = e0.o.f2714b;
        p1.n0 n0Var = this.f2390q;
        int i8 = this.f2380g - (n0Var != null ? n0Var.f7064g : 0);
        int O = t6.a.O(h0Var2.d() * a3);
        int O2 = t6.a.O(androidx.compose.foundation.layout.b.c(h0Var2, layoutDirection) * a3);
        float f13 = e0.o.f2715c * a3;
        p1.n0 n0Var2 = this.f2382i;
        if (n0Var2 != null) {
            p1.m0.f(m0Var, n0Var2, 0, Math.round((1 + 0.0f) * ((i8 - n0Var2.f7064g) / 2.0f)));
        }
        p1.n0 n0Var3 = this.f2387n;
        if (n0Var3 != null) {
            if (z8) {
                f9 = 2.0f;
                i7 = Math.round((1 + 0.0f) * ((i8 - n0Var3.f7064g) / 2.0f));
            } else {
                f9 = 2.0f;
                i7 = O;
            }
            p1.m0.f(m0Var, n0Var3, t6.a.O(n0Var2 == null ? 0.0f : (1 - f10) * (n0Var2.f7063f - f13)) + O2, a8.m.E(f10, i7, -(n0Var3.f7064g / 2)));
        } else {
            f9 = 2.0f;
        }
        p1.n0 n0Var4 = this.f2384k;
        if (n0Var4 != null) {
            p1.m0.f(m0Var, n0Var4, n0Var2 != null ? n0Var2.f7063f : 0, r2.e(z8, i8, O, n0Var3, n0Var4));
        }
        int i9 = (n0Var2 != null ? n0Var2.f7063f : 0) + (n0Var4 != null ? n0Var4.f7063f : 0);
        p1.n0 n0Var5 = this.f2386m;
        p1.m0.f(m0Var, n0Var5, i9, r2.e(z8, i8, O, n0Var3, n0Var5));
        p1.n0 n0Var6 = this.f2388o;
        if (n0Var6 != null) {
            p1.m0.f(m0Var, n0Var6, i9, r2.e(z8, i8, O, n0Var3, n0Var6));
        }
        int i10 = this.f2381h;
        p1.n0 n0Var7 = this.f2383j;
        p1.n0 n0Var8 = this.f2385l;
        if (n0Var8 != null) {
            p1.m0.f(m0Var, n0Var8, (i10 - (n0Var7 != null ? n0Var7.f7063f : 0)) - n0Var8.f7063f, r2.e(z8, i8, O, n0Var3, n0Var8));
        }
        if (n0Var7 != null) {
            p1.m0.f(m0Var, n0Var7, i10 - n0Var7.f7063f, Math.round((1 + 0.0f) * ((i8 - n0Var7.f7064g) / f9)));
        }
        if (n0Var != null) {
            p1.m0.f(m0Var, n0Var, 0, i8);
        }
        return d6.z.f2639a;
    }
}
