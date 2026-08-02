package G0;

import a.AbstractC0132a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d extends j {
    public static final void P(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, P0.l lVar) {
        Q0.h.e(collection, "<this>");
        Q0.h.e(charSequence, "separator");
        Q0.h.e(charSequence2, "prefix");
        Q0.h.e(charSequence3, "postfix");
        Q0.h.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.i(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) String.valueOf(next));
                }
            }
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String Q(Collection collection, String str, String str2, String str3, P0.l lVar, int i2) {
        String str4 = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        Q0.h.e(collection, "<this>");
        Q0.h.e(str4, "prefix");
        Q0.h.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        P(collection, sb, str, str4, str5, -1, "...", lVar);
        String sb2 = sb.toString();
        Q0.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static final void R(Iterable iterable, AbstractCollection abstractCollection) {
        Q0.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List S(Iterable iterable) {
        ArrayList arrayList;
        Q0.h.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        l lVar = l.f490e;
        if (!z2) {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                R(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : i1.a.u(arrayList.get(0)) : lVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return lVar;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return i1.a.u(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static Set T(Collection collection) {
        Q0.h.e(collection, "<this>");
        n nVar = n.f492e;
        int size = collection.size();
        if (size == 0) {
            return nVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0132a.z(collection.size()));
            R(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        Q0.h.d(singleton, "singleton(...)");
        return singleton;
    }
}
