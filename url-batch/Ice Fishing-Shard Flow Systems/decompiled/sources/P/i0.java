package P;

/* loaded from: classes.dex */
public final class i0 extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f2099d;

    /* renamed from: e, reason: collision with root package name */
    public v6.c f2100e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2101i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f2102l;

    /* renamed from: m, reason: collision with root package name */
    public int f2103m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, X5.c cVar) {
        super(cVar);
        this.f2102l = l0Var;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2101i = obj;
        this.f2103m |= Integer.MIN_VALUE;
        return this.f2102l.b(null, this);
    }
}
