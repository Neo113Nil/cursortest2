package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class m40 extends j8 {
    public static String Z(String str) {
        List list;
        if (l40.l0("|")) {
            o8.j("marginPrefix must be non-blank string.");
            return null;
        }
        yq yqVar = new yq(str);
        if (yqVar.hasNext()) {
            Object next = yqVar.next();
            if (yqVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (yqVar.hasNext()) {
                    arrayList.add(yqVar.next());
                }
                list = arrayList;
            } else {
                list = l70.z(next);
            }
        } else {
            list = vh.f;
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
            if ((i == 0 || i == size) && l40.l0(str2)) {
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
                String substring = (i3 != -1 && t40.d0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
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
        db.d0(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
