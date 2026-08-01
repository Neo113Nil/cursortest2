package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class g70 extends xf {
    public static String P(String str) {
        List list;
        if (f70.b0("|")) {
            g9.i("marginPrefix must be non-blank string.");
            return null;
        }
        zs zsVar = new zs(str);
        if (zsVar.hasNext()) {
            Object next = zsVar.next();
            if (zsVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (zsVar.hasNext()) {
                    arrayList.add(zsVar.next());
                }
                list = arrayList;
            } else {
                list = kr.J(next);
            }
        } else {
            list = ik.f;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xb.j0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && f70.b0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    char charAt = str2.charAt(i3);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && n70.T(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
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
        wb.m0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
