package cn.hutool.core.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public class g0 {
    public static final int INDEX_NOT_FOUND = -1;

    public static byte[] addAll(byte[]... bArr) {
        if (bArr.length == 1) {
            return bArr[0];
        }
        int i8 = 0;
        for (byte[] bArr2 : bArr) {
            if (isNotEmpty(bArr2)) {
                i8 += bArr2.length;
            }
        }
        byte[] bArr3 = new byte[i8];
        int i9 = 0;
        for (byte[] bArr4 : bArr) {
            if (isNotEmpty(bArr4)) {
                System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                i9 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static boolean contains(long[] jArr, long j8) {
        return indexOf(jArr, j8) > -1;
    }

    public static int indexOf(long[] jArr, long j8) {
        if (!isNotEmpty(jArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < jArr.length; i8++) {
            if (j8 == jArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static boolean isEmpty(long[] jArr) {
        return jArr == null || jArr.length == 0;
    }

    public static boolean isNotEmpty(long[] jArr) {
        return !isEmpty(jArr);
    }

    public static boolean isSorted(byte[] bArr) {
        return isSortedASC(bArr);
    }

    public static boolean isSortedASC(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < bArr.length - 1) {
            byte b8 = bArr[i8];
            i8++;
            if (b8 > bArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < bArr.length - 1) {
            byte b8 = bArr[i8];
            i8++;
            if (b8 < bArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        if (!isNotEmpty(jArr)) {
            return -1;
        }
        for (int length = jArr.length - 1; length >= 0; length--) {
            if (j8 == jArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static long max(long... jArr) {
        if (isEmpty(jArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j8 < j9) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        if (isEmpty(jArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        long j8 = jArr[0];
        for (int i8 = 1; i8 < jArr.length; i8++) {
            long j9 = jArr[i8];
            if (j8 > j9) {
                j8 = j9;
            }
        }
        return j8;
    }

    public static int[] range(int i8) {
        return range(0, i8, 1);
    }

    public static long[] remove(long[] jArr, int i8) {
        return (long[]) remove((Object) jArr, i8);
    }

    public static long[] removeEle(long[] jArr, long j8) {
        return remove(jArr, indexOf(jArr, j8));
    }

    public static byte[] resize(byte[] bArr, int i8) {
        if (i8 < 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        if (i8 > 0 && isNotEmpty(bArr)) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i8));
        }
        return bArr2;
    }

    public static long[] reverse(long[] jArr, int i8, int i9) {
        if (isEmpty(jArr)) {
            return jArr;
        }
        int min = Math.min(jArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(jArr, max, min);
            min--;
        }
        return jArr;
    }

    public static int[] shuffle(int[] iArr) {
        return shuffle(iArr, (Random) i0.getRandom());
    }

    public static byte[][] split(byte[] bArr, int i8) {
        byte[] bArr2;
        int length = bArr.length / i8;
        int length2 = bArr.length % i8;
        if (length2 != 0) {
            length++;
        }
        byte[][] bArr3 = new byte[length][];
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 != length - 1 || length2 == 0) {
                bArr2 = new byte[i8];
                System.arraycopy(bArr, i9 * i8, bArr2, 0, i8);
            } else {
                bArr2 = new byte[length2];
                System.arraycopy(bArr, i9 * i8, bArr2, 0, length2);
            }
            bArr3[i9] = bArr2;
        }
        return bArr3;
    }

    public static byte[] sub(byte[] bArr, int i8, int i9) {
        int length = Array.getLength(bArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new byte[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i9, length);
    }

    public static int[] swap(int[] iArr, int i8, int i9) {
        if (isEmpty(iArr)) {
            throw new IllegalArgumentException("Number array must not empty !");
        }
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
        return iArr;
    }

    public static int[] unWrap(Integer... numArr) {
        if (numArr == null) {
            return null;
        }
        int length = numArr.length;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = ((Integer) e0.defaultIfNull((int) numArr[i8], 0)).intValue();
        }
        return iArr;
    }

    public static Integer[] wrap(int... iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        if (length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[length];
        for (int i8 = 0; i8 < length; i8++) {
            numArr[i8] = Integer.valueOf(iArr[i8]);
        }
        return numArr;
    }

    public static boolean contains(int[] iArr, int i8) {
        return indexOf(iArr, i8) > -1;
    }

    public static boolean isEmpty(int[] iArr) {
        return iArr == null || iArr.length == 0;
    }

    public static boolean isNotEmpty(int[] iArr) {
        return !isEmpty(iArr);
    }

    public static boolean isSorted(short[] sArr) {
        return isSortedASC(sArr);
    }

    public static int[] range(int i8, int i9) {
        return range(i8, i9, 1);
    }

    public static int[] remove(int[] iArr, int i8) {
        return (int[]) remove((Object) iArr, i8);
    }

    public static int[] removeEle(int[] iArr, int i8) {
        return remove(iArr, indexOf(iArr, i8));
    }

    public static int[] shuffle(int[] iArr, Random random) {
        if (iArr != null && random != null && iArr.length > 1) {
            for (int length = iArr.length; length > 1; length--) {
                swap(iArr, length - 1, random.nextInt(length));
            }
        }
        return iArr;
    }

    public static boolean contains(short[] sArr, short s7) {
        return indexOf(sArr, s7) > -1;
    }

    public static boolean isEmpty(short[] sArr) {
        return sArr == null || sArr.length == 0;
    }

    public static boolean isNotEmpty(short[] sArr) {
        return !isEmpty(sArr);
    }

    public static boolean isSorted(char[] cArr) {
        return isSortedASC(cArr);
    }

    public static boolean isSortedASC(short[] sArr) {
        if (sArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < sArr.length - 1) {
            short s7 = sArr[i8];
            i8++;
            if (s7 > sArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(short[] sArr) {
        if (sArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < sArr.length - 1) {
            short s7 = sArr[i8];
            i8++;
            if (s7 < sArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int[] range(int i8, int i9, int i10) {
        if (i8 > i9) {
            i9 = i8;
            i8 = i9;
        }
        if (i10 <= 0) {
            i10 = 1;
        }
        int i11 = i9 - i8;
        int i12 = i11 / i10;
        if (i11 % i10 != 0) {
            i12++;
        }
        int[] iArr = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i13] = i8;
            i8 += i10;
        }
        return iArr;
    }

    public static short[] remove(short[] sArr, int i8) {
        return (short[]) remove((Object) sArr, i8);
    }

    public static short[] removeEle(short[] sArr, short s7) {
        return remove(sArr, indexOf(sArr, s7));
    }

    public static int[] sub(int[] iArr, int i8, int i9) {
        int length = Array.getLength(iArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new int[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new int[0];
        }
        return Arrays.copyOfRange(iArr, i9, length);
    }

    public static boolean contains(char[] cArr, char c8) {
        return indexOf(cArr, c8) > -1;
    }

    public static int indexOf(int[] iArr, int i8) {
        if (!isNotEmpty(iArr)) {
            return -1;
        }
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (i8 == iArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public static boolean isEmpty(char[] cArr) {
        return cArr == null || cArr.length == 0;
    }

    public static boolean isNotEmpty(char[] cArr) {
        return !isEmpty(cArr);
    }

    public static boolean isSorted(int[] iArr) {
        return isSortedASC(iArr);
    }

    public static int lastIndexOf(int[] iArr, int i8) {
        if (!isNotEmpty(iArr)) {
            return -1;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (i8 == iArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static char[] remove(char[] cArr, int i8) {
        return (char[]) remove((Object) cArr, i8);
    }

    public static char[] removeEle(char[] cArr, char c8) {
        return remove(cArr, indexOf(cArr, c8));
    }

    public static long[] unWrap(Long... lArr) {
        if (lArr == null) {
            return null;
        }
        int length = lArr.length;
        if (length == 0) {
            return new long[0];
        }
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            jArr[i8] = ((Long) e0.defaultIfNull((long) lArr[i8], 0L)).longValue();
        }
        return jArr;
    }

    public static Long[] wrap(long... jArr) {
        if (jArr == null) {
            return null;
        }
        int length = jArr.length;
        if (length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[length];
        for (int i8 = 0; i8 < length; i8++) {
            lArr[i8] = Long.valueOf(jArr[i8]);
        }
        return lArr;
    }

    public static boolean contains(byte[] bArr, byte b8) {
        return indexOf(bArr, b8) > -1;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean isNotEmpty(byte[] bArr) {
        return !isEmpty(bArr);
    }

    public static boolean isSorted(long[] jArr) {
        return isSortedASC(jArr);
    }

    public static boolean isSortedASC(char[] cArr) {
        if (cArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < cArr.length - 1) {
            char c8 = cArr[i8];
            i8++;
            if (c8 > cArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(char[] cArr) {
        if (cArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < cArr.length - 1) {
            char c8 = cArr[i8];
            i8++;
            if (c8 < cArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] remove(byte[] bArr, int i8) {
        return (byte[]) remove((Object) bArr, i8);
    }

    public static byte[] removeEle(byte[] bArr, byte b8) {
        return remove(bArr, indexOf(bArr, b8));
    }

    public static long[] reverse(long[] jArr) {
        return reverse(jArr, 0, jArr.length);
    }

    public static long[] shuffle(long[] jArr) {
        return shuffle(jArr, (Random) i0.getRandom());
    }

    public static long[] sub(long[] jArr, int i8, int i9) {
        int length = Array.getLength(jArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new long[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new long[0];
        }
        return Arrays.copyOfRange(jArr, i9, length);
    }

    public static boolean contains(double[] dArr, double d8) {
        return indexOf(dArr, d8) > -1;
    }

    public static boolean isEmpty(double[] dArr) {
        return dArr == null || dArr.length == 0;
    }

    public static boolean isNotEmpty(double[] dArr) {
        return !isEmpty(dArr);
    }

    public static boolean isSorted(double[] dArr) {
        return isSortedASC(dArr);
    }

    public static int max(int... iArr) {
        if (!isEmpty(iArr)) {
            int i8 = iArr[0];
            for (int i9 = 1; i9 < iArr.length; i9++) {
                int i10 = iArr[i9];
                if (i8 < i10) {
                    i8 = i10;
                }
            }
            return i8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static int min(int... iArr) {
        if (!isEmpty(iArr)) {
            int i8 = iArr[0];
            for (int i9 = 1; i9 < iArr.length; i9++) {
                int i10 = iArr[i9];
                if (i8 > i10) {
                    i8 = i10;
                }
            }
            return i8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static double[] remove(double[] dArr, int i8) {
        return (double[]) remove((Object) dArr, i8);
    }

    public static double[] removeEle(double[] dArr, double d8) {
        return remove(dArr, indexOf(dArr, d8));
    }

    public static int[] reverse(int[] iArr, int i8, int i9) {
        if (isEmpty(iArr)) {
            return iArr;
        }
        int min = Math.min(iArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(iArr, max, min);
            min--;
        }
        return iArr;
    }

    public static long[] shuffle(long[] jArr, Random random) {
        if (jArr != null && random != null && jArr.length > 1) {
            for (int length = jArr.length; length > 1; length--) {
                swap(jArr, length - 1, random.nextInt(length));
            }
        }
        return jArr;
    }

    public static long[] swap(long[] jArr, int i8, int i9) {
        if (!isEmpty(jArr)) {
            long j8 = jArr[i8];
            jArr[i8] = jArr[i9];
            jArr[i9] = j8;
            return jArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static boolean contains(float[] fArr, float f8) {
        return indexOf(fArr, f8) > -1;
    }

    public static int indexOf(short[] sArr, short s7) {
        if (!isNotEmpty(sArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < sArr.length; i8++) {
            if (s7 == sArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static boolean isEmpty(float[] fArr) {
        return fArr == null || fArr.length == 0;
    }

    public static boolean isNotEmpty(float[] fArr) {
        return !isEmpty(fArr);
    }

    public static boolean isSorted(float[] fArr) {
        return isSortedASC(fArr);
    }

    public static boolean isSortedASC(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < iArr.length - 1) {
            int i9 = iArr[i8];
            i8++;
            if (i9 > iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < iArr.length - 1) {
            int i9 = iArr[i8];
            i8++;
            if (i9 < iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int lastIndexOf(short[] sArr, short s7) {
        if (!isNotEmpty(sArr)) {
            return -1;
        }
        for (int length = sArr.length - 1; length >= 0; length--) {
            if (s7 == sArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static float[] remove(float[] fArr, int i8) {
        return (float[]) remove((Object) fArr, i8);
    }

    public static float[] removeEle(float[] fArr, float f8) {
        return remove(fArr, indexOf(fArr, f8));
    }

    public static short[] sub(short[] sArr, int i8, int i9) {
        int length = Array.getLength(sArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new short[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new short[0];
        }
        return Arrays.copyOfRange(sArr, i9, length);
    }

    public static char[] unWrap(Character... chArr) {
        if (chArr == null) {
            return null;
        }
        int length = chArr.length;
        if (length == 0) {
            return new char[0];
        }
        char[] cArr = new char[length];
        for (int i8 = 0; i8 < length; i8++) {
            cArr[i8] = ((Character) e0.defaultIfNull((char) chArr[i8], (char) 0)).charValue();
        }
        return cArr;
    }

    public static Character[] wrap(char... cArr) {
        if (cArr == null) {
            return null;
        }
        int length = cArr.length;
        if (length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[length];
        for (int i8 = 0; i8 < length; i8++) {
            chArr[i8] = Character.valueOf(cArr[i8]);
        }
        return chArr;
    }

    public static boolean contains(boolean[] zArr, boolean z7) {
        return indexOf(zArr, z7) > -1;
    }

    public static boolean isEmpty(boolean[] zArr) {
        return zArr == null || zArr.length == 0;
    }

    public static boolean isNotEmpty(boolean[] zArr) {
        return !isEmpty(zArr);
    }

    public static boolean[] remove(boolean[] zArr, int i8) {
        return (boolean[]) remove((Object) zArr, i8);
    }

    public static boolean[] removeEle(boolean[] zArr, boolean z7) {
        return remove(zArr, indexOf(zArr, z7));
    }

    public static boolean isSortedASC(long[] jArr) {
        if (jArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < jArr.length - 1) {
            long j8 = jArr[i8];
            i8++;
            if (j8 > jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(long[] jArr) {
        if (jArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < jArr.length - 1) {
            long j8 = jArr[i8];
            i8++;
            if (j8 < jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static Object remove(Object obj, int i8) {
        if (obj == null) {
            return null;
        }
        int length = Array.getLength(obj);
        if (i8 < 0 || i8 >= length) {
            return obj;
        }
        int i9 = length - 1;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i9);
        System.arraycopy(obj, 0, newInstance, 0, i8);
        if (i8 < i9) {
            System.arraycopy(obj, i8 + 1, newInstance, i8, (length - i8) - 1);
        }
        return newInstance;
    }

    public static double[] shuffle(double[] dArr) {
        return shuffle(dArr, i0.getRandom());
    }

    public static char[] sub(char[] cArr, int i8, int i9) {
        int length = Array.getLength(cArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new char[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new char[0];
        }
        return Arrays.copyOfRange(cArr, i9, length);
    }

    public static int indexOf(char[] cArr, char c8) {
        if (!isNotEmpty(cArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < cArr.length; i8++) {
            if (c8 == cArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int lastIndexOf(char[] cArr, char c8) {
        if (!isNotEmpty(cArr)) {
            return -1;
        }
        for (int length = cArr.length - 1; length >= 0; length--) {
            if (c8 == cArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static int[] reverse(int[] iArr) {
        return reverse(iArr, 0, iArr.length);
    }

    public static double[] shuffle(double[] dArr, Random random) {
        if (dArr != null && random != null && dArr.length > 1) {
            for (int length = dArr.length; length > 1; length--) {
                swap(dArr, length - 1, random.nextInt(length));
            }
        }
        return dArr;
    }

    public static byte[] unWrap(Byte... bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = ((Byte) e0.defaultIfNull((byte) bArr[i8], (byte) 0)).byteValue();
        }
        return bArr2;
    }

    public static Byte[] wrap(byte... bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            bArr2[i8] = Byte.valueOf(bArr[i8]);
        }
        return bArr2;
    }

    public static int[] addAll(int[]... iArr) {
        if (iArr.length == 1) {
            return iArr[0];
        }
        int i8 = 0;
        for (int[] iArr2 : iArr) {
            if (isNotEmpty(iArr2)) {
                i8 += iArr2.length;
            }
        }
        int[] iArr3 = new int[i8];
        int i9 = 0;
        for (int[] iArr4 : iArr) {
            if (isNotEmpty(iArr4)) {
                System.arraycopy(iArr4, 0, iArr3, i9, iArr4.length);
                i9 += iArr4.length;
            }
        }
        return iArr3;
    }

    public static boolean isSortedASC(double[] dArr) {
        if (dArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < dArr.length - 1) {
            double d8 = dArr[i8];
            i8++;
            if (d8 > dArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(double[] dArr) {
        if (dArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < dArr.length - 1) {
            double d8 = dArr[i8];
            i8++;
            if (d8 < dArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static short max(short... sArr) {
        if (!isEmpty(sArr)) {
            short s7 = sArr[0];
            for (int i8 = 1; i8 < sArr.length; i8++) {
                short s8 = sArr[i8];
                if (s7 < s8) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static short min(short... sArr) {
        if (!isEmpty(sArr)) {
            short s7 = sArr[0];
            for (int i8 = 1; i8 < sArr.length; i8++) {
                short s8 = sArr[i8];
                if (s7 > s8) {
                    s7 = s8;
                }
            }
            return s7;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static short[] reverse(short[] sArr, int i8, int i9) {
        if (isEmpty(sArr)) {
            return sArr;
        }
        int min = Math.min(sArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(sArr, max, min);
            min--;
        }
        return sArr;
    }

    public static double[] sub(double[] dArr, int i8, int i9) {
        int length = Array.getLength(dArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new double[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new double[0];
        }
        return Arrays.copyOfRange(dArr, i9, length);
    }

    public static double[] swap(double[] dArr, int i8, int i9) {
        if (!isEmpty(dArr)) {
            double d8 = dArr[i8];
            dArr[i8] = dArr[i9];
            dArr[i9] = d8;
            return dArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static int indexOf(byte[] bArr, byte b8) {
        if (!isNotEmpty(bArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (b8 == bArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static boolean isSortedASC(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < fArr.length - 1) {
            float f8 = fArr[i8];
            i8++;
            if (f8 > fArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDESC(float[] fArr) {
        if (fArr == null) {
            return false;
        }
        int i8 = 0;
        while (i8 < fArr.length - 1) {
            float f8 = fArr[i8];
            i8++;
            if (f8 < fArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public static int lastIndexOf(byte[] bArr, byte b8) {
        if (!isNotEmpty(bArr)) {
            return -1;
        }
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (b8 == bArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static float[] shuffle(float[] fArr) {
        return shuffle(fArr, (Random) i0.getRandom());
    }

    public static float[] sub(float[] fArr, int i8, int i9) {
        int length = Array.getLength(fArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new float[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new float[0];
        }
        return Arrays.copyOfRange(fArr, i9, length);
    }

    public static short[] unWrap(Short... shArr) {
        if (shArr == null) {
            return null;
        }
        int length = shArr.length;
        if (length == 0) {
            return new short[0];
        }
        short[] sArr = new short[length];
        for (int i8 = 0; i8 < length; i8++) {
            sArr[i8] = ((Short) e0.defaultIfNull((short) shArr[i8], (short) 0)).shortValue();
        }
        return sArr;
    }

    public static Short[] wrap(short... sArr) {
        if (sArr == null) {
            return null;
        }
        int length = sArr.length;
        if (length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[length];
        for (int i8 = 0; i8 < length; i8++) {
            shArr[i8] = Short.valueOf(sArr[i8]);
        }
        return shArr;
    }

    public static float[] shuffle(float[] fArr, Random random) {
        if (fArr != null && random != null && fArr.length > 1) {
            for (int length = fArr.length; length > 1; length--) {
                swap(fArr, length - 1, random.nextInt(length));
            }
        }
        return fArr;
    }

    public static short[] reverse(short[] sArr) {
        return reverse(sArr, 0, sArr.length);
    }

    public static boolean[] sub(boolean[] zArr, int i8, int i9) {
        int length = Array.getLength(zArr);
        if (i8 < 0) {
            i8 += length;
        }
        if (i9 < 0) {
            i9 += length;
        }
        if (i8 == length) {
            return new boolean[0];
        }
        if (i8 <= i9) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        if (i8 <= length) {
            length = i8;
        } else if (i9 >= length) {
            return new boolean[0];
        }
        return Arrays.copyOfRange(zArr, i9, length);
    }

    public static int indexOf(double[] dArr, double d8) {
        if (!isNotEmpty(dArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < dArr.length; i8++) {
            if (d0.equals(d8, dArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d8) {
        if (!isNotEmpty(dArr)) {
            return -1;
        }
        for (int length = dArr.length - 1; length >= 0; length--) {
            if (d0.equals(d8, dArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static char max(char... cArr) {
        if (!isEmpty(cArr)) {
            char c8 = cArr[0];
            for (int i8 = 1; i8 < cArr.length; i8++) {
                char c9 = cArr[i8];
                if (c8 < c9) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static char min(char... cArr) {
        if (!isEmpty(cArr)) {
            char c8 = cArr[0];
            for (int i8 = 1; i8 < cArr.length; i8++) {
                char c9 = cArr[i8];
                if (c8 > c9) {
                    c8 = c9;
                }
            }
            return c8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static char[] reverse(char[] cArr, int i8, int i9) {
        if (isEmpty(cArr)) {
            return cArr;
        }
        int min = Math.min(cArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(cArr, max, min);
            min--;
        }
        return cArr;
    }

    public static float[] swap(float[] fArr, int i8, int i9) {
        if (!isEmpty(fArr)) {
            float f8 = fArr[i8];
            fArr[i8] = fArr[i9];
            fArr[i9] = f8;
            return fArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static float[] unWrap(Float... fArr) {
        if (fArr == null) {
            return null;
        }
        int length = fArr.length;
        if (length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[length];
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = ((Float) e0.defaultIfNull(fArr[i8], Float.valueOf(0.0f))).floatValue();
        }
        return fArr2;
    }

    public static Float[] wrap(float... fArr) {
        if (fArr == null) {
            return null;
        }
        int length = fArr.length;
        if (length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[length];
        for (int i8 = 0; i8 < length; i8++) {
            fArr2[i8] = Float.valueOf(fArr[i8]);
        }
        return fArr2;
    }

    public static boolean[] shuffle(boolean[] zArr) {
        return shuffle(zArr, i0.getRandom());
    }

    public static boolean[] shuffle(boolean[] zArr, Random random) {
        if (zArr != null && random != null && zArr.length > 1) {
            for (int length = zArr.length; length > 1; length--) {
                swap(zArr, length - 1, random.nextInt(length));
            }
        }
        return zArr;
    }

    public static int indexOf(float[] fArr, float f8) {
        if (!isNotEmpty(fArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < fArr.length; i8++) {
            if (d0.equals(f8, fArr[i8])) {
                return i8;
            }
        }
        return -1;
    }

    public static int lastIndexOf(float[] fArr, float f8) {
        if (!isNotEmpty(fArr)) {
            return -1;
        }
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (d0.equals(f8, fArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static double[] unWrap(Double... dArr) {
        if (dArr == null) {
            return null;
        }
        int length = dArr.length;
        if (length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = ((Double) e0.defaultIfNull(dArr[i8], Double.valueOf(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON))).doubleValue();
        }
        return dArr2;
    }

    public static Double[] wrap(double... dArr) {
        if (dArr == null) {
            return null;
        }
        int length = dArr.length;
        if (length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[length];
        for (int i8 = 0; i8 < length; i8++) {
            dArr2[i8] = Double.valueOf(dArr[i8]);
        }
        return dArr2;
    }

    public static char[] reverse(char[] cArr) {
        return reverse(cArr, 0, cArr.length);
    }

    public static long[] addAll(long[]... jArr) {
        if (jArr.length == 1) {
            return jArr[0];
        }
        int i8 = 0;
        for (long[] jArr2 : jArr) {
            if (isNotEmpty(jArr2)) {
                i8 += jArr2.length;
            }
        }
        long[] jArr3 = new long[i8];
        int i9 = 0;
        for (long[] jArr4 : jArr) {
            if (isNotEmpty(jArr4)) {
                System.arraycopy(jArr4, 0, jArr3, i9, jArr4.length);
                i9 += jArr4.length;
            }
        }
        return jArr3;
    }

    public static byte max(byte... bArr) {
        if (!isEmpty(bArr)) {
            byte b8 = bArr[0];
            for (int i8 = 1; i8 < bArr.length; i8++) {
                byte b9 = bArr[i8];
                if (b8 < b9) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static byte min(byte... bArr) {
        if (!isEmpty(bArr)) {
            byte b8 = bArr[0];
            for (int i8 = 1; i8 < bArr.length; i8++) {
                byte b9 = bArr[i8];
                if (b8 > b9) {
                    b8 = b9;
                }
            }
            return b8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static byte[] reverse(byte[] bArr, int i8, int i9) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        int min = Math.min(bArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(bArr, max, min);
            min--;
        }
        return bArr;
    }

    public static byte[] shuffle(byte[] bArr) {
        return shuffle(bArr, (Random) i0.getRandom());
    }

    public static boolean[] swap(boolean[] zArr, int i8, int i9) {
        if (!isEmpty(zArr)) {
            boolean z7 = zArr[i8];
            zArr[i8] = zArr[i9];
            zArr[i9] = z7;
            return zArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static int indexOf(boolean[] zArr, boolean z7) {
        if (!isNotEmpty(zArr)) {
            return -1;
        }
        for (int i8 = 0; i8 < zArr.length; i8++) {
            if (z7 == zArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z7) {
        if (!isNotEmpty(zArr)) {
            return -1;
        }
        for (int length = zArr.length - 1; length >= 0; length--) {
            if (z7 == zArr[length]) {
                return length;
            }
        }
        return -1;
    }

    public static byte[] shuffle(byte[] bArr, Random random) {
        if (bArr != null && random != null && bArr.length > 1) {
            for (int length = bArr.length; length > 1; length--) {
                swap(bArr, length - 1, random.nextInt(length));
            }
        }
        return bArr;
    }

    public static boolean[] unWrap(Boolean... boolArr) {
        if (boolArr == null) {
            return null;
        }
        int length = boolArr.length;
        if (length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            zArr[i8] = ((Boolean) e0.defaultIfNull(boolArr[i8], Boolean.FALSE)).booleanValue();
        }
        return zArr;
    }

    public static Boolean[] wrap(boolean... zArr) {
        if (zArr == null) {
            return null;
        }
        int length = zArr.length;
        if (length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            boolArr[i8] = Boolean.valueOf(zArr[i8]);
        }
        return boolArr;
    }

    public static byte[] reverse(byte[] bArr) {
        return reverse(bArr, 0, bArr.length);
    }

    public static char[] shuffle(char[] cArr) {
        return shuffle(cArr, (Random) i0.getRandom());
    }

    public static double max(double... dArr) {
        if (!isEmpty(dArr)) {
            double d8 = dArr[0];
            for (int i8 = 1; i8 < dArr.length; i8++) {
                double d9 = dArr[i8];
                if (d8 < d9) {
                    d8 = d9;
                }
            }
            return d8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static double min(double... dArr) {
        if (!isEmpty(dArr)) {
            double d8 = dArr[0];
            for (int i8 = 1; i8 < dArr.length; i8++) {
                double d9 = dArr[i8];
                if (d8 > d9) {
                    d8 = d9;
                }
            }
            return d8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static double[] reverse(double[] dArr, int i8, int i9) {
        if (isEmpty(dArr)) {
            return dArr;
        }
        int min = Math.min(dArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(dArr, max, min);
            min--;
        }
        return dArr;
    }

    public static char[] shuffle(char[] cArr, Random random) {
        if (cArr != null && random != null && cArr.length > 1) {
            for (int length = cArr.length; length > 1; length--) {
                swap(cArr, length - 1, random.nextInt(length));
            }
        }
        return cArr;
    }

    public static byte[] swap(byte[] bArr, int i8, int i9) {
        if (!isEmpty(bArr)) {
            byte b8 = bArr[i8];
            bArr[i8] = bArr[i9];
            bArr[i9] = b8;
            return bArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static short[] shuffle(short[] sArr) {
        return shuffle(sArr, (Random) i0.getRandom());
    }

    public static double[] reverse(double[] dArr) {
        return reverse(dArr, 0, dArr.length);
    }

    public static short[] shuffle(short[] sArr, Random random) {
        if (sArr != null && random != null && sArr.length > 1) {
            for (int length = sArr.length; length > 1; length--) {
                swap(sArr, length - 1, random.nextInt(length));
            }
        }
        return sArr;
    }

    public static double[] addAll(double[]... dArr) {
        if (dArr.length == 1) {
            return dArr[0];
        }
        int i8 = 0;
        for (double[] dArr2 : dArr) {
            if (isNotEmpty(dArr2)) {
                i8 += dArr2.length;
            }
        }
        double[] dArr3 = new double[i8];
        int i9 = 0;
        for (double[] dArr4 : dArr) {
            if (isNotEmpty(dArr4)) {
                System.arraycopy(dArr4, 0, dArr3, i9, dArr4.length);
                i9 += dArr4.length;
            }
        }
        return dArr3;
    }

    public static float max(float... fArr) {
        if (!isEmpty(fArr)) {
            float f8 = fArr[0];
            for (int i8 = 1; i8 < fArr.length; i8++) {
                float f9 = fArr[i8];
                if (f8 < f9) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static float min(float... fArr) {
        if (!isEmpty(fArr)) {
            float f8 = fArr[0];
            for (int i8 = 1; i8 < fArr.length; i8++) {
                float f9 = fArr[i8];
                if (f8 > f9) {
                    f8 = f9;
                }
            }
            return f8;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static float[] reverse(float[] fArr, int i8, int i9) {
        if (isEmpty(fArr)) {
            return fArr;
        }
        int min = Math.min(fArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(fArr, max, min);
            min--;
        }
        return fArr;
    }

    public static char[] swap(char[] cArr, int i8, int i9) {
        if (!isEmpty(cArr)) {
            char c8 = cArr[i8];
            cArr[i8] = cArr[i9];
            cArr[i9] = c8;
            return cArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static float[] reverse(float[] fArr) {
        return reverse(fArr, 0, fArr.length);
    }

    public static boolean[] reverse(boolean[] zArr, int i8, int i9) {
        if (isEmpty(zArr)) {
            return zArr;
        }
        int min = Math.min(zArr.length, i9) - 1;
        for (int max = Math.max(i8, 0); min > max; max++) {
            swap(zArr, max, min);
            min--;
        }
        return zArr;
    }

    public static short[] swap(short[] sArr, int i8, int i9) {
        if (!isEmpty(sArr)) {
            short s7 = sArr[i8];
            sArr[i8] = sArr[i9];
            sArr[i9] = s7;
            return sArr;
        }
        throw new IllegalArgumentException("Number array must not empty !");
    }

    public static boolean[] reverse(boolean[] zArr) {
        return reverse(zArr, 0, zArr.length);
    }

    public static float[] addAll(float[]... fArr) {
        if (fArr.length == 1) {
            return fArr[0];
        }
        int i8 = 0;
        for (float[] fArr2 : fArr) {
            if (isNotEmpty(fArr2)) {
                i8 += fArr2.length;
            }
        }
        float[] fArr3 = new float[i8];
        int i9 = 0;
        for (float[] fArr4 : fArr) {
            if (isNotEmpty(fArr4)) {
                System.arraycopy(fArr4, 0, fArr3, i9, fArr4.length);
                i9 += fArr4.length;
            }
        }
        return fArr3;
    }

    public static char[] addAll(char[]... cArr) {
        if (cArr.length == 1) {
            return cArr[0];
        }
        int i8 = 0;
        for (char[] cArr2 : cArr) {
            if (isNotEmpty(cArr2)) {
                i8 += cArr2.length;
            }
        }
        char[] cArr3 = new char[i8];
        int i9 = 0;
        for (char[] cArr4 : cArr) {
            if (isNotEmpty(cArr4)) {
                System.arraycopy(cArr4, 0, cArr3, i9, cArr4.length);
                i9 += cArr4.length;
            }
        }
        return cArr3;
    }

    public static boolean[] addAll(boolean[]... zArr) {
        if (zArr.length == 1) {
            return zArr[0];
        }
        int i8 = 0;
        for (boolean[] zArr2 : zArr) {
            if (isNotEmpty(zArr2)) {
                i8 += zArr2.length;
            }
        }
        boolean[] zArr3 = new boolean[i8];
        int i9 = 0;
        for (boolean[] zArr4 : zArr) {
            if (isNotEmpty(zArr4)) {
                System.arraycopy(zArr4, 0, zArr3, i9, zArr4.length);
                i9 += zArr4.length;
            }
        }
        return zArr3;
    }

    public static short[] addAll(short[]... sArr) {
        if (sArr.length == 1) {
            return sArr[0];
        }
        int i8 = 0;
        for (short[] sArr2 : sArr) {
            if (isNotEmpty(sArr2)) {
                i8 += sArr2.length;
            }
        }
        short[] sArr3 = new short[i8];
        int i9 = 0;
        for (short[] sArr4 : sArr) {
            if (isNotEmpty(sArr4)) {
                System.arraycopy(sArr4, 0, sArr3, i9, sArr4.length);
                i9 += sArr4.length;
            }
        }
        return sArr3;
    }
}
