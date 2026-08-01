package T0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static Object n0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void o0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, a1.l lVar) {
        b1.d.e(charSequence, "separator");
        b1.d.e(charSequence2, "prefix");
        b1.d.e(charSequence3, "postfix");
        b1.d.e(charSequence4, "truncated");
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
                u1.l.f(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static List p0(List list) {
        b1.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : u1.d.P(list.get(0)) : q.f844a;
    }
}
