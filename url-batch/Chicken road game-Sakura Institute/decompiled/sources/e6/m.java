package e6;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m extends t6.a {
    public static ArrayList U(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static int V(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        r6.k.f(arrayList, "<this>");
        int size2 = arrayList.size();
        int i7 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i8 = size - 1;
        while (i7 <= i8) {
            int i9 = (i7 + i8) >>> 1;
            int v5 = a8.d.v((Comparable) arrayList.get(i9), comparable);
            if (v5 < 0) {
                i7 = i9 + 1;
            } else {
                if (v5 <= 0) {
                    return i9;
                }
                i8 = i9 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static int W(List list) {
        r6.k.f(list, "<this>");
        return list.size() - 1;
    }

    public static List X(Object... objArr) {
        r6.k.f(objArr, "elements");
        return objArr.length > 0 ? k.T(objArr) : u.f2826f;
    }

    public static ArrayList Y(Object... objArr) {
        r6.k.f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i(objArr, true));
    }

    public static void Z() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
