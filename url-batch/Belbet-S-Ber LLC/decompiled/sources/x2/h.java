package x2;

import a.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends n {
    public static final void E(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, g0 g0Var) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            b4.l.a(sb, obj, g0Var);
        }
        sb.append(charSequence3);
    }

    public static List F(ArrayList arrayList, Comparator comparator) {
        if (arrayList.size() <= 1) {
            return G(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        i3.d.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        i3.d.d(asList, "asList(...)");
        return asList;
    }

    public static List G(List list) {
        i3.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : s.a.s(list.get(0)) : q.f3887f;
    }
}
