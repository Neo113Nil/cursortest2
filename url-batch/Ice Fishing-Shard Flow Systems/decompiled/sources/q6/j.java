package q6;

/* loaded from: classes.dex */
public final class j extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7378d;

    /* renamed from: e, reason: collision with root package name */
    public int f7379e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P0.c f7380i;

    /* renamed from: l, reason: collision with root package name */
    public P0.c f7381l;

    /* renamed from: m, reason: collision with root package name */
    public e f7382m;

    /* renamed from: n, reason: collision with root package name */
    public r6.t f7383n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(P0.c cVar, V5.b bVar) {
        super(bVar);
        this.f7380i = cVar;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f7378d = obj;
        this.f7379e |= Integer.MIN_VALUE;
        return this.f7380i.e(null, this);
    }
}
