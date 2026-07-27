package i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0670e f6907d;

    public C0667b(C0670e c0670e) {
        this.f6907d = c0670e;
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
        this.f6907d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6907d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f6907d.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0670e c0670e = this.f6907d;
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (c0670e.f6895i == set.size()) {
                    if (c0670e.k(set)) {
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
        C0670e c0670e = this.f6907d;
        int i2 = 0;
        for (int i4 = c0670e.f6895i - 1; i4 >= 0; i4--) {
            Object f4 = c0670e.f(i4);
            i2 += f4 == null ? 0 : f4.hashCode();
        }
        return i2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6907d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0666a(this.f6907d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0670e c0670e = this.f6907d;
        int d4 = c0670e.d(obj);
        if (d4 < 0) {
            return false;
        }
        c0670e.g(d4);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f6907d.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0670e c0670e = this.f6907d;
        int i2 = c0670e.f6895i;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (!collection.contains(c0670e.f(i4))) {
                c0670e.g(i4);
            }
        }
        return i2 != c0670e.f6895i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6907d.f6895i;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0670e c0670e = this.f6907d;
        int i2 = c0670e.f6895i;
        Object[] objArr = new Object[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = c0670e.f(i4);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0670e c0670e = this.f6907d;
        int i2 = c0670e.f6895i;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = c0670e.f(i4);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
