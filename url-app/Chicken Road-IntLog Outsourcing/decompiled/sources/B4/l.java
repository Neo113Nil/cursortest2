package B4;

import a.AbstractC0169a;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.C0471p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends e5.g {
    public static String E(String str) {
        List list;
        int i2;
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
                list = K1.b.W(next);
            }
        } else {
            list = C0471p.f5750a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!k.Z((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0467l.D0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
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
                if (!AbstractC0169a.y(str2.charAt(i2))) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                i2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList3.iterator();
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
        list.size();
        int z02 = AbstractC0466k.z0(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            String str3 = (String) obj2;
            String T2 = ((i2 == 0 || i2 == z02) && k.Z(str3)) ? null : k.T(intValue, str3);
            if (T2 != null) {
                arrayList4.add(T2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length2);
        AbstractC0465j.I0(arrayList4, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static String F(String str) {
        List list;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (k.Z("|")) {
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
                list = K1.b.W(next);
            }
        } else {
            list = C0471p.f5750a;
        }
        int length = str.length();
        list.size();
        int z02 = AbstractC0466k.z0(list);
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            String str2 = null;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i2 != 0 && i2 != z02) || !k.Z(str3)) {
                int length2 = str3.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!AbstractC0169a.y(str3.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && r.N(str3, i6, "|", false)) {
                    str2 = str3.substring("|".length() + i6);
                    kotlin.jvm.internal.i.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC0465j.I0(arrayList2, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}
