package l5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m1.AbstractC0521b;
import u0.AbstractC0676f;

/* renamed from: l5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505i extends AbstractC0521b {
    public static List E(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }

    public static void F(int i7, int i8, int i9, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i8, destination, i7, i9 - i8);
    }

    public static void G(Object[] objArr, Object[] destination, int i7, int i8, int i9) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i8, destination, i7, i9 - i8);
    }

    public static byte[] H(byte[] bArr, int i7, int i8) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        AbstractC0521b.h(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] I(int i7, int i8, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        AbstractC0521b.h(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void J(int i7, int i8, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    public static ArrayList K(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object L(Object[] objArr, int i7) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    public static List M(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0503g(objArr, false)) : AbstractC0676f.n(objArr[0]) : C0512p.f5303f;
    }
}
