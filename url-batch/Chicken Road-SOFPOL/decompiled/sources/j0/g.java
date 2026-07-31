package j0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g implements u1.e0 {
    public static final void a(ArrayList arrayList, q6.q qVar, w1.n0 n0Var, ArrayList arrayList2, ArrayList arrayList3, q6.q qVar2, ArrayList arrayList4, q6.q qVar3, q6.q qVar4) {
        float f6 = j.f3709d;
        if (!arrayList.isEmpty()) {
            qVar.f6203d = n0Var.H(f6) + qVar.f6203d;
        }
        arrayList.add(0, d6.m.g0(arrayList2));
        arrayList3.add(Integer.valueOf(qVar2.f6203d));
        arrayList4.add(Integer.valueOf(qVar.f6203d));
        qVar.f6203d += qVar2.f6203d;
        qVar3.f6203d = Math.max(qVar3.f6203d, qVar4.f6203d);
        arrayList2.clear();
        qVar4.f6203d = 0;
        qVar2.f6203d = 0;
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        q6.q qVar = new q6.q();
        q6.q qVar2 = new q6.q();
        ArrayList arrayList6 = new ArrayList();
        q6.q qVar3 = new q6.q();
        q6.q qVar4 = new q6.q();
        float f6 = j.f3708c;
        float f8 = j.f3706a;
        int size = list.size();
        int i = 0;
        while (i < size) {
            u1.l0 e8 = ((u1.d0) list.get(i)).e(j7);
            if (!arrayList6.isEmpty()) {
                ArrayList arrayList7 = arrayList3;
                q6.q qVar5 = qVar2;
                if (n0Var.H(f6) + qVar3.f6203d + e8.f7230d <= r2.a.h(j7)) {
                    arrayList3 = arrayList7;
                    qVar2 = qVar5;
                } else {
                    arrayList3 = arrayList7;
                    qVar2 = qVar5;
                    a(arrayList3, qVar2, n0Var, arrayList6, arrayList4, qVar4, arrayList5, qVar, qVar3);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = arrayList3;
                qVar3.f6203d = n0Var.H(f6) + qVar3.f6203d;
            }
            arrayList6.add(e8);
            qVar3.f6203d += e8.f7230d;
            qVar4.f6203d = Math.max(qVar4.f6203d, e8.f7231e);
            i++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList8 = arrayList3;
        if (arrayList6.isEmpty()) {
            arrayList = arrayList8;
        } else {
            float f9 = j.f3706a;
            arrayList = arrayList8;
            a(arrayList, qVar2, n0Var, arrayList6, arrayList4, qVar4, arrayList5, qVar, qVar3);
        }
        int max = Math.max(qVar.f6203d, r2.a.j(j7));
        int max2 = Math.max(qVar2.f6203d, r2.a.i(j7));
        float f10 = j.f3706a;
        return n0Var.e0(max, max2, d6.v.f2327d, new f(arrayList, n0Var, max, arrayList5));
    }
}
