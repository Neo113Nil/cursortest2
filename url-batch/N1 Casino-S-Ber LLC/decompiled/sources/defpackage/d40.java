package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class d40 extends jw {
    public static String h0(String str) {
        List list;
        if (c40.t0("|")) {
            t8.k("marginPrefix must be non-blank string.");
            return null;
        }
        lq lqVar = new lq(str);
        if (lqVar.hasNext()) {
            Object next = lqVar.next();
            if (lqVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (lqVar.hasNext()) {
                    arrayList.add(lqVar.next());
                }
                list = arrayList;
            } else {
                list = o8.U(next);
            }
        } else {
            list = di.f;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && c40.t0(str2)) {
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
                String substring = (i3 != -1 && k40.l0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
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
        bb.I0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
