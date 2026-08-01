package o1;

import W0.p;
import h0.d0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends d0 {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r8 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String s(String str) {
        List list;
        h1.d.e(str, "<this>");
        if (d.G("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        b bVar = new b(d.I(str, new String[]{"\r\n", "\n", "\r"}, false, 0));
        if (bVar.hasNext()) {
            l1.c cVar = (l1.c) bVar.next();
            h1.d.e(cVar, "it");
            String P2 = d.P(str, cVar);
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(P2);
                while (bVar.hasNext()) {
                    l1.c cVar2 = (l1.c) bVar.next();
                    h1.d.e(cVar2, "it");
                    arrayList.add(d.P(str, cVar2));
                }
                list = arrayList;
            } else {
                list = A1.d.T(P2);
            }
        } else {
            list = p.f959a;
        }
        int length = str.length();
        list.size();
        int m02 = W0.h.m0(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String str3 = null;
            if ((i != 0 && i != m02) || !d.G(str2)) {
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
                    str3 = str2.substring(1 + i3);
                    h1.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        W0.g.r0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        h1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
