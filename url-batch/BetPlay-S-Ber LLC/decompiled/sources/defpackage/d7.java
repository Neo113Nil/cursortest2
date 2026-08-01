package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class d7 implements Collection {
    public final /* synthetic */ e7 f;

    public d7(e7 e7Var) {
        this.f = e7Var;
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
        this.f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.a(obj) >= 0;
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
        return this.f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a7(this.f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e7 e7Var = this.f;
        int a = e7Var.a(obj);
        if (a < 0) {
            return false;
        }
        e7Var.g(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e7 e7Var = this.f;
        int i = e7Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(e7Var.i(i2))) {
                e7Var.g(i2);
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
        e7 e7Var = this.f;
        int i = e7Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(e7Var.i(i2))) {
                e7Var.g(i2);
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
        return this.f.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e7 e7Var = this.f;
        int i = e7Var.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = e7Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e7 e7Var = this.f;
        int i = e7Var.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = e7Var.i(i2);
        }
        return objArr;
    }
}
