package P;

/* renamed from: P.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156v extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public Q f2163d;

    /* renamed from: e, reason: collision with root package name */
    public v6.c f2164e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2165i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f2166l;

    /* renamed from: m, reason: collision with root package name */
    public int f2167m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156v(Q q4, X5.c cVar) {
        super(cVar);
        this.f2166l = q4;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2165i = obj;
        this.f2167m |= Integer.MIN_VALUE;
        return Q.b(this.f2166l, this);
    }
}
