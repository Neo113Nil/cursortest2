package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f6194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.p f6195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f6196i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f6197j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f6198k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f6199l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f6200m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b1.i f6201n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z8, z0.r0 r0Var, long j8, float f9, float f10, long j9, long j10, b1.i iVar) {
        super(1);
        this.f6194g = z8;
        this.f6195h = r0Var;
        this.f6196i = j8;
        this.f6197j = f9;
        this.f6198k = f10;
        this.f6199l = j9;
        this.f6200m = j10;
        this.f6201n = iVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        r1.f0 f0Var = (r1.f0) obj;
        f0Var.b();
        b1.c cVar = f0Var.f7767f;
        if (this.f6194g) {
            b1.e.N(f0Var, this.f6195h, 0L, 0L, this.f6196i, null, 246);
        } else {
            long j8 = this.f6196i;
            float b9 = y0.a.b(j8);
            float f9 = this.f6197j;
            if (b9 < f9) {
                float f10 = this.f6198k;
                float d8 = y0.f.d(cVar.d());
                float f11 = this.f6198k;
                float f12 = d8 - f11;
                float b10 = y0.f.b(cVar.d()) - f11;
                z0.p pVar = this.f6195h;
                long j9 = this.f6196i;
                b1.b bVar = cVar.f1234g;
                long p6 = bVar.p();
                bVar.k().o();
                try {
                    ((b1.b) ((b6.c) bVar.f1230g).f1394g).k().j(f10, f10, f12, b10, 0);
                    b1.e.N(f0Var, pVar, 0L, 0L, j9, null, 246);
                } finally {
                    a0.m.s(bVar, p6);
                }
            } else {
                b1.e.N(f0Var, this.f6195h, this.f6199l, this.f6200m, a8.m.L(j8, f9), this.f6201n, 208);
            }
        }
        return d6.z.f2639a;
    }
}
