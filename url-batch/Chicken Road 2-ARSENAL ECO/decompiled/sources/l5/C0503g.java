package l5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import y5.InterfaceC0766a;

/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503g implements Collection, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f5296f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5297g;

    public C0503g(Object[] objArr, boolean z5) {
        this.f5296f = objArr;
        this.f5297g = z5;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i7;
        Object[] objArr = this.f5296f;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    break;
                }
                i7++;
            }
            i7 = -1;
        } else {
            int length2 = objArr.length;
            for (int i8 = 0; i8 < length2; i8++) {
                if (obj.equals(objArr[i8])) {
                    i7 = i8;
                    break;
                }
            }
            i7 = -1;
        }
        return i7 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5296f.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new R5.g(this.f5296f);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5296f.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.n(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f5296f;
        if (this.f5297g && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }
}
