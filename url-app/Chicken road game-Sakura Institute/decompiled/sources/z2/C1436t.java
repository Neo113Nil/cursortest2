package z2;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1436t extends C1435s {
    public static List b(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(asList, "asList(...)");
        return asList;
    }

    public static void c(int i2, int i4, int i5, byte[] bArr, byte[] destination) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i4, destination, i2, i5 - i4);
    }

    public static void d(char[] cArr, char[] destination, int i2, int i4, int i5) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i4, destination, i2, i5 - i4);
    }

    public static void e(int[] iArr, int[] destination, int i2, int i4, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i4, destination, i2, i5 - i4);
    }

    public static void f(Object[] objArr, Object[] destination, int i2, int i4, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i4, destination, i2, i5 - i4);
    }

    public static /* synthetic */ void g(int[] iArr, int[] iArr2, int i2, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = iArr.length;
        }
        e(iArr, iArr2, i2, 0, i4);
    }

    public static /* synthetic */ void h(Object[] objArr, Object[] objArr2, int i2, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        f(objArr, objArr2, 0, i2, i4);
    }

    public static byte[] i(byte[] bArr, int i2, int i4) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C1434r.a(i4, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i4);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] j(Object[] objArr, int i2, int i4) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C1434r.a(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i4);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void k(Object[] objArr, int i2, int i4) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i2, i4, (Object) null);
    }

    public static void l(int[] iArr, int i2) {
        int length = iArr.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, 0, length, i2);
    }

    public static void m(long[] jArr) {
        int length = jArr.length;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }
}
