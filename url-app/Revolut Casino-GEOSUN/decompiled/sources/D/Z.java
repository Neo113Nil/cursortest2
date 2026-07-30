package D;

/* loaded from: classes.dex */
public final class Z extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public a0 f158h;

    /* renamed from: i, reason: collision with root package name */
    public Object f159i;

    /* renamed from: j, reason: collision with root package name */
    public Object f160j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f161k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f163m;

    /* renamed from: n, reason: collision with root package name */
    public int f164n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(a0 a0Var, y0.b bVar) {
        super(bVar);
        this.f163m = a0Var;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f162l = obj;
        this.f164n |= Integer.MIN_VALUE;
        return this.f163m.b(null, this);
    }
}
