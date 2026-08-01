package p3;

import java.util.ArrayList;
import java.util.List;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class e extends b4.l {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        if (r8 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String l0(String str) {
        List list;
        i3.d.e(str, "<this>");
        if (d.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        c cVar = new c(str);
        if (cVar.hasNext()) {
            Object next = cVar.next();
            if (cVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (cVar.hasNext()) {
                    arrayList.add(cVar.next());
                }
                list = arrayList;
            } else {
                list = s.a.s(next);
            }
        } else {
            list = q.f3887f;
        }
        int length = str.length();
        list.size();
        int A = x2.i.A(list);
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            String str3 = null;
            if ((i != 0 && i != A) || !d.y0(str2)) {
                int length2 = str2.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length2) {
                        i5 = -1;
                        break;
                    }
                    char charAt = str2.charAt(i5);
                    if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                        break;
                    }
                    i5++;
                }
                if (i5 != -1 && l.p0(str2, "|", i5, false)) {
                    str3 = str2.substring("|".length() + i5);
                    i3.d.d(str3, "substring(...)");
                }
            }
            str2 = str3;
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length);
        x2.h.E(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
