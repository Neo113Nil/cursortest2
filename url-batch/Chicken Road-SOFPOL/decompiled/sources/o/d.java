package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f5433d;

    public d(e eVar) {
        this.f5433d = eVar;
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
        this.f5433d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5433d.a(obj) >= 0;
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
        return this.f5433d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f5433d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f5433d;
        int a8 = eVar.a(obj);
        if (a8 < 0) {
            return false;
        }
        eVar.g(a8);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f5433d;
        int i = eVar.f5542f;
        int i8 = 0;
        boolean z3 = false;
        while (i8 < i) {
            if (collection.contains(eVar.i(i8))) {
                eVar.g(i8);
                i8--;
                i--;
                z3 = true;
            }
            i8++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5433d;
        int i = eVar.f5542f;
        int i8 = 0;
        boolean z3 = false;
        while (i8 < i) {
            if (!collection.contains(eVar.i(i8))) {
                eVar.g(i8);
                i8--;
                i--;
                z3 = true;
            }
            i8++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5433d.f5542f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f5433d;
        int i = eVar.f5542f;
        Object[] objArr = new Object[i];
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.i(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f5433d;
        int i = eVar.f5542f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i8 = 0; i8 < i; i8++) {
            objArr[i8] = eVar.i(i8);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
