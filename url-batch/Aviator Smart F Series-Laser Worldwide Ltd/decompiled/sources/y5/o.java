package y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public final class o implements Collection, g6.a {
    private final byte[] storage;

    private static final class a implements Iterator, g6.a {
        private final byte[] array;
        private int index;

        public a(byte[] array) {
            kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return n.m1550boximpl(m1624nextw2LRezQ());
        }

        /* renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m1624nextw2LRezQ() {
            int i8 = this.index;
            byte[] bArr = this.array;
            if (i8 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i8 + 1;
            return n.m1556constructorimpl(bArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ o(byte[] bArr) {
        this.storage = bArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m1607boximpl(byte[] bArr) {
        return new o(bArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m1609constructorimpl(byte[] storage) {
        kotlin.jvm.internal.s.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m1611containsAllimpl(byte[] bArr, Collection<n> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection<n> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof n) || !ArraysKt___ArraysKt.contains(bArr, ((n) obj).m1606unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1612equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.s.areEqual(bArr, ((o) obj).m1623unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1613equalsimpl0(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.s.areEqual(bArr, bArr2);
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m1614getw2LRezQ(byte[] bArr, int i8) {
        return n.m1556constructorimpl(bArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m1615getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1616hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m1617isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<n> m1618iteratorimpl(byte[] bArr) {
        return new a(bArr);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m1619setVurrAj0(byte[] bArr, int i8, byte b8) {
        bArr[i8] = b8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1620toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m1621add7apg3OU(byte b8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends n> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof n) {
            return m1622contains7apg3OU(((n) obj).m1606unboximpl());
        }
        return false;
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m1622contains7apg3OU(byte b8) {
        return m1610contains7apg3OU(this.storage, b8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return m1611containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m1612equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m1615getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m1616hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m1617isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<n> iterator() {
        return m1618iteratorimpl(this.storage);
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
        return m1620toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m1623unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m1608constructorimpl(int i8) {
        return m1609constructorimpl(new byte[i8]);
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m1610contains7apg3OU(byte[] bArr, byte b8) {
        return ArraysKt___ArraysKt.contains(bArr, b8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.n.toArray(this, array);
    }
}
