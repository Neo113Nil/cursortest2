package k5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class r implements Collection, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final long[] f5215f;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        long j4 = ((q) obj).f5214f;
        long[] jArr = this.f5215f;
        int length = jArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (j4 == jArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (obj instanceof q) {
                    long j4 = ((q) obj).f5214f;
                    long[] jArr = this.f5215f;
                    int length = jArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        }
                        if (j4 == jArr[i7]) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return kotlin.jvm.internal.i.a(this.f5215f, ((r) obj).f5215f);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f5215f);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5215f.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new R5.g(3, this.f5215f);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5215f.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.m(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f5215f) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.n(this, array);
    }
}
