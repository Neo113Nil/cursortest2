package i;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669d implements Collection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0670e f6912d;

    public C0669d(C0670e c0670e) {
        this.f6912d = c0670e;
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
        this.f6912d.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6912d.b(obj) >= 0;
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
        return this.f6912d.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0666a(this.f6912d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0670e c0670e = this.f6912d;
        int b4 = c0670e.b(obj);
        if (b4 < 0) {
            return false;
        }
        c0670e.g(b4);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0670e c0670e = this.f6912d;
        int i2 = c0670e.f6895i;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < i2) {
            if (collection.contains(c0670e.i(i4))) {
                c0670e.g(i4);
                i4--;
                i2--;
                z4 = true;
            }
            i4++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0670e c0670e = this.f6912d;
        int i2 = c0670e.f6895i;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < i2) {
            if (!collection.contains(c0670e.i(i4))) {
                c0670e.g(i4);
                i4--;
                i2--;
                z4 = true;
            }
            i4++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f6912d.f6895i;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0670e c0670e = this.f6912d;
        int i2 = c0670e.f6895i;
        Object[] objArr = new Object[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = c0670e.i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0670e c0670e = this.f6912d;
        int i2 = c0670e.f6895i;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = c0670e.i(i4);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
