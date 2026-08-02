package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qg implements Collection {
    final /* synthetic */ qi a;

    public qg(qi qiVar) {
        this.a = qiVar;
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
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
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
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qh(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        qi qiVar = this.a;
        int a = qiVar.a(obj);
        if (a < 0) {
            return false;
        }
        qiVar.d(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        qi qiVar = this.a;
        int i = qiVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(qiVar.f(i2))) {
                qiVar.d(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        qi qiVar = this.a;
        int i = qiVar.d;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(qiVar.f(i2))) {
                qiVar.d(i2);
                i--;
                i2--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.f(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        qi qiVar = this.a;
        int i = qiVar.d;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = qiVar.f(i2);
        }
        return objArr;
    }
}
