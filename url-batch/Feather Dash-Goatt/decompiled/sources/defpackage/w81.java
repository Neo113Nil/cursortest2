package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class w81 {
    public static final Comparator[] a;
    public static final r81 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new v81(new v81(i == 0 ? r10.e : r10.c));
            i++;
        }
        a = comparatorArr;
        b = r81.h;
    }

    public static final void a(l81 l81Var, ArrayList arrayList, a3 a3Var, a3 a3Var2, en0 en0Var) {
        h81 h81Var = l81Var.d;
        Object g = h81Var.d.g(p81.m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) a3Var2.invoke(l81Var)).booleanValue()) && ((Boolean) a3Var.invoke(l81Var)).booleanValue()) {
            arrayList.add(l81Var);
        }
        if (booleanValue) {
            en0Var.h(l81Var.g, b(l81Var, a3Var, a3Var2, l81.j(7, l81Var)));
            return;
        }
        List j = l81.j(7, l81Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((l81) j.get(i), arrayList, a3Var, a3Var2, en0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(l81 l81Var, a3 a3Var, a3 a3Var2, List list) {
        int i;
        en0 en0Var = r90.a;
        en0 en0Var2 = new en0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((l81) list.get(i2), arrayList, a3Var, a3Var2, en0Var2);
        }
        int i3 = 1;
        char c = l81Var.c.D == vc0.e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                l81 l81Var2 = (l81) arrayList.get(i4);
                if (i4 != 0) {
                    float f = l81Var2.h().b;
                    float f2 = l81Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            s11 s11Var = (s11) ((Pair) arrayList2.get(i6)).d;
                            float f3 = s11Var.b;
                            i = i3;
                            float f4 = s11Var.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new Pair(new s11(Math.max(s11Var.a, 0.0f), Math.max(s11Var.b, f), Math.min(s11Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).e));
                                ((List) ((Pair) arrayList2.get(i6)).e).add(l81Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new Pair(l81Var2.h(), zh.f(l81Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new Pair(l81Var2.h(), zh.f(l81Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        di.i(arrayList2, r10.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            di.i((List) pair.e, comparator);
            arrayList3.addAll((Collection) pair.e);
        }
        int i9 = i;
        di.i(arrayList3, new cj(i9, b));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            List list2 = (List) en0Var2.b(((l81) arrayList3.get(i10)).g);
            if (list2 != null) {
                if (((Boolean) a3Var2.invoke(arrayList3.get(i10))).booleanValue()) {
                    i10++;
                } else {
                    arrayList3.remove(i10);
                }
                arrayList3.addAll(i10, list2);
                i10 += list2.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }
}
