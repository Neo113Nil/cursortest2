package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1204d;

    /* renamed from: e, reason: collision with root package name */
    public i f1205e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1206i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f1207r;

    /* renamed from: s, reason: collision with root package name */
    public int f1208s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, nd.c cVar) {
        super(cVar);
        this.f1207r = b0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1206i = obj;
        this.f1208s |= Integer.MIN_VALUE;
        return this.f1207r.f(false, this);
    }
}
