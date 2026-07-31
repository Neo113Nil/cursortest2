package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int i4 = 0;
        for (T[] tArr2 : tArr) {
            i4 += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i4);
        int length = tArr[0].length;
        for (int i5 = 1; i5 < tArr.length; i5++) {
            T[] tArr4 = tArr[i5];
            int length2 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length, length2);
            length += length2;
        }
        return tArr3;
    }

    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i4 = 0;
        for (byte[] bArr2 : bArr) {
            i4 += bArr2.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i4);
        int length = bArr[0].length;
        for (int i5 = 1; i5 < bArr.length; i5++) {
            byte[] bArr3 = bArr[i5];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, copyOf, length, length2);
            length += length2;
        }
        return copyOf;
    }

    public static boolean contains(int[] iArr, int i4) {
        if (iArr != null) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i4;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i4 = 0;
            for (T t4 : tArr) {
                if (!Objects.equal(tArr2[0], t4)) {
                    tArr3[i4] = t4;
                    i4++;
                }
            }
        } else {
            int i5 = 0;
            for (T t5 : tArr) {
                if (!contains(tArr2, t5)) {
                    tArr3[i5] = t5;
                    i5++;
                }
            }
            i4 = i5;
        }
        if (tArr3 == null) {
            return null;
        }
        return i4 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i4);
    }

    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t4 : tArr) {
            arrayList.add(t4);
        }
        return arrayList;
    }

    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i4 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i4] = it.next().intValue();
            i4++;
        }
        return iArr;
    }

    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i4 = 0; i4 < length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    public static void writeArray(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(dArr[i4]);
        }
    }

    public static void writeStringArray(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append("\"");
            sb.append(strArr[i4]);
            sb.append("\"");
        }
    }

    public static <T> boolean contains(T[] tArr, T t4) {
        int length = tArr != null ? tArr.length : 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            if (!Objects.equal(tArr[i4], t4)) {
                i4++;
            } else if (i4 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void writeArray(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(fArr[i4]);
        }
    }

    public static void writeArray(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(iArr[i4]);
        }
    }

    public static void writeArray(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(jArr[i4]);
        }
    }

    public static <T> void writeArray(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(tArr[i4]);
        }
    }

    public static void writeArray(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(zArr[i4]);
        }
    }
}
