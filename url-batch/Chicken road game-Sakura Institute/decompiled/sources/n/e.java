package n;

import d0.b0;
import g0.p;
import g0.p1;
import m.o;
import q0.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final q f6477a = new q();

    public static void b(e eVar, w.i iVar, boolean z8, q6.a aVar) {
        eVar.f6477a.add(new o0.a(262103052, new o(iVar, z8, aVar), true));
    }

    public final void a(a aVar, p pVar, int i7) {
        pVar.S(1320309496);
        int i8 = (pVar.f(aVar) ? 4 : 2) | i7 | (pVar.f(this) ? 32 : 16);
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            q qVar = this.f6477a;
            int size = qVar.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((q6.f) qVar.get(i9)).c(aVar, pVar, Integer.valueOf(i8 & 14));
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new b0(i7, 6, this, aVar);
        }
    }
}
