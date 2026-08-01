package k1;

import S0.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends h1.d {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t(String str) {
        List list;
        d1.d.e(str, "<this>");
        if (d.G("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d.K(0);
        b bVar = new b(new c(str, 0, 0, new m(S0.f.b0(new String[]{"\r\n", "\n", "\r"}), false, 1)));
        if (bVar.hasNext()) {
            h1.c cVar = (h1.c) bVar.next();
            d1.d.e(cVar, "it");
            String obj = str.subSequence(cVar.f2517a, cVar.f2518b + 1).toString();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                while (bVar.hasNext()) {
                    h1.c cVar2 = (h1.c) bVar.next();
                    d1.d.e(cVar2, "it");
                    arrayList.add(str.subSequence(cVar2.f2517a, cVar2.f2518b + 1).toString());
                }
                list = arrayList;
            } else {
                list = w1.d.Y(obj);
            }
        } else {
            list = p.f795a;
        }
        int length = str.length();
        list.size();
        int x02 = S0.h.x0(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj2;
            String str3 = null;
            if ((i != 0 && i != x02) || !d.G(str2)) {
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
                if (i3 != -1 && l.x(str2, "|", i3, false)) {
                    str3 = str2.substring(i3 + 1);
                    d1.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        S0.g.B0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        d1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
