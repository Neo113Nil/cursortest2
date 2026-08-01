package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p0 extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public oe.a f10424d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10425e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c6.n f10426i;

    /* renamed from: r, reason: collision with root package name */
    public int f10427r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c6.n nVar, nd.c cVar) {
        super(cVar);
        this.f10426i = nVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10425e = obj;
        this.f10427r |= Integer.MIN_VALUE;
        return this.f10426i.c(this);
    }
}
