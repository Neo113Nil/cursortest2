package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f1209d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f1210e;

    /* renamed from: i, reason: collision with root package name */
    public int f1211i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1212r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f1213s;

    /* renamed from: t, reason: collision with root package name */
    public int f1214t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, nd.c cVar) {
        super(cVar);
        this.f1213s = b0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1212r = obj;
        this.f1214t |= Integer.MIN_VALUE;
        return this.f1213s.g(null, null, this);
    }
}
