package W1;

import i2.InterfaceC2471a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.AbstractC3244j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements Collection, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final int[] f9629b;

    private static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final int[] f9630b;

        /* renamed from: c, reason: collision with root package name */
        private int f9631c;

        public a(int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f9630b = array;
        }

        public int a() {
            int i4 = this.f9631c;
            int[] iArr = this.f9630b;
            if (i4 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f9631c));
            }
            this.f9631c = i4 + 1;
            return t.b(iArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9631c < this.f9630b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return t.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ u(int[] iArr) {
        this.f9629b = iArr;
    }

    public static final /* synthetic */ u b(int[] iArr) {
        return new u(iArr);
    }

    public static int[] d(int i4) {
        return e(new int[i4]);
    }

    public static int[] e(int[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean g(int[] iArr, int i4) {
        return AbstractC3219i.y(iArr, i4);
    }

    public static boolean h(int[] iArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof t) || !AbstractC3219i.y(iArr, ((t) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr, Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(iArr, ((u) obj).t());
    }

    public static final int l(int[] iArr, int i4) {
        return t.b(iArr[i4]);
    }

    public static int n(int[] iArr) {
        return iArr.length;
    }

    public static int o(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean p(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator q(int[] iArr) {
        return new a(iArr);
    }

    public static final void r(int[] iArr, int i4, int i5) {
        iArr[i4] = i5;
    }

    public static String s(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof t) {
            return f(((t) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(this.f9629b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f9629b, obj);
    }

    public boolean f(int i4) {
        return g(this.f9629b, i4);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f9629b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f9629b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f9629b);
    }

    @Override // java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f9629b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ int[] t() {
        return this.f9629b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3244j.a(this);
    }

    public String toString() {
        return s(this.f9629b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }
}
