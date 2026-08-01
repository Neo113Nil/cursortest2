package w1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f10004e;

    /* renamed from: i, reason: collision with root package name */
    public int f10005i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, nd.c cVar2) {
        super(cVar2);
        this.f10004e = cVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10003d = obj;
        this.f10005i |= Integer.MIN_VALUE;
        return this.f10004e.a(0L, 0L, this);
    }
}
