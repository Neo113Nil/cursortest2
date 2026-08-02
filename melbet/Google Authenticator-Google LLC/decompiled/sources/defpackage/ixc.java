package defpackage;

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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixc {
    public static final void A(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void B(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean C(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!C((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof koq) && (obj2 instanceof koq)) {
                        throw null;
                    }
                    if ((obj instanceof kou) && (obj2 instanceof kou)) {
                        throw null;
                    }
                    if ((obj instanceof kor) && (obj2 instanceof kor)) {
                        throw null;
                    }
                    if ((obj instanceof kos) && (obj2 instanceof kos)) {
                        throw null;
                    }
                    if (!ksp.b(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static List D(Object[] objArr) {
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static void E(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static Object[] F(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static int G(int[] iArr) {
        iArr.getClass();
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int H(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int I(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Object J(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List K(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        R(objArr, arrayList);
        return arrayList;
    }

    public static List L(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return kpk.a;
        }
        if (length == 1) {
            return b(objArr[0]);
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        copyOf.getClass();
        return D(copyOf);
    }

    public static Set M(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return kpm.a;
        }
        if (length == 1) {
            return ixd.k(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ixd.m(length));
        S(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static void N(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void O(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void P(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        O(objArr, objArr2, 0, i, i2);
    }

    public static void R(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static void S(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static final void T(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(a.af(i2, i, "index: ", ", size: "));
        }
    }

    public static final void U(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a.af(i2, i, "index: ", ", size: "));
        }
    }

    public static final void V(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(a.af(i2, i, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static final int W(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return (-2147483639) + i3 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static final Object X(Throwable th) {
        th.getClass();
        return new kom(th);
    }

    public static final void Y(Object obj) {
        if (obj instanceof kom) {
            throw ((kom) obj).a;
        }
    }

    public static final List a(List list) {
        kpt kptVar = (kpt) list;
        kptVar.h();
        kptVar.d = true;
        return kptVar.c > 0 ? list : kpt.a;
    }

    public static final List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List c(Object... objArr) {
        return new ArrayList(new kph(objArr));
    }

    public static void d() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static Object e(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public static Object f(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object g(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object h(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object i(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return j((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object j(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static List k(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List l(Collection collection, Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List m(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List n(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return p(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return D(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List o(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return p(iterable);
        }
        Object[] array = iterable.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return D(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List p(Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size == 0) {
            return kpk.a;
        }
        if (size != 1) {
            return q(iterable);
        }
        return b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static List q(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set r(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (iterable2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static Set s(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            B(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : ixd.k(linkedHashSet.iterator().next()) : kpm.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return kpm.a;
        }
        if (size2 == 1) {
            return ixd.k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(ixd.m(collection.size()));
        B(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean t(Iterable iterable, Object obj) {
        iterable.getClass();
        return iterable.contains(obj);
    }

    public static int[] u(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void v(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static int w(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static void x(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, krt krtVar) {
        appendable.append(charSequence2);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            ksp.e(appendable, next, krtVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String y(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, krt krtVar, int i) {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        x(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : krtVar);
        return sb.toString();
    }

    public static void z(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }
}
