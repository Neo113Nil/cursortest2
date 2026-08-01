package a3;

import a.y;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class d extends y {
    public static void W(int i, int i4, int i5, int[] iArr, int[] iArr2) {
        f3.d.e(iArr, "<this>");
        f3.d.e(iArr2, "destination");
        System.arraycopy(iArr, i4, iArr2, i, i5 - i4);
    }

    public static void X(Object[] objArr, Object[] objArr2, int i, int i4, int i5) {
        f3.d.e(objArr, "<this>");
        f3.d.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i, i5 - i4);
    }

    public static /* synthetic */ void Y(Object[] objArr, Object[] objArr2, int i, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i = 0;
        }
        X(objArr, objArr2, 0, i, i4);
    }

    public static Object[] Z(Object[] objArr, int i, int i4) {
        f3.d.e(objArr, "<this>");
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i4);
            f3.d.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }
}
