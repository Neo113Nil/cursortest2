package q1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends H1.l {
    public static String k0(String str) {
        j1.h.e(str, "<this>");
        if (e.B0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List D0 = e.D0(str);
        int length = str.length();
        D0.size();
        int size = D0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : D0) {
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                X0.l.l0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i != 0 && i != size) || !e.B0(str3)) {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!H1.d.R(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && m.r0(str3, "|", i3, false)) {
                    str2 = str3.substring("|".length() + i3);
                    j1.h.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        X0.k.o0(arrayList, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        j1.h.d(sb2, "toString(...)");
        return sb2;
    }
}
