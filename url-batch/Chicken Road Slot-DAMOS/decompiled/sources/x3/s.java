package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10446d;

    /* renamed from: e, reason: collision with root package name */
    public t0 f10447e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10448i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z f10449r;

    /* renamed from: s, reason: collision with root package name */
    public int f10450s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, ld.a aVar) {
        super(aVar);
        this.f10449r = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10448i = obj;
        this.f10450s |= Integer.MIN_VALUE;
        return z.f(this.f10449r, false, this);
    }
}
