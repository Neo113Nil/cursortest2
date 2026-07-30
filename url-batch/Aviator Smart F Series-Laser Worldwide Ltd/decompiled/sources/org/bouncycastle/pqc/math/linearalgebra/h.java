package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public final class h {
    private h() {
    }

    public static int[] clone(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z7 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z7 &= iArr[length] == iArr2[length];
        }
        return z7;
    }

    public static void fill(int[] iArr, int i8) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i8;
        }
    }

    private static int partition(int[] iArr, int i8, int i9, int i10) {
        int i11 = iArr[i10];
        iArr[i10] = iArr[i9];
        iArr[i9] = i11;
        int i12 = i8;
        while (i8 < i9) {
            int i13 = iArr[i8];
            if (i13 <= i11) {
                int i14 = iArr[i12];
                iArr[i12] = i13;
                iArr[i8] = i14;
                i12++;
            }
            i8++;
        }
        int i15 = iArr[i12];
        iArr[i12] = iArr[i9];
        iArr[i9] = i15;
        return i12;
    }

    public static void quicksort(int[] iArr) {
        quicksort(iArr, 0, iArr.length - 1);
    }

    public static int[] subArray(int[] iArr, int i8, int i9) {
        int i10 = i9 - i8;
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, i8, iArr2, 0, i10);
        return iArr2;
    }

    public static String toHexString(int[] iArr) {
        return b.toHexString(a.toByteArray(iArr));
    }

    public static String toString(int[] iArr) {
        String str = "";
        for (int i8 : iArr) {
            str = str + i8 + cn.hutool.core.text.l.SPACE;
        }
        return str;
    }

    public static void quicksort(int[] iArr, int i8, int i9) {
        if (i9 > i8) {
            int partition = partition(iArr, i8, i9, i9);
            quicksort(iArr, i8, partition - 1);
            quicksort(iArr, partition + 1, i9);
        }
    }
}
