package P;

/* loaded from: classes.dex */
public final class C extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Q f1955d;

    /* renamed from: e, reason: collision with root package name */
    public m0 f1956e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1957i;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q f1959m;

    /* renamed from: n, reason: collision with root package name */
    public int f1960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Q q4, V5.b bVar) {
        super(bVar);
        this.f1959m = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f1958l = obj;
        this.f1960n |= Integer.MIN_VALUE;
        return Q.e(this.f1959m, false, this);
    }
}
