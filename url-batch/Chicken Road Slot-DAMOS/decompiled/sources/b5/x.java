package b5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public z4.d0 f1199d;

    /* renamed from: e, reason: collision with root package name */
    public i f1200e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1201i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b0 f1202r;

    /* renamed from: s, reason: collision with root package name */
    public int f1203s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, nd.c cVar) {
        super(cVar);
        this.f1202r = b0Var;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f1201i = obj;
        this.f1203s |= Integer.MIN_VALUE;
        return this.f1202r.e(null, this);
    }
}
