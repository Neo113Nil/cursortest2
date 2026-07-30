package u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933d implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0934e f8024d;

    public C0933d(C0934e c0934e) {
        this.f8024d = c0934e;
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
        this.f8024d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8024d.a(obj) >= 0;
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
        return this.f8024d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0930a(this.f8024d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0934e c0934e = this.f8024d;
        int a7 = c0934e.a(obj);
        if (a7 < 0) {
            return false;
        }
        c0934e.f(a7);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0934e c0934e = this.f8024d;
        int i2 = c0934e.f8045i;
        int i5 = 0;
        boolean z7 = false;
        while (i5 < i2) {
            if (collection.contains(c0934e.h(i5))) {
                c0934e.f(i5);
                i5--;
                i2--;
                z7 = true;
            }
            i5++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0934e c0934e = this.f8024d;
        int i2 = c0934e.f8045i;
        int i5 = 0;
        boolean z7 = false;
        while (i5 < i2) {
            if (!collection.contains(c0934e.h(i5))) {
                c0934e.f(i5);
                i5--;
                i2--;
                z7 = true;
            }
            i5++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8024d.f8045i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0934e c0934e = this.f8024d;
        int i2 = c0934e.f8045i;
        Object[] objArr = new Object[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = c0934e.h(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0934e c0934e = this.f8024d;
        int i2 = c0934e.f8045i;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = c0934e.h(i5);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
