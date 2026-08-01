package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10356d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f10357e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10358i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f10359r;

    /* renamed from: s, reason: collision with root package name */
    public int f10360s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, nd.c cVar) {
        super(cVar);
        this.f10359r = h0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10358i = obj;
        this.f10360s |= Integer.MIN_VALUE;
        return this.f10359r.a(null, this);
    }
}
