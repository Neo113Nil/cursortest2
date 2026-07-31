package I1;

import M1.n;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k2.AbstractC0552y;
import n2.AbstractC0682G;
import n2.C0676A;
import n2.C0692Q;

/* loaded from: classes.dex */
public final class m extends V {

    /* renamed from: b, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.e f2483b;

    /* renamed from: c, reason: collision with root package name */
    public final C0692Q f2484c;

    /* renamed from: d, reason: collision with root package name */
    public final C0676A f2485d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2486e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f2487f;

    public m(com.gates.olympus.miruv.data.e eVar) {
        Z1.i.f(eVar, "repository");
        this.f2483b = eVar;
        C0692Q b2 = AbstractC0682G.b(new i(null, 0, 0, 127));
        this.f2484c = b2;
        this.f2485d = new C0676A(b2);
        this.f2486e = 6;
        AbstractC0552y.q(P.j(this), null, null, new j(this, null), 3);
        e();
    }

    public final void e() {
        C0692Q c0692q;
        Object value;
        this.f2487f = null;
        List<com.gates.olympus.miruv.data.b> allJoints = this.f2483b.getAllJoints();
        Z1.i.f(allJoints, "<this>");
        List E02 = M1.l.E0(allJoints);
        Collections.shuffle(E02);
        int i3 = this.f2486e;
        List<com.gates.olympus.miruv.data.b> z02 = M1.l.z0(i3, E02);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (com.gates.olympus.miruv.data.b bVar : z02) {
            int i5 = i4 + 1;
            arrayList.add(new c(i4, bVar.getId(), bVar.getName(), bVar.getShape(), true));
            i4 += 2;
            arrayList.add(new c(i5, bVar.getId(), bVar.getName(), bVar.getShape(), false));
        }
        Collections.shuffle(arrayList);
        do {
            c0692q = this.f2484c;
            value = c0692q.getValue();
        } while (!c0692q.i(value, new i(arrayList, i3, ((i) value).f2476g, 54)));
    }

    public final void f(f fVar) {
        int i3;
        Object obj;
        boolean z3;
        Object value;
        i iVar;
        Object value2;
        if (!(fVar instanceof d)) {
            if (!fVar.equals(e.f2465a)) {
                throw new L1.f();
            }
            e();
            return;
        }
        d dVar = (d) fVar;
        C0692Q c0692q = this.f2484c;
        i iVar2 = (i) c0692q.getValue();
        if (iVar2.f2474e || iVar2.f2475f) {
            return;
        }
        List list = iVar2.f2470a;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i3 = dVar.f2464a;
            if (!hasNext) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((c) obj).f2457a == i3) {
                    break;
                }
            }
        }
        c cVar = (c) obj;
        if (cVar == null || cVar.f2462f || cVar.f2463g) {
            return;
        }
        ArrayList arrayList = new ArrayList(n.g0(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            z3 = true;
            if (!it2.hasNext()) {
                break;
            }
            c cVar2 = (c) it2.next();
            if (cVar2.f2457a == i3) {
                cVar2 = c.a(cVar2, true, false, 95);
            }
            arrayList.add(cVar2);
        }
        Integer num = this.f2487f;
        if (num == null) {
            this.f2487f = Integer.valueOf(i3);
            do {
                value2 = c0692q.getValue();
            } while (!c0692q.i(value2, i.a((i) value2, arrayList, 0, 0, false, false, 0, 126)));
            return;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            c cVar3 = (c) it3.next();
            if (cVar3.f2457a == num.intValue()) {
                String str = cVar3.f2458b;
                String str2 = cVar.f2458b;
                boolean a3 = Z1.i.a(str, str2);
                this.f2487f = null;
                if (a3) {
                    ArrayList arrayList2 = new ArrayList(n.g0(arrayList, 10));
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        c cVar4 = (c) it4.next();
                        if (Z1.i.a(cVar4.f2458b, str2)) {
                            cVar4 = c.a(cVar4, false, true, 63);
                        }
                        arrayList2.add(cVar4);
                    }
                    int i4 = iVar2.f2472c + 1;
                    boolean z4 = i4 == iVar2.f2473d;
                    do {
                        value = c0692q.getValue();
                        iVar = (i) value;
                    } while (!c0692q.i(value, i.a(iVar, arrayList2, iVar.f2471b + 1, i4, false, z4, 0, 88)));
                    if (z4) {
                        AbstractC0552y.q(P.j(this), null, null, new k(this, null), 3);
                        return;
                    }
                    return;
                }
                while (true) {
                    Object value3 = c0692q.getValue();
                    i iVar3 = (i) value3;
                    boolean z5 = z3;
                    if (c0692q.i(value3, i.a(iVar3, arrayList, iVar3.f2471b + 1, 0, true, false, 0, 108))) {
                        AbstractC0552y.q(P.j(this), null, null, new l(this, null), 3);
                        return;
                    }
                    z3 = z5;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
