package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w6 implements Collection {
    public final /* synthetic */ x6 f;

    public w6(x6 x6Var) {
        this.f = x6Var;
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
        return new t6(this.f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        x6 x6Var = this.f;
        int a = x6Var.a(obj);
        if (a < 0) {
            return false;
        }
        x6Var.g(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        x6 x6Var = this.f;
        int i = x6Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(x6Var.i(i2))) {
                x6Var.g(i2);
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
        x6 x6Var = this.f;
        int i = x6Var.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(x6Var.i(i2))) {
                x6Var.g(i2);
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
        x6 x6Var = this.f;
        int i = x6Var.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x6Var.i(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        x6 x6Var = this.f;
        int i = x6Var.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = x6Var.i(i2);
        }
        return objArr;
    }
}
