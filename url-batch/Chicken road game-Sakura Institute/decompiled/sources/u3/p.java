package u3;

import java.util.Iterator;
import java.util.List;
import t3.d0;
import t3.f0;
import t3.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
@f0("dialog")
/* loaded from: classes.dex */
public final class p extends g0 {
    @Override // t3.g0
    public final t3.v a() {
        o0.a aVar = e.f8992a;
        return new o(this);
    }

    @Override // t3.g0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((t3.h) it.next());
        }
    }

    @Override // t3.g0
    public final void e(t3.h hVar, boolean z8) {
        b().e(hVar, z8);
        int j02 = e6.l.j0((Iterable) b().f8816f.f3566f.getValue(), hVar);
        int i7 = 0;
        for (Object obj : (Iterable) b().f8816f.f3566f.getValue()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                e6.m.Z();
                throw null;
            }
            t3.h hVar2 = (t3.h) obj;
            if (i7 > j02) {
                b().b(hVar2);
            }
            i7 = i8;
        }
    }
}
