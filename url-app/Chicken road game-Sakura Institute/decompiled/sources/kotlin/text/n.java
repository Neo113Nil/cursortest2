package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1441y;
import z2.C1442z;

/* loaded from: classes.dex */
public class n extends l {
    public static String b(String str) {
        int i2;
        Comparable comparable;
        String invoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        List A4 = y.A(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A4) {
            if (!y.x((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(i2))) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                i2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i2));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        A4.size();
        m mVar = m.f7542d;
        int d4 = C1441y.d(A4);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : A4) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            String str3 = (String) obj2;
            if ((i2 == 0 || i2 == d4) && y.x(str3)) {
                str3 = null;
            } else {
                String N3 = A.N(intValue, str3);
                if (N3 != null && (invoke = mVar.invoke(N3)) != null) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        C1403G.v(arrayList3, sb, null, 124);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (y.x("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List A4 = y.A(str);
        int length = str.length();
        A4.size();
        m mVar = m.f7542d;
        int d4 = C1441y.d(A4);
        ArrayList arrayList = new ArrayList();
        Iterator it = A4.iterator();
        int i2 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                C1403G.v(arrayList, sb, null, 124);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                return sb2;
            }
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            String str3 = (String) next;
            if ((i2 != 0 && i2 != d4) || !y.x(str3)) {
                int length2 = str3.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    if (!CharsKt.b(str3.charAt(i5))) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1 && u.m(i5, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i5);
                    Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                }
                if (str2 == null || (str2 = mVar.invoke(str2)) == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i2 = i4;
        }
    }
}
