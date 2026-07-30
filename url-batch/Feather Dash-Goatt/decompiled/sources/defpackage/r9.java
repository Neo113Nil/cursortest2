package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r9 implements Collection {
    public final /* synthetic */ s9 d;

    public r9(s9 s9Var) {
        this.d = s9Var;
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
        this.d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.a(obj) >= 0;
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
        return this.d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new o9(this.d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        s9 s9Var = this.d;
        int a = s9Var.a(obj);
        if (a < 0) {
            return false;
        }
        s9Var.f(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        s9 s9Var = this.d;
        int i = s9Var.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(s9Var.h(i2))) {
                s9Var.f(i2);
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
        s9 s9Var = this.d;
        int i = s9Var.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(s9Var.h(i2))) {
                s9Var.f(i2);
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
        return this.d.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        s9 s9Var = this.d;
        int i = s9Var.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = s9Var.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        s9 s9Var = this.d;
        int i = s9Var.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = s9Var.h(i2);
        }
        return objArr;
    }
}
