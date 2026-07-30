package P;

/* loaded from: classes.dex */
public final class j0 extends X5.c {

    /* renamed from: d, reason: collision with root package name */
    public v6.c f2108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2109e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2110i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0 f2111l;

    /* renamed from: m, reason: collision with root package name */
    public int f2112m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, X5.c cVar) {
        super(cVar);
        this.f2111l = l0Var;
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        this.f2110i = obj;
        this.f2112m |= Integer.MIN_VALUE;
        return this.f2111l.c(null, this);
    }
}
