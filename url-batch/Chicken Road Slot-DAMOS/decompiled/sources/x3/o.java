package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public oe.c f10415d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10416e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f10417i;

    /* renamed from: r, reason: collision with root package name */
    public int f10418r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, nd.c cVar) {
        super(cVar);
        this.f10417i = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10416e = obj;
        this.f10418r |= Integer.MIN_VALUE;
        return z.a(this.f10417i, this);
    }
}
