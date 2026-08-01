package Y0;

import K.V;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class g implements Collection, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1509b;

    public g(Object[] objArr, boolean z2) {
        this.f1508a = objArr;
        this.f1509b = z2;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
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
        int i;
        Object[] objArr = this.f1508a;
        k1.e.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        k1.e.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1508a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new V(this.f1508a);
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
        return this.f1508a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f1508a;
        if (this.f1509b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        k1.e.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k1.e.e(objArr, "array");
        return k1.e.j(this, objArr);
    }
}
