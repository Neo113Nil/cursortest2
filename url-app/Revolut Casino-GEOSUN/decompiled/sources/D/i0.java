package D;

/* loaded from: classes.dex */
public final class i0 extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public Object f205h;

    /* renamed from: i, reason: collision with root package name */
    public U0.d f206i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f207j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f208k;

    /* renamed from: l, reason: collision with root package name */
    public int f209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, y0.b bVar) {
        super(bVar);
        this.f208k = l0Var;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f207j = obj;
        this.f209l |= Integer.MIN_VALUE;
        return this.f208k.b(null, this);
    }
}
