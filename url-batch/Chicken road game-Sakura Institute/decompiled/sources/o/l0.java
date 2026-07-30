package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public m0 f6676f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0 f6678h;

    /* renamed from: i, reason: collision with root package name */
    public int f6679i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, j6.c cVar) {
        super(cVar);
        this.f6678h = m0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6677g = obj;
        this.f6679i |= Integer.MIN_VALUE;
        return this.f6678h.c(this);
    }
}
