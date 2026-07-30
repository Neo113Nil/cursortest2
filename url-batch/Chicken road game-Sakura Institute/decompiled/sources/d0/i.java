package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.e f2022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f2023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2024i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2025j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f2026k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2027l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2028m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2029n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q6.e f2030o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0.a f2031p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q6.e eVar, q6.e eVar2, z0.p0 p0Var, long j8, float f9, long j9, long j10, long j11, q6.e eVar3, o0.a aVar) {
        super(2);
        this.f2022g = eVar;
        this.f2023h = eVar2;
        this.f2024i = p0Var;
        this.f2025j = j8;
        this.f2026k = f9;
        this.f2027l = j9;
        this.f2028m = j10;
        this.f2029n = j11;
        this.f2030o = eVar3;
        this.f2031p = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            o0.a b9 = o0.f.b(1163543932, new h(this.f2030o, this.f2031p, 1), pVar);
            int i7 = f0.c.f2925a;
            m.a(b9, null, this.f2022g, this.f2023h, this.f2024i, this.f2025j, this.f2026k, s0.d(26, pVar), this.f2027l, this.f2028m, this.f2029n, pVar, 6);
        }
        return d6.z.f2639a;
    }
}
