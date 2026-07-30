package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public g7.v f3437f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f3439h;

    /* renamed from: i, reason: collision with root package name */
    public int f3440i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a0 a0Var, h6.d dVar) {
        super(dVar);
        this.f3439h = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f3438g = obj;
        this.f3440i |= Integer.MIN_VALUE;
        return this.f3439h.b(null, this);
    }
}
