package m4;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t {
    public static <T> boolean a(Iterable<T> iterable, l4.k<? super T> kVar) {
        return u.b(iterable.iterator(), kVar);
    }

    public static <T> T b(Iterable<? extends T> iterable, T t6) {
        return (T) u.k(iterable.iterator(), t6);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) u.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) e(list);
    }

    public static <T> T d(Iterable<? extends T> iterable, T t6) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t6;
            }
            if (iterable instanceof List) {
                return (T) e(w.a(iterable));
            }
        }
        return (T) u.j(iterable.iterator(), t6);
    }

    private static <T> T e(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> boolean f(Iterable<T> iterable, l4.k<? super T> kVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? g((List) iterable, (l4.k) l4.j.i(kVar)) : u.o(iterable.iterator(), kVar);
    }

    private static <T> boolean g(List<T> list, l4.k<? super T> kVar) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            T t6 = list.get(i7);
            if (!kVar.apply(t6)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, t6);
                    } catch (IllegalArgumentException unused) {
                        h(list, kVar, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        h(list, kVar, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }

    private static <T> void h(List<T> list, l4.k<? super T> kVar, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (kVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }
}
