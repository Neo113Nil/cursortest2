package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public i7.c f8926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8927h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0 f8928j;

    /* renamed from: k, reason: collision with root package name */
    public int f8929k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, i6.c cVar) {
        super(cVar);
        this.f8928j = r0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f8929k |= Integer.MIN_VALUE;
        return this.f8928j.c(null, this);
    }
}
