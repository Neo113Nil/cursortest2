package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public i1 f1976f;

    /* renamed from: g, reason: collision with root package name */
    public p.h f1977g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i1 f1979i;

    /* renamed from: j, reason: collision with root package name */
    public int f1980j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, j6.c cVar) {
        super(cVar);
        this.f1979i = i1Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f1978h = obj;
        this.f1980j |= Integer.MIN_VALUE;
        return this.f1979i.a(null, this);
    }
}
