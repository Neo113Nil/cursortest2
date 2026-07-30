package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p1 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.b f2272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2273h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.o f2274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2275j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2276k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(e1.b bVar, String str, s0.o oVar, long j8, int i7) {
        super(2);
        this.f2272g = bVar;
        this.f2273h = str;
        this.f2274i = oVar;
        this.f2275j = j8;
        this.f2276k = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        q1.a(this.f2272g, this.f2273h, this.f2274i, this.f2275j, (g0.p) obj, g0.d.T(this.f2276k | 1));
        return d6.z.f2639a;
    }
}
