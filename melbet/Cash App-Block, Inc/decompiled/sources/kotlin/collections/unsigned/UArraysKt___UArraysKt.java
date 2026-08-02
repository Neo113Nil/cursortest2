package kotlin.collections.unsigned;

import java.util.Arrays;
import java.util.List;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.ArraysKt__ArraysJVMKt;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntRange;

/* loaded from: classes9.dex */
public class UArraysKt___UArraysKt extends UArraysKt___UArraysJvmKt {
    /* renamed from: contentEquals-FGO6Aew, reason: not valid java name */
    public static boolean m4127contentEqualsFGO6Aew(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: contentEquals-KJPZfPQ, reason: not valid java name */
    public static boolean m4128contentEqualsKJPZfPQ(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: contentEquals-kV0jMPg, reason: not valid java name */
    public static boolean m4129contentEqualskV0jMPg(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: contentEquals-lec5QzE, reason: not valid java name */
    public static boolean m4130contentEqualslec5QzE(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    /* renamed from: contentToString-2csIQuQ, reason: not valid java name */
    public static String m4131contentToString2csIQuQ(byte[] bArr) {
        return CollectionsKt.joinToString$default(new UByteArray(bArr), ", ", "[", "]", 0, null, null, 56);
    }

    /* renamed from: contentToString-XUkPCBk, reason: not valid java name */
    public static String m4132contentToStringXUkPCBk(int[] iArr) {
        return CollectionsKt.joinToString$default(new UIntArray(iArr), ", ", "[", "]", 0, null, null, 56);
    }

    /* renamed from: contentToString-d-6D3K8, reason: not valid java name */
    public static String m4133contentToStringd6D3K8(short[] sArr) {
        return CollectionsKt.joinToString$default(new UShortArray(sArr), ", ", "[", "]", 0, null, null, 56);
    }

    /* renamed from: contentToString-uLth9ew, reason: not valid java name */
    public static String m4134contentToStringuLth9ew(long[] jArr) {
        return jArr != null ? CollectionsKt.joinToString$default(new ULongArray(jArr), ", ", "[", "]", 0, null, null, 56) : "null";
    }

    /* renamed from: slice-ZRhS8yI, reason: not valid java name */
    public static List m4135sliceZRhS8yI(long[] jArr, IntRange intRange) {
        jArr.getClass();
        intRange.getClass();
        if (intRange.isEmpty()) {
            return EmptyList.INSTANCE;
        }
        int i = intRange.first;
        int i2 = intRange.last + 1;
        ArraysKt__ArraysJVMKt.copyOfRangeToIndexCheck(i2, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
        copyOfRange.getClass();
        return new ArraysKt___ArraysJvmKt$asList$3(copyOfRange, 1);
    }
}
