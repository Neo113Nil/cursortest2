package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f8944g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f8945h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f8946j;

    /* renamed from: k, reason: collision with root package name */
    public int f8947k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, g6.c cVar) {
        super(cVar);
        this.f8946j = b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f8947k |= Integer.MIN_VALUE;
        return b0.e(this.f8946j, false, this);
    }
}
