package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static ArrayList A(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet B(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection != null) {
            return new LinkedHashSet(collection);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.k(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static Set C(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C.f6117d;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(H.a(collection.size()));
                CollectionsKt___CollectionsKt.k(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
            Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        CollectionsKt___CollectionsKt.k(iterable, linkedHashSet2);
        Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return C.f6117d;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        Intrinsics.checkNotNullExpressionValue(singleton2, "singleton(...)");
        return singleton2;
    }

    public static boolean m(Iterable iterable, Object obj) {
        int i2;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i5 < 0) {
                    r.f();
                    throw null;
                }
                if (Intrinsics.a(obj, next)) {
                    i2 = i5;
                    break;
                }
                i5++;
            }
        } else {
            i2 = ((List) iterable).indexOf(obj);
        }
        return i2 >= 0;
    }

    public static Object n(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection instanceof List) {
            return o((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object o(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object q(int i2, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static String s(Iterable iterable, String str, String str2, String str3, Function1 function1, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i2 & 2) != 0 ? "" : str2;
        String postfix = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.j(iterable, sb, separator, prefix, postfix, function1);
        return sb.toString();
    }

    public static Object t(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(r.c(list));
    }

    public static ArrayList u(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements == null) {
            ArrayList arrayList = new ArrayList(collection);
            w.h(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List v(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection != null && collection.size() <= 1) {
            return z(collection);
        }
        List l7 = CollectionsKt___CollectionsKt.l(collection);
        Intrinsics.checkNotNullParameter(l7, "<this>");
        Collections.reverse(l7);
        return l7;
    }

    public static List w(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list == null) {
            List l7 = CollectionsKt___CollectionsKt.l(list);
            Intrinsics.checkNotNullParameter(l7, "<this>");
            if (((ArrayList) l7).size() > 1) {
                Collections.sort(l7);
            }
            return l7;
        }
        if (list.size() <= 1) {
            return z(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return o.b(array);
    }

    public static List x(int i2, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.h(i2, "Requested element count ", " is less than zero.").toString());
        }
        if (i2 == 0) {
            return A.f6115d;
        }
        if (i2 >= list.size()) {
            return z(list);
        }
        if (i2 == 1) {
            return q.b(n(list));
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i5++;
            if (i5 == i2) {
                break;
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : q.b(arrayList.get(0)) : A.f6115d;
    }

    public static HashSet y(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(H.a(s.g(arrayList, 12)));
        CollectionsKt___CollectionsKt.k(arrayList, hashSet);
        return hashSet;
    }

    public static List z(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List l7 = CollectionsKt___CollectionsKt.l(iterable);
            Intrinsics.checkNotNullParameter(l7, "<this>");
            ArrayList arrayList = (ArrayList) l7;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? l7 : q.b(arrayList.get(0)) : A.f6115d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return A.f6115d;
        }
        if (size2 != 1) {
            return A(collection);
        }
        return q.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }
}
