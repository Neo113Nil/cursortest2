package y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public final class s implements Collection, g6.a {
    private final long[] storage;

    private static final class a implements Iterator, g6.a {
        private final long[] array;
        private int index;

        public a(long[] array) {
            kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return r.m1704boximpl(m1780nextsVKNKU());
        }

        /* renamed from: next-s-VKNKU, reason: not valid java name */
        public long m1780nextsVKNKU() {
            int i8 = this.index;
            long[] jArr = this.array;
            if (i8 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i8 + 1;
            return r.m1710constructorimpl(jArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ s(long[] jArr) {
        this.storage = jArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ s m1763boximpl(long[] jArr) {
        return new s(jArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m1765constructorimpl(long[] storage) {
        kotlin.jvm.internal.s.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m1767containsAllimpl(long[] jArr, Collection<r> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection<r> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof r) || !ArraysKt___ArraysKt.contains(jArr, ((r) obj).m1762unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1768equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof s) && kotlin.jvm.internal.s.areEqual(jArr, ((s) obj).m1779unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1769equalsimpl0(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.s.areEqual(jArr, jArr2);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m1770getsVKNKU(long[] jArr, int i8) {
        return r.m1710constructorimpl(jArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m1771getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1772hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m1773isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<r> m1774iteratorimpl(long[] jArr) {
        return new a(jArr);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m1775setk8EXiF4(long[] jArr, int i8, long j8) {
        jArr[i8] = j8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1776toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ, reason: not valid java name */
    public boolean m1777addVKZWuLQ(long j8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends r> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof r) {
            return m1778containsVKZWuLQ(((r) obj).m1762unboximpl());
        }
        return false;
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m1778containsVKZWuLQ(long j8) {
        return m1766containsVKZWuLQ(this.storage, j8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return m1767containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m1768equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m1771getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m1772hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m1773isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<r> iterator() {
        return m1774iteratorimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.n.toArray(this);
    }

    public String toString() {
        return m1776toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m1779unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m1764constructorimpl(int i8) {
        return m1765constructorimpl(new long[i8]);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m1766containsVKZWuLQ(long[] jArr, long j8) {
        return ArraysKt___ArraysKt.contains(jArr, j8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.n.toArray(this, array);
    }
}
