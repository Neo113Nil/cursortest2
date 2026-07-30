package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0.x0 x0Var, boolean z8, int i7) {
        super(2);
        this.f9439g = x0Var;
        this.f9440h = z8;
        this.f9441i = i7;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int T = g0.d.T(this.f9441i | 1);
        g0.f(this.f9439g, this.f9440h, (g0.p) obj, T);
        return d6.z.f2639a;
    }
}
