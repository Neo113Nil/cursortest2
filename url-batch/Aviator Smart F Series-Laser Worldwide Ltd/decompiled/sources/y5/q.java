package y5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public final class q implements Collection, g6.a {
    private final int[] storage;

    private static final class a implements Iterator, g6.a {
        private final int[] array;
        private int index;

        public a(int[] array) {
            kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
            this.array = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return p.m1626boximpl(m1702nextpVg5ArA());
        }

        /* renamed from: next-pVg5ArA, reason: not valid java name */
        public int m1702nextpVg5ArA() {
            int i8 = this.index;
            int[] iArr = this.array;
            if (i8 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i8 + 1;
            return p.m1632constructorimpl(iArr[i8]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ q(int[] iArr) {
        this.storage = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q m1685boximpl(int[] iArr) {
        return new q(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1687constructorimpl(int[] storage) {
        kotlin.jvm.internal.s.checkNotNullParameter(storage, "storage");
        return storage;
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m1689containsAllimpl(int[] iArr, Collection<p> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        Collection<p> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof p) || !ArraysKt___ArraysKt.contains(iArr, ((p) obj).m1684unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1690equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof q) && kotlin.jvm.internal.s.areEqual(iArr, ((q) obj).m1701unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1691equalsimpl0(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.s.areEqual(iArr, iArr2);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m1692getpVg5ArA(int[] iArr, int i8) {
        return p.m1632constructorimpl(iArr[i8]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m1693getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    public static /* synthetic */ void getStorage$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1694hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m1695isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<p> m1696iteratorimpl(int[] iArr) {
        return new a(iArr);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m1697setVXSXFK8(int[] iArr, int i8, int i9) {
        iArr[i8] = i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1698toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public boolean m1699addWZ4Q5Ns(int i8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends p> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof p) {
            return m1700containsWZ4Q5Ns(((p) obj).m1684unboximpl());
        }
        return false;
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m1700containsWZ4Q5Ns(int i8) {
        return m1688containsWZ4Q5Ns(this.storage, i8);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return m1689containsAllimpl(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m1690equalsimpl(this.storage, obj);
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m1693getSizeimpl(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m1694hashCodeimpl(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m1695isEmptyimpl(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<p> iterator() {
        return m1696iteratorimpl(this.storage);
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
        return m1698toStringimpl(this.storage);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1701unboximpl() {
        return this.storage;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1686constructorimpl(int i8) {
        return m1687constructorimpl(new int[i8]);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m1688containsWZ4Q5Ns(int[] iArr, int i8) {
        return ArraysKt___ArraysKt.contains(iArr, i8);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.n.toArray(this, array);
    }
}
