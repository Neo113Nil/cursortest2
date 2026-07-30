package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.n2 f1939a = new g0.n2(r0.f2351o);

    /* renamed from: b, reason: collision with root package name */
    public static final g0.z f1940b = new g0.z(r0.f2350n);

    /* renamed from: c, reason: collision with root package name */
    public static final f3 f1941c;

    /* renamed from: d, reason: collision with root package name */
    public static final f3 f1942d;

    static {
        long j8 = z0.u.f10057g;
        f1941c = new f3(true, Float.NaN, j8);
        f1942d = new f3(false, Float.NaN, j8);
    }

    public static final m.g0 a(float f9, g0.p pVar, int i7, int i8) {
        m.g0 f3Var;
        boolean z8 = true;
        boolean z9 = (i8 & 1) != 0;
        if ((i8 & 2) != 0) {
            f9 = Float.NaN;
        }
        long j8 = z0.u.f10057g;
        pVar.Q(-1280632857);
        if (((Boolean) pVar.k(f1939a)).booleanValue()) {
            l.v1 v1Var = c0.p.f1494a;
            g0.z0 M = g0.d.M(new z0.u(j8), pVar);
            boolean z10 = (((i7 & 14) ^ 6) > 4 && pVar.g(z9)) || (i7 & 6) == 4;
            if ((((i7 & 112) ^ 48) <= 32 || !pVar.c(f9)) && (i7 & 48) != 32) {
                z8 = false;
            }
            boolean z11 = z10 | z8;
            Object G = pVar.G();
            if (z11 || G == g0.l.f3784a) {
                G = new c0.e(z9, f9, M);
                pVar.a0(G);
            }
            f3Var = (c0.e) G;
        } else if (m2.e.a(f9, Float.NaN) && z0.u.c(j8, j8)) {
            f3Var = z9 ? f1941c : f1942d;
        } else {
            f3Var = new f3(z9, f9, j8);
        }
        pVar.p(false);
        return f3Var;
    }
}
