package u1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r0 extends q6.j implements p6.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f7260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0.m f7261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p6.e f7262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(w0 w0Var, y0.m mVar, p6.e eVar, int i) {
        super(2);
        this.f7260e = w0Var;
        this.f7261f = mVar;
        this.f7262g = eVar;
        this.f7263h = i;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int w7 = m0.b.w(this.f7263h | 1);
        s0.a(this.f7260e, this.f7261f, this.f7262g, (m0.s) obj, w7);
        return c6.m.f1757a;
    }
}
