package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public oe.c f10428d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10429e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f10430i;

    /* renamed from: r, reason: collision with root package name */
    public int f10431r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z zVar, nd.c cVar) {
        super(cVar);
        this.f10430i = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10429e = obj;
        this.f10431r |= Integer.MIN_VALUE;
        return z.d(this.f10430i, this);
    }
}
