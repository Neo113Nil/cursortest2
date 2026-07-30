package D;

/* loaded from: classes.dex */
public final class Y extends y0.b {

    /* renamed from: h, reason: collision with root package name */
    public a0 f152h;

    /* renamed from: i, reason: collision with root package name */
    public U f153i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f154j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f155k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f156l;

    /* renamed from: m, reason: collision with root package name */
    public int f157m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(a0 a0Var, y0.b bVar) {
        super(bVar);
        this.f156l = a0Var;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        this.f155k = obj;
        this.f157m |= Integer.MIN_VALUE;
        return this.f156l.a(null, this);
    }
}
