package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1893g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1894h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1895i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1896j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1897k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1900n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1901o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a0.x0 x0Var, w.j0 j0Var, boolean z8, q6.c cVar, g2.w wVar, g2.q qVar, m2.b bVar, int i7) {
        super(2);
        this.f1896j = x0Var;
        this.f1897k = j0Var;
        this.f1894h = z8;
        this.f1898l = cVar;
        this.f1899m = wVar;
        this.f1900n = qVar;
        this.f1901o = bVar;
        this.f1895i = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r4 != false) goto L28;
     */
    @Override // q6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Object obj2) {
        switch (this.f1893g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                d3.b((q6.a) this.f1896j, (s0.o) this.f1897k, this.f1894h, (z0.p0) this.f1898l, (w) this.f1899m, null, (q.h0) this.f1900n, (o0.a) this.f1901o, (g0.p) obj, g0.d.T(this.f1895i | 1));
                break;
            default:
                g0.p pVar = (g0.p) obj;
                int intValue = ((Number) obj2).intValue();
                a0.x0 x0Var = (a0.x0) this.f1896j;
                w.j0 j0Var = (w.j0) this.f1897k;
                if ((intValue & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    w.l lVar = new w.l(j0Var, (q6.c) this.f1898l, (g2.w) this.f1899m, (g2.q) this.f1900n, (m2.b) this.f1901o, this.f1895i);
                    int i7 = pVar.P;
                    g0.k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, s0.l.f8103a);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(nVar);
                    } else {
                        pVar.d0();
                    }
                    g0.d.Q(pVar, lVar, r1.i.f7784e);
                    g0.d.Q(pVar, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                        a0.m.q(i7, pVar, i7, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    boolean z8 = true;
                    pVar.p(true);
                    w.a0 a3 = j0Var.a();
                    w.a0 a0Var = w.a0.f9183f;
                    boolean z9 = this.f1894h;
                    if (a3 != a0Var && j0Var.c() != null) {
                        p1.p c6 = j0Var.c();
                        r6.k.c(c6);
                        if (c6.O()) {
                        }
                    }
                    z8 = false;
                    w.g0.f(x0Var, z8, pVar, 0);
                    if (j0Var.a() == w.a0.f9185h && z9) {
                        pVar.Q(-2032274);
                        w.g0.e(x0Var, pVar, 0);
                        pVar.p(false);
                    } else {
                        pVar.Q(-1955394);
                        pVar.p(false);
                    }
                }
                break;
        }
        return d6.z.f2639a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(q6.a aVar, s0.o oVar, boolean z8, z0.p0 p0Var, w wVar, d3 d3Var, q.h0 h0Var, o0.a aVar2, int i7) {
        super(2);
        this.f1896j = aVar;
        this.f1897k = oVar;
        this.f1894h = z8;
        this.f1898l = p0Var;
        this.f1899m = wVar;
        this.f1900n = h0Var;
        this.f1901o = aVar2;
        this.f1895i = i7;
    }
}
