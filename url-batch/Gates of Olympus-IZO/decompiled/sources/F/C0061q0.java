package F;

/* renamed from: F.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061q0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H f1339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f1341g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0.H f1342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1343i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1344j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f1345k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r0.H f1346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r0.H f1349o;
    public final /* synthetic */ int p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f1350q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1351r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t0.O f1352s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061q0(r0.H h3, boolean z3, float f3, r0.H h4, int i3, float f4, float f5, r0.H h5, int i4, float f6, r0.H h6, int i5, float f7, int i6, t0.O o3) {
        super(1);
        this.f1339e = h3;
        this.f1340f = z3;
        this.f1341g = f3;
        this.f1342h = h4;
        this.f1343i = i3;
        this.f1344j = f4;
        this.f1345k = f5;
        this.f1346l = h5;
        this.f1347m = i4;
        this.f1348n = f6;
        this.f1349o = h6;
        this.p = i5;
        this.f1350q = f7;
        this.f1351r = i6;
        this.f1352s = o3;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        r0.G g3 = (r0.G) obj;
        float f3 = this.f1348n;
        float f4 = this.f1345k;
        r0.H h3 = this.f1339e;
        if (h3 != null) {
            r0.G.f(g3, h3, (this.f1351r - h3.f7114d) / 2, M1.B.M((f3 - this.f1352s.k(AbstractC0062r0.f1360e)) + f4));
        }
        if (this.f1340f || this.f1341g != 0.0f) {
            r0.G.f(g3, this.f1342h, this.f1343i, M1.B.M(this.f1344j + f4));
        }
        r0.G.f(g3, this.f1346l, this.f1347m, M1.B.M(f3 + f4));
        r0.G.f(g3, this.f1349o, this.p, M1.B.M(this.f1350q + f4));
        return L1.z.f2729a;
    }
}
