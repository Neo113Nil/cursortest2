package d6;

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
public abstract class m extends r {
    public static boolean Q(Iterable iterable, Object obj) {
        q6.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : T(iterable, obj) >= 0;
    }

    public static Object R(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object S(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int T(Iterable iterable, Object obj) {
        q6.i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                s6.a.J();
                throw null;
            }
            if (q6.i.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void U(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, p6.c cVar) {
        q6.i.e(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            r2.r.f(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static String W(Iterable iterable, String str, String str2, String str3, p6.c cVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            cVar = null;
        }
        q6.i.e(iterable, "<this>");
        q6.i.e(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        U(iterable, sb, str4, str5, str6, "...", cVar);
        return sb.toString();
    }

    public static Object X(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(s6.a.t(list));
    }

    public static Object Y(List list) {
        q6.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable Z(ArrayList arrayList) {
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

    public static ArrayList a0(Collection collection, Object obj) {
        q6.i.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList b0(Collection collection, List list) {
        q6.i.e(collection, "<this>");
        q6.i.e(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List c0(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return g0(iterable);
        }
        List i02 = i0(iterable);
        Collections.reverse(i02);
        return i02;
    }

    public static List d0(ArrayList arrayList, Comparator comparator) {
        q6.i.e(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return g0(arrayList);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        q6.i.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        q6.i.d(asList, "asList(...)");
        return asList;
    }

    public static List e0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return u.f2326d;
        }
        if (i >= list.size()) {
            return g0(list);
        }
        if (i == 1) {
            return s6.a.x(R(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i) {
                break;
            }
        }
        return s6.a.A(arrayList);
    }

    public static final void f0(Iterable iterable, AbstractCollection abstractCollection) {
        q6.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List g0(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return s6.a.A(i0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u.f2326d;
        }
        if (size != 1) {
            return h0(collection);
        }
        return s6.a.x(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList h0(Collection collection) {
        q6.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List i0(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return h0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        f0(iterable, arrayList);
        return arrayList;
    }

    public static Set j0(Iterable iterable) {
        q6.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(y.F(collection.size()));
                    f0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                q6.i.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            f0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                q6.i.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return w.f2328d;
    }
}
