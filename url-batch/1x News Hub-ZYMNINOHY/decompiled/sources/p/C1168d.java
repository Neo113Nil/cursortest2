package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1169e f10187a;

    public C1168d(C1169e c1169e) {
        this.f10187a = c1169e;
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
        this.f10187a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10187a.a(obj) >= 0;
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
        return this.f10187a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1165a(this.f10187a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1169e c1169e = this.f10187a;
        int a3 = c1169e.a(obj);
        if (a3 < 0) {
            return false;
        }
        c1169e.f(a3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1169e c1169e = this.f10187a;
        int i3 = c1169e.f10206c;
        int i4 = 0;
        boolean z = false;
        while (i4 < i3) {
            if (collection.contains(c1169e.h(i4))) {
                c1169e.f(i4);
                i4--;
                i3--;
                z = true;
            }
            i4++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1169e c1169e = this.f10187a;
        int i3 = c1169e.f10206c;
        int i4 = 0;
        boolean z = false;
        while (i4 < i3) {
            if (!collection.contains(c1169e.h(i4))) {
                c1169e.f(i4);
                i4--;
                i3--;
                z = true;
            }
            i4++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10187a.f10206c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1169e c1169e = this.f10187a;
        int i3 = c1169e.f10206c;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c1169e.h(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1169e c1169e = this.f10187a;
        int i3 = c1169e.f10206c;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c1169e.h(i4);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
