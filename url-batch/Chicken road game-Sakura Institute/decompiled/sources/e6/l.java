package e6;

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
    public static boolean f0(Iterable iterable, Object obj) {
        r6.k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : j0(iterable, obj) >= 0;
    }

    public static Object g0(Iterable iterable) {
        r6.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object h0(List list) {
        r6.k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object i0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static int j0(Iterable iterable, Object obj) {
        r6.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                m.Z();
                throw null;
            }
            if (r6.k.a(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static final void k0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, q6.c cVar) {
        r6.k.f(iterable, "<this>");
        sb.append(charSequence2);
        int i7 = 0;
        for (Object obj : iterable) {
            i7++;
            if (i7 > 1) {
                sb.append(charSequence);
            }
            u3.r.b(sb, obj, cVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void l0(List list, StringBuilder sb, c1.a aVar, int i7) {
        if ((i7 & 64) != 0) {
            aVar = null;
        }
        k0(list, sb, "\n", "", "", "...", aVar);
    }

    public static String m0(Iterable iterable, String str, String str2, String str3, q6.c cVar, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 2) != 0 ? "" : str2;
        String str6 = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            cVar = null;
        }
        r6.k.f(iterable, "<this>");
        r6.k.f(str5, "prefix");
        StringBuilder sb = new StringBuilder();
        k0(iterable, sb, str4, str5, str6, "...", cVar);
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        return sb2;
    }

    public static Object n0(List list) {
        r6.k.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(m.W(list));
    }

    public static Object o0(List list) {
        r6.k.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable p0(ArrayList arrayList) {
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

    public static ArrayList q0(Collection collection, Object obj) {
        r6.k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList r0(Collection collection, List list) {
        r6.k.f(collection, "<this>");
        r6.k.f(list, "elements");
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static List s0(Iterable iterable) {
        r6.k.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return w0(iterable);
        }
        List y02 = y0(iterable);
        Collections.reverse(y02);
        return y02;
    }

    public static List t0(List list, Comparator comparator) {
        r6.k.f(list, "<this>");
        if (list.size() <= 1) {
            return w0(list);
        }
        Object[] array = list.toArray(new Object[0]);
        r6.k.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return k.T(array);
    }

    public static final void u0(Iterable iterable, AbstractCollection abstractCollection) {
        r6.k.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] v0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            iArr[i7] = ((Number) obj).intValue();
            i7++;
        }
        return iArr;
    }

    public static List w0(Iterable iterable) {
        r6.k.f(iterable, "<this>");
        boolean z8 = iterable instanceof Collection;
        u uVar = u.f2826f;
        if (!z8) {
            List y02 = y0(iterable);
            ArrayList arrayList = (ArrayList) y02;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? y02 : t6.a.F(arrayList.get(0)) : uVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return uVar;
        }
        if (size2 != 1) {
            return x0(collection);
        }
        return t6.a.F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList x0(Collection collection) {
        r6.k.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List y0(Iterable iterable) {
        r6.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return x0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        u0(iterable, arrayList);
        return arrayList;
    }

    public static Set z0(Iterable iterable) {
        r6.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(d0.h0(collection.size()));
                    u0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                r6.k.e(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            u0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                r6.k.e(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return w.f2828f;
    }
}
