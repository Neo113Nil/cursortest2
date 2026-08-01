package z4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public c6.e f10748d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10749e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f10750i;

    /* renamed from: r, reason: collision with root package name */
    public int f10751r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, nd.c cVar) {
        super(cVar);
        this.f10750i = n0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10749e = obj;
        this.f10751r |= Integer.MIN_VALUE;
        return n0.b(this.f10750i, this);
    }
}
