package n2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n.T;

/* renamed from: n2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0731k extends T {
    public static String p(String str) {
        int i3;
        Comparable comparable;
        f2.j.f(str, "<this>");
        List O3 = AbstractC0730j.O(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : O3) {
            if (!AbstractC0730j.K((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(S1.n.E0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!n.r.n(str2.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
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
        O3.size();
        int z02 = S1.m.z0(O3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : O3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                S1.m.D0();
                throw null;
            }
            String str3 = (String) obj2;
            String D = ((i3 == 0 || i3 == z02) && AbstractC0730j.K(str3)) ? null : AbstractC0730j.D(str3, intValue);
            if (D != null) {
                arrayList3.add(D);
            }
            i3 = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        S1.l.O0(arrayList3, sb, null, 124);
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public static String q(String str) {
        f2.j.f(str, "<this>");
        if (AbstractC0730j.K("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List O3 = AbstractC0730j.O(str);
        int length = str.length();
        O3.size();
        int z02 = S1.m.z0(O3);
        ArrayList arrayList = new ArrayList();
        Iterator it = O3.iterator();
        int i3 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                S1.l.O0(arrayList, sb, null, 124);
                String sb2 = sb.toString();
                f2.j.e(sb2, "toString(...)");
                return sb2;
            }
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                S1.m.D0();
                throw null;
            }
            String str3 = (String) next;
            if ((i3 != 0 && i3 != z02) || !AbstractC0730j.K(str3)) {
                int length2 = str3.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    if (!n.r.n(str3.charAt(i5))) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1 && AbstractC0737q.y(str3, "|", i5, false)) {
                    str2 = str3.substring("|".length() + i5);
                    f2.j.e(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i3 = i4;
        }
    }
}
