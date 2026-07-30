package r7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: r7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4978i extends com.bumptech.glide.h {
    public static List H(Object[] objArr) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.h.d(asList, "asList(...)");
        return asList;
    }

    public static void I(int i, int i4, int i9, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(objArr, i4, destination, i, i9 - i4);
    }

    public static void J(byte[] bArr, int i, byte[] destination, int i4, int i9) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(bArr, i4, destination, i, i9 - i4);
    }

    public static byte[] K(byte[] bArr, int i, int i4) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        com.bumptech.glide.h.f(i4, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i4);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] L(Object[] objArr, int i, int i4) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        com.bumptech.glide.h.f(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i4);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void M(Object[] objArr, int i, int i4) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        Arrays.fill(objArr, i, i4, (Object) null);
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

    public static Object O(Object[] objArr, int i) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List P(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C4976g(objArr, false)) : p8.g.k(objArr[0]) : C4985p.f40358n;
    }
}
