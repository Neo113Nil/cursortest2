package kotlin.text;

import defpackage.ai;
import defpackage.dd0;
import defpackage.se1;
import defpackage.zh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class b extends se1 {
    public static String b(String str) {
        Comparable comparable;
        String str2;
        List h = StringsKt__StringsKt.h(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (!StringsKt.n((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ai.h(arrayList));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!CharsKt.a(str3.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
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
        h.size();
        int size2 = h.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : h) {
            int i4 = i + 1;
            if (i < 0) {
                zh.g();
                throw null;
            }
            String str4 = (String) obj3;
            if ((i == 0 || i == size2) && StringsKt.n(str4)) {
                str2 = null;
            } else {
                str4.getClass();
                if (intValue < 0) {
                    dd0.g("Requested character count ", intValue, " is less than zero.");
                    return null;
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        CollectionsKt___CollectionsKt.k(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String c(String str) {
        if (StringsKt.n("|")) {
            dd0.e("marginPrefix must be non-blank string.");
            return null;
        }
        List h = StringsKt__StringsKt.h(str);
        int length = str.length();
        h.size();
        int size = h.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : h) {
            int i2 = i + 1;
            if (i < 0) {
                zh.g();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && StringsKt.n(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.a(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt___CollectionsKt.k(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
