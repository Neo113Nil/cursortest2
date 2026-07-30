package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class b extends AbstractCollection implements List {
    public static final a Companion = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: " + i9);
        }

        public final void checkElementIndex$kotlin_stdlib(int i8, int i9) {
            if (i8 < 0 || i8 >= i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int i8, int i9) {
            if (i8 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("index: " + i8 + ", size: " + i9);
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int i8, int i9, int i10) {
            if (i8 < 0 || i9 > i10) {
                throw new IndexOutOfBoundsException("fromIndex: " + i8 + ", toIndex: " + i9 + ", size: " + i10);
            }
            if (i8 <= i9) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i8 + " > toIndex: " + i9);
        }

        public final boolean orderedEquals$kotlin_stdlib(Collection<?> c8, Collection<?> other) {
            kotlin.jvm.internal.s.checkNotNullParameter(c8, "c");
            kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
            if (c8.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c8.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.s.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int orderedHashCode$kotlin_stdlib(Collection<?> c8) {
            kotlin.jvm.internal.s.checkNotNullParameter(c8, "c");
            Iterator<?> it = c8.iterator();
            int i8 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i8 = (i8 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i8;
        }
    }

    /* renamed from: kotlin.collections.b$b, reason: collision with other inner class name */
    private class C0360b implements Iterator, g6.a {
        private int index;

        public C0360b() {
        }

        protected final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            int i8 = this.index;
            this.index = i8 + 1;
            return bVar.get(i8);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        protected final void setIndex(int i8) {
            this.index = i8;
        }
    }

    private class c extends C0360b implements ListIterator {
        public c(int i8) {
            super();
            b.Companion.checkPositionIndex$kotlin_stdlib(i8, b.this.size());
            setIndex(i8);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getIndex() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getIndex();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            setIndex(getIndex() - 1);
            return bVar.get(getIndex());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getIndex() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d extends b implements RandomAccess {
        private int _size;
        private final int fromIndex;
        private final b list;

        public d(b list, int i8, int i9) {
            kotlin.jvm.internal.s.checkNotNullParameter(list, "list");
            this.list = list;
            this.fromIndex = i8;
            b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, list.size());
            this._size = i9 - i8;
        }

        @Override // kotlin.collections.b, java.util.List
        public Object get(int i8) {
            b.Companion.checkElementIndex$kotlin_stdlib(i8, this._size);
            return this.list.get(this.fromIndex + i8);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }
    }

    protected b() {
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.orderedEquals$kotlin_stdlib(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i8);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.orderedHashCode$kotlin_stdlib(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.s.areEqual(it.next(), obj)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new C0360b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.s.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Object> subList(int i8, int i9) {
        return new d(this, i8, i9);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i8) {
        return new c(i8);
    }
}
