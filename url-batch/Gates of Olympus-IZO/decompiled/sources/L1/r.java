package L1;

import a2.InterfaceC0184a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements Collection, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2721d;

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
        if (!(obj instanceof p)) {
            return false;
        }
        byte b2 = ((p) obj).f2717d;
        byte[] bArr = this.f2721d;
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (b2 == bArr[i3]) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Z1.i.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof p) {
                byte b2 = ((p) obj).f2717d;
                byte[] bArr = this.f2721d;
                int length = bArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (b2 == bArr[i3]) {
                        break;
                    }
                    i3++;
                }
                if (i3 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Z1.i.a(this.f2721d, ((r) obj).f2721d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f2721d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2721d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new q(0, this.f2721d);
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
        return this.f2721d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f2721d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Z1.i.f(objArr, "array");
        return Z1.h.b(this, objArr);
    }
}
