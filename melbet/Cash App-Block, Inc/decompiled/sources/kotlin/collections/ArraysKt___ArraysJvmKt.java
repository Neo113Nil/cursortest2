package kotlin.collections;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class ArraysKt___ArraysJvmKt extends ArraysKt__ArraysKt {
    public static List asList(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void copyInto(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        copyInto(i, bArr, i2, bArr2, i3);
    }

    public static Object[] copyOfRange(int i, int i2, Object[] objArr) {
        objArr.getClass();
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static void fill(Object[] objArr, int i, int i2, Object obj) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void fill$default(int i, int[] iArr) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i);
    }

    public static Object[] plus(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Integer[] toTypedArray(int[] iArr) {
        iArr.getClass();
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static void fill$default(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static void copyInto(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void copyInto(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void copyInto(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static byte[] copyOfRange(byte[] bArr, int i, int i2) {
        bArr.getClass();
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static int[] copyOfRange(int[] iArr, int i, int i2) {
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static byte[] plus(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static /* synthetic */ void copyInto$default(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        copyInto(0, i, i2, objArr, objArr2);
    }

    public static /* synthetic */ void copyInto$default(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        copyInto(i, iArr, 0, i2, iArr2);
    }

    public static /* synthetic */ void copyInto$default(int i, long[] jArr, int i2, long[] jArr2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = jArr.length;
        }
        copyInto(i, jArr, 0, jArr2, i2);
    }

    public static char[] plus(char[] cArr, char[] cArr2) {
        cArr.getClass();
        cArr2.getClass();
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        return copyOf;
    }
}
