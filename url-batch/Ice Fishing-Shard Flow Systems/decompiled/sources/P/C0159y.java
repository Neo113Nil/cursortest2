package P;

/* renamed from: P.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159y extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Q f2176d;

    /* renamed from: e, reason: collision with root package name */
    public v6.c f2177e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2178i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f2179l;

    /* renamed from: m, reason: collision with root package name */
    public int f2180m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159y(Q q4, X5.c cVar) {
        super(cVar);
        this.f2179l = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2178i = obj;
        this.f2180m |= Integer.MIN_VALUE;
        return Q.d(this.f2179l, this);
    }
}
