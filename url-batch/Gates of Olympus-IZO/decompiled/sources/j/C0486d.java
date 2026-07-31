package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486d implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0487e f5157d;

    public C0486d(C0487e c0487e) {
        this.f5157d = c0487e;
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
        this.f5157d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5157d.a(obj) >= 0;
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
        return this.f5157d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0483a(this.f5157d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0487e c0487e = this.f5157d;
        int a3 = c0487e.a(obj);
        if (a3 < 0) {
            return false;
        }
        c0487e.f(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0487e c0487e = this.f5157d;
        int i3 = c0487e.f5140f;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (collection.contains(c0487e.h(i4))) {
                c0487e.f(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0487e c0487e = this.f5157d;
        int i3 = c0487e.f5140f;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (!collection.contains(c0487e.h(i4))) {
                c0487e.f(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5157d.f5140f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0487e c0487e = this.f5157d;
        int i3 = c0487e.f5140f;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0487e.h(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0487e c0487e = this.f5157d;
        int i3 = c0487e.f5140f;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0487e.h(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
