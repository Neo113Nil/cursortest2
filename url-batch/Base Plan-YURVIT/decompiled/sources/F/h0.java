package F;

/* loaded from: classes.dex */
public final class h0 extends I0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f369h;

    /* renamed from: i, reason: collision with root package name */
    public e1.d f370i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f372k;

    /* renamed from: l, reason: collision with root package name */
    public int f373l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, I0.b bVar) {
        super(bVar);
        this.f372k = k0Var;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        this.f371j = obj;
        this.f373l |= Integer.MIN_VALUE;
        return this.f372k.b(null, this);
    }
}
