package g1;

import R0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends s1.d {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n0(String str) {
        List list;
        Z0.d.e(str, "<this>");
        if (d.A0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d.E0(0);
        List asList = Arrays.asList("\r\n", "\n", "\r");
        Z0.d.d(asList, "asList(...)");
        b bVar = new b(new c(str, 0, 0, new m(asList, false, 1)));
        if (bVar.hasNext()) {
            d1.c cVar = (d1.c) bVar.next();
            Z0.d.e(cVar, "it");
            String obj = str.subSequence(cVar.f1982a, cVar.f1983b + 1).toString();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                while (bVar.hasNext()) {
                    d1.c cVar2 = (d1.c) bVar.next();
                    Z0.d.e(cVar2, "it");
                    arrayList.add(str.subSequence(cVar2.f1982a, cVar2.f1983b + 1).toString());
                }
                list = arrayList;
            } else {
                list = s1.l.K(obj);
            }
        } else {
            list = q.f712a;
        }
        int length = str.length();
        list.size();
        int k02 = R0.i.k0(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj2;
            String str3 = null;
            if ((i != 0 && i != k02) || !d.A0(str2)) {
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
                if (i3 != -1 && l.r0(str2, "|", i3, false)) {
                    str3 = str2.substring(i3 + 1);
                    Z0.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        R0.h.o0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        Z0.d.d(sb2, "toString(...)");
        return sb2;
    }
}
