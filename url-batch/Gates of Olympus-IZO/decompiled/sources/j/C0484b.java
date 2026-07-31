package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0487e f5152d;

    public C0484b(C0487e c0487e) {
        this.f5152d = c0487e;
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
        this.f5152d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5152d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f5152d.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0487e c0487e = this.f5152d;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c0487e.f5140f == set.size()) {
                    if (c0487e.i(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0487e c0487e = this.f5152d;
        int i3 = 0;
        for (int i4 = c0487e.f5140f - 1; i4 >= 0; i4--) {
            Object e3 = c0487e.e(i4);
            i3 += e3 == null ? 0 : e3.hashCode();
        }
        return i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5152d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0483a(this.f5152d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0487e c0487e = this.f5152d;
        int c3 = c0487e.c(obj);
        if (c3 < 0) {
            return false;
        }
        c0487e.f(c3);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f5152d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0487e c0487e = this.f5152d;
        int i3 = c0487e.f5140f;
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c0487e.e(i4))) {
                c0487e.f(i4);
            }
        }
        return i3 != c0487e.f5140f;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5152d.f5140f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0487e c0487e = this.f5152d;
        int i3 = c0487e.f5140f;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0487e.e(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0487e c0487e = this.f5152d;
        int i3 = c0487e.f5140f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0487e.e(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
