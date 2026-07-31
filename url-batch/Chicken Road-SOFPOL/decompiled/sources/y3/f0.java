package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f8863g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f8864h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f8865j;

    /* renamed from: k, reason: collision with root package name */
    public int f8866k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, i6.c cVar) {
        super(cVar);
        this.f8865j = h0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f8866k |= Integer.MIN_VALUE;
        return this.f8865j.a(null, this);
    }
}
