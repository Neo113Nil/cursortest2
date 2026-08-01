package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f9792d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9793e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f9794i;

    /* renamed from: r, reason: collision with root package name */
    public int f9795r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, nd.c cVar) {
        super(cVar);
        this.f9794i = h0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f9793e = obj;
        this.f9795r |= Integer.MIN_VALUE;
        return h0.v(this.f9794i, this);
    }
}
