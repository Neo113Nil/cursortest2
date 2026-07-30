package g3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public a0 f4189f;

    /* renamed from: g, reason: collision with root package name */
    public int f4190g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4191h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f4192i;

    /* renamed from: j, reason: collision with root package name */
    public int f4193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a0 a0Var, j6.c cVar) {
        super(cVar);
        this.f4192i = a0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f4191h = obj;
        this.f4193j |= Integer.MIN_VALUE;
        return this.f4192i.f(this);
    }
}
