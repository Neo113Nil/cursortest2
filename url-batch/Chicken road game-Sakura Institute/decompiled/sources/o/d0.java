package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public x0 f6588f;

    /* renamed from: g, reason: collision with root package name */
    public q f6589g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6590h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f6591i;

    /* renamed from: j, reason: collision with root package name */
    public int f6592j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x0 x0Var, j6.c cVar) {
        super(cVar);
        this.f6591i = x0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f6590h = obj;
        this.f6592j |= Integer.MIN_VALUE;
        return x0.F0(this.f6591i, null, this);
    }
}
