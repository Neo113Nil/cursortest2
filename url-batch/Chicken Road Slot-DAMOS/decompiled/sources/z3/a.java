package z3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f10692e;

    /* renamed from: i, reason: collision with root package name */
    public int f10693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, nd.c cVar) {
        super(cVar);
        this.f10692e = bVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10691d = obj;
        this.f10693i |= Integer.MIN_VALUE;
        return this.f10692e.a(null, this);
    }
}
