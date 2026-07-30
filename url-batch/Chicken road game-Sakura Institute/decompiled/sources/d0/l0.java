package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2140g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.c f2141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.o f2142i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2143j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j0 f2144k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z8, q6.c cVar, s0.o oVar, boolean z9, j0 j0Var, int i7) {
        super(2);
        this.f2140g = z8;
        this.f2141h = cVar;
        this.f2142i = oVar;
        this.f2143j = z9;
        this.f2144k = j0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T = g0.d.T(1);
        p0.a(this.f2140g, this.f2141h, this.f2142i, this.f2143j, this.f2144k, (g0.p) obj, T);
        return d6.z.f2639a;
    }
}
