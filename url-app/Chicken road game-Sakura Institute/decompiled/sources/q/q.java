package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final s f7329a = new s(j.f7293c, s0.b.f8089q);

    public static final s a(h hVar, s0.e eVar, g0.p pVar, int i7) {
        if (hVar.equals(j.f7293c) && eVar.equals(s0.b.f8089q)) {
            pVar.Q(345962472);
            pVar.p(false);
            return f7329a;
        }
        pVar.Q(346016319);
        boolean z8 = true;
        boolean z9 = (((i7 & 14) ^ 6) > 4 && pVar.f(hVar)) || (i7 & 6) == 4;
        if ((((i7 & 112) ^ 48) <= 32 || !pVar.f(eVar)) && (i7 & 48) != 32) {
            z8 = false;
        }
        boolean z10 = z9 | z8;
        Object G = pVar.G();
        if (z10 || G == g0.l.f3784a) {
            G = new s(hVar, eVar);
            pVar.a0(G);
        }
        s sVar = (s) G;
        pVar.p(false);
        return sVar;
    }
}
