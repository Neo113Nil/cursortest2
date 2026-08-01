package W0;

import h0.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static Object q0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void r0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1.l lVar) {
        h1.d.e(charSequence, "separator");
        h1.d.e(charSequence2, "prefix");
        h1.d.e(charSequence3, "postfix");
        h1.d.e(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : collection) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                d0.a(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String s0(Collection collection, String str, String str2, String str3, g1.l lVar, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        h1.d.e(str4, "prefix");
        h1.d.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        r0(collection, sb, str, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        h1.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static List t0(List list, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        p pVar = p.f959a;
        if (i == 0) {
            return pVar;
        }
        if (i >= list.size()) {
            return u0(list);
        }
        if (i == 1) {
            return A1.d.T(q0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : A1.d.T(arrayList.get(0)) : pVar;
    }

    public static List u0(List list) {
        h1.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : A1.d.T(list.get(0)) : p.f959a;
    }
}
