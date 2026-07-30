package kotlin.collections.builders;

import g6.f;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.d;
import kotlin.collections.g;
import kotlin.collections.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class ListBuilder<E> extends d implements RandomAccess, Serializable {
    private static final a Companion = new a(null);
    private static final ListBuilder Empty;
    private E[] array;
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    private final ListBuilder<E> root;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private static final class b implements ListIterator, f {
        private int index;
        private int lastIndex;
        private final ListBuilder<Object> list;

        public b(ListBuilder<Object> list, int i8) {
            s.checkNotNullParameter(list, "list");
            this.list = list;
            this.index = i8;
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            ListBuilder<Object> listBuilder = this.list;
            int i8 = this.index;
            this.index = i8 + 1;
            listBuilder.add(i8, obj);
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((ListBuilder) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            if (this.index >= ((ListBuilder) this.list).length) {
                throw new NoSuchElementException();
            }
            int i8 = this.index;
            this.index = i8 + 1;
            this.lastIndex = i8;
            return ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i8 = this.index;
            if (i8 <= 0) {
                throw new NoSuchElementException();
            }
            int i9 = i8 - 1;
            this.index = i9;
            this.lastIndex = i9;
            return ((ListBuilder) this.list).array[((ListBuilder) this.list).offset + this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i8 = this.lastIndex;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.list.remove(i8);
            this.index = this.lastIndex;
            this.lastIndex = -1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            int i8 = this.lastIndex;
            if (i8 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.list.set(i8, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        Empty = listBuilder;
    }

    private ListBuilder(E[] eArr, int i8, int i9, boolean z7, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i8;
        this.length = i9;
        this.isReadOnly = z7;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final void addAllInternal(int i8, Collection<? extends E> collection, int i9) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.addAllInternal(i8, collection, i9);
            this.array = this.backing.array;
            this.length += i9;
        } else {
            insertAtInternal(i8, i9);
            Iterator<? extends E> it = collection.iterator();
            for (int i10 = 0; i10 < i9; i10++) {
                this.array[i8 + i10] = it.next();
            }
        }
    }

    private final void addAtInternal(int i8, E e8) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder == null) {
            insertAtInternal(i8, 1);
            this.array[i8] = e8;
        } else {
            listBuilder.addAtInternal(i8, e8);
            this.array = this.backing.array;
            this.length++;
        }
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean subarrayContentEquals;
        subarrayContentEquals = z5.b.subarrayContentEquals(this.array, this.offset, this.length, list);
        return subarrayContentEquals;
    }

    private final void ensureCapacity(int i8) {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.array;
        if (i8 > eArr.length) {
            this.array = (E[]) z5.b.copyOfUninitializedElements(this.array, g.Companion.newCapacity$kotlin_stdlib(eArr.length, i8));
        }
    }

    private final void ensureExtraCapacity(int i8) {
        ensureCapacity(this.length + i8);
    }

    private final void insertAtInternal(int i8, int i9) {
        ensureExtraCapacity(i9);
        E[] eArr = this.array;
        k.copyInto(eArr, eArr, i8 + i9, i8, this.offset + this.length);
        this.length += i9;
    }

    private final boolean isEffectivelyReadOnly() {
        ListBuilder<E> listBuilder;
        return this.isReadOnly || ((listBuilder = this.root) != null && listBuilder.isReadOnly);
    }

    private final E removeAtInternal(int i8) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.removeAtInternal(i8);
        }
        E[] eArr = this.array;
        E e8 = eArr[i8];
        k.copyInto(eArr, eArr, i8, i8 + 1, this.offset + this.length);
        z5.b.resetAt(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e8;
    }

    private final void removeRangeInternal(int i8, int i9) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.removeRangeInternal(i8, i9);
        } else {
            E[] eArr = this.array;
            k.copyInto(eArr, eArr, i8, i8 + i9, this.length);
            E[] eArr2 = this.array;
            int i10 = this.length;
            z5.b.resetRange(eArr2, i10 - i9, i10);
        }
        this.length -= i9;
    }

    private final int retainOrRemoveAllInternal(int i8, int i9, Collection<? extends E> collection, boolean z7) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int retainOrRemoveAllInternal = listBuilder.retainOrRemoveAllInternal(i8, i9, collection, z7);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i8 + i10;
            if (collection.contains(this.array[i12]) == z7) {
                E[] eArr = this.array;
                i10++;
                eArr[i11 + i8] = eArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        E[] eArr2 = this.array;
        k.copyInto(eArr2, eArr2, i8 + i11, i9 + i8, this.length);
        E[] eArr3 = this.array;
        int i14 = this.length;
        z5.b.resetRange(eArr3, i14 - i13, i14);
        this.length -= i13;
        return i13;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e8) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e8);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    public final List<E> build() {
        if (this.backing != null) {
            throw new IllegalStateException();
        }
        checkIsMutable();
        this.isReadOnly = true;
        return this.length > 0 ? this : Empty;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i8) {
        kotlin.collections.b.Companion.checkElementIndex$kotlin_stdlib(i8, this.length);
        return this.array[this.offset + i8];
    }

    @Override // kotlin.collections.d
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int subarrayContentHashCode;
        subarrayContentHashCode = z5.b.subarrayContentHashCode(this.array, this.offset, this.length);
        return subarrayContentHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i8 = 0; i8 < this.length; i8++) {
            if (s.areEqual(this.array[this.offset + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i8 = this.length - 1; i8 >= 0; i8--) {
            if (s.areEqual(this.array[this.offset + i8], obj)) {
                return i8;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new b(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0;
    }

    @Override // kotlin.collections.d
    public E removeAt(int i8) {
        checkIsMutable();
        kotlin.collections.b.Companion.checkElementIndex$kotlin_stdlib(i8, this.length);
        return removeAtInternal(this.offset + i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        s.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        return retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0;
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public E set(int i8, E e8) {
        checkIsMutable();
        kotlin.collections.b.Companion.checkElementIndex$kotlin_stdlib(i8, this.length);
        E[] eArr = this.array;
        int i9 = this.offset;
        E e9 = eArr[i9 + i8];
        eArr[i9 + i8] = e8;
        return e9;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i8, int i9) {
        kotlin.collections.b.Companion.checkRangeIndexes$kotlin_stdlib(i8, i9, this.length);
        E[] eArr = this.array;
        int i10 = this.offset + i8;
        int i11 = i9 - i8;
        boolean z7 = this.isReadOnly;
        ListBuilder<E> listBuilder = this.root;
        return new ListBuilder(eArr, i10, i11, z7, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        s.checkNotNullParameter(destination, "destination");
        int length = destination.length;
        int i8 = this.length;
        if (length < i8) {
            E[] eArr = this.array;
            int i9 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i9, i8 + i9, destination.getClass());
            s.checkNotNullExpressionValue(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i10 = this.offset;
        k.copyInto(eArr2, destination, 0, i10, i8 + i10);
        int length2 = destination.length;
        int i11 = this.length;
        if (length2 > i11) {
            destination[i11] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String subarrayContentToString;
        subarrayContentToString = z5.b.subarrayContentToString(this.array, this.offset, this.length);
        return subarrayContentToString;
    }

    public ListBuilder() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i8) {
        kotlin.collections.b.Companion.checkPositionIndex$kotlin_stdlib(i8, this.length);
        return new b(this, i8);
    }

    public ListBuilder(int i8) {
        this(z5.b.arrayOfUninitializedElements(i8), 0, 0, false, null, null);
    }

    @Override // kotlin.collections.d, java.util.AbstractList, java.util.List
    public void add(int i8, E e8) {
        checkIsMutable();
        kotlin.collections.b.Companion.checkPositionIndex$kotlin_stdlib(i8, this.length);
        addAtInternal(this.offset + i8, e8);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection<? extends E> elements) {
        s.checkNotNullParameter(elements, "elements");
        checkIsMutable();
        kotlin.collections.b.Companion.checkPositionIndex$kotlin_stdlib(i8, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i8, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.array;
        int i8 = this.offset;
        return k.copyOfRange(eArr, i8, this.length + i8);
    }
}
