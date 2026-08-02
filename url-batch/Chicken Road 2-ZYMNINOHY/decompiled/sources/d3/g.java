package d3;

import a.AbstractC0124a;
import io.appmetrica.analytics.impl.C0579e5;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends V3.b {
    public static List N(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }

    public static void O(int i4, int i5, int i6, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i5, destination, i4, i6 - i5);
    }

    public static void P(int i4, int i5, int i6, int[] iArr, int[] destination) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(iArr, i5, destination, i4, i6 - i5);
    }

    public static void Q(int i4, int i5, int i6, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i5, destination, i4, i6 - i5);
    }

    public static /* synthetic */ void R(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        Q(0, i4, i5, objArr, objArr2);
    }

    public static void S(Object[] objArr, int i4, int i5) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, (Object) null);
    }

    public static ArrayList T(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object U(int i4, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i4 < 0 || i4 >= objArr.length) {
            return null;
        }
        return objArr[i4];
    }

    public static String V(Object[] objArr, String str, C0579e5 c0579e5) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                sb.append((CharSequence) str);
            }
            O3.d.d(sb, obj, c0579e5);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void W(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List X(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return q.f8333a;
        }
        if (length == 1) {
            return AbstractC0124a.H(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static List Y(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new e(objArr, false)) : AbstractC0124a.H(objArr[0]) : q.f8333a;
    }
}
