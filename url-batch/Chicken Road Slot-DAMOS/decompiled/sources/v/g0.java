package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f9803d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9804e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f9805i;

    /* renamed from: r, reason: collision with root package name */
    public int f9806r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, nd.c cVar) {
        super(cVar);
        this.f9805i = h0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f9804e = obj;
        this.f9806r |= Integer.MIN_VALUE;
        return h0.w(this.f9805i, this);
    }
}
