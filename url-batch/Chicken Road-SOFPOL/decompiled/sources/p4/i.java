package p4;

import d6.b0;
import d7.n0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m0.h1;
import o4.x;
import o4.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
@x("composable")
/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: c, reason: collision with root package name */
    public final h1 f5746c = m0.b.q(Boolean.FALSE);

    @Override // o4.y
    public final o4.o a() {
        return new h(this, c.f5743a);
    }

    @Override // o4.y
    public final void d(List list, o4.v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o4.d dVar = (o4.d) it.next();
            o4.g b8 = b();
            d7.y yVar = b8.f5635e;
            q6.i.e(dVar, "backStackEntry");
            n0 n0Var = b8.f5633c;
            Iterable iterable = (Iterable) n0Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((o4.d) it2.next()) == dVar) {
                        Iterable iterable2 = (Iterable) yVar.f2430d.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((o4.d) it3.next()) == dVar) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            o4.d dVar2 = (o4.d) d6.m.Y((List) yVar.f2430d.getValue());
            if (dVar2 != null) {
                n0Var.j(null, b0.M((Set) n0Var.getValue(), dVar2));
            }
            n0Var.j(null, b0.M((Set) n0Var.getValue(), dVar));
            b8.f(dVar);
        }
        this.f5746c.setValue(Boolean.FALSE);
    }

    @Override // o4.y
    public final void e(o4.d dVar, boolean z3) {
        b().e(dVar, z3);
        this.f5746c.setValue(Boolean.TRUE);
    }

    public final void g(o4.d dVar) {
        o4.g b8 = b();
        q6.i.e(dVar, "entry");
        n0 n0Var = b8.f5633c;
        n0Var.j(null, b0.M((Set) n0Var.getValue(), dVar));
        r4.g gVar = b8.f5638h.f5685b;
        gVar.getClass();
        if (!gVar.f6589f.contains(dVar)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        dVar.c(androidx.lifecycle.p.f850g);
    }
}
