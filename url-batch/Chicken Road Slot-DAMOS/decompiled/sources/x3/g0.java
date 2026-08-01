package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f10363d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10364e;

    /* renamed from: i, reason: collision with root package name */
    public k0 f10365i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10366r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f10367s;

    /* renamed from: t, reason: collision with root package name */
    public int f10368t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, nd.c cVar) {
        super(cVar);
        this.f10367s = h0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10366r = obj;
        this.f10368t |= Integer.MIN_VALUE;
        return this.f10367s.b(null, this);
    }
}
