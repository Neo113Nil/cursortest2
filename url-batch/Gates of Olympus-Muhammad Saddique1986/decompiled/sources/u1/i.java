package u1;

import I.C0143d;
import I.C0156j0;
import I.W;
import S1.D;
import androidx.lifecycle.EnumC0286o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t1.AbstractC1019G;
import t1.C1016D;
import t1.C1028h;
import t1.InterfaceC1018F;
import t2.C1030A;
import t2.C1045P;

@InterfaceC1018F("composable")
/* loaded from: classes.dex */
public final class i extends AbstractC1019G {

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f9593c = C0143d.K(Boolean.FALSE, W.f2783i);

    @Override // t1.AbstractC1019G
    public final t1.u a() {
        return new h(this, c.f9584a);
    }

    @Override // t1.AbstractC1019G
    public final void d(List list, C1016D c1016d) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1028h c1028h = (C1028h) it.next();
            t1.k b3 = b();
            f2.j.f(c1028h, "backStackEntry");
            C1045P c1045p = b3.f8893c;
            Iterable iterable = (Iterable) c1045p.getValue();
            boolean z3 = iterable instanceof Collection;
            C1030A c1030a = b3.f8895e;
            if (!z3 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C1028h) it2.next()) == c1028h) {
                        Iterable iterable2 = (Iterable) ((C1045P) c1030a.f8956d).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C1028h) it3.next()) == c1028h) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C1028h c1028h2 = (C1028h) S1.l.R0((List) ((C1045P) c1030a.f8956d).getValue());
            if (c1028h2 != null) {
                c1045p.l(null, D.b0((Set) c1045p.getValue(), c1028h2));
            }
            c1045p.l(null, D.b0((Set) c1045p.getValue(), c1028h));
            b3.f(c1028h);
        }
        this.f9593c.setValue(Boolean.FALSE);
    }

    @Override // t1.AbstractC1019G
    public final void e(C1028h c1028h, boolean z3) {
        b().e(c1028h, z3);
        this.f9593c.setValue(Boolean.TRUE);
    }

    public final void g(C1028h c1028h) {
        t1.k b3 = b();
        f2.j.f(c1028h, "entry");
        C1045P c1045p = b3.f8893c;
        c1045p.l(null, D.b0((Set) c1045p.getValue(), c1028h));
        if (!b3.f8898h.f8812g.contains(c1028h)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c1028h.h(EnumC0286o.f5229g);
    }
}
