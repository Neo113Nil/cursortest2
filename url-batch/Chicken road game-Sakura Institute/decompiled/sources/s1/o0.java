package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 extends j6.c {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f8333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0 f8334g;

    /* renamed from: h, reason: collision with root package name */
    public int f8335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, j6.c cVar) {
        super(cVar);
        this.f8334g = p0Var;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        this.f8333f = obj;
        this.f8335h |= Integer.MIN_VALUE;
        this.f8334g.a(null, this);
        return i6.a.f4956f;
    }
}
