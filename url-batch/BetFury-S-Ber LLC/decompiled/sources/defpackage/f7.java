package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f7 implements Collection {
    public final /* synthetic */ g7 f;

    public f7(g7 g7Var) {
        this.f = g7Var;
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
        return new c7(this.f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        g7 g7Var = this.f;
        int a = g7Var.a(obj);
        if (a < 0) {
            return false;
        }
        g7Var.g(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        g7 g7Var = this.f;
        int i = g7Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(g7Var.i(i2))) {
                g7Var.g(i2);
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
        g7 g7Var = this.f;
        int i = g7Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(g7Var.i(i2))) {
                g7Var.g(i2);
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
        g7 g7Var = this.f;
        int i = g7Var.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = g7Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        g7 g7Var = this.f;
        int i = g7Var.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = g7Var.i(i2);
        }
        return objArr;
    }
}
