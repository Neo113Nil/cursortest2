package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f7304a = new m0(j.f7291a, s0.b.f8087o);

    public static final m0 a(f fVar, s0.f fVar2, g0.p pVar, int i7) {
        if (r6.k.a(fVar, j.f7291a) && r6.k.a(fVar2, s0.b.f8087o)) {
            pVar.Q(-849081669);
            pVar.p(false);
            return f7304a;
        }
        pVar.Q(-849030798);
        boolean z8 = true;
        boolean z9 = (((i7 & 14) ^ 6) > 4 && pVar.f(fVar)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !pVar.f(fVar2)) && (i7 & 48) != 32) {
            z8 = false;
        }
        boolean z10 = z9 | z8;
        Object G = pVar.G();
        if (z10 || G == g0.l.f3784a) {
            G = new m0(fVar, fVar2);
            pVar.a0(G);
        }
        m0 m0Var = (m0) G;
        pVar.p(false);
        return m0Var;
    }
}
