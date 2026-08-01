package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2926f;

    public e(f fVar) {
        this.f2926f = fVar;
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
        this.f2926f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2926f.a(obj) >= 0;
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
        return this.f2926f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2926f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f2926f;
        int a4 = fVar.a(obj);
        if (a4 < 0) {
            return false;
        }
        fVar.g(a4);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f2926f;
        int i4 = fVar.h;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i4) {
            if (collection.contains(fVar.i(i5))) {
                fVar.g(i5);
                i5--;
                i4--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f2926f;
        int i4 = fVar.h;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i4) {
            if (!collection.contains(fVar.i(i5))) {
                fVar.g(i5);
                i5--;
                i4--;
                z3 = true;
            }
            i5++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2926f.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f2926f;
        int i4 = fVar.h;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = fVar.i(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f2926f;
        int i4 = fVar.h;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = fVar.i(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
