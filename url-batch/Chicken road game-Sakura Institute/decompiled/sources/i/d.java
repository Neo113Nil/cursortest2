package i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4731f;

    public d(e eVar) {
        this.f4731f = eVar;
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
        this.f4731f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4731f.a(obj) >= 0;
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
        return this.f4731f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f4731f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f4731f;
        int a3 = eVar.a(obj);
        if (a3 < 0) {
            return false;
        }
        eVar.f(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f4731f;
        int i7 = eVar.f4744h;
        int i8 = 0;
        boolean z8 = false;
        while (i8 < i7) {
            if (collection.contains(eVar.h(i8))) {
                eVar.f(i8);
                i8--;
                i7--;
                z8 = true;
            }
            i8++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f4731f;
        int i7 = eVar.f4744h;
        int i8 = 0;
        boolean z8 = false;
        while (i8 < i7) {
            if (!collection.contains(eVar.h(i8))) {
                eVar.f(i8);
                i8--;
                i7--;
                z8 = true;
            }
            i8++;
        }
        return z8;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4731f.f4744h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f4731f;
        int i7 = eVar.f4744h;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = eVar.h(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f4731f;
        int i7 = eVar.f4744h;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = eVar.h(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
