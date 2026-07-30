package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0.o f9180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9182i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s0.o oVar, int i7, int i8) {
        super(2);
        this.f9180g = oVar;
        this.f9181h = i7;
        this.f9182i = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T = g0.d.T(this.f9181h | 1);
        int i7 = this.f9182i;
        d.b(this.f9180g, (g0.p) obj, T, i7);
        return d6.z.f2639a;
    }
}
