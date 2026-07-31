package S1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends O2.l {
    public static List A0(Object... objArr) {
        f2.j.f(objArr, "elements");
        return objArr.length > 0 ? k.h0(objArr) : u.f4320d;
    }

    public static ArrayList B0(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList C0(Object... objArr) {
        f2.j.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static void D0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList x0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static int y0(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        f2.j.f(arrayList, "<this>");
        int size2 = arrayList.size();
        int i3 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i4 = size - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int T3 = O2.l.T((Comparable) arrayList.get(i5), comparable);
            if (T3 < 0) {
                i3 = i5 + 1;
            } else {
                if (T3 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static int z0(List list) {
        f2.j.f(list, "<this>");
        return list.size() - 1;
    }
}
