package S1;

import B.C0022x;
import e2.InterfaceC0424c;
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
import n.T;

/* loaded from: classes.dex */
public abstract class l extends r {
    public static Object J0(Iterable iterable) {
        f2.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return K0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object K0(List list) {
        f2.j.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object L0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int M0(Iterable iterable, Object obj) {
        f2.j.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                m.D0();
                throw null;
            }
            if (f2.j.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final void N0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, InterfaceC0424c interfaceC0424c) {
        f2.j.f(iterable, "<this>");
        f2.j.f(charSequence, "separator");
        f2.j.f(charSequence2, "prefix");
        f2.j.f(charSequence3, "postfix");
        f2.j.f(charSequence4, "truncated");
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
                T.h(sb, obj, interfaceC0424c);
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void O0(List list, StringBuilder sb, C0022x c0022x, int i3) {
        if ((i3 & 64) != 0) {
            c0022x = null;
        }
        N0(list, sb, "\n", "", "", -1, "...", c0022x);
    }

    public static String P0(Iterable iterable, String str, String str2, String str3, InterfaceC0424c interfaceC0424c, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            interfaceC0424c = null;
        }
        f2.j.f(iterable, "<this>");
        f2.j.f(str4, "separator");
        f2.j.f(str5, "prefix");
        f2.j.f(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        N0(iterable, sb, str4, str5, str6, -1, "...", interfaceC0424c);
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }

    public static Object Q0(List list) {
        f2.j.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.z0(list));
    }

    public static Object R0(List list) {
        f2.j.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable S0(ArrayList arrayList) {
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

    public static ArrayList T0(Collection collection, Object obj) {
        f2.j.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList U0(Collection collection, List list) {
        f2.j.f(collection, "<this>");
        f2.j.f(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List V0(Iterable iterable) {
        f2.j.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return a1(iterable);
        }
        List c12 = c1(iterable);
        Collections.reverse(c12);
        return c12;
    }

    public static List W0(Iterable iterable, Comparator comparator) {
        f2.j.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List c12 = c1(iterable);
            q.F0(c12, comparator);
            return c12;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return a1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        f2.j.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.h0(array);
    }

    public static List X0(Iterable iterable, int i3) {
        f2.j.f(iterable, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(A.k.g(i3, "Requested element count ", " is less than zero.").toString());
        }
        u uVar = u.f4320d;
        if (i3 == 0) {
            return uVar;
        }
        if (iterable instanceof Collection) {
            if (i3 >= ((Collection) iterable).size()) {
                return a1(iterable);
            }
            if (i3 == 1) {
                return O2.l.l0(J0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == i3) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : O2.l.l0(arrayList.get(0)) : uVar;
    }

    public static final void Y0(Iterable iterable, AbstractCollection abstractCollection) {
        f2.j.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] Z0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List a1(Iterable iterable) {
        f2.j.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        u uVar = u.f4320d;
        if (!z3) {
            List c12 = c1(iterable);
            ArrayList arrayList = (ArrayList) c12;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? c12 : O2.l.l0(arrayList.get(0)) : uVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            return b1(collection);
        }
        return O2.l.l0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList b1(Collection collection) {
        f2.j.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List c1(Iterable iterable) {
        f2.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return b1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Y0(iterable, arrayList);
        return arrayList;
    }

    public static Set d1(Iterable iterable) {
        f2.j.f(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        w wVar = w.f4322d;
        if (!z3) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Y0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return wVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(linkedHashSet.iterator().next());
            f2.j.e(singleton, "singleton(...)");
            return singleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(B.J(collection.size()));
            Y0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        f2.j.e(singleton2, "singleton(...)");
        return singleton2;
    }
}
