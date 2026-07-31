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
public final class w implements Collection, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final long[] f9634b;

    private static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final long[] f9635b;

        /* renamed from: c, reason: collision with root package name */
        private int f9636c;

        public a(long[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f9635b = array;
        }

        public long a() {
            int i4 = this.f9636c;
            long[] jArr = this.f9635b;
            if (i4 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f9636c));
            }
            this.f9636c = i4 + 1;
            return v.b(jArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9636c < this.f9635b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return v.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ w(long[] jArr) {
        this.f9634b = jArr;
    }

    public static final /* synthetic */ w b(long[] jArr) {
        return new w(jArr);
    }

    public static long[] d(int i4) {
        return e(new long[i4]);
    }

    public static long[] e(long[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean g(long[] jArr, long j4) {
        return AbstractC3219i.z(jArr, j4);
    }

    public static boolean h(long[] jArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof v) || !AbstractC3219i.z(jArr, ((v) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof w) && Intrinsics.areEqual(jArr, ((w) obj).t());
    }

    public static final long l(long[] jArr, int i4) {
        return v.b(jArr[i4]);
    }

    public static int n(long[] jArr) {
        return jArr.length;
    }

    public static int o(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean p(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator q(long[] jArr) {
        return new a(jArr);
    }

    public static final void r(long[] jArr, int i4, long j4) {
        jArr[i4] = j4;
    }

    public static String s(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof v) {
            return f(((v) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(this.f9634b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f9634b, obj);
    }

    public boolean f(long j4) {
        return g(this.f9634b, j4);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f9634b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f9634b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f9634b);
    }

    @Override // java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f9634b);
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

    public final /* synthetic */ long[] t() {
        return this.f9634b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3244j.a(this);
    }

    public String toString() {
        return s(this.f9634b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }
}
