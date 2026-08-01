package d2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public s.x f3596d;

    /* renamed from: e, reason: collision with root package name */
    public ie.b f3597e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3598i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f3599r;

    /* renamed from: s, reason: collision with root package name */
    public int f3600s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, nd.c cVar) {
        super(cVar);
        this.f3599r = b0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f3598i = obj;
        this.f3600s |= Integer.MIN_VALUE;
        return this.f3599r.f(this);
    }
}
