package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8283d;

    public d(e eVar) {
        this.f8283d = eVar;
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
        this.f8283d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8283d.a(obj) >= 0;
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
        return this.f8283d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f8283d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f8283d;
        int a9 = eVar.a(obj);
        if (a9 < 0) {
            return false;
        }
        eVar.f(a9);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f8283d;
        int i3 = eVar.f8369i;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i3) {
            if (collection.contains(eVar.h(i10))) {
                eVar.f(i10);
                i10--;
                i3--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f8283d;
        int i3 = eVar.f8369i;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i3) {
            if (!collection.contains(eVar.h(i10))) {
                eVar.f(i10);
                i10--;
                i3--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8283d.f8369i;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f8283d;
        int i3 = eVar.f8369i;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = eVar.h(i10);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f8283d;
        int i3 = eVar.f8369i;
        Object[] objArr = new Object[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            objArr[i10] = eVar.h(i10);
        }
        return objArr;
    }
}
