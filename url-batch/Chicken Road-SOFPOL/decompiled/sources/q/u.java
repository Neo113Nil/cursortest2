package q;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0.m f5913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f5914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0 f5915h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.c f5916j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z3, y0.m mVar, m0 m0Var, n0 n0Var, String str, u0.c cVar, int i) {
        super(2);
        this.f5912e = z3;
        this.f5913f = mVar;
        this.f5914g = m0Var;
        this.f5915h = n0Var;
        this.i = str;
        this.f5916j = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int w7 = m0.b.w(1600519);
        androidx.compose.animation.b.b(this.f5912e, this.f5913f, this.f5914g, this.f5915h, this.i, this.f5916j, (m0.s) obj, w7);
        return c6.m.f1757a;
    }
}
