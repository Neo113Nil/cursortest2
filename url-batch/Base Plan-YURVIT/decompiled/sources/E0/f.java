package E0;

import a.AbstractC0086a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f extends l {
    public static final void P(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, O0.l lVar) {
        P0.h.e(iterable, "<this>");
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.j(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    public static String Q(Collection collection, String str, String str2, String str3, O0.l lVar, int i2) {
        String str4 = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        P0.h.e(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        P(collection, sb, str, str4, str5, "...", lVar);
        return sb.toString();
    }

    public static final void R(Iterable iterable, AbstractCollection abstractCollection) {
        P0.h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List S(Iterable iterable) {
        ArrayList arrayList;
        P0.h.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                return AbstractC0086a.x(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            }
        } else {
            if (z2) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                R(iterable, arrayList);
            }
            int size2 = arrayList.size();
            if (size2 != 0) {
                return size2 != 1 ? arrayList : AbstractC0086a.x(arrayList.get(0));
            }
        }
        return o.f219e;
    }

    public static Set T(Collection collection) {
        P0.h.e(collection, "<this>");
        int size = collection.size();
        if (size == 0) {
            return q.f221e;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0086a.y(collection.size()));
            R(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        P0.h.d(singleton, "singleton(...)");
        return singleton;
    }
}
