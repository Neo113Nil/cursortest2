package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o1 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f2247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.o f2249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2250j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(f1.f fVar, String str, s0.o oVar, long j8, int i7) {
        super(2);
        this.f2247g = fVar;
        this.f2248h = str;
        this.f2249i = oVar;
        this.f2250j = j8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T = g0.d.T(1);
        q1.b(this.f2247g, this.f2248h, this.f2249i, this.f2250j, (g0.p) obj, T);
        return d6.z.f2639a;
    }
}
