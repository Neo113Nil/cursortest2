package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class nf0 extends mc0 {
    public static String m(String str) {
        int i = 2;
        return wc0.j(new ij(new cd(i, str), new h(8, "    "), i), "\n");
    }

    public static String n(String str) {
        if (mf0.y("|")) {
            s9.k("marginPrefix must be non-blank string.");
            return null;
        }
        List A = mf0.A(str);
        int length = str.length();
        A.size();
        int size = A.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : A) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && mf0.y(str2)) {
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
                String substring = (i3 != -1 && uf0.q(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        uc.j0(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
