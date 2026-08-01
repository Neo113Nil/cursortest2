package x3;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends nd.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f10377d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10378e;

    /* renamed from: i, reason: collision with root package name */
    public Object f10379i;

    /* renamed from: r, reason: collision with root package name */
    public wd.b0 f10380r;

    /* renamed from: s, reason: collision with root package name */
    public z f10381s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f10382t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f10383u;

    /* renamed from: v, reason: collision with root package name */
    public int f10384v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, nd.c cVar) {
        super(cVar);
        this.f10383u = jVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.f10382t = obj;
        this.f10384v |= Integer.MIN_VALUE;
        return this.f10383u.a(null, this);
    }
}
