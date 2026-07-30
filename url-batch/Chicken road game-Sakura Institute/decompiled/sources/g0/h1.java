package g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h1 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public i1 f3738f;

    /* renamed from: g, reason: collision with root package name */
    public q6.c f3739g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3740h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i1 f3741i;

    /* renamed from: j, reason: collision with root package name */
    public int f3742j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, h6.d dVar) {
        super(dVar);
        this.f3741i = i1Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3740h = obj;
        this.f3742j |= Integer.MIN_VALUE;
        return this.f3741i.t(null, this);
    }
}
