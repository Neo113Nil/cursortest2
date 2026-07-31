package H1;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import k2.AbstractC0552y;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class y extends V {

    /* renamed from: b, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.e f1918b;

    /* renamed from: c, reason: collision with root package name */
    public final C0692Q f1919c;

    /* renamed from: d, reason: collision with root package name */
    public final C0676A f1920d;

    public y(com.gates.olympus.miruv.data.e eVar) {
        Z1.i.f(eVar, "repository");
        this.f1918b = eVar;
        C0692Q b2 = AbstractC0682G.b(new v(eVar.getAllJoints(), null, M1.w.f2805d));
        this.f1919c = b2;
        this.f1920d = new C0676A(b2);
        AbstractC0552y.q(P.j(this), null, null, new w(this, null), 3);
    }

    public final void e(l lVar) {
        C0692Q c0692q;
        Object value;
        if (lVar instanceof j) {
            do {
                c0692q = this.f1919c;
                value = c0692q.getValue();
            } while (!c0692q.i(value, v.a((v) value, ((j) lVar).f1877a, null, 5)));
        } else {
            if (!(lVar instanceof k)) {
                throw new L1.f();
            }
            AbstractC0552y.q(P.j(this), null, null, new x(this, lVar, null), 3);
        }
    }
}
