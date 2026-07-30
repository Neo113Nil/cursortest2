package d0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements p1.f0 {
    public static final void d(ArrayList arrayList, r6.t tVar, p1.h0 h0Var, ArrayList arrayList2, ArrayList arrayList3, r6.t tVar2, ArrayList arrayList4, r6.t tVar3, r6.t tVar4) {
        float f9 = m.f2158d;
        if (!arrayList.isEmpty()) {
            tVar.f7966f = h0Var.K(f9) + tVar.f7966f;
        }
        arrayList.add(0, e6.l.w0(arrayList2));
        arrayList3.add(Integer.valueOf(tVar2.f7966f));
        arrayList4.add(Integer.valueOf(tVar.f7966f));
        tVar.f7966f += tVar2.f7966f;
        tVar3.f7966f = Math.max(tVar3.f7966f, tVar4.f7966f);
        arrayList2.clear();
        tVar4.f7966f = 0;
        tVar2.f7966f = 0;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        r6.t tVar = new r6.t();
        r6.t tVar2 = new r6.t();
        ArrayList arrayList6 = new ArrayList();
        r6.t tVar3 = new r6.t();
        r6.t tVar4 = new r6.t();
        float f9 = m.f2157c;
        float f10 = m.f2155a;
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            p1.n0 b9 = ((p1.e0) list.get(i7)).b(j8);
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                r6.t tVar5 = tVar2;
                if (h0Var.K(f9) + tVar3.f7966f + b9.f7063f <= m2.a.h(j8)) {
                    arrayList3 = arrayList7;
                    tVar2 = tVar5;
                } else {
                    arrayList3 = arrayList7;
                    tVar2 = tVar5;
                    d(arrayList3, tVar2, h0Var, arrayList6, arrayList4, tVar4, arrayList5, tVar, tVar3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList3;
                tVar3.f7966f = h0Var.K(f9) + tVar3.f7966f;
            }
            arrayList6.add(b9);
            tVar3.f7966f += b9.f7063f;
            tVar4.f7966f = Math.max(tVar4.f7966f, b9.f7064g);
            i7++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList8 = arrayList3;
        if (arrayList6.isEmpty()) {
            arrayList = arrayList8;
        } else {
            float f11 = m.f2155a;
            arrayList = arrayList8;
            d(arrayList, tVar2, h0Var, arrayList6, arrayList4, tVar4, arrayList5, tVar, tVar3);
        }
        int max = Math.max(tVar.f7966f, m2.a.j(j8));
        int max2 = Math.max(tVar2.f7966f, m2.a.i(j8));
        float f12 = m.f2155a;
        return h0Var.C(max, max2, e6.v.f2827f, new e(arrayList, h0Var, max, arrayList5));
    }
}
