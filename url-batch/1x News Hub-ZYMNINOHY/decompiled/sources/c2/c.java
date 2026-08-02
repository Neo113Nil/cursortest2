package c2;

import a.AbstractC0129a;
import io.appmetrica.analytics.impl.C0638l5;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends S0.a {
    public static void Q(int i3, int i4, int i5, int[] iArr, int[] destination) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(iArr, i4, destination, i3, i5 - i4);
    }

    public static void R(int i3, int i4, int i5, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        kotlin.jvm.internal.j.e(destination, "destination");
        System.arraycopy(objArr, i4, destination, i3, i5 - i4);
    }

    public static /* synthetic */ void S(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        R(0, i3, i4, objArr, objArr2);
    }

    public static Object T(int i3, Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static String U(Object[] objArr, String str, C0638l5 c0638l5) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append((CharSequence) str);
            }
            S0.a.a(sb, obj, c0638l5);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void V(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List W(int[] iArr) {
        kotlin.jvm.internal.j.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return m.f2637a;
        }
        if (length == 1) {
            return AbstractC0129a.r(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static List X(Object[] objArr) {
        kotlin.jvm.internal.j.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0203a(objArr, false)) : AbstractC0129a.r(objArr[0]) : m.f2637a;
    }
}
