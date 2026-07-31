package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public int f8940g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f8941h;
    public final /* synthetic */ b0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f8942j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b0 b0Var, i6.c cVar) {
        super(cVar);
        this.i = b0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.f8941h = obj;
        this.f8942j |= Integer.MIN_VALUE;
        return b0.d(this.i, this);
    }
}
