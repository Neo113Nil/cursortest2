package F5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.AbstractC0506j;
import l5.AbstractC0507k;
import l5.AbstractC0508l;
import l5.C0512p;
import m1.AbstractC0521b;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class k extends AbstractC0676f {
    public static String y(String str) {
        List list;
        Comparable comparable;
        kotlin.jvm.internal.i.e(str, "<this>");
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                list = arrayList;
            } else {
                list = AbstractC0676f.n(next);
            }
        } else {
            list = C0512p.f5303f;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!j.T((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0508l.C(arrayList2, 10));
        int size = arrayList2.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i9 = -1;
                    break;
                }
                if (!AbstractC0521b.v(str2.charAt(i9))) {
                    break;
                }
                i9++;
            }
            if (i9 == -1) {
                i9 = str2.length();
            }
            arrayList3.add(Integer.valueOf(i9));
        }
        Iterator it = arrayList3.iterator();
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
        list.size();
        int y = AbstractC0507k.y(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                AbstractC0507k.B();
                throw null;
            }
            String str3 = (String) obj3;
            String N5 = ((i7 == 0 || i7 == y) && j.T(str3)) ? null : j.N(str3, intValue);
            if (N5 != null) {
                arrayList4.add(N5);
            }
            i7 = i10;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC0506j.G(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String z(String str) {
        List list;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (j.T("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                list = arrayList;
            } else {
                list = AbstractC0676f.n(next);
            }
        } else {
            list = C0512p.f5303f;
        }
        int length = str.length();
        list.size();
        int y = AbstractC0507k.y(list);
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            String str2 = null;
            if (i7 < 0) {
                AbstractC0507k.B();
                throw null;
            }
            String str3 = (String) obj;
            if ((i7 != 0 && i7 != y) || !j.T(str3)) {
                int length2 = str3.length();
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        i9 = -1;
                        break;
                    }
                    if (!AbstractC0521b.v(str3.charAt(i9))) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 && q.H(str3, i9, "|", false)) {
                    str2 = str3.substring("|".length() + i9);
                    kotlin.jvm.internal.i.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i7 = i8;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0506j.G(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
