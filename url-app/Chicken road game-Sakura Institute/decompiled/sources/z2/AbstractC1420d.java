package z2;

import M2.C0249a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1420d<E> extends AbstractC1418b implements List<E> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f11939d = new a(null);

    @Metadata
    /* renamed from: z2.d$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i2, int i4, int i5) {
            if (i2 >= 0 && i4 <= i5) {
                if (i2 > i4) {
                    throw new IllegalArgumentException(r0.B.b(i2, i4, "startIndex: ", " > endIndex: "));
                }
                return;
            }
            throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i4 + ", size: " + i5);
        }

        public static void b(int i2, int i4) {
            if (i2 < 0 || i2 >= i4) {
                throw new IndexOutOfBoundsException(r0.B.b(i2, i4, "index: ", ", size: "));
            }
        }

        public static void c(int i2, int i4) {
            if (i2 < 0 || i2 > i4) {
                throw new IndexOutOfBoundsException(r0.B.b(i2, i4, "index: ", ", size: "));
            }
        }

        public static void d(int i2, int i4, int i5) {
            if (i2 >= 0 && i4 <= i5) {
                if (i2 > i4) {
                    throw new IllegalArgumentException(r0.B.b(i2, i4, "fromIndex: ", " > toIndex: "));
                }
                return;
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i4 + ", size: " + i5);
        }

        public static int e(int i2, int i4) {
            int i5 = i2 + (i2 >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            return i5 - 2147483639 > 0 ? i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i5;
        }
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        f11939d.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        f11939d.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i2;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0249a(6, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C1421e(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i2, int i4) {
        return new C1422f(this, i2, i4);
    }

    public ListIterator listIterator(int i2) {
        return new C1421e(this, i2);
    }
}
