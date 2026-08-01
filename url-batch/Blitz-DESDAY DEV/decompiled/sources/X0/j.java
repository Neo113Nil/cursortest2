package X0;

import h0.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class j extends p {
    public static Object B0(List list) {
        g1.d.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final void C0(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, f1.l lVar) {
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
                a0.a(sb, obj, lVar);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static ArrayList D0(Collection collection, Iterable iterable) {
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(collection2);
        return arrayList;
    }

    public static Object E0(ArrayList arrayList, i1.d dVar) {
        g1.d.e(dVar, "random");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return arrayList.get(i1.e.f2620b.b(arrayList.size()));
    }

    public static List F0(List list, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        s sVar = s.f992a;
        if (i == 0) {
            return sVar;
        }
        if (i >= list.size()) {
            return G0(list);
        }
        if (i == 1) {
            return z1.l.a0(B0(list));
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
        return size != 0 ? size != 1 ? arrayList : z1.l.a0(arrayList.get(0)) : sVar;
    }

    public static List G0(List list) {
        g1.d.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? new ArrayList(list) : z1.l.a0(list.get(0)) : s.f992a;
    }
}
