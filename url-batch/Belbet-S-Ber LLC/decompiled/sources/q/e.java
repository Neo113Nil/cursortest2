package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f3105f;

    public e(f fVar) {
        this.f3105f = fVar;
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
        this.f3105f.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3105f.a(obj) >= 0;
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
        return this.f3105f.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f3105f, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f3105f;
        int a5 = fVar.a(obj);
        if (a5 < 0) {
            return false;
        }
        fVar.g(a5);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f3105f;
        int i = fVar.h;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < i) {
            if (collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i--;
                z4 = true;
            }
            i4++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f3105f;
        int i = fVar.h;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < i) {
            if (!collection.contains(fVar.i(i4))) {
                fVar.g(i4);
                i4--;
                i--;
                z4 = true;
            }
            i4++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3105f.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f3105f;
        int i = fVar.h;
        Object[] objArr = new Object[i];
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f3105f;
        int i = fVar.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = fVar.i(i4);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
