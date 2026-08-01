package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f10432d;

    /* renamed from: e, reason: collision with root package name */
    public oe.c f10433e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10434i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f10435r;

    /* renamed from: s, reason: collision with root package name */
    public int f10436s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, nd.c cVar) {
        super(cVar);
        this.f10435r = s0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10434i = obj;
        this.f10436s |= Integer.MIN_VALUE;
        return this.f10435r.b(null, this);
    }
}
