package P;

/* renamed from: P.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146k extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Object f2113d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2114e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2115i;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.D f2116l;

    /* renamed from: m, reason: collision with root package name */
    public Q f2117m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f2118n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0147l f2119o;

    /* renamed from: p, reason: collision with root package name */
    public int f2120p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146k(C0147l c0147l, X5.c cVar) {
        super(cVar);
        this.f2119o = c0147l;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2118n = obj;
        this.f2120p |= Integer.MIN_VALUE;
        return this.f2119o.a(null, this);
    }
}
