package P;

/* loaded from: classes.dex */
public final class X extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Z f2042d;

    /* renamed from: e, reason: collision with root package name */
    public T f2043e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2044i;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2045l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f2046m;

    /* renamed from: n, reason: collision with root package name */
    public int f2047n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Z z7, X5.c cVar) {
        super(cVar);
        this.f2046m = z7;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2045l = obj;
        this.f2047n |= Integer.MIN_VALUE;
        return this.f2046m.a(null, this);
    }
}
