package M1;

import H2.AbstractC0080b;
import a.AbstractC0157a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l extends r {
    public static final void A0(Iterable iterable, AbstractCollection abstractCollection) {
        Z1.i.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] B0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List C0(Iterable iterable) {
        Z1.i.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        u uVar = u.f2803d;
        if (!z3) {
            List E02 = E0(iterable);
            ArrayList arrayList = (ArrayList) E02;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? E02 : AbstractC0157a.M(arrayList.get(0)) : uVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            return D0(collection);
        }
        return AbstractC0157a.M(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList D0(Collection collection) {
        Z1.i.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List E0(Iterable iterable) {
        Z1.i.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return D0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A0(iterable, arrayList);
        return arrayList;
    }

    public static Set F0(Iterable iterable) {
        Z1.i.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        w wVar = w.f2805d;
        if (!z3) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            A0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return wVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            Z1.i.e(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(B.I(collection.size()));
            A0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        Z1.i.e(singleton2, "singleton(...)");
        return singleton2;
    }

    public static Object l0(Iterable iterable) {
        Z1.i.f(iterable, "<this>");
        if (iterable instanceof List) {
            return m0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object m0(List list) {
        Z1.i.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object n0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int o0(Iterable iterable, Object obj) {
        Z1.i.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                m.f0();
                throw null;
            }
            if (Z1.i.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void p0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, Y1.c cVar) {
        Z1.i.f(iterable, "<this>");
        Z1.i.f(charSequence, "separator");
        Z1.i.f(charSequence2, "prefix");
        Z1.i.f(charSequence3, "postfix");
        Z1.i.f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            } else {
                g2.i.H(sb, obj, cVar);
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String r0(Iterable iterable, String str, String str2, String str3, Y1.c cVar, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            cVar = null;
        }
        Z1.i.f(iterable, "<this>");
        Z1.i.f(str4, "separator");
        Z1.i.f(str5, "prefix");
        Z1.i.f(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        p0(iterable, sb, str4, str5, str6, -1, "...", cVar);
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }

    public static Object s0(List list) {
        Z1.i.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.b0(list));
    }

    public static Object t0(List list) {
        Z1.i.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable u0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList v0(Collection collection, Object obj) {
        Z1.i.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList w0(Collection collection, List list) {
        Z1.i.f(collection, "<this>");
        Z1.i.f(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List x0(Iterable iterable) {
        Z1.i.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C0(iterable);
        }
        List E02 = E0(iterable);
        Collections.reverse(E02);
        return E02;
    }

    public static List y0(List list, Comparator comparator) {
        Z1.i.f(list, "<this>");
        if (list.size() <= 1) {
            return C0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        Z1.i.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.T(array);
    }

    public static List z0(int i3, List list) {
        if (i3 < 0) {
            throw new IllegalArgumentException(AbstractC0080b.i("Requested element count ", i3, " is less than zero.").toString());
        }
        u uVar = u.f2803d;
        if (i3 == 0) {
            return uVar;
        }
        if (i3 >= list.size()) {
            return C0(list);
        }
        if (i3 == 1) {
            return AbstractC0157a.M(l0(list));
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == i3) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0157a.M(arrayList.get(0)) : uVar;
    }
}
