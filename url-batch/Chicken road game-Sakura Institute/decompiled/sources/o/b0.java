package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public x0 f6564f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f6566h;

    /* renamed from: i, reason: collision with root package name */
    public int f6567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x0 x0Var, j6.c cVar) {
        super(cVar);
        this.f6566h = x0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6565g = obj;
        this.f6567i |= Integer.MIN_VALUE;
        return x0.D0(this.f6566h, this);
    }
}
