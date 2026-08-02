package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166b implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1169e f10182a;

    public C1166b(C1169e c1169e) {
        this.f10182a = c1169e;
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
        this.f10182a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10182a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f10182a.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C1169e c1169e = this.f10182a;
        try {
            if (c1169e.f10206c == set.size()) {
                return c1169e.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1169e c1169e = this.f10182a;
        int i3 = 0;
        for (int i4 = c1169e.f10206c - 1; i4 >= 0; i4--) {
            Object e3 = c1169e.e(i4);
            i3 += e3 == null ? 0 : e3.hashCode();
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f10182a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1165a(this.f10182a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1169e c1169e = this.f10182a;
        int c3 = c1169e.c(obj);
        if (c3 < 0) {
            return false;
        }
        c1169e.f(c3);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f10182a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1169e c1169e = this.f10182a;
        int i3 = c1169e.f10206c;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c1169e.e(i4))) {
                c1169e.f(i4);
            }
        }
        return i3 != c1169e.f10206c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f10182a.f10206c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1169e c1169e = this.f10182a;
        int i3 = c1169e.f10206c;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c1169e.e(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1169e c1169e = this.f10182a;
        int i3 = c1169e.f10206c;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c1169e.e(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
