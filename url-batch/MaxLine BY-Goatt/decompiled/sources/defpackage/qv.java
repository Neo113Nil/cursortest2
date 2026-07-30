package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class qv extends pv {
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ai(objArr, true));
    }

    public static int e(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        j(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int a = bx.a((Comparable) arrayList.get(i3), comparable);
            if (a < 0) {
                i2 = i3 + 1;
            } else {
                if (a <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int f(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List g(Object... objArr) {
        if (objArr.length <= 0) {
            return ah0.m;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static ArrayList h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new ai(objArr, true));
    }

    public static final List i(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : pv.c(list.get(0)) : ah0.m;
    }

    public static final void j(int i, int i2) {
        if (i2 < 0) {
            lh.e(in1.l(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            ch2.e(i2, i, ") is greater than size (", "toIndex (");
        }
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
