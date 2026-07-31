package R1;

import g2.InterfaceC0439a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s implements Collection, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f4165d;

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
        if (!(obj instanceof r)) {
            return false;
        }
        int i3 = ((r) obj).f4164d;
        int[] iArr = this.f4165d;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (i3 == iArr[i4]) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        f2.j.f(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof r) {
                int i3 = ((r) obj).f4164d;
                int[] iArr = this.f4165d;
                int length = iArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (i3 == iArr[i4]) {
                        break;
                    }
                    i4++;
                }
                if (i4 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return f2.j.a(this.f4165d, ((s) obj).f4165d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4165d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4165d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new p(1, this.f4165d);
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
        return this.f4165d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return f2.i.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f4165d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f2.j.f(objArr, "array");
        return f2.i.b(this, objArr);
    }
}
