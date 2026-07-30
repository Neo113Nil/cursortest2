package z6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class i extends r {
    public static String m(String str) {
        Comparable comparable;
        r6.k.f(str, "<this>");
        List K = h.K(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K) {
            if (!h.G((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e6.n.a0(arrayList, 10));
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                }
                if (!v1.g.l(str2.charAt(i9))) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                i9 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i9));
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
        K.size();
        int W = e6.m.W(K);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : K) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                e6.m.Z();
                throw null;
            }
            String str3 = (String) obj3;
            String z8 = ((i7 == 0 || i7 == W) && h.G(str3)) ? null : h.z(str3, intValue);
            if (z8 != null) {
                arrayList3.add(z8);
            }
            i7 = i10;
        }
        StringBuilder sb = new StringBuilder(length2);
        e6.l.l0(arrayList3, sb, null, 124);
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }

    public static String n(String str) {
        r6.k.f(str, "<this>");
        if (h.G("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List K = h.K(str);
        int length = str.length();
        K.size();
        int W = e6.m.W(K);
        ArrayList arrayList = new ArrayList();
        Iterator it = K.iterator();
        int i7 = 0;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                e6.l.l0(arrayList, sb, null, 124);
                String sb2 = sb.toString();
                r6.k.e(sb2, "toString(...)");
                return sb2;
            }
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                e6.m.Z();
                throw null;
            }
            String str3 = (String) next;
            if ((i7 != 0 && i7 != W) || !h.G(str3)) {
                int length2 = str3.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!v1.g.l(str3.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && o.u(str3, "|", i9, false)) {
                    str2 = str3.substring("|".length() + i9);
                    r6.k.e(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i7 = i8;
        }
    }
}
