package V0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public abstract class g extends m {
    public static final void A0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, f1.l lVar) {
        g1.d.e(charSequence, "separator");
        g1.d.e(charSequence2, "prefix");
        g1.d.e(charSequence3, "postfix");
        g1.d.e(charSequence4, "truncated");
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
                AbstractC0180a.a(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static byte[] B0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void C0(Iterable iterable, AbstractCollection abstractCollection) {
        g1.d.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List D0(Iterable iterable) {
        ArrayList arrayList;
        g1.d.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        p pVar = p.f917a;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                C0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : z1.d.Y(arrayList.get(0)) : pVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return pVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return z1.d.Y(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static Set E0(ArrayList arrayList) {
        r rVar = r.f919a;
        int size = arrayList.size();
        if (size == 0) {
            return rVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(s.d0(arrayList.size()));
            C0(arrayList, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(arrayList.get(0));
        g1.d.d(singleton, "singleton(...)");
        return singleton;
    }

    public static List z0(List list) {
        g1.d.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
        }
        p pVar = p.f917a;
        if (size == 0) {
            return pVar;
        }
        if (size >= list.size()) {
            return D0(list);
        }
        if (size == 1) {
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return z1.d.Y(list.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : z1.d.Y(arrayList.get(0)) : pVar;
    }
}
