package z2;

import A.AbstractC0017m;
import A.C0028y;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1403G extends C1402F {
    public static ArrayList A(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList B(Collection collection, List elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements == null) {
            ArrayList arrayList = new ArrayList(collection);
            C1400D.j(elements, arrayList);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(elements.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(elements);
        return arrayList2;
    }

    public static List C(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return H(iterable);
        }
        List J3 = J(iterable);
        Intrinsics.checkNotNullParameter(J3, "<this>");
        Collections.reverse(J3);
        return J3;
    }

    public static List D(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list == null) {
            List J3 = J(list);
            C1399C.i(J3, comparator);
            return J3;
        }
        if (list.size() <= 1) {
            return H(list);
        }
        Object[] array = list.toArray(new Object[0]);
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C1436t.b(array);
    }

    public static List E(Iterable iterable, int i2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.h(i2, "Requested element count ", " is less than zero.").toString());
        }
        if (i2 == 0) {
            return C1405I.f11931d;
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return H(iterable);
            }
            if (i2 == 1) {
                return C1440x.a(p(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = iterable.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == i2) {
                break;
            }
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : C1440x.a(arrayList.get(0)) : C1405I.f11931d;
    }

    public static final void F(Iterable iterable, AbstractCollection destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
    }

    public static int[] G(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List H(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List J3 = J(iterable);
            Intrinsics.checkNotNullParameter(J3, "<this>");
            ArrayList arrayList = (ArrayList) J3;
            int size = arrayList.size();
            return size != 0 ? size != 1 ? J3 : C1440x.a(arrayList.get(0)) : C1405I.f11931d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return C1405I.f11931d;
        }
        if (size2 != 1) {
            return I(collection);
        }
        return C1440x.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static ArrayList I(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List J(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return I((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        F(iterable, arrayList);
        return arrayList;
    }

    public static Set K(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C1407K.f11933d;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C1411O.a(collection.size()));
                F(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        F(iterable, linkedHashSet2);
        Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return C1407K.f11933d;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        Intrinsics.checkNotNullExpressionValue(singleton2, "singleton(...)");
        return singleton2;
    }

    public static boolean o(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : t(iterable, obj) >= 0;
    }

    public static Object p(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return q((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object r(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object s(int i2, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static int t(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            if (Intrinsics.a(obj, obj2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void u(Iterable iterable, StringBuilder buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i4 > i2) {
                break;
            } else {
                kotlin.text.l.a(buffer, obj, function1);
            }
        }
        if (i2 >= 0 && i4 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void v(List list, StringBuilder sb, C0028y c0028y, int i2) {
        if ((i2 & 64) != 0) {
            c0028y = null;
        }
        u(list, sb, "\n", "", "", -1, "...", c0028y);
    }

    public static String w(Iterable iterable, String str, String str2, String str3, Function1 function1, int i2) {
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
        u(iterable, sb, separator, prefix, postfix, -1, "...", function1);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static Object x(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C1441y.d(list));
    }

    public static Object y(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable z(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
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
}
