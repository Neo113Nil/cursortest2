package Y0;

import c1.AbstractC0091d;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class j extends p {
    public static final void B0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, j1.l lVar) {
        k1.e.e(charSequence, "separator");
        k1.e.e(charSequence2, "prefix");
        k1.e.e(charSequence3, "postfix");
        k1.e.e(charSequence4, "truncated");
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
                AbstractC0091d.a(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static final void C0(Iterable iterable, AbstractCollection abstractCollection) {
        k1.e.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List D0(Iterable iterable) {
        ArrayList arrayList;
        k1.e.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        s sVar = s.f1516a;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                C0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : H1.d.R(arrayList.get(0)) : sVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return sVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return H1.d.R(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static Set E0(ArrayList arrayList) {
        u uVar = u.f1518a;
        int size = arrayList.size();
        if (size == 0) {
            return uVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(v.i0(arrayList.size()));
            C0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        k1.e.d(singleton, "singleton(...)");
        return singleton;
    }
}
