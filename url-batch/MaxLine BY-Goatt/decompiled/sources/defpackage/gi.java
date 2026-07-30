package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gi implements Collection {
    public final /* synthetic */ hi m;

    public gi(hi hiVar) {
        this.m = hiVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.m.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.m.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
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
        return this.m.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new di(this.m, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        hi hiVar = this.m;
        int a = hiVar.a(obj);
        if (a < 0) {
            return false;
        }
        hiVar.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        hi hiVar = this.m;
        int i = hiVar.o;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(hiVar.h(i2))) {
                hiVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        hi hiVar = this.m;
        int i = hiVar.o;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(hiVar.h(i2))) {
                hiVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.m.o;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        hi hiVar = this.m;
        int i = hiVar.o;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = hiVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        hi hiVar = this.m;
        int i = hiVar.o;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = hiVar.h(i2);
        }
        return objArr;
    }
}
