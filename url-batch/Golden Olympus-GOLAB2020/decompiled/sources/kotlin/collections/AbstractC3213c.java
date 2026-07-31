package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3213c extends AbstractC3211a implements List, InterfaceC2471a {

    @NotNull
    public static final a Companion = new a(null);

    /* renamed from: kotlin.collections.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("startIndex: " + i4 + ", endIndex: " + i5 + ", size: " + i6);
            }
            if (i4 <= i5) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i4 + " > endIndex: " + i5);
        }

        public final void b(int i4, int i5) {
            if (i4 < 0 || i4 >= i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void c(int i4, int i5) {
            if (i4 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void d(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
            }
            if (i4 <= i5) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
        }

        public final int e(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            return i6 - 2147483639 > 0 ? i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i6;
        }

        public final boolean f(Collection c4, Collection other) {
            Intrinsics.checkNotNullParameter(c4, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c4.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c4.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c4) {
            Intrinsics.checkNotNullParameter(c4, "c");
            Iterator it = c4.iterator();
            int i4 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i4 = (i4 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i4;
        }

        private a() {
        }
    }

    /* renamed from: kotlin.collections.c$b */
    private class b implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private int f41083b;

        public b() {
        }

        protected final int a() {
            return this.f41083b;
        }

        protected final void b(int i4) {
            this.f41083b = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41083b < AbstractC3213c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC3213c abstractC3213c = AbstractC3213c.this;
            int i4 = this.f41083b;
            this.f41083b = i4 + 1;
            return abstractC3213c.get(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    private class C0229c extends b implements ListIterator, InterfaceC2471a {
        public C0229c(int i4) {
            super();
            AbstractC3213c.Companion.c(i4, AbstractC3213c.this.size());
            b(i4);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC3213c abstractC3213c = AbstractC3213c.this;
            b(a() - 1);
            return abstractC3213c.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$d */
    private static final class d extends AbstractC3213c implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3213c f41086b;

        /* renamed from: c, reason: collision with root package name */
        private final int f41087c;

        /* renamed from: d, reason: collision with root package name */
        private int f41088d;

        public d(AbstractC3213c list, int i4, int i5) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f41086b = list;
            this.f41087c = i4;
            AbstractC3213c.Companion.d(i4, i5, list.size());
            this.f41088d = i5 - i4;
        }

        @Override // kotlin.collections.AbstractC3213c, java.util.List
        public Object get(int i4) {
            AbstractC3213c.Companion.b(i4, this.f41088d);
            return this.f41086b.get(this.f41087c + i4);
        }

        @Override // kotlin.collections.AbstractC3211a
        public int getSize() {
            return this.f41088d;
        }
    }

    protected AbstractC3213c() {
    }

    @Override // java.util.List
    public void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i4);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), obj)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<Object> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<Object> listIterator() {
        return new C0229c(0);
    }

    @Override // java.util.List
    public Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<Object> subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    @NotNull
    public ListIterator<Object> listIterator(int i4) {
        return new C0229c(i4);
    }
}
