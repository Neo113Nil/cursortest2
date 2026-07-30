package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class li2 {
    public static final Comparator[] a;
    public static final fi2 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new ki2(new ki2(i == 0 ? zo0.e : zo0.c));
            i++;
        }
        a = comparatorArr;
        b = fi2.A;
    }

    public static final void a(ai2 ai2Var, ArrayList arrayList, j6 j6Var, j6 j6Var2, zm1 zm1Var) {
        sh2 sh2Var = ai2Var.d;
        Object g = sh2Var.m.g(gi2.m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) j6Var2.invoke(ai2Var)).booleanValue()) && ((Boolean) j6Var.invoke(ai2Var)).booleanValue()) {
            arrayList.add(ai2Var);
        }
        if (booleanValue) {
            zm1Var.h(ai2Var.g, b(ai2Var, j6Var, j6Var2, ai2.j(7, ai2Var)));
            return;
        }
        List j = ai2.j(7, ai2Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((ai2) j.get(i), arrayList, j6Var, j6Var2, zm1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(ai2 ai2Var, j6 j6Var, j6 j6Var2, List list) {
        int i;
        zm1 zm1Var = r31.a;
        zm1 zm1Var2 = new zm1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((ai2) list.get(i2), arrayList, j6Var, j6Var2, zm1Var2);
        }
        int i3 = 1;
        char c = ai2Var.c.J == u81.n ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                ai2 ai2Var2 = (ai2) arrayList.get(i4);
                if (i4 != 0) {
                    float f = ai2Var2.h().b;
                    float f2 = ai2Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            w72 w72Var = (w72) ((Pair) arrayList2.get(i6)).m;
                            float f3 = w72Var.b;
                            i = i3;
                            float f4 = w72Var.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new Pair(new w72(Math.max(w72Var.a, 0.0f), Math.max(w72Var.b, f), Math.min(w72Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).n));
                                ((List) ((Pair) arrayList2.get(i6)).n).add(ai2Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new Pair(ai2Var2.h(), qv.h(ai2Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new Pair(ai2Var2.h(), qv.h(ai2Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        uv.n(arrayList2, zo0.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            uv.n((List) pair.n, comparator);
            arrayList3.addAll((Collection) pair.n);
        }
        int i9 = i;
        uv.n(arrayList3, new ax(i9, b));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            List list2 = (List) zm1Var2.b(((ai2) arrayList3.get(i10)).g);
            if (list2 != null) {
                if (((Boolean) j6Var2.invoke(arrayList3.get(i10))).booleanValue()) {
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
