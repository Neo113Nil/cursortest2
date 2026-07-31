package h2;

import e2.AbstractC0381e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: h2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0448j extends g2.i {
    public static String a0(String str) {
        int i3;
        Comparable comparable;
        Z1.i.f(str, "<this>");
        List x02 = AbstractC0447i.x0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : x02) {
            if (!AbstractC0447i.t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(M1.n.g0(arrayList, 10));
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
                if (!AbstractC0381e.F(str2.charAt(i3))) {
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
        x02.size();
        int b02 = M1.m.b0(x02);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : x02) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                M1.m.f0();
                throw null;
            }
            String str3 = (String) obj2;
            String m02 = ((i3 == 0 || i3 == b02) && AbstractC0447i.t0(str3)) ? null : AbstractC0447i.m0(str3, intValue);
            if (m02 != null) {
                arrayList3.add(m02);
            }
            i3 = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        M1.l.p0(arrayList3, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    public static String b0(String str) {
        Z1.i.f(str, "<this>");
        if (AbstractC0447i.t0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List x02 = AbstractC0447i.x0(str);
        int length = str.length();
        x02.size();
        int b02 = M1.m.b0(x02);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (Object obj : x02) {
            int i4 = i3 + 1;
            String str2 = null;
            if (i3 < 0) {
                M1.m.f0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i3 != 0 && i3 != b02) || !AbstractC0447i.t0(str3)) {
                int length2 = str3.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    if (!AbstractC0381e.F(str3.charAt(i5))) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1 && AbstractC0454p.h0(str3, "|", i5, false)) {
                    str2 = str3.substring("|".length() + i5);
                    Z1.i.e(str2, "substring(...)");
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
        StringBuilder sb = new StringBuilder(length);
        M1.l.p0(arrayList, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }
}
