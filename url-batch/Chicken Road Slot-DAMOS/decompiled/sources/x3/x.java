package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public wd.a0 f10482d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10483e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f10484i;

    /* renamed from: r, reason: collision with root package name */
    public int f10485r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, nd.c cVar) {
        super(cVar);
        this.f10484i = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10483e = obj;
        this.f10485r |= Integer.MIN_VALUE;
        return this.f10484i.k(null, false, this);
    }
}
