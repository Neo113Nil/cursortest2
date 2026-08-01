package z4;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f10743d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10744e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0 f10745i;

    /* renamed from: r, reason: collision with root package name */
    public int f10746r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(n0 n0Var, nd.c cVar) {
        super(cVar);
        this.f10745i = n0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10744e = obj;
        this.f10746r |= Integer.MIN_VALUE;
        return n0.a(this.f10745i, null, this);
    }
}
