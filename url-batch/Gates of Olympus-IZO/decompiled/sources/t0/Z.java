package t0;

/* loaded from: classes.dex */
public final class Z extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f7861f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.k f7862g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0896d f7863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7864i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f7865j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7866k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f7867l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f7868m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(a0 a0Var, U.k kVar, C0896d c0896d, long j3, r rVar, boolean z3, boolean z4, float f3, int i3) {
        super(0);
        this.f7860e = i3;
        this.f7861f = a0Var;
        this.f7862g = kVar;
        this.f7863h = c0896d;
        this.f7864i = j3;
        this.f7865j = rVar;
        this.f7866k = z3;
        this.f7867l = z4;
        this.f7868m = f3;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f7860e) {
            case 0:
                U.k e3 = AbstractC0898f.e(this.f7862g, this.f7863h.a());
                boolean z3 = this.f7867l;
                a0 a0Var = this.f7861f;
                C0896d c0896d = this.f7863h;
                long j3 = this.f7864i;
                r rVar = this.f7865j;
                boolean z4 = this.f7866k;
                if (e3 == null) {
                    a0Var.G0(c0896d, j3, rVar, z4, z3);
                } else {
                    a0Var.getClass();
                    float f3 = this.f7868m;
                    rVar.c(e3, f3, z3, new Z(a0Var, e3, c0896d, j3, rVar, z4, z3, f3, 0));
                }
                break;
            default:
                this.f7861f.S0(AbstractC0898f.e(this.f7862g, this.f7863h.a()), this.f7863h, this.f7864i, this.f7865j, this.f7866k, this.f7867l, this.f7868m);
                break;
        }
        return L1.z.f2729a;
    }
}
