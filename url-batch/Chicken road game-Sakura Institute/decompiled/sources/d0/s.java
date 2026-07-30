package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2372i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q.f f2373j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2374k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f2375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p1.h0 f2376m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.h f2377n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p1.n0 n0Var, int i7, p1.n0 n0Var2, q.f fVar, long j8, p1.n0 n0Var3, p1.h0 h0Var, q.h hVar, int i8) {
        super(1);
        this.f2370g = n0Var;
        this.f2371h = i7;
        this.f2372i = n0Var2;
        this.f2373j = fVar;
        this.f2374k = j8;
        this.f2375l = n0Var3;
        this.f2376m = h0Var;
        this.f2377n = hVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int h3;
        int h8;
        p1.m0 m0Var = (p1.m0) obj;
        p1.n0 n0Var = this.f2370g;
        int i7 = n0Var.f7064g;
        int i8 = this.f2371h;
        int i9 = 0;
        p1.m0.f(m0Var, n0Var, 0, (i8 - i7) / 2);
        q.e eVar = q.j.f7295e;
        q.f fVar = this.f2373j;
        boolean a3 = r6.k.a(fVar, eVar);
        p1.n0 n0Var2 = this.f2375l;
        p1.n0 n0Var3 = this.f2372i;
        long j8 = this.f2374k;
        if (a3) {
            int h9 = m2.a.h(j8);
            int i10 = n0Var3.f7063f;
            h3 = (h9 - i10) / 2;
            int i11 = n0Var.f7063f;
            if (h3 < i11) {
                h8 = i11 - h3;
            } else if (i10 + h3 > m2.a.h(j8) - n0Var2.f7063f) {
                h8 = (m2.a.h(j8) - n0Var2.f7063f) - (n0Var3.f7063f + h3);
            }
            h3 += h8;
        } else {
            h3 = r6.k.a(fVar, q.j.f7292b) ? (m2.a.h(j8) - n0Var3.f7063f) - n0Var2.f7063f : Math.max(this.f2376m.K(v.f2462b), n0Var.f7063f);
        }
        q.h hVar = this.f2377n;
        if (r6.k.a(hVar, eVar)) {
            i9 = (i8 - n0Var3.f7064g) / 2;
        } else if (r6.k.a(hVar, q.j.f7294d)) {
            i9 = i8 - n0Var3.f7064g;
        }
        p1.m0.f(m0Var, n0Var3, h3, i9);
        p1.m0.f(m0Var, n0Var2, m2.a.h(j8) - n0Var2.f7063f, (i8 - n0Var2.f7064g) / 2);
        return d6.z.f2639a;
    }
}
