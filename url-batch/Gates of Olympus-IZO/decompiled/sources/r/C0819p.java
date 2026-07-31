package r;

/* renamed from: r.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819p extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H f7079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0.z f7080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0.O f7081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7083i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f7084j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0819p(r0.H h3, r0.z zVar, t0.O o3, int i3, int i4, r rVar) {
        super(1);
        this.f7079e = h3;
        this.f7080f = zVar;
        this.f7081g = o3;
        this.f7082h = i3;
        this.f7083i = i4;
        this.f7084j = rVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        M0.j layoutDirection = this.f7081g.getLayoutDirection();
        U.d dVar = this.f7084j.f7091a;
        AbstractC0818o.b((r0.G) obj, this.f7079e, this.f7080f, layoutDirection, this.f7082h, this.f7083i, dVar);
        return L1.z.f2729a;
    }
}
