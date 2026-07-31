package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3222l extends C3221k {
    public static List e(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List a4 = AbstractC3224n.a(objArr);
        Intrinsics.checkNotNullExpressionValue(a4, "asList(...)");
        return a4;
    }

    public static byte[] f(byte[] bArr, byte[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    public static char[] g(char[] cArr, char[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(cArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    public static Object[] h(Object[] objArr, Object[] destination, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i5, destination, i4, i6 - i5);
        return destination;
    }

    public static /* synthetic */ byte[] i(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return f(bArr, bArr2, i4, i5, i6);
    }

    public static /* synthetic */ Object[] j(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return h(objArr, objArr2, i4, i5, i6);
    }

    public static byte[] k(byte[] bArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        C3220j.b(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] l(Object[] objArr, int i4, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C3220j.b(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void m(int[] iArr, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Arrays.fill(iArr, i5, i6, i4);
    }

    public static void n(Object[] objArr, Object obj, int i4, int i5) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, obj);
    }

    public static /* synthetic */ void o(Object[] objArr, Object obj, int i4, int i5, int i6, Object obj2) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = objArr.length;
        }
        n(objArr, obj, i4, i5);
    }

    public static byte[] p(byte[] bArr, byte[] elements) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.checkNotNull(copyOf);
        return copyOf;
    }

    public static Object[] q(Object[] objArr, Collection elements) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, elements.size() + length);
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        Intrinsics.checkNotNull(copyOf);
        return copyOf;
    }

    public static Object[] r(Object[] objArr, Object[] elements) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        int length = objArr.length;
        int length2 = elements.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(elements, 0, copyOf, length, length2);
        Intrinsics.checkNotNull(copyOf);
        return copyOf;
    }

    public static final void s(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void t(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static SortedSet u(Comparable[] comparableArr) {
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        return (SortedSet) C3223m.y0(comparableArr, new TreeSet());
    }
}
