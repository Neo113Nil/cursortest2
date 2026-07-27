package z2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1441y extends C1440x {
    public static ArrayList b(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1432p(elements, true));
    }

    public static int c(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size2 = arrayList.size();
        int i2 = 0;
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i4 = size - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int a4 = B2.b.a((Comparable) arrayList.get(i5), comparable);
            if (a4 < 0) {
                i2 = i5 + 1;
            } else {
                if (a4 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C1436t.b(elements) : C1405I.f11931d;
    }

    public static ArrayList f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1432p(elements, true));
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
