package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public r6.u f6560f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f6562h;

    /* renamed from: i, reason: collision with root package name */
    public int f6563i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(f1 f1Var, j6.c cVar) {
        super(cVar);
        this.f6562h = f1Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6561g = obj;
        this.f6563i |= Integer.MIN_VALUE;
        return this.f6562h.b(0L, this);
    }
}
