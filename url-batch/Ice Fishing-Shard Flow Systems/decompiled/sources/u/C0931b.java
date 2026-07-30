package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0934e f8019d;

    public C0931b(C0934e c0934e) {
        this.f8019d = c0934e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8019d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8019d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8019d.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0934e c0934e = this.f8019d;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c0934e.f8045i == set.size()) {
                return c0934e.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0934e c0934e = this.f8019d;
        int i2 = 0;
        for (int i5 = c0934e.f8045i - 1; i5 >= 0; i5--) {
            Object e7 = c0934e.e(i5);
            i2 += e7 == null ? 0 : e7.hashCode();
        }
        return i2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8019d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0930a(this.f8019d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0934e c0934e = this.f8019d;
        int c7 = c0934e.c(obj);
        if (c7 < 0) {
            return false;
        }
        c0934e.f(c7);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8019d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0934e c0934e = this.f8019d;
        int i2 = c0934e.f8045i;
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            if (!collection.contains(c0934e.e(i5))) {
                c0934e.f(i5);
            }
        }
        return i2 != c0934e.f8045i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8019d.f8045i;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0934e c0934e = this.f8019d;
        int i2 = c0934e.f8045i;
        Object[] objArr = new Object[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = c0934e.e(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0934e c0934e = this.f8019d;
        int i2 = c0934e.f8045i;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = c0934e.e(i5);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
