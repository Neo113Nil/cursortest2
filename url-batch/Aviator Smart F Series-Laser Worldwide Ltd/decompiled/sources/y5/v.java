package y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public final class v implements Collection, g6.a {
    private final short[] storage;

    private static final class a implements Iterator, g6.a {
        private final short[] array;
        private int index;

        public a(short[] array) {
            kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return u.m1782boximpl(m1856nextMh2AYeg());
        }

        /* renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m1856nextMh2AYeg() {
            int i8 = this.index;
            short[] sArr = this.array;
            if (i8 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i8 + 1;
            return u.m1788constructorimpl(sArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ v(short[] sArr) {
        this.storage = sArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v m1839boximpl(short[] sArr) {
        return new v(sArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m1841constructorimpl(short[] storage) {
        kotlin.jvm.internal.s.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m1843containsAllimpl(short[] sArr, Collection<u> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection<u> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof u) || !ArraysKt___ArraysKt.contains(sArr, ((u) obj).m1838unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1844equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof v) && kotlin.jvm.internal.s.areEqual(sArr, ((v) obj).m1855unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1845equalsimpl0(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.s.areEqual(sArr, sArr2);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m1846getMh2AYeg(short[] sArr, int i8) {
        return u.m1788constructorimpl(sArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m1847getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1848hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m1849isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<u> m1850iteratorimpl(short[] sArr) {
        return new a(sArr);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m1851set01HTLdE(short[] sArr, int i8, short s7) {
        sArr[i8] = s7;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1852toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m1853addxj2QHRw(short s7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends u> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof u) {
            return m1854containsxj2QHRw(((u) obj).m1838unboximpl());
        }
        return false;
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m1854containsxj2QHRw(short s7) {
        return m1842containsxj2QHRw(this.storage, s7);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return m1843containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m1844equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m1847getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m1848hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m1849isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<u> iterator() {
        return m1850iteratorimpl(this.storage);
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
        return m1852toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m1855unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m1840constructorimpl(int i8) {
        return m1841constructorimpl(new short[i8]);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m1842containsxj2QHRw(short[] sArr, short s7) {
        return ArraysKt___ArraysKt.contains(sArr, s7);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.n.toArray(this, array);
    }
}
