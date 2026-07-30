package R5;

import f6.InterfaceC0406a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC0644i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y implements Collection, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2440d;

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
        if (!(obj instanceof x)) {
            return false;
        }
        int i2 = ((x) obj).f2439d;
        int[] iArr = this.f2440d;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (i2 == iArr[i5]) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (obj instanceof x) {
                    int i2 = ((x) obj).f2439d;
                    int[] iArr = this.f2440d;
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    int length = iArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            i5 = -1;
                            break;
                        }
                        if (i2 == iArr[i5]) {
                            break;
                        }
                        i5++;
                    }
                    if (i5 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return Intrinsics.a(this.f2440d, ((y) obj).f2440d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f2440d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2440d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.f2440d);
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
        return this.f2440d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0644i.b(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f2440d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC0644i.c(this, array);
    }
}
