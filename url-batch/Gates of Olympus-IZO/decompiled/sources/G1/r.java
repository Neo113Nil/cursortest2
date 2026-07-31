package G1;

import M1.u;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.AbstractC0552y;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class r extends V {

    /* renamed from: b, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.e f1576b;

    /* renamed from: c, reason: collision with root package name */
    public final C0692Q f1577c;

    /* renamed from: d, reason: collision with root package name */
    public final C0676A f1578d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1579e;

    public r(com.gates.olympus.miruv.data.e eVar) {
        Z1.i.f(eVar, "repository");
        this.f1576b = eVar;
        C0692Q b2 = AbstractC0682G.b(new n(u.f2803d, 0, 0, null, false, false, 0));
        this.f1577c = b2;
        this.f1578d = new C0676A(b2);
        this.f1579e = 8;
        AbstractC0552y.q(P.j(this), null, null, new p(this, null), 3);
        e();
    }

    public final void e() {
        C0692Q c0692q;
        Object value;
        List<com.gates.olympus.miruv.data.b> allJoints = this.f1576b.getAllJoints();
        Z1.i.f(allJoints, "<this>");
        List E02 = M1.l.E0(allJoints);
        Collections.shuffle(E02);
        List<com.gates.olympus.miruv.data.b> z02 = M1.l.z0(this.f1579e, E02);
        ArrayList arrayList = new ArrayList(M1.n.g0(z02, 10));
        for (com.gates.olympus.miruv.data.b bVar : z02) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : allJoints) {
                if (!Z1.i.a(((com.gates.olympus.miruv.data.b) obj).getId(), bVar.getId())) {
                    arrayList2.add(obj);
                }
            }
            List E03 = M1.l.E0(arrayList2);
            Collections.shuffle(E03);
            List E04 = M1.l.E0(M1.l.v0(M1.l.z0(3, E03), bVar));
            Collections.shuffle(E04);
            arrayList.add(new g(bVar, E04));
        }
        do {
            c0692q = this.f1577c;
            value = c0692q.getValue();
        } while (!c0692q.i(value, n.a((n) value, arrayList, 0, 0, null, false, false, 0, 64)));
    }

    public final void f(f fVar) {
        Object value;
        n nVar;
        Object value2;
        Object value3;
        n nVar2;
        com.gates.olympus.miruv.data.b bVar;
        boolean z3 = fVar instanceof c;
        String str = null;
        C0692Q c0692q = this.f1577c;
        if (!z3) {
            if (!fVar.equals(d.f1542a)) {
                if (!fVar.equals(e.f1543a)) {
                    throw new L1.f();
                }
                e();
                return;
            }
            n nVar3 = (n) c0692q.getValue();
            if (nVar3.f1564b + 1 >= nVar3.f1563a.size()) {
                do {
                    value2 = c0692q.getValue();
                } while (!c0692q.i(value2, n.a((n) value2, null, 0, 0, null, false, true, 0, 95)));
                AbstractC0552y.q(P.j(this), null, null, new q(this, null), 3);
                return;
            } else {
                do {
                    value = c0692q.getValue();
                    nVar = (n) value;
                } while (!c0692q.i(value, n.a(nVar, null, nVar.f1564b + 1, 0, null, false, false, 0, 101)));
                return;
            }
        }
        n nVar4 = (n) c0692q.getValue();
        if (nVar4.f1567e) {
            return;
        }
        List list = nVar4.f1563a;
        Z1.i.f(list, "<this>");
        int i3 = nVar4.f1564b;
        g gVar = (g) ((i3 < 0 || i3 >= list.size()) ? null : list.get(i3));
        if (gVar != null && (bVar = gVar.f1544a) != null) {
            str = bVar.getId();
        }
        c cVar = (c) fVar;
        boolean a3 = Z1.i.a(str, cVar.f1541a);
        do {
            value3 = c0692q.getValue();
            nVar2 = (n) value3;
        } while (!c0692q.i(value3, n.a(nVar2, null, 0, a3 ? nVar2.f1565c + 1 : nVar2.f1565c, cVar.f1541a, true, false, 0, 99)));
    }
}
