package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public i7.c f8918g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8919h;
    public final /* synthetic */ b0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f8920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b0 b0Var, i6.c cVar) {
        super(cVar);
        this.i = b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8919h = obj;
        this.f8920j |= Integer.MIN_VALUE;
        return b0.a(this.i, this);
    }
}
