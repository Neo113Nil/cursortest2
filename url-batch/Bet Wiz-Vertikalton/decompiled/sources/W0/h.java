package W0;

import j0.AbstractC0142a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static final void o0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, d1.l lVar) {
        e1.d.e(charSequence, "separator");
        e1.d.e(charSequence2, "prefix");
        e1.d.e(charSequence3, "postfix");
        e1.d.e(charSequence4, "truncated");
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
                AbstractC0142a.b(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static List p0(List list) {
        e1.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? q0(list) : x1.l.S(list.get(0)) : q.f896a;
    }

    public static ArrayList q0(Collection collection) {
        e1.d.e(collection, "<this>");
        return new ArrayList(collection);
    }
}
