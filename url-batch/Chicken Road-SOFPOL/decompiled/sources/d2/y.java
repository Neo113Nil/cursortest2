package d2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f2223a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f2224b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new x(new x(i == 0 ? e.f2116c : e.f2115b));
            i++;
        }
        f2223a = comparatorArr;
        f2224b = r.f2186w;
    }

    public static final void a(n nVar, ArrayList arrayList, b1.e eVar, b1.e eVar2, o.x xVar) {
        j jVar = nVar.f2159d;
        Object g3 = jVar.f2150d.g(s.f2199m);
        if (g3 == null) {
            g3 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g3).booleanValue();
        if ((booleanValue || ((Boolean) eVar2.i(nVar)).booleanValue()) && ((Boolean) eVar.i(nVar)).booleanValue()) {
            arrayList.add(nVar);
        }
        if (booleanValue) {
            xVar.g(nVar.f2162g, b(nVar, eVar, eVar2, n.j(7, nVar)));
            return;
        }
        List j7 = n.j(7, nVar);
        int size = j7.size();
        for (int i = 0; i < size; i++) {
            a((n) j7.get(i), arrayList, eVar, eVar2, xVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[LOOP:1: B:11:0x0044->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[EDGE_INSN: B:30:0x00ee->B:31:0x00ee BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00e8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(n nVar, b1.e eVar, b1.e eVar2, List list) {
        o.x xVar = o.m.f5510a;
        o.x xVar2 = new o.x();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((n) list.get(i), arrayList, eVar, eVar2, xVar2);
        }
        char c8 = nVar.f2158c.f7660z == r2.l.f6530e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int t3 = s6.a.t(arrayList);
        if (t3 >= 0) {
            int i8 = 0;
            while (true) {
                n nVar2 = (n) arrayList.get(i8);
                if (i8 != 0) {
                    float f6 = nVar2.h().f2458b;
                    float f8 = nVar2.h().f2460d;
                    boolean z3 = f6 >= f8;
                    int t7 = s6.a.t(arrayList2);
                    if (t7 >= 0) {
                        int i9 = 0;
                        while (true) {
                            e1.c cVar = (e1.c) ((c6.f) arrayList2.get(i9)).f1747d;
                            float f9 = cVar.f2458b;
                            float f10 = cVar.f2460d;
                            boolean z7 = f9 >= f10;
                            if (!z3 && !z7 && Math.max(f6, f9) < Math.min(f8, f10)) {
                                arrayList2.set(i9, new c6.f(new e1.c(Math.max(cVar.f2457a, 0.0f), Math.max(cVar.f2458b, f6), Math.min(cVar.f2459c, Float.POSITIVE_INFINITY), Math.min(f10, f8)), ((c6.f) arrayList2.get(i9)).f1748e));
                                ((List) ((c6.f) arrayList2.get(i9)).f1748e).add(nVar2);
                                break;
                            }
                            if (i9 == t7) {
                                break;
                            }
                            i9++;
                        }
                        if (i8 != t3) {
                            break;
                        }
                        i8++;
                    }
                }
                arrayList2.add(new c6.f(nVar2.h(), s6.a.z(nVar2)));
                if (i8 != t3) {
                }
            }
        }
        d6.q.N(arrayList2, e.f2117d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f2223a[c8 ^ 1];
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            c6.f fVar = (c6.f) arrayList2.get(i10);
            d6.q.N((List) fVar.f1748e, comparator);
            arrayList3.addAll((Collection) fVar.f1748e);
        }
        d6.q.N(arrayList3, new w(0, f2224b));
        int i11 = 0;
        while (i11 <= s6.a.t(arrayList3)) {
            List list2 = (List) xVar2.b(((n) arrayList3.get(i11)).f2162g);
            if (list2 != null) {
                if (((Boolean) eVar2.i(arrayList3.get(i11))).booleanValue()) {
                    i11++;
                } else {
                    arrayList3.remove(i11);
                }
                arrayList3.addAll(i11, list2);
                i11 += list2.size();
            } else {
                i11++;
            }
        }
        return arrayList3;
    }
}
