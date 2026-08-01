package n2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static final void G(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, b3.n nVar) {
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : collection) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            k3.m.h(sb, obj, nVar);
        }
        sb.append(charSequence3);
    }

    public static List H(List list) {
        u2.c.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : m0.a.r(list.get(0)) : o.f2953f;
    }
}
