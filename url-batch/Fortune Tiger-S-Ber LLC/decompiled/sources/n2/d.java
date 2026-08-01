package n2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements Collection, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f2949f;
    public final boolean g;

    public d(Object[] objArr, boolean z3) {
        this.f2949f = objArr;
        this.g = z3;
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
        int i4;
        Object[] objArr = this.f2949f;
        u2.c.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i4 = 0;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    break;
                }
                i4++;
            }
            i4 = -1;
        } else {
            int length2 = objArr.length;
            for (int i5 = 0; i5 < length2; i5++) {
                if (obj.equals(objArr[i5])) {
                    i4 = i5;
                    break;
                }
            }
            i4 = -1;
        }
        return i4 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        u2.c.e(collection, "elements");
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
        return this.f2949f.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a3.b(this.f2949f);
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
        return this.f2949f.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        u2.c.e(objArr, "array");
        return u2.c.j(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f2949f;
        if (this.g && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        u2.c.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
