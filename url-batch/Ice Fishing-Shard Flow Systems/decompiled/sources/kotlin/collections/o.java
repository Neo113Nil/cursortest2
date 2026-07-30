package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o extends C0635n {
    public static List b(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    public static void c(int i2, int i5, int i7, byte[] bArr, byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i5, destination, i2, i7 - i5);
    }

    public static void d(int i2, int i5, int[] iArr, int[] destination, int i7) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i5, destination, i2, i7 - i5);
    }

    public static void e(Object[] objArr, Object[] destination, int i2, int i5, int i7) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i5, destination, i2, i7 - i5);
    }

    public static /* synthetic */ void f(Object[] objArr, Object[] objArr2, int i2, int i5, int i7) {
        if ((i7 & 4) != 0) {
            i2 = 0;
        }
        if ((i7 & 8) != 0) {
            i5 = objArr.length;
        }
        e(objArr, objArr2, 0, i2, i5);
    }

    public static byte[] g(byte[] bArr, int i2, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C0634m.a(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i5);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] h(Object[] objArr, int i2, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C0634m.a(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i5);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void i(Object[] objArr, int i2, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i2, i5, (Object) null);
    }
}
