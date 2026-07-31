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
public final class s implements Collection, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9624b;

    private static final class a implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f9625b;

        /* renamed from: c, reason: collision with root package name */
        private int f9626c;

        public a(byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f9625b = array;
        }

        public byte a() {
            int i4 = this.f9626c;
            byte[] bArr = this.f9625b;
            if (i4 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f9626c));
            }
            this.f9626c = i4 + 1;
            return r.b(bArr[i4]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9626c < this.f9625b.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return r.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ s(byte[] bArr) {
        this.f9624b = bArr;
    }

    public static final /* synthetic */ s b(byte[] bArr) {
        return new s(bArr);
    }

    public static byte[] d(int i4) {
        return e(new byte[i4]);
    }

    public static byte[] e(byte[] storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return storage;
    }

    public static boolean g(byte[] bArr, byte b4) {
        return AbstractC3219i.w(bArr, b4);
    }

    public static boolean h(byte[] bArr, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof r) || !AbstractC3219i.w(bArr, ((r) obj).f())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte[] bArr, Object obj) {
        return (obj instanceof s) && Intrinsics.areEqual(bArr, ((s) obj).t());
    }

    public static final byte l(byte[] bArr, int i4) {
        return r.b(bArr[i4]);
    }

    public static int n(byte[] bArr) {
        return bArr.length;
    }

    public static int o(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean p(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator q(byte[] bArr) {
        return new a(bArr);
    }

    public static final void r(byte[] bArr, int i4, byte b4) {
        bArr[i4] = b4;
    }

    public static String s(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof r) {
            return f(((r) obj).f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(this.f9624b, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return k(this.f9624b, obj);
    }

    public boolean f(byte b4) {
        return g(this.f9624b, b4);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.f9624b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.f9624b);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return q(this.f9624b);
    }

    @Override // java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.f9624b);
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

    public final /* synthetic */ byte[] t() {
        return this.f9624b;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC3244j.a(this);
    }

    public String toString() {
        return s(this.f9624b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }
}
