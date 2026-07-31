package R1;

import g2.InterfaceC0439a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Collection, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4163d;

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
        if (!(obj instanceof o)) {
            return false;
        }
        byte b3 = ((o) obj).f4159d;
        byte[] bArr = this.f4163d;
        int length = bArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (b3 == bArr[i3]) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        f2.j.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof o) {
                byte b3 = ((o) obj).f4159d;
                byte[] bArr = this.f4163d;
                int length = bArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (b3 == bArr[i3]) {
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
        if (obj instanceof q) {
            return f2.j.a(this.f4163d, ((q) obj).f4163d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4163d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4163d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new p(0, this.f4163d);
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
        return this.f4163d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f4163d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f2.j.f(objArr, "array");
        return f2.i.b(this, objArr);
    }
}
