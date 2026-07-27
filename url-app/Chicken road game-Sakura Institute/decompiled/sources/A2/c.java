package A2;

import a.AbstractC0345a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;
import z2.AbstractC1428l;
import z2.C1436t;

/* loaded from: classes.dex */
public final class c extends AbstractC1428l implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f809e;

    /* renamed from: i, reason: collision with root package name */
    public int f810i;

    /* renamed from: j, reason: collision with root package name */
    public final c f811j;

    /* renamed from: k, reason: collision with root package name */
    public final d f812k;

    public c(Object[] backing, int i2, int i4, c cVar, d root) {
        int i5;
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f808d = backing;
        this.f809e = i2;
        this.f810i = i4;
        this.f811j = cVar;
        this.f812k = root;
        i5 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i5;
    }

    public final void B(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        d dVar = this.f812k;
        c cVar = this.f811j;
        if (cVar != null) {
            cVar.B(i2, obj);
        } else {
            d dVar2 = d.f813j;
            dVar.B(i2, obj);
        }
        this.f808d = dVar.f814d;
        this.f810i++;
    }

    public final void C() {
        int i2;
        i2 = ((AbstractList) this.f812k).modCount;
        if (i2 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void D() {
        if (this.f812k.f816i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object E(int i2) {
        Object E3;
        ((AbstractList) this).modCount++;
        c cVar = this.f811j;
        if (cVar != null) {
            E3 = cVar.E(i2);
        } else {
            d dVar = d.f813j;
            E3 = this.f812k.E(i2);
        }
        this.f810i--;
        return E3;
    }

    public final void F(int i2, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.f811j;
        if (cVar != null) {
            cVar.F(i2, i4);
        } else {
            d dVar = d.f813j;
            this.f812k.F(i2, i4);
        }
        this.f810i -= i4;
    }

    public final int G(int i2, int i4, Collection collection, boolean z4) {
        int G3;
        c cVar = this.f811j;
        if (cVar != null) {
            G3 = cVar.G(i2, i4, collection, z4);
        } else {
            d dVar = d.f813j;
            G3 = this.f812k.G(i2, i4, collection, z4);
        }
        if (G3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f810i -= G3;
        return G3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        D();
        C();
        B(this.f809e + this.f810i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        D();
        C();
        int size = elements.size();
        w(this.f809e + this.f810i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        D();
        C();
        F(this.f809e, this.f810i);
    }

    @Override // z2.AbstractC1428l
    public final int e() {
        C();
        return this.f810i;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        C();
        if (obj != this) {
            if (obj instanceof List) {
                if (AbstractC0345a.f(this.f808d, this.f809e, this.f810i, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return this.f808d[this.f809e + i2];
    }

    @Override // z2.AbstractC1428l
    public final Object h(int i2) {
        D();
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return E(this.f809e + i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        C();
        Object[] objArr = this.f808d;
        int i2 = this.f810i;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[this.f809e + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        C();
        for (int i2 = 0; i2 < this.f810i; i2++) {
            if (Intrinsics.a(this.f808d[this.f809e + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        C();
        return this.f810i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        C();
        for (int i2 = this.f810i - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.f808d[this.f809e + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        D();
        C();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            h(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        D();
        C();
        return G(this.f809e, this.f810i, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        D();
        C();
        return G(this.f809e, this.f810i, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        D();
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        Object[] objArr = this.f808d;
        int i5 = this.f809e + i2;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i4) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i5 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.d(i2, i4, i5);
        return new c(this.f808d, this.f809e + i2, i4 - i2, this, this.f812k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        C();
        int length = array.length;
        int i2 = this.f810i;
        int i4 = this.f809e;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f808d, i4, i2 + i4, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C1436t.f(this.f808d, array, 0, i4, i2 + i4);
        int i5 = this.f810i;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        C();
        return AbstractC0345a.g(this.f808d, this.f809e, this.f810i, this);
    }

    public final void w(int i2, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        d dVar = this.f812k;
        c cVar = this.f811j;
        if (cVar != null) {
            cVar.w(i2, collection, i4);
        } else {
            d dVar2 = d.f813j;
            dVar.w(i2, collection, i4);
        }
        this.f808d = dVar.f814d;
        this.f810i += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        return new b(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        D();
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        B(this.f809e + i2, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        D();
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f810i;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        int size = elements.size();
        w(this.f809e + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        C();
        Object[] objArr = this.f808d;
        int i2 = this.f810i;
        int i4 = this.f809e;
        return C1436t.j(objArr, i4, i2 + i4);
    }
}
