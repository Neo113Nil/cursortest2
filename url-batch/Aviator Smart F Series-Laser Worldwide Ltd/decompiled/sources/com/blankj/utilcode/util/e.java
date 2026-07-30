package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    public static final int INDEX_NOT_FOUND = -1;

    public interface a {
        void a(int i8, Object obj);
    }

    private e() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T t7) {
        return (T[]) ((Object[]) realAddOne(tArr, t7, tArr != null ? tArr.getClass() : t7 != null ? t7.getClass() : Object.class));
    }

    @NonNull
    public static <T> List<T> asArrayList(@Nullable T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    @NonNull
    public static <T> List<T> asLinkedList(@Nullable T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    @NonNull
    public static <T> List<T> asList(@Nullable T... tArr) {
        return (tArr == null || tArr.length == 0) ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @NonNull
    public static <T> List<T> asUnmodifiableList(@Nullable T... tArr) {
        return Collections.unmodifiableList(asList(tArr));
    }

    public static boolean contains(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    @Nullable
    public static <T> T[] copy(@Nullable T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    public static boolean equals(@Nullable Object[] objArr, @Nullable Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    public static <E> void forAllDo(@Nullable Object obj, @Nullable a aVar) {
        if (obj == null || aVar == null) {
            return;
        }
        int i8 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i8 < length) {
                aVar.a(i8, objArr[i8]);
                i8++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i8 < length2) {
                aVar.a(i8, zArr[i8] ? Boolean.TRUE : Boolean.FALSE);
                i8++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (i8 < length3) {
                aVar.a(i8, Byte.valueOf(bArr[i8]));
                i8++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (i8 < length4) {
                aVar.a(i8, Character.valueOf(cArr[i8]));
                i8++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (i8 < length5) {
                aVar.a(i8, Short.valueOf(sArr[i8]));
                i8++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length6 = iArr.length;
            while (i8 < length6) {
                aVar.a(i8, Integer.valueOf(iArr[i8]));
                i8++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (i8 < length7) {
                aVar.a(i8, Long.valueOf(jArr[i8]));
                i8++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (i8 < length8) {
                aVar.a(i8, Float.valueOf(fArr[i8]));
                i8++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            throw new IllegalArgumentException("Not an array: " + obj.getClass());
        }
        double[] dArr = (double[]) obj;
        int length9 = dArr.length;
        while (i8 < length9) {
            aVar.a(i8, Double.valueOf(dArr[i8]));
            i8++;
        }
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i8) {
        return get(obj, i8, null);
    }

    public static int getLength(@Nullable Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static boolean isEmpty(@Nullable Object obj) {
        return getLength(obj) == 0;
    }

    public static boolean isSameLength(@Nullable Object obj, @Nullable Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    @NonNull
    public static <T> T[] newArray(T... tArr) {
        return tArr;
    }

    @NonNull
    public static boolean[] newBooleanArray(boolean... zArr) {
        return zArr;
    }

    @NonNull
    public static byte[] newByteArray(byte... bArr) {
        return bArr;
    }

    @NonNull
    public static char[] newCharArray(char... cArr) {
        return cArr;
    }

    @NonNull
    public static double[] newDoubleArray(double... dArr) {
        return dArr;
    }

    @NonNull
    public static float[] newFloatArray(float... fArr) {
        return fArr;
    }

    @NonNull
    public static int[] newIntArray(int... iArr) {
        return iArr;
    }

    @NonNull
    public static long[] newLongArray(long... jArr) {
        return jArr;
    }

    @NonNull
    public static short[] newShortArray(short... sArr) {
        return sArr;
    }

    @NonNull
    private static Object realAdd(@Nullable Object obj, int i8, @Nullable Object obj2, Class cls) {
        if (obj == null) {
            if (i8 == 0) {
                Object newInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(newInstance, 0, obj2);
                return newInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i8 > length || i8 < 0) {
            throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + length);
        }
        Object newInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, newInstance2, 0, i8);
        Array.set(newInstance2, i8, obj2);
        if (i8 < length) {
            System.arraycopy(obj, i8, newInstance2, i8 + 1, length - i8);
        }
        return newInstance2;
    }

    private static Object realAddArr(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    @NonNull
    private static Object realAddOne(@Nullable Object obj, @Nullable Object obj2, Class cls) {
        Object newInstance;
        int i8 = 0;
        if (obj != null) {
            int length = getLength(obj);
            newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, newInstance, 0, length);
            i8 = length;
        } else {
            newInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(newInstance, i8, obj2);
        return newInstance;
    }

    @Nullable
    private static Object realCopy(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    @Nullable
    private static Object realSubArray(@Nullable Object obj, int i8, int i9) {
        if (obj == null) {
            return null;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        int length = getLength(obj);
        if (i9 > length) {
            i9 = length;
        }
        int i10 = i9 - i8;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i10 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object newInstance = Array.newInstance(componentType, i10);
        System.arraycopy(obj, i8, newInstance, 0, i10);
        return newInstance;
    }

    @Nullable
    public static Object[] remove(@Nullable Object[] objArr, int i8) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, i8);
    }

    @Nullable
    public static Object[] removeElement(@Nullable Object[] objArr, @Nullable Object obj) {
        int indexOf = indexOf(objArr, obj);
        return indexOf == -1 ? copy(objArr) : remove(objArr, indexOf);
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            T t7 = tArr[length];
            tArr[length] = tArr[i8];
            tArr[i8] = t7;
            length--;
        }
    }

    public static void set(@Nullable Object obj, int i8, @Nullable Object obj2) {
        if (obj == null) {
            return;
        }
        Array.set(obj, i8, obj2);
    }

    public static <T> void sort(@Nullable T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    @Nullable
    public static <T> T[] subArray(@Nullable T[] tArr, int i8, int i9) {
        return (T[]) ((Object[]) realSubArray(tArr, i8, i9));
    }

    @Nullable
    public static Character[] toObject(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int i8 = 0; i8 < cArr.length; i8++) {
            chArr[i8] = new Character(cArr[i8]);
        }
        return chArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i8 = 0; i8 < chArr.length; i8++) {
            cArr[i8] = chArr[i8].charValue();
        }
        return cArr;
    }

    @NonNull
    public static String toString(@Nullable Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }

    public static boolean contains(@Nullable long[] jArr, long j8) {
        return indexOf(jArr, j8) != -1;
    }

    @Nullable
    public static long[] copy(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @Nullable
    public static Object get(@Nullable Object obj, int i8, @Nullable Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i8);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static int indexOf(@Nullable Object[] objArr, @Nullable Object obj, int i8) {
        if (objArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if (obj == null) {
            while (i8 < objArr.length) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8++;
            }
        } else {
            while (i8 < objArr.length) {
                if (obj.equals(objArr[i8])) {
                    return i8;
                }
                i8++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable Object[] objArr, @Nullable Object obj, int i8) {
        if (objArr == null || i8 < 0) {
            return -1;
        }
        if (i8 >= objArr.length) {
            i8 = objArr.length - 1;
        }
        if (obj == null) {
            while (i8 >= 0) {
                if (objArr[i8] == null) {
                    return i8;
                }
                i8--;
            }
        } else {
            while (i8 >= 0) {
                if (obj.equals(objArr[i8])) {
                    return i8;
                }
                i8--;
            }
        }
        return -1;
    }

    @Nullable
    public static boolean[] remove(@Nullable boolean[] zArr, int i8) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, i8);
    }

    @Nullable
    public static long[] subArray(@Nullable long[] jArr, int i8, int i9) {
        return (long[]) realSubArray(jArr, i8, i9);
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, boolean z7) {
        return (boolean[]) realAddOne(zArr, Boolean.valueOf(z7), Boolean.TYPE);
    }

    public static boolean contains(@Nullable int[] iArr, int i8) {
        return indexOf(iArr, i8) != -1;
    }

    @Nullable
    public static int[] copy(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return subArray(iArr, 0, iArr.length);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @Nullable
    public static byte[] remove(@Nullable byte[] bArr, int i8) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, i8);
    }

    public static void sort(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    @Nullable
    public static int[] subArray(@Nullable int[] iArr, int i8, int i9) {
        return (int[]) realSubArray(iArr, i8, i9);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, byte b8) {
        return (byte[]) realAddOne(bArr, Byte.valueOf(b8), Byte.TYPE);
    }

    public static boolean contains(@Nullable short[] sArr, short s7) {
        return indexOf(sArr, s7) != -1;
    }

    @Nullable
    public static short[] copy(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @Nullable
    public static char[] remove(@Nullable char[] cArr, int i8) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, i8);
    }

    @Nullable
    public static boolean[] removeElement(@Nullable boolean[] zArr, boolean z7) {
        int indexOf = indexOf(zArr, z7);
        if (indexOf == -1) {
            return copy(zArr);
        }
        return remove(zArr, indexOf);
    }

    @Nullable
    public static short[] subArray(@Nullable short[] sArr, int i8, int i9) {
        return (short[]) realSubArray(sArr, i8, i9);
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, char c8) {
        return (char[]) realAddOne(cArr, Character.valueOf(c8), Character.TYPE);
    }

    public static boolean contains(@Nullable char[] cArr, char c8) {
        return indexOf(cArr, c8) != -1;
    }

    @Nullable
    public static char[] copy(@Nullable char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @Nullable
    public static double[] remove(@Nullable double[] dArr, int i8) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, i8);
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            long j8 = jArr[length];
            jArr[length] = jArr[i8];
            jArr[i8] = j8;
            length--;
        }
    }

    public static void sort(@Nullable char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        Arrays.sort(cArr);
    }

    @Nullable
    public static char[] subArray(@Nullable char[] cArr, int i8, int i9) {
        return (char[]) realSubArray(cArr, i8, i9);
    }

    @Nullable
    public static Long[] toObject(@Nullable long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int i8 = 0; i8 < jArr.length; i8++) {
            lArr[i8] = new Long(jArr[i8]);
        }
        return lArr;
    }

    @Nullable
    public static char[] toPrimitive(@Nullable Character[] chArr, char c8) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i8 = 0; i8 < chArr.length; i8++) {
            Character ch = chArr[i8];
            cArr[i8] = ch == null ? c8 : ch.charValue();
        }
        return cArr;
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, double d8) {
        return (double[]) realAddOne(dArr, Double.valueOf(d8), Double.TYPE);
    }

    public static boolean contains(@Nullable byte[] bArr, byte b8) {
        return indexOf(bArr, b8) != -1;
    }

    @Nullable
    public static byte[] copy(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static int indexOf(@Nullable long[] jArr, long j8) {
        return indexOf(jArr, j8, 0);
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j8) {
        return lastIndexOf(jArr, j8, Integer.MAX_VALUE);
    }

    @Nullable
    public static float[] remove(@Nullable float[] fArr, int i8) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, i8);
    }

    @Nullable
    public static byte[] subArray(@Nullable byte[] bArr, int i8, int i9) {
        return (byte[]) realSubArray(bArr, i8, i9);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, float f8) {
        return (float[]) realAddOne(fArr, Float.valueOf(f8), Float.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d8) {
        return indexOf(dArr, d8) != -1;
    }

    @Nullable
    public static double[] copy(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static int indexOf(@Nullable long[] jArr, long j8, int i8) {
        if (jArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < jArr.length) {
            if (j8 == jArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable long[] jArr, long j8, int i8) {
        if (jArr == null || i8 < 0) {
            return -1;
        }
        if (i8 >= jArr.length) {
            i8 = jArr.length - 1;
        }
        while (i8 >= 0) {
            if (j8 == jArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static int[] remove(@Nullable int[] iArr, int i8) {
        if (iArr == null) {
            return null;
        }
        return (int[]) remove((Object) iArr, i8);
    }

    @Nullable
    public static byte[] removeElement(@Nullable byte[] bArr, byte b8) {
        int indexOf = indexOf(bArr, b8);
        if (indexOf == -1) {
            return copy(bArr);
        }
        return remove(bArr, indexOf);
    }

    public static void sort(@Nullable double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        Arrays.sort(dArr);
    }

    @Nullable
    public static double[] subArray(@Nullable double[] dArr, int i8, int i9) {
        return (double[]) realSubArray(dArr, i8, i9);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i8) {
        return (int[]) realAddOne(iArr, Integer.valueOf(i8), Integer.TYPE);
    }

    public static boolean contains(@Nullable double[] dArr, double d8, double d9) {
        return indexOf(dArr, d8, 0, d9) != -1;
    }

    @Nullable
    public static float[] copy(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @Nullable
    private static Object realAddArr(@Nullable Object obj, int i8, @Nullable Object obj2, Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (i8 == 0) {
                return realCopy(obj2);
            }
            throw new IndexOutOfBoundsException("Index: " + i8 + ", array1 Length: 0");
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (i8 <= length && i8 >= 0) {
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
            if (i8 == length) {
                System.arraycopy(obj, 0, newInstance, 0, length);
                System.arraycopy(obj2, 0, newInstance, length, length2);
            } else if (i8 == 0) {
                System.arraycopy(obj2, 0, newInstance, 0, length2);
                System.arraycopy(obj, 0, newInstance, length2, length);
            } else {
                System.arraycopy(obj, 0, newInstance, 0, i8);
                System.arraycopy(obj2, 0, newInstance, i8, length2);
                System.arraycopy(obj, i8, newInstance, length2 + i8, length - i8);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", array1 Length: " + length);
    }

    @Nullable
    public static long[] remove(@Nullable long[] jArr, int i8) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, i8);
    }

    @Nullable
    public static float[] subArray(@Nullable float[] fArr, int i8, int i9) {
        return (float[]) realSubArray(fArr, i8, i9);
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, long j8) {
        return (long[]) realAddOne(jArr, Long.valueOf(j8), Long.TYPE);
    }

    public static boolean contains(@Nullable float[] fArr, float f8) {
        return indexOf(fArr, f8) != -1;
    }

    @Nullable
    public static boolean[] copy(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    public static int indexOf(@Nullable int[] iArr, int i8) {
        return indexOf(iArr, i8, 0);
    }

    @Nullable
    public static short[] remove(@Nullable short[] sArr, int i8) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, i8);
    }

    public static void reverse(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            int i9 = iArr[length];
            iArr[length] = iArr[i8];
            iArr[i8] = i9;
            length--;
        }
    }

    public static void sort(@Nullable float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        Arrays.sort(fArr);
    }

    @Nullable
    public static boolean[] subArray(@Nullable boolean[] zArr, int i8, int i9) {
        return (boolean[]) realSubArray(zArr, i8, i9);
    }

    @Nullable
    public static Integer[] toObject(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            numArr[i8] = new Integer(iArr[i8]);
        }
        return numArr;
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, short s7) {
        return (short[]) realAddOne(sArr, Short.valueOf(s7), Short.TYPE);
    }

    public static boolean contains(@Nullable boolean[] zArr, boolean z7) {
        return indexOf(zArr, z7) != -1;
    }

    public static int indexOf(@Nullable int[] iArr, int i8, int i9) {
        if (iArr == null) {
            return -1;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        while (i9 < iArr.length) {
            if (i8 == iArr[i9]) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i8) {
        return lastIndexOf(iArr, i8, Integer.MAX_VALUE);
    }

    @NonNull
    private static Object remove(@NonNull Object obj, int i8) {
        int length = getLength(obj);
        if (i8 >= 0 && i8 < length) {
            int i9 = length - 1;
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i9);
            System.arraycopy(obj, 0, newInstance, 0, i8);
            if (i8 < i9) {
                System.arraycopy(obj, i8 + 1, newInstance, i8, (length - i8) - 1);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i8 + ", Length: " + length);
    }

    @Nullable
    public static char[] removeElement(@Nullable char[] cArr, char c8) {
        int indexOf = indexOf(cArr, c8);
        if (indexOf == -1) {
            return copy(cArr);
        }
        return remove(cArr, indexOf);
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i8 = 0; i8 < lArr.length; i8++) {
            jArr[i8] = lArr[i8].longValue();
        }
        return jArr;
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, @Nullable T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    public static int lastIndexOf(@Nullable int[] iArr, int i8, int i9) {
        if (iArr == null || i9 < 0) {
            return -1;
        }
        if (i9 >= iArr.length) {
            i9 = iArr.length - 1;
        }
        while (i9 >= 0) {
            if (i8 == iArr[i9]) {
                return i9;
            }
            i9--;
        }
        return -1;
    }

    public static void sort(@Nullable int[] iArr) {
        if (iArr == null || iArr.length < 2) {
            return;
        }
        Arrays.sort(iArr);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, @Nullable boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s7) {
        return indexOf(sArr, s7, 0);
    }

    @Nullable
    public static char[] add(@Nullable char[] cArr, @Nullable char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static int indexOf(@Nullable short[] sArr, short s7, int i8) {
        if (sArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < sArr.length) {
            if (s7 == sArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Nullable
    public static double[] removeElement(@Nullable double[] dArr, double d8) {
        int indexOf = indexOf(dArr, d8);
        if (indexOf == -1) {
            return copy(dArr);
        }
        return remove(dArr, indexOf);
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            short s7 = sArr[length];
            sArr[length] = sArr[i8];
            sArr[i8] = s7;
            length--;
        }
    }

    public static void sort(@Nullable long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        Arrays.sort(jArr);
    }

    @Nullable
    public static Short[] toObject(@Nullable short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int i8 = 0; i8 < sArr.length; i8++) {
            shArr[i8] = new Short(sArr[i8]);
        }
        return shArr;
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s7) {
        return lastIndexOf(sArr, s7, Integer.MAX_VALUE);
    }

    @Nullable
    public static long[] toPrimitive(@Nullable Long[] lArr, long j8) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i8 = 0; i8 < lArr.length; i8++) {
            Long l8 = lArr[i8];
            jArr[i8] = l8 == null ? j8 : l8.longValue();
        }
        return jArr;
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, @Nullable short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int indexOf(@Nullable char[] cArr, char c8) {
        return indexOf(cArr, c8, 0);
    }

    public static int lastIndexOf(@Nullable short[] sArr, short s7, int i8) {
        if (sArr == null || i8 < 0) {
            return -1;
        }
        if (i8 >= sArr.length) {
            i8 = sArr.length - 1;
        }
        while (i8 >= 0) {
            if (s7 == sArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    public static void sort(@Nullable short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        Arrays.sort(sArr);
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, @Nullable int[] iArr2) {
        return (int[]) realAddArr(iArr, iArr2);
    }

    public static int indexOf(@Nullable char[] cArr, char c8, int i8) {
        if (cArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < cArr.length) {
            if (c8 == cArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Nullable
    public static float[] removeElement(@Nullable float[] fArr, float f8) {
        int indexOf = indexOf(fArr, f8);
        if (indexOf == -1) {
            return copy(fArr);
        }
        return remove(fArr, indexOf);
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, @Nullable long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            char c8 = cArr[length];
            cArr[length] = cArr[i8];
            cArr[i8] = c8;
            length--;
        }
    }

    @Nullable
    public static Byte[] toObject(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = new Byte(bArr[i8]);
        }
        return bArr2;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, @Nullable float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b8) {
        return indexOf(bArr, b8, 0);
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c8) {
        return lastIndexOf(cArr, c8, Integer.MAX_VALUE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, @Nullable double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    public static int indexOf(@Nullable byte[] bArr, byte b8, int i8) {
        if (bArr == null) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < bArr.length) {
            if (b8 == bArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable char[] cArr, char c8, int i8) {
        if (cArr == null || i8 < 0) {
            return -1;
        }
        if (i8 >= cArr.length) {
            i8 = cArr.length - 1;
        }
        while (i8 >= 0) {
            if (c8 == cArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static int[] removeElement(@Nullable int[] iArr, int i8) {
        int indexOf = indexOf(iArr, i8);
        if (indexOf == -1) {
            return copy(iArr);
        }
        return remove(iArr, indexOf);
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i8 = 0; i8 < numArr.length; i8++) {
            iArr[i8] = numArr[i8].intValue();
        }
        return iArr;
    }

    @Nullable
    public static <T> T[] add(@Nullable T[] tArr, int i8, @Nullable T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((Object[]) realAddArr(tArr, i8, tArr2, componentType));
    }

    public static int indexOf(@Nullable double[] dArr, double d8) {
        return indexOf(dArr, d8, 0);
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            byte b8 = bArr[length];
            bArr[length] = bArr[i8];
            bArr[i8] = b8;
            length--;
        }
    }

    @Nullable
    public static Double[] toObject(@Nullable double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr2[i8] = new Double(dArr[i8]);
        }
        return dArr2;
    }

    public static int indexOf(@Nullable double[] dArr, double d8, double d9) {
        return indexOf(dArr, d8, 0, d9);
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b8) {
        return lastIndexOf(bArr, b8, Integer.MAX_VALUE);
    }

    @Nullable
    public static long[] removeElement(@Nullable long[] jArr, long j8) {
        int indexOf = indexOf(jArr, j8);
        if (indexOf == -1) {
            return copy(jArr);
        }
        return remove(jArr, indexOf);
    }

    @Nullable
    public static boolean[] add(@Nullable boolean[] zArr, int i8, @Nullable boolean[] zArr2) {
        Object realAddArr = realAddArr(zArr, i8, zArr2, Boolean.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (boolean[]) realAddArr;
    }

    public static int indexOf(@Nullable double[] dArr, double d8, int i8) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < dArr.length) {
            if (d8 == dArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable byte[] bArr, byte b8, int i8) {
        if (bArr == null || i8 < 0) {
            return -1;
        }
        if (i8 >= bArr.length) {
            i8 = bArr.length - 1;
        }
        while (i8 >= 0) {
            if (b8 == bArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static int[] toPrimitive(@Nullable Integer[] numArr, int i8) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i9 = 0; i9 < numArr.length; i9++) {
            Integer num = numArr[i9];
            iArr[i9] = num == null ? i8 : num.intValue();
        }
        return iArr;
    }

    public static char[] add(@Nullable char[] cArr, int i8, @Nullable char[] cArr2) {
        Object realAddArr = realAddArr(cArr, i8, cArr2, Character.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (char[]) realAddArr;
    }

    @Nullable
    public static short[] removeElement(@Nullable short[] sArr, short s7) {
        int indexOf = indexOf(sArr, s7);
        if (indexOf == -1) {
            return copy(sArr);
        }
        return remove(sArr, indexOf);
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            double d8 = dArr[length];
            dArr[length] = dArr[i8];
            dArr[i8] = d8;
            length--;
        }
    }

    @Nullable
    public static Float[] toObject(@Nullable float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr2[i8] = new Float(fArr[i8]);
        }
        return fArr2;
    }

    public static int indexOf(@Nullable double[] dArr, double d8, int i8, double d9) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        double d10 = d8 - d9;
        double d11 = d8 + d9;
        while (i8 < dArr.length) {
            double d12 = dArr[i8];
            if (d12 >= d10 && d12 <= d11) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d8) {
        return lastIndexOf(dArr, d8, Integer.MAX_VALUE);
    }

    @Nullable
    public static byte[] add(@Nullable byte[] bArr, int i8, @Nullable byte[] bArr2) {
        Object realAddArr = realAddArr(bArr, i8, bArr2, Byte.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (byte[]) realAddArr;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d8, double d9) {
        return lastIndexOf(dArr, d8, Integer.MAX_VALUE, d9);
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d8, int i8) {
        if (isEmpty(dArr) || i8 < 0) {
            return -1;
        }
        if (i8 >= dArr.length) {
            i8 = dArr.length - 1;
        }
        while (i8 >= 0) {
            if (d8 == dArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i8 = 0; i8 < shArr.length; i8++) {
            sArr[i8] = shArr[i8].shortValue();
        }
        return sArr;
    }

    @Nullable
    public static short[] add(@Nullable short[] sArr, int i8, @Nullable short[] sArr2) {
        Object realAddArr = realAddArr(sArr, i8, sArr2, Short.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (short[]) realAddArr;
    }

    public static int indexOf(@Nullable float[] fArr, float f8) {
        return indexOf(fArr, f8, 0);
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            float f8 = fArr[length];
            fArr[length] = fArr[i8];
            fArr[i8] = f8;
            length--;
        }
    }

    @Nullable
    public static Boolean[] toObject(@Nullable boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i8 = 0; i8 < zArr.length; i8++) {
            boolArr[i8] = zArr[i8] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static int indexOf(@Nullable float[] fArr, float f8, int i8) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < fArr.length) {
            if (f8 == fArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Nullable
    public static int[] add(@Nullable int[] iArr, int i8, @Nullable int[] iArr2) {
        Object realAddArr = realAddArr(iArr, i8, iArr2, Integer.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (int[]) realAddArr;
    }

    public static int lastIndexOf(@Nullable double[] dArr, double d8, int i8, double d9) {
        if (isEmpty(dArr) || i8 < 0) {
            return -1;
        }
        if (i8 >= dArr.length) {
            i8 = dArr.length - 1;
        }
        double d10 = d8 - d9;
        double d11 = d8 + d9;
        while (i8 >= 0) {
            double d12 = dArr[i8];
            if (d12 >= d10 && d12 <= d11) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static short[] toPrimitive(@Nullable Short[] shArr, short s7) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i8 = 0; i8 < shArr.length; i8++) {
            Short sh = shArr[i8];
            sArr[i8] = sh == null ? s7 : sh.shortValue();
        }
        return sArr;
    }

    @Nullable
    public static long[] add(@Nullable long[] jArr, int i8, @Nullable long[] jArr2) {
        Object realAddArr = realAddArr(jArr, i8, jArr2, Long.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (long[]) realAddArr;
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z7) {
        return indexOf(zArr, z7, 0);
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i8 = 0; length > i8; i8++) {
            boolean z7 = zArr[length];
            zArr[length] = zArr[i8];
            zArr[i8] = z7;
            length--;
        }
    }

    public static int indexOf(@Nullable boolean[] zArr, boolean z7, int i8) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < zArr.length) {
            if (z7 == zArr[i8]) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Nullable
    public static float[] add(@Nullable float[] fArr, int i8, @Nullable float[] fArr2) {
        Object realAddArr = realAddArr(fArr, i8, fArr2, Float.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (float[]) realAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f8) {
        return lastIndexOf(fArr, f8, Integer.MAX_VALUE);
    }

    @Nullable
    public static double[] add(@Nullable double[] dArr, int i8, @Nullable double[] dArr2) {
        Object realAddArr = realAddArr(dArr, i8, dArr2, Double.TYPE);
        if (realAddArr == null) {
            return null;
        }
        return (double[]) realAddArr;
    }

    public static int lastIndexOf(@Nullable float[] fArr, float f8, int i8) {
        if (isEmpty(fArr) || i8 < 0) {
            return -1;
        }
        if (i8 >= fArr.length) {
            i8 = fArr.length - 1;
        }
        while (i8 >= 0) {
            if (f8 == fArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = bArr[i8].byteValue();
        }
        return bArr2;
    }

    @NonNull
    public static <T> T[] add(@Nullable T[] tArr, int i8, @Nullable T t7) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else {
            if (t7 == null) {
                T[] tArr2 = (T[]) new Object[1];
                tArr2[0] = null;
                return tArr2;
            }
            cls = t7.getClass();
        }
        return (T[]) ((Object[]) realAdd(tArr, i8, t7, cls));
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z7) {
        return lastIndexOf(zArr, z7, Integer.MAX_VALUE);
    }

    @Nullable
    public static byte[] toPrimitive(@Nullable Byte[] bArr, byte b8) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            Byte b9 = bArr[i8];
            bArr2[i8] = b9 == null ? b8 : b9.byteValue();
        }
        return bArr2;
    }

    @NonNull
    public static boolean[] add(@Nullable boolean[] zArr, int i8, boolean z7) {
        return (boolean[]) realAdd(zArr, i8, Boolean.valueOf(z7), Boolean.TYPE);
    }

    public static int lastIndexOf(@Nullable boolean[] zArr, boolean z7, int i8) {
        if (isEmpty(zArr) || i8 < 0) {
            return -1;
        }
        if (i8 >= zArr.length) {
            i8 = zArr.length - 1;
        }
        while (i8 >= 0) {
            if (z7 == zArr[i8]) {
                return i8;
            }
            i8--;
        }
        return -1;
    }

    @NonNull
    public static char[] add(@Nullable char[] cArr, int i8, char c8) {
        return (char[]) realAdd(cArr, i8, Character.valueOf(c8), Character.TYPE);
    }

    @NonNull
    public static byte[] add(@Nullable byte[] bArr, int i8, byte b8) {
        return (byte[]) realAdd(bArr, i8, Byte.valueOf(b8), Byte.TYPE);
    }

    @NonNull
    public static short[] add(@Nullable short[] sArr, int i8, short s7) {
        return (short[]) realAdd(sArr, i8, Short.valueOf(s7), Short.TYPE);
    }

    @NonNull
    public static int[] add(@Nullable int[] iArr, int i8, int i9) {
        return (int[]) realAdd(iArr, i8, Integer.valueOf(i9), Integer.TYPE);
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            dArr2[i8] = dArr[i8].doubleValue();
        }
        return dArr2;
    }

    @NonNull
    public static long[] add(@Nullable long[] jArr, int i8, long j8) {
        return (long[]) realAdd(jArr, i8, Long.valueOf(j8), Long.TYPE);
    }

    @NonNull
    public static float[] add(@Nullable float[] fArr, int i8, float f8) {
        return (float[]) realAdd(fArr, i8, Float.valueOf(f8), Float.TYPE);
    }

    @NonNull
    public static double[] add(@Nullable double[] dArr, int i8, double d8) {
        return (double[]) realAdd(dArr, i8, Double.valueOf(d8), Double.TYPE);
    }

    @Nullable
    public static double[] toPrimitive(@Nullable Double[] dArr, double d8) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            Double d9 = dArr[i8];
            dArr2[i8] = d9 == null ? d8 : d9.doubleValue();
        }
        return dArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            fArr2[i8] = fArr[i8].floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static float[] toPrimitive(@Nullable Float[] fArr, float f8) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i8 = 0; i8 < fArr.length; i8++) {
            Float f9 = fArr[i8];
            fArr2[i8] = f9 == null ? f8 : f9.floatValue();
        }
        return fArr2;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i8 = 0; i8 < boolArr.length; i8++) {
            zArr[i8] = boolArr[i8].booleanValue();
        }
        return zArr;
    }

    @Nullable
    public static boolean[] toPrimitive(@Nullable Boolean[] boolArr, boolean z7) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i8 = 0; i8 < boolArr.length; i8++) {
            Boolean bool = boolArr[i8];
            zArr[i8] = bool == null ? z7 : bool.booleanValue();
        }
        return zArr;
    }
}
