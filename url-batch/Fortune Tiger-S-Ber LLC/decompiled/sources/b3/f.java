package b3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n2.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class f extends k3.m {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String W(String str) {
        List list;
        u2.c.e(str, "<this>");
        if (e.j0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List asList = Arrays.asList("\r\n", "\n", "\r");
        u2.c.d(asList, "asList(...)");
        b bVar = new b(new c(str, new n(1, asList)));
        if (bVar.hasNext()) {
            y2.c cVar = (y2.c) bVar.next();
            u2.c.e(cVar, "it");
            String obj = str.subSequence(cVar.f3617f, cVar.g + 1).toString();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                while (bVar.hasNext()) {
                    y2.c cVar2 = (y2.c) bVar.next();
                    u2.c.e(cVar2, "it");
                    arrayList.add(str.subSequence(cVar2.f3617f, cVar2.g + 1).toString());
                }
                list = arrayList;
            } else {
                list = m0.a.r(obj);
            }
        } else {
            list = o.f2953f;
        }
        int length = str.length();
        list.size();
        int D = n2.h.D(list);
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (Object obj2 : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj2;
            String str3 = null;
            if ((i4 != 0 && i4 != D) || !e.j0(str2)) {
                int length2 = str2.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    char charAt = str2.charAt(i6);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && m.a0(str2, "|", i6, false)) {
                    str3 = str2.substring(i6 + 1);
                    u2.c.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i4 = i5;
        }
        StringBuilder sb = new StringBuilder(length);
        n2.g.G(arrayList2, sb, "\n", "", "", "...", null);
        String sb2 = sb.toString();
        u2.c.d(sb2, "toString(...)");
        return sb2;
    }
}
