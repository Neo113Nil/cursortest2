package w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public long f10019d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10020e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f10021i;

    /* renamed from: r, reason: collision with root package name */
    public int f10022r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, nd.c cVar) {
        super(cVar);
        this.f10021i = hVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10020e = obj;
        this.f10022r |= Integer.MIN_VALUE;
        return this.f10021i.M(0L, this);
    }
}
