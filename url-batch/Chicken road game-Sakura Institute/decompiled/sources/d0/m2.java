package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m2 extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0.s f2176j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p.j f2177k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.e f2178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t3 f2179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2180n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(String str, boolean z8, boolean z9, a0.s sVar, p.j jVar, q6.e eVar, t3 t3Var, z0.p0 p0Var) {
        super(3);
        this.f2173g = str;
        this.f2174h = z8;
        this.f2175i = z9;
        this.f2176j = sVar;
        this.f2177k = jVar;
        this.f2178l = eVar;
        this.f2179m = t3Var;
        this.f2180n = p0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        q6.e eVar = (q6.e) obj;
        g0.p pVar = (g0.p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= pVar.h(eVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            k2 k2Var = k2.f2128a;
            z0.p0 p0Var = this.f2180n;
            boolean z8 = this.f2174h;
            p.j jVar = this.f2177k;
            t3 t3Var = this.f2179m;
            k2Var.b(this.f2173g, eVar, z8, this.f2175i, this.f2176j, jVar, this.f2178l, t3Var, null, o0.f.b(2108828640, new l2(z8, jVar, t3Var, p0Var), pVar), pVar, (intValue << 3) & 112);
        }
        return d6.z.f2639a;
    }
}
