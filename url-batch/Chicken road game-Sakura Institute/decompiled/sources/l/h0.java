package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f5500a = new i0.d(new f0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final g0.g1 f5501b;

    /* renamed from: c, reason: collision with root package name */
    public long f5502c;

    /* renamed from: d, reason: collision with root package name */
    public final g0.g1 f5503d;

    public h0() {
        Boolean bool = Boolean.FALSE;
        g0.t0 t0Var = g0.t0.f3903k;
        this.f5501b = g0.d.J(bool, t0Var);
        this.f5502c = Long.MIN_VALUE;
        this.f5503d = g0.d.J(Boolean.TRUE, t0Var);
    }

    public final void a(int i7, g0.p pVar) {
        pVar.S(-318043801);
        if ((((pVar.h(this) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (G == t0Var) {
                G = g0.d.J(null, g0.t0.f3903k);
                pVar.a0(G);
            }
            g0.z0 z0Var = (g0.z0) G;
            if (((Boolean) this.f5503d.getValue()).booleanValue() || ((Boolean) this.f5501b.getValue()).booleanValue()) {
                pVar.Q(1719915818);
                boolean h3 = pVar.h(this);
                Object G2 = pVar.G();
                if (h3 || G2 == t0Var) {
                    G2 = new androidx.lifecycle.g0(z0Var, this, (h6.d) null);
                    pVar.a0(G2);
                }
                g0.d.e(pVar, this, (q6.e) G2);
                pVar.p(false);
            } else {
                pVar.Q(1721436120);
                pVar.p(false);
            }
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 5, this);
        }
    }
}
