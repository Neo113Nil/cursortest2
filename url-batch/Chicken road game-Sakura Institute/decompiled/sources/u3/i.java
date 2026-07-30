package u3;

import f7.q0;
import g0.g1;
import g0.t0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t3.d0;
import t3.f0;
import t3.g0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
@f0("composable")
/* loaded from: classes.dex */
public final class i extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final g1 f8994c = g0.d.J(Boolean.FALSE, t0.f3903k);

    @Override // t3.g0
    public final t3.v a() {
        return new h(this, c.f8990a);
    }

    @Override // t3.g0
    public final void d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t3.h hVar = (t3.h) it.next();
            t3.k b9 = b();
            f7.z zVar = b9.f8815e;
            r6.k.f(hVar, "backStackEntry");
            q0 q0Var = b9.f8813c;
            Iterable iterable = (Iterable) q0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((t3.h) it2.next()) == hVar) {
                        Iterable iterable2 = (Iterable) zVar.f3566f.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((t3.h) it3.next()) == hVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            t3.h hVar2 = (t3.h) e6.l.o0((List) zVar.f3566f.getValue());
            if (hVar2 != null) {
                q0Var.l(null, e6.g0.U((Set) q0Var.getValue(), hVar2));
            }
            q0Var.l(null, e6.g0.U((Set) q0Var.getValue(), hVar));
            b9.f(hVar);
        }
        this.f8994c.setValue(Boolean.FALSE);
    }

    @Override // t3.g0
    public final void e(t3.h hVar, boolean z8) {
        b().e(hVar, z8);
        this.f8994c.setValue(Boolean.TRUE);
    }

    public final void g(t3.h hVar) {
        t3.k b9 = b();
        r6.k.f(hVar, "entry");
        q0 q0Var = b9.f8813c;
        q0Var.l(null, e6.g0.U((Set) q0Var.getValue(), hVar));
        if (!b9.f8818h.f8751g.contains(hVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        hVar.h(androidx.lifecycle.o.f1010i);
    }
}
