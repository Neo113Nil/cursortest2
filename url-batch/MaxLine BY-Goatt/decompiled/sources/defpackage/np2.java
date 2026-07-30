package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class np2 extends mp2 {
    public static String b(String str) {
        return dj2.d(new ps2(new yv(3, str), new ck("    ", 2), 1), "\n");
    }

    public static String c(String str) {
        List list;
        Comparable comparable;
        ae1 ae1Var = new ae1(str);
        if (ae1Var.hasNext()) {
            Object next = ae1Var.next();
            if (ae1Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ae1Var.hasNext()) {
                    arrayList.add(ae1Var.next());
                }
                list = arrayList;
            } else {
                list = pv.c(next);
            }
        } else {
            list = ah0.m;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!up2.y((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(rv.l(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!CharsKt.b(str2.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str2.length();
            }
            arrayList3.add(Integer.valueOf(i3));
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
        int size2 = list.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i4 = i + 1;
            if (i < 0) {
                qv.k();
                throw null;
            }
            String str3 = (String) obj3;
            String L = ((i == 0 || i == size2) && up2.y(str3)) ? null : wp2.L(intValue, str3);
            if (L != null) {
                arrayList4.add(L);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        zv.z(arrayList4, sb, null, 124);
        return sb.toString();
    }

    public static String d(String str) {
        List list;
        if (up2.y("|")) {
            lh.e("marginPrefix must be non-blank string.");
            return null;
        }
        ae1 ae1Var = new ae1(str);
        if (ae1Var.hasNext()) {
            Object next = ae1Var.next();
            if (ae1Var.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ae1Var.hasNext()) {
                    arrayList.add(ae1Var.next());
                }
                list = arrayList;
            } else {
                list = pv.c(next);
            }
        } else {
            list = ah0.m;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                qv.k();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && up2.y(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.b(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && tp2.n(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        zv.z(arrayList2, sb, null, 124);
        return sb.toString();
    }
}
