package M1;

import a.AbstractC0157a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends AbstractC0157a {
    public static ArrayList Z(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static int a0(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Z1.i.f(arrayList, "<this>");
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
            int q2 = AbstractC0157a.q((Comparable) arrayList.get(i5), comparable);
            if (q2 < 0) {
                i3 = i5 + 1;
            } else {
                if (q2 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static int b0(List list) {
        Z1.i.f(list, "<this>");
        return list.size() - 1;
    }

    public static List c0(Object... objArr) {
        Z1.i.f(objArr, "elements");
        return objArr.length > 0 ? k.T(objArr) : u.f2803d;
    }

    public static ArrayList d0(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList e0(Object... objArr) {
        Z1.i.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static void f0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
