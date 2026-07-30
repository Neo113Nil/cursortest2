package s0;

/* loaded from: classes.dex */
public final class q extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2923h;

    /* renamed from: i, reason: collision with root package name */
    public int f2924i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P0.l f2925j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(P0.l lVar, w0.d dVar) {
        super(dVar);
        this.f2925j = lVar;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f2923h = obj;
        this.f2924i |= Integer.MIN_VALUE;
        return this.f2925j.a(null, this);
    }
}
