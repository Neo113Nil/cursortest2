package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.n f10370e;

    /* renamed from: i, reason: collision with root package name */
    public int f10371i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c6.n nVar, nd.c cVar) {
        super(cVar);
        this.f10370e = nVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10369d = obj;
        this.f10371i |= Integer.MIN_VALUE;
        return this.f10370e.a(this);
    }
}
