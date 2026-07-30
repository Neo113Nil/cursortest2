package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public Object f4180f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f4181g;

    /* renamed from: h, reason: collision with root package name */
    public c7.n f4182h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4183i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f4184j;

    /* renamed from: k, reason: collision with root package name */
    public int f4185k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, j6.c cVar) {
        super(cVar);
        this.f4184j = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4183i = obj;
        this.f4185k |= Integer.MIN_VALUE;
        return a0.a(this.f4184j, null, this);
    }
}
