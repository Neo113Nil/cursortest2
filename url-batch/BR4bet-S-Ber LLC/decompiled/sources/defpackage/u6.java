package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u6 implements Set {
    public final /* synthetic */ x6 f;

    public u6(x6 x6Var) {
        this.f = x6Var;
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
        this.f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        x6 x6Var = this.f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (x6Var.h == set.size()) {
                return x6Var.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        x6 x6Var = this.f;
        int i = 0;
        for (int i2 = x6Var.h - 1; i2 >= 0; i2--) {
            Object f = x6Var.f(i2);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t6(this.f, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        x6 x6Var = this.f;
        int d = x6Var.d(obj);
        if (d < 0) {
            return false;
        }
        x6Var.g(d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        x6 x6Var = this.f;
        int i = x6Var.h;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(x6Var.f(i2))) {
                x6Var.g(i2);
            }
        }
        return i != x6Var.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f.h;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        x6 x6Var = this.f;
        int i = x6Var.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x6Var.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        x6 x6Var = this.f;
        int i = x6Var.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x6Var.f(i2);
        }
        return objArr;
    }
}
