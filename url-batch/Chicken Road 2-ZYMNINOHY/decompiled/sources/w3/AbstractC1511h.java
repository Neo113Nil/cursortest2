package w3;

import a.AbstractC0124a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import d3.q;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: w3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1511h extends O3.d {
    public static String T(String str) {
        List list;
        kotlin.jvm.internal.i.e(str, "<this>");
        if (AbstractC1510g.j0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C1507d c1507d = new C1507d(str);
        if (c1507d.hasNext()) {
            Object next = c1507d.next();
            if (c1507d.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c1507d.hasNext()) {
                    arrayList.add(c1507d.next());
                }
                list = arrayList;
            } else {
                list = AbstractC0124a.H(next);
            }
        } else {
            list = q.f8333a;
        }
        int length = str.length();
        list.size();
        int size = list.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            String str2 = null;
            if (i4 < 0) {
                d3.j.X();
                throw null;
            }
            String str3 = (String) obj;
            if ((i4 != 0 && i4 != size) || !AbstractC1510g.j0(str3)) {
                int length2 = str3.length();
                int i6 = 0;
                while (true) {
                    if (i6 >= length2) {
                        i6 = -1;
                        break;
                    }
                    if (!AbstractC0457a.w(str3.charAt(i6))) {
                        break;
                    }
                    i6++;
                }
                if (i6 != -1 && o.Z(i6, str3, "|", false)) {
                    str2 = str3.substring("|".length() + i6);
                    kotlin.jvm.internal.i.d(str2, "substring(...)");
                }
                if (str2 == null) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                arrayList2.add(str2);
            }
            i4 = i5;
        }
        StringBuilder sb = new StringBuilder(length);
        d3.i.e0(arrayList2, sb, IOUtils.LINE_SEPARATOR_UNIX, "", "", "...", null);
        return sb.toString();
    }
}
