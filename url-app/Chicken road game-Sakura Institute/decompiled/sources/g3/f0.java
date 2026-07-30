package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public Object f4118f;

    /* renamed from: g, reason: collision with root package name */
    public k7.c f4119g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h0 f4121i;

    /* renamed from: j, reason: collision with root package name */
    public int f4122j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, j6.c cVar) {
        super(cVar);
        this.f4121i = h0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4120h = obj;
        this.f4122j |= Integer.MIN_VALUE;
        return this.f4121i.b(null, this);
    }
}
