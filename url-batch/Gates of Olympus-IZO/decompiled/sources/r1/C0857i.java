package r1;

import I.C0089d;
import I.C0102j0;
import I.X;
import M1.E;
import androidx.lifecycle.EnumC0230o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n2.C0676A;
import n2.C0692Q;
import q1.C0784h;
import q1.C0787k;
import q1.G;
import q1.I;
import q1.J;

@I("composable")
/* renamed from: r1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857i extends J {

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f7223c = C0089d.J(Boolean.FALSE, X.f2228i);

    @Override // q1.J
    public final q1.w a() {
        return new C0856h(this, AbstractC0851c.f7215a);
    }

    @Override // q1.J
    public final void d(List list, G g3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0784h c0784h = (C0784h) it.next();
            C0787k b2 = b();
            Z1.i.f(c0784h, "backStackEntry");
            C0692Q c0692q = b2.f6914c;
            Iterable iterable = (Iterable) c0692q.getValue();
            boolean z3 = iterable instanceof Collection;
            C0676A c0676a = b2.f6916e;
            if (!z3 || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((C0784h) it2.next()) == c0784h) {
                        Iterable iterable2 = (Iterable) ((C0692Q) c0676a.f6272d).getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((C0784h) it3.next()) == c0784h) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            C0784h c0784h2 = (C0784h) M1.l.t0((List) ((C0692Q) c0676a.f6272d).getValue());
            if (c0784h2 != null) {
                c0692q.k(null, E.O((Set) c0692q.getValue(), c0784h2));
            }
            c0692q.k(null, E.O((Set) c0692q.getValue(), c0784h));
            b2.f(c0784h);
        }
        this.f7223c.setValue(Boolean.FALSE);
    }

    @Override // q1.J
    public final void e(C0784h c0784h, boolean z3) {
        b().e(c0784h, z3);
        this.f7223c.setValue(Boolean.TRUE);
    }

    public final void g(C0784h c0784h) {
        C0787k b2 = b();
        Z1.i.f(c0784h, "entry");
        C0692Q c0692q = b2.f6914c;
        c0692q.k(null, E.O((Set) c0692q.getValue(), c0784h));
        if (!b2.f6919h.f6834g.contains(c0784h)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        c0784h.h(EnumC0230o.f4028g);
    }
}
