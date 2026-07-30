package P;

/* loaded from: classes.dex */
public final class Y extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Z f2048d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2049e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2050i;

    /* renamed from: l, reason: collision with root package name */
    public b0 f2051l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2052m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f2053n;

    /* renamed from: o, reason: collision with root package name */
    public int f2054o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z7, X5.c cVar) {
        super(cVar);
        this.f2053n = z7;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2052m = obj;
        this.f2054o |= Integer.MIN_VALUE;
        return this.f2053n.b(null, this);
    }
}
