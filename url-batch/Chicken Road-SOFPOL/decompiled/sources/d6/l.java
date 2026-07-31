package d6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends a.a {
    public static boolean E(Object[] objArr, Object obj) {
        return P(objArr, obj) >= 0;
    }

    public static void F(int i, int i8, int i9, int[] iArr, int[] iArr2) {
        q6.i.e(iArr, "<this>");
        q6.i.e(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i, i9 - i8);
    }

    public static void G(long[] jArr, long[] jArr2, int i, int i8, int i9) {
        q6.i.e(jArr, "<this>");
        q6.i.e(jArr2, "destination");
        System.arraycopy(jArr, i8, jArr2, i, i9 - i8);
    }

    public static void H(Object[] objArr, Object[] objArr2, int i, int i8, int i9) {
        q6.i.e(objArr, "<this>");
        q6.i.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i, i9 - i8);
    }

    public static /* synthetic */ void I(int i, int i8, int i9, int[] iArr, int[] iArr2) {
        if ((i9 & 2) != 0) {
            i = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        F(i, 0, i8, iArr, iArr2);
    }

    public static /* synthetic */ void J(Object[] objArr, Object[] objArr2, int i, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i = 0;
        }
        H(objArr, objArr2, 0, i, i8);
    }

    public static Object[] K(Object[] objArr, int i, int i8) {
        q6.i.e(objArr, "<this>");
        int length = objArr.length;
        if (i8 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i8);
            q6.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i8 + ") is greater than size (" + length + ").");
    }

    public static void L(Object[] objArr, int i, int i8) {
        q6.i.e(objArr, "<this>");
        Arrays.fill(objArr, i, i8, (Object) null);
    }

    public static void M(long[] jArr, long j7) {
        int length = jArr.length;
        q6.i.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j7);
    }

    public static ArrayList N(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int O(long[] jArr) {
        q6.i.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int P(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void Q(Object[] objArr, Comparator comparator, int i, int i8) {
        q6.i.e(objArr, "<this>");
        q6.i.e(comparator, "comparator");
        Arrays.sort(objArr, i, i8, comparator);
    }

    public static List R(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : s6.a.x(objArr[0]) : u.f2326d;
    }
}
