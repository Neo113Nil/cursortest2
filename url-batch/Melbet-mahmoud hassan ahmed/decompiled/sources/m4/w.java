package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class w {
    static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    static int b(int i7) {
        h.b(i7, "arraySize");
        return o4.d.j(i7 + 5 + (i7 / 10));
    }

    static boolean c(List<?> list, Object obj) {
        if (obj == l4.j.i(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return u.e(list.iterator(), list2.iterator());
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!l4.i.a(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    static int d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (l4.i.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int e(List<?> list, Object obj) {
        int size = list.size();
        int i7 = 0;
        if (obj == null) {
            while (i7 < size) {
                if (list.get(i7) == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        while (i7 < size) {
            if (obj.equals(list.get(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    static int f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (l4.i.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterator<? extends E> it) {
        ArrayList<E> h7 = h();
        u.a(h7, it);
        return h7;
    }

    @SafeVarargs
    public static <E> ArrayList<E> j(E... eArr) {
        l4.j.i(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
