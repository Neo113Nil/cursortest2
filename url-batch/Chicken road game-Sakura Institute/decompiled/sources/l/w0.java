package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public x0 f5697f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5698g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f5700i;

    /* renamed from: j, reason: collision with root package name */
    public int f5701j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, j6.c cVar) {
        super(cVar);
        this.f5700i = x0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f5699h = obj;
        this.f5701j |= Integer.MIN_VALUE;
        return x0.j(this.f5700i, this);
    }
}
