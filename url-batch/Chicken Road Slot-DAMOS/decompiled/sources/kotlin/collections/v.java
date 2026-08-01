package kotlin.collections;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class v extends u {
    public static List b(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void c(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i10, iArr2, i3, i11 - i10);
    }

    public static void d(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i10, objArr2, i3, i11 - i10);
    }

    public static void e(long[] jArr, long[] jArr2, int i3, int i10, int i11) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i10, jArr2, i3, i11 - i10);
    }

    public static /* synthetic */ void f(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        if ((i11 & 2) != 0) {
            i3 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = iArr.length;
        }
        c(i3, 0, i10, iArr, iArr2);
    }

    public static /* synthetic */ void g(int i3, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i3 = 0;
        }
        d(0, i3, i10, objArr, objArr2);
    }

    public static Object[] h(Object[] objArr, int i3, int i10) {
        objArr.getClass();
        int length = objArr.length;
        if (i10 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i3, i10);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + length + ").");
    }

    public static void i(Object[] objArr, int i3, int i10) {
        objArr.getClass();
        Arrays.fill(objArr, i3, i10, (Object) null);
    }

    public static void j(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }
}
