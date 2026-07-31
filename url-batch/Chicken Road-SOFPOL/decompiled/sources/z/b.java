package z;

import f1.i0;
import j0.s;
import t.t;
import x.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9000d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0.m f9001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f9003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f9004h;
    public final /* synthetic */ boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f9005j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f9006k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f9007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c6.c f9008m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f9009n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9010o;

    public /* synthetic */ b(p6.a aVar, y0.m mVar, boolean z3, i0 i0Var, j0.n nVar, s sVar, t tVar, f0 f0Var, p6.f fVar, int i, int i8) {
        this.f9002f = aVar;
        this.f9001e = mVar;
        this.i = z3;
        this.f9007l = i0Var;
        this.f9006k = nVar;
        this.f9004h = sVar;
        this.f9005j = tVar;
        this.f9003g = f0Var;
        this.f9008m = fVar;
        this.f9009n = i;
        this.f9010o = i8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f9000d) {
            case 0:
                p pVar = (p) this.f9002f;
                x.d dVar = (x.d) this.f9007l;
                y0.d dVar2 = (y0.d) this.f9006k;
                u.i iVar = (u.i) this.f9004h;
                t.j jVar = (t.j) this.f9005j;
                p6.c cVar = (p6.c) this.f9008m;
                ((Integer) obj2).getClass();
                r2.o.c(m0.b.w(this.f9009n | 1), this.f9010o, (m0.s) obj, cVar, jVar, iVar, dVar, this.f9003g, dVar2, this.f9001e, pVar, this.i);
                break;
            case 1:
                p pVar2 = (p) this.f9002f;
                u.i iVar2 = (u.i) this.f9004h;
                t.j jVar2 = (t.j) this.f9005j;
                y0.d dVar3 = (y0.d) this.f9006k;
                x.d dVar4 = (x.d) this.f9007l;
                p6.c cVar2 = (p6.c) this.f9008m;
                ((Integer) obj2).getClass();
                r2.r.b(m0.b.w(this.f9009n | 1), m0.b.w(this.f9010o), (m0.s) obj, cVar2, jVar2, iVar2, dVar4, this.f9003g, dVar3, this.f9001e, pVar2, this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                j0.m.b((p6.a) this.f9002f, this.f9001e, this.i, (i0) this.f9007l, (j0.n) this.f9006k, (s) this.f9004h, (t) this.f9005j, this.f9003g, (p6.f) this.f9008m, (m0.s) obj, m0.b.w(this.f9009n | 1), this.f9010o);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ b(y0.m mVar, p pVar, f0 f0Var, u.i iVar, boolean z3, t.j jVar, y0.d dVar, x.d dVar2, p6.c cVar, int i, int i8) {
        this.f9001e = mVar;
        this.f9002f = pVar;
        this.f9003g = f0Var;
        this.f9004h = iVar;
        this.i = z3;
        this.f9005j = jVar;
        this.f9006k = dVar;
        this.f9007l = dVar2;
        this.f9008m = cVar;
        this.f9009n = i;
        this.f9010o = i8;
    }

    public /* synthetic */ b(y0.m mVar, p pVar, f0 f0Var, x.d dVar, y0.d dVar2, u.i iVar, boolean z3, t.j jVar, p6.c cVar, int i, int i8) {
        this.f9001e = mVar;
        this.f9002f = pVar;
        this.f9003g = f0Var;
        this.f9007l = dVar;
        this.f9006k = dVar2;
        this.f9004h = iVar;
        this.i = z3;
        this.f9005j = jVar;
        this.f9008m = cVar;
        this.f9009n = i;
        this.f9010o = i8;
    }
}
