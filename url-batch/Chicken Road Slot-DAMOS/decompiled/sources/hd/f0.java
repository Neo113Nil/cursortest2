package hd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 implements Collection, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final short[] f4504d;

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
        if (!(obj instanceof e0)) {
            return false;
        }
        short s3 = ((e0) obj).f4500d;
        short[] sArr = this.f4504d;
        int length = sArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (s3 == sArr[i3]) {
                break;
            }
            i3++;
        }
        return i3 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof e0) {
                    short s3 = ((e0) obj).f4500d;
                    short[] sArr = this.f4504d;
                    int length = sArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (s3 == sArr[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            return this.f4504d.equals(((f0) obj).f4504d);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f4504d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4504d.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new u(3, this.f4504d);
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
        return this.f4504d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wd.i.b(this, objArr);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f4504d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }
}
