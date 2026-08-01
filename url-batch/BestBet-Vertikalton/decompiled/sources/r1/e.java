package r1;

import c1.AbstractC0091d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0091d {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r8 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String w(String str) {
        k1.e.e(str, "<this>");
        if (d.L("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d.P(0);
        List w2 = q1.f.w(new q1.j(new c(str, 0, 0, new m(Y0.i.i0(new String[]{"\r\n", "\n", "\r"}), false, 1)), new Y0.a(1, str)));
        int length = str.length();
        w2.size();
        int y02 = Y0.k.y0(w2);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : w2) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String str3 = null;
            if ((i != 0 && i != y02) || !d.L(str2)) {
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
                if (i3 != -1 && l.B(str2, "|", i3, false)) {
                    str3 = str2.substring("|".length() + i3);
                    k1.e.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        Y0.j.B0(arrayList, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        k1.e.d(sb2, "toString(...)");
        return sb2;
    }
}
