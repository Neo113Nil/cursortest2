package w;

import a0.g1;
import a0.h1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public static final c f9201g = new c(3);

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        s0.o oVar = (s0.o) obj;
        g0.p pVar = (g0.p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(-2126899193);
        long j8 = ((g1) pVar.k(h1.f83a)).f73a;
        boolean e9 = pVar.e(j8);
        Object G = pVar.G();
        if (e9 || G == g0.l.f3784a) {
            G = new b(j8, 0);
            pVar.a0(G);
        }
        s0.o j9 = oVar.j(androidx.compose.ui.draw.a.b(s0.l.f8103a, (q6.c) G));
        pVar.p(false);
        return j9;
    }
}
