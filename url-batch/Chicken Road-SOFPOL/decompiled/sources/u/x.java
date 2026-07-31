package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends i6.c {

    /* renamed from: g, reason: collision with root package name */
    public m f7116g;

    /* renamed from: h, reason: collision with root package name */
    public v.b f7117h;
    public /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f7118j;

    /* renamed from: k, reason: collision with root package name */
    public int f7119k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(x0 x0Var, i6.c cVar) {
        super(cVar);
        this.f7118j = x0Var;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        this.i = obj;
        this.f7119k |= Integer.MIN_VALUE;
        return x0.v0(this.f7118j, null, this);
    }
}
