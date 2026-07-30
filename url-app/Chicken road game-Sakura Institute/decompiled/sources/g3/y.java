package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public r6.t f4224f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a0 f4226h;

    /* renamed from: i, reason: collision with root package name */
    public int f4227i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, j6.c cVar) {
        super(cVar);
        this.f4226h = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4225g = obj;
        this.f4227i |= Integer.MIN_VALUE;
        return this.f4226h.h(null, false, this);
    }
}
