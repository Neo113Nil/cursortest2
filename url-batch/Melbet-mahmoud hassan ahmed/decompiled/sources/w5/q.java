package w5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q extends p {
    public static final <T, A extends Appendable> A i(Iterable<? extends T> iterable, A a7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, f6.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(a7, "buffer");
        kotlin.jvm.internal.i.d(charSequence, "separator");
        kotlin.jvm.internal.i.d(charSequence2, "prefix");
        kotlin.jvm.internal.i.d(charSequence3, "postfix");
        kotlin.jvm.internal.i.d(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (T t6 : iterable) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            l6.e.a(a7, t6, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final <T> String k(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, f6.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(charSequence, "separator");
        kotlin.jvm.internal.i.d(charSequence2, "prefix");
        kotlin.jvm.internal.i.d(charSequence3, "postfix");
        kotlin.jvm.internal.i.d(charSequence4, "truncated");
        String sb = ((StringBuilder) i(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        kotlin.jvm.internal.i.c(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        int i9 = (i8 & 8) != 0 ? -1 : i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return k(iterable, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    public static <T extends Comparable<? super T>> T m(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> T n(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T o(List<? extends T> list) {
        kotlin.jvm.internal.i.d(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T, C extends Collection<? super T>> C p(Iterable<? extends T> iterable, C c7) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        kotlin.jvm.internal.i.d(c7, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c7.add(it.next());
        }
        return c7;
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i.e(r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.b();
        }
        if (size != 1) {
            return s(collection);
        }
        return h.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> r(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.i.d(iterable, "<this>");
        return iterable instanceof Collection ? s((Collection) iterable) : (List) p(iterable, new ArrayList());
    }

    public static final <T> List<T> s(Collection<? extends T> collection) {
        kotlin.jvm.internal.i.d(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> t(Iterable<? extends T> iterable) {
        Set<T> b7;
        int a7;
        kotlin.jvm.internal.i.d(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d0.c((Set) p(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            b7 = d0.b();
            return b7;
        }
        if (size == 1) {
            return c0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        a7 = y.a(collection.size());
        return (Set) p(iterable, new LinkedHashSet(a7));
    }
}
