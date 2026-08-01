package j2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f5027a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f5028b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i3 = 0;
        while (i3 < 2) {
            comparatorArr[i3] = new w(new w(i3 == 0 ? e.f4933i : e.f4932e));
            i3++;
        }
        f5027a = comparatorArr;
        f5028b = h.I;
    }

    public static final void a(m mVar, ArrayList arrayList, a3.e eVar, a3.e eVar2, s.w wVar) {
        j jVar = mVar.f4983d;
        Object g = jVar.f4975d.g(q.f5003m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) eVar2.invoke(mVar)).booleanValue()) && ((Boolean) eVar.invoke(mVar)).booleanValue()) {
            arrayList.add(mVar);
        }
        if (booleanValue) {
            wVar.h(mVar.f4985f, b(mVar, eVar, eVar2, m.j(7, mVar)));
            return;
        }
        List j = m.j(7, mVar);
        int size = j.size();
        for (int i3 = 0; i3 < size; i3++) {
            a((m) j.get(i3), arrayList, eVar, eVar2, wVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(m mVar, a3.e eVar, a3.e eVar2, List list) {
        int i3;
        s.w wVar = s.l.f8343a;
        s.w wVar2 = new s.w();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a((m) list.get(i10), arrayList, eVar, eVar2, wVar2);
        }
        int i11 = 1;
        char c10 = mVar.f4982c.M == x2.l.f10331e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i12 = 0;
            while (true) {
                m mVar2 = (m) arrayList.get(i12);
                if (i12 != 0) {
                    float f3 = mVar2.h().f4917b;
                    float f10 = mVar2.h().f4919d;
                    int i13 = f3 >= f10 ? i11 : 0;
                    int size3 = arrayList2.size() - i11;
                    if (size3 >= 0) {
                        int i14 = 0;
                        while (true) {
                            j1.c cVar = (j1.c) ((Pair) arrayList2.get(i14)).f5552d;
                            i3 = i11;
                            float f11 = cVar.f4917b;
                            float f12 = cVar.f4919d;
                            int i15 = f11 >= f12 ? i3 : 0;
                            if (i13 == 0 && i15 == 0 && Math.max(f3, f11) < Math.min(f10, f12)) {
                                arrayList2.set(i14, new Pair(new j1.c(Math.max(cVar.f4916a, 0.0f), Math.max(cVar.f4917b, f3), Math.min(cVar.f4918c, Float.POSITIVE_INFINITY), Math.min(f12, f10)), ((Pair) arrayList2.get(i14)).f5553e));
                                ((List) ((Pair) arrayList2.get(i14)).f5553e).add(mVar2);
                                break;
                            }
                            if (i14 == size3) {
                                break;
                            }
                            i14++;
                            i11 = i3;
                        }
                        arrayList2.add(new Pair(mVar2.h(), y.g(mVar2)));
                        if (i12 != size2) {
                            break;
                        }
                        i12++;
                        i11 = i3;
                    }
                }
                i3 = i11;
                arrayList2.add(new Pair(mVar2.h(), y.g(mVar2)));
                if (i12 != size2) {
                }
            }
        }
        c0.k(arrayList2, e.f4934r);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f5027a[c10 ^ 1];
        int size4 = arrayList2.size();
        for (int i16 = 0; i16 < size4; i16++) {
            Pair pair = (Pair) arrayList2.get(i16);
            c0.k((List) pair.f5553e, comparator);
            arrayList3.addAll((Collection) pair.f5553e);
        }
        c0.k(arrayList3, new v(0, f5028b));
        int i17 = 0;
        while (i17 <= arrayList3.size() - 1) {
            List list2 = (List) wVar2.b(((m) arrayList3.get(i17)).f4985f);
            if (list2 != null) {
                if (((Boolean) eVar2.invoke(arrayList3.get(i17))).booleanValue()) {
                    i17++;
                } else {
                    arrayList3.remove(i17);
                }
                arrayList3.addAll(i17, list2);
                i17 += list2.size();
            } else {
                i17++;
            }
        }
        return arrayList3;
    }
}
