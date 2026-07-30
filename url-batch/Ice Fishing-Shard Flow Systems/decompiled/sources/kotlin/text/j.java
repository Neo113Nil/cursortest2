package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class j extends i {
    public static String b(String str) {
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List b7 = l6.l.b(new c6.n(3, str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b7) {
            if (!StringsKt.z((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.s.g(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                }
                if (!CharsKt__CharJVMKt.a(str2.charAt(i7))) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                i7 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i7));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
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
        b7.size();
        int c7 = kotlin.collections.r.c(b7);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : b7) {
            int i8 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.r.f();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i2 == 0 || i2 == c7) && StringsKt.z(str3)) {
                str3 = null;
            } else {
                Intrinsics.checkNotNullParameter(str3, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(C4.p.h(intValue, "Requested character count ", " is less than zero.").toString());
                }
                int length3 = str3.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                String line = str3.substring(length3);
                Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i2 = i8;
        }
        StringBuilder sb = new StringBuilder(length2);
        CollectionsKt___CollectionsKt.j(arrayList3, sb, "\n", "", "", null);
        return sb.toString();
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.z("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List b7 = l6.l.b(new c6.n(3, str));
        int length = str.length();
        b7.size();
        int c7 = kotlin.collections.r.c(b7);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : b7) {
            int i5 = i2 + 1;
            String line = null;
            if (i2 < 0) {
                kotlin.collections.r.f();
                throw null;
            }
            String str2 = (String) obj;
            if ((i2 != 0 && i2 != c7) || !StringsKt.z(str2)) {
                int length2 = str2.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        i7 = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.a(str2.charAt(i7))) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1 && p.k(str2, i7, "|", false)) {
                    line = str2.substring("|".length() + i7);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i2 = i5;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt___CollectionsKt.j(arrayList, sb, "\n", "", "", null);
        return sb.toString();
    }
}
