package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = a4.j.LONG_FIELD_NUMBER, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 49)
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    public static /* synthetic */ void A(Iterable iterable, StringBuilder sb2, String str, a1.f fVar, int i3) {
        if ((i3 & 64) != 0) {
            fVar = null;
        }
        CollectionsKt___CollectionsKt.r(iterable, sb2, str, "", "", "...", fVar);
    }

    public static String B(Iterable iterable, String str, String str2, String str3, Function1 function1, int i3) {
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i3 & 2) != 0 ? "" : str2;
        String str6 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.r(iterable, sb2, str4, str5, str6, "...", function1);
        return sb2.toString();
    }

    public static Object C(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object D(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable E(ArrayList arrayList) {
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

    public static ArrayList F(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList G(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static Object H(Collection collection, zd.c cVar) {
        collection.getClass();
        cVar.getClass();
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return CollectionsKt___CollectionsKt.q(zd.d.f10965e.e(collection.size()), collection);
    }

    public static Object I(ArrayList arrayList, zd.c cVar) {
        cVar.getClass();
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt___CollectionsKt.q(zd.d.f10965e.e(arrayList.size()), arrayList);
    }

    public static List J(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return Q(iterable);
        }
        List t6 = CollectionsKt___CollectionsKt.t(iterable);
        Collections.reverse(t6);
        return t6;
    }

    public static List K(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List t6 = CollectionsKt___CollectionsKt.t(iterable);
            if (((ArrayList) t6).size() > 1) {
                Collections.sort(t6);
            }
            return t6;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return v.b(array);
    }

    public static List L(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List t6 = CollectionsKt___CollectionsKt.t(iterable);
            c0.k(t6, comparator);
            return t6;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List M(Iterable iterable, int i3) {
        iterable.getClass();
        if (i3 < 0) {
            a2.r.h(n0.l.f(i3, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i3 == 0) {
            return j0.f5574d;
        }
        if (iterable instanceof Collection) {
            if (i3 >= ((Collection) iterable).size()) {
                return Q(iterable);
            }
            if (i3 == 1) {
                return x.c(w(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i3);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i3) {
                break;
            }
        }
        return y.h(arrayList);
    }

    public static boolean[] N(List list) {
        list.getClass();
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        return zArr;
    }

    public static HashSet O(ArrayList arrayList) {
        arrayList.getClass();
        HashSet hashSet = new HashSet(o0.a(z.j(arrayList, 12)));
        CollectionsKt___CollectionsKt.s(arrayList, hashSet);
        return hashSet;
    }

    public static int[] P(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = ((Number) it.next()).intValue();
            i3++;
        }
        return iArr;
    }

    public static List Q(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return y.h(CollectionsKt___CollectionsKt.t(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j0.f5574d;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return x.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList R(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static LinkedHashSet S(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.s(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set T(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.s(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : u0.b(linkedHashSet.iterator().next()) : l0.f5576d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return l0.f5576d;
        }
        if (size2 == 1) {
            return u0.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(o0.a(collection.size()));
        CollectionsKt___CollectionsKt.s(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static boolean u(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : z(iterable, obj) >= 0;
    }

    public static List v(Iterable iterable, int i3) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i3 < 0) {
            a2.r.h(n0.l.f(i3, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i3 == 0) {
            return Q(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i3;
            if (size <= 0) {
                return j0.f5574d;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = C((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return x.c(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i3 < size2) {
                        arrayList.add(list.get(i3));
                        i3++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i3);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 >= i3) {
                arrayList.add(obj2);
            } else {
                i10++;
            }
        }
        return y.h(arrayList);
    }

    public static Object w(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return x((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object x(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object y(int i3, List list) {
        list.getClass();
        if (i3 < 0 || i3 >= list.size()) {
            return null;
        }
        return list.get(i3);
    }

    public static int z(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                y.i();
                throw null;
            }
            if (Intrinsics.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }
}
