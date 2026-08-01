package i1;

import T0.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends u1.l {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ec, code lost:
    
        if (r9 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String j0(String str) {
        List list;
        b1.d.e(str, "<this>");
        if (d.w0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d.A0(0);
        List asList = Arrays.asList("\r\n", "\n", "\r");
        b1.d.d(asList, "asList(...)");
        b bVar = new b(new c(str, 0, 0, new m(asList, false, 1)));
        if (bVar.hasNext()) {
            f1.c cVar = (f1.c) bVar.next();
            b1.d.e(cVar, "it");
            String obj = str.subSequence(cVar.f2254a, cVar.f2255b + 1).toString();
            if (bVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                while (bVar.hasNext()) {
                    f1.c cVar2 = (f1.c) bVar.next();
                    b1.d.e(cVar2, "it");
                    arrayList.add(str.subSequence(cVar2.f2254a, cVar2.f2255b + 1).toString());
                }
                list = arrayList;
            } else {
                list = u1.d.a0(obj);
            }
        } else {
            list = q.f829a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj2;
            String str3 = null;
            if ((i != 0 && i != size) || !d.w0(str2)) {
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
                if (i3 != -1 && l.n0(str2, "|", i3, false)) {
                    str3 = str2.substring(i3 + 1);
                    b1.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        T0.h.x0(arrayList2, sb, "\n", "", "", -1, "...", null);
        String sb2 = sb.toString();
        b1.d.d(sb2, "toString(...)");
        return sb2;
    }
}
