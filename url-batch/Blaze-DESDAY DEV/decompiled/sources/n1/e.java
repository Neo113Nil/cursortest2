package n1;

import V0.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0180a {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t(String str) {
        List list;
        g1.d.e(str, "<this>");
        if (d.G("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d.K(0);
        List asList = Arrays.asList("\r\n", "\n", "\r");
        g1.d.d(asList, "asList(...)");
        b bVar = new b(new c(str, 0, 0, new m(asList, false, 1)));
        if (bVar.hasNext()) {
            k1.c cVar = (k1.c) bVar.next();
            g1.d.e(cVar, "it");
            String obj = str.subSequence(cVar.f2785a, cVar.f2786b + 1).toString();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                while (bVar.hasNext()) {
                    k1.c cVar2 = (k1.c) bVar.next();
                    g1.d.e(cVar2, "it");
                    arrayList.add(str.subSequence(cVar2.f2785a, cVar2.f2786b + 1).toString());
                }
                list = arrayList;
            } else {
                list = z1.d.Y(obj);
            }
        } else {
            list = p.f917a;
        }
        int length = str.length();
        list.size();
        int v02 = V0.h.v0(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj2;
            String str3 = null;
            if ((i != 0 && i != v02) || !d.G(str2)) {
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
                    g1.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        V0.g.A0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        g1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
