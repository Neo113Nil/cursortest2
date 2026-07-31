package E0;

import a.AbstractC0086a;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0086a {
    public static void O(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        P0.h.e(objArr, "<this>");
        P0.h.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static Object[] P(Object[] objArr, int i2, int i3) {
        P0.h.e(objArr, "<this>");
        int length = objArr.length;
        if (i3 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
            P0.h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }
}
