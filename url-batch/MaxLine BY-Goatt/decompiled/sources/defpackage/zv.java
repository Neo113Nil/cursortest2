package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class zv extends xv {
    public static String A(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? BuildConfig.FLAVOR : str2;
        String str6 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        y(iterable, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static Object B(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        ch2.k("List is empty.");
        return null;
    }

    public static Object C(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable D(ArrayList arrayList) {
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

    public static ArrayList E(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            vv.o(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList F(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List G(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return M(iterable);
        }
        List O = O(iterable);
        Collections.reverse(O);
        return O;
    }

    public static List H(List list) {
        list.getClass();
        if (list.size() <= 1) {
            return M(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return ni.b(array);
    }

    public static List I(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List O = O(iterable);
            uv.n(O, comparator);
            return O;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return M(iterable);
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

    public static List J(int i, List list) {
        list.getClass();
        if (i < 0) {
            lh.c(in1.l(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return ah0.m;
        }
        if (i >= list.size()) {
            return M(list);
        }
        if (i == 1) {
            return pv.c(t(list));
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
        return qv.i(arrayList);
    }

    public static final void K(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] L(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List M(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return qv.i(O(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ah0.m;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return pv.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList N(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List O(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        K(iterable, arrayList);
        return arrayList;
    }

    public static Set P(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        K(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set Q(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            K(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : qj2.b(linkedHashSet.iterator().next()) : fh0.m;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return fh0.m;
        }
        if (size2 == 1) {
            return qj2.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(li1.a(collection.size()));
        K(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static boolean q(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : x(iterable, obj) >= 0;
    }

    public static List r(int i, List list) {
        list.getClass();
        if (i < 0) {
            lh.c(in1.l(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return M(list);
        }
        int size = list.size() - i;
        if (size <= 0) {
            return ah0.m;
        }
        if (size == 1) {
            return pv.c(B(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i < size2) {
                arrayList.add(list.get(i));
                i++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList s(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object t(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return u((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        ch2.k("Collection is empty.");
        return null;
    }

    public static Object u(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        ch2.k("List is empty.");
        return null;
    }

    public static Object v(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object w(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int x(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                qv.k();
                throw null;
            }
            if (Intrinsics.b(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void y(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            mp2.a(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void z(List list, StringBuilder sb, a0 a0Var, int i) {
        if ((i & 64) != 0) {
            a0Var = null;
        }
        y(list, sb, "\n", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "...", a0Var);
    }
}
