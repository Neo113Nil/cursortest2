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
public final class z implements Collection, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final short[] f9640b;

    private static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final short[] f9641b;

        /* renamed from: c, reason: collision with root package name */
        private int f9642c;

        public a(short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f9641b = array;
        }

        public short a() {
            int i4 = this.f9642c;
            short[] sArr = this.f9641b;
            if (i4 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f9642c));
            }
            this.f9642c = i4 + 1;
            return y.b(sArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9642c < this.f9641b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return y.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(short[] sArr) {
        this.f9640b = sArr;
    }

    public static final /* synthetic */ z b(short[] sArr) {
        return new z(sArr);
    }

    public static short[] d(int i4) {
        return e(new short[i4]);
    }

    public static short[] e(short[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean g(short[] sArr, short s4) {
        return AbstractC3219i.B(sArr, s4);
    }

    public static boolean h(short[] sArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof y) || !AbstractC3219i.B(sArr, ((y) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof z) && Intrinsics.areEqual(sArr, ((z) obj).t());
    }

    public static final short l(short[] sArr, int i4) {
        return y.b(sArr[i4]);
    }

    public static int n(short[] sArr) {
        return sArr.length;
    }

    public static int o(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean p(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator q(short[] sArr) {
        return new a(sArr);
    }

    public static final void r(short[] sArr, int i4, short s4) {
        sArr[i4] = s4;
    }

    public static String s(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
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
        if (obj instanceof y) {
            return f(((y) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(this.f9640b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f9640b, obj);
    }

    public boolean f(short s4) {
        return g(this.f9640b, s4);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f9640b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f9640b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f9640b);
    }

    @Override // java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f9640b);
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

    public final /* synthetic */ short[] t() {
        return this.f9640b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3244j.a(this);
    }

    public String toString() {
        return s(this.f9640b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }
}
