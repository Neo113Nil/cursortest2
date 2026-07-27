package A2;

import a.AbstractC0345a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1420d;
import z2.AbstractC1428l;
import z2.C1436t;

/* loaded from: classes.dex */
public final class d extends AbstractC1428l implements List, RandomAccess, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final d f813j;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f814d;

    /* renamed from: e, reason: collision with root package name */
    public int f815e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f816i;

    static {
        d dVar = new d(0);
        dVar.f816i = true;
        f813j = dVar;
    }

    public d() {
        this(10);
    }

    public final void B(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        D(i2, 1);
        this.f814d[i2] = obj;
    }

    public final void C() {
        if (this.f816i) {
            throw new UnsupportedOperationException();
        }
    }

    public final void D(int i2, int i4) {
        int i5 = this.f815e + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f814d;
        if (i5 > objArr.length) {
            AbstractC1420d.a aVar = AbstractC1420d.f11939d;
            int length = objArr.length;
            aVar.getClass();
            int e4 = AbstractC1420d.a.e(length, i5);
            Object[] objArr2 = this.f814d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr2, e4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f814d = copyOf;
        }
        Object[] objArr3 = this.f814d;
        C1436t.f(objArr3, objArr3, i2 + i4, i2, this.f815e);
        this.f815e += i4;
    }

    public final Object E(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f814d;
        Object obj = objArr[i2];
        C1436t.f(objArr, objArr, i2, i2 + 1, this.f815e);
        Object[] objArr2 = this.f814d;
        int i4 = this.f815e - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i4] = null;
        this.f815e--;
        return obj;
    }

    public final void F(int i2, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f814d;
        C1436t.f(objArr, objArr, i2, i2 + i4, this.f815e);
        Object[] objArr2 = this.f814d;
        int i5 = this.f815e;
        AbstractC0345a.D(objArr2, i5 - i4, i5);
        this.f815e -= i4;
    }

    public final int G(int i2, int i4, Collection collection, boolean z4) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i2 + i5;
            if (collection.contains(this.f814d[i7]) == z4) {
                Object[] objArr = this.f814d;
                i5++;
                objArr[i6 + i2] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f814d;
        C1436t.f(objArr2, objArr2, i2 + i6, i4 + i2, this.f815e);
        Object[] objArr3 = this.f814d;
        int i9 = this.f815e;
        AbstractC0345a.D(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f815e -= i8;
        return i8;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        C();
        int i2 = this.f815e;
        ((AbstractList) this).modCount++;
        D(i2, 1);
        this.f814d[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        int size = elements.size();
        w(this.f815e, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        C();
        F(0, this.f815e);
    }

    @Override // z2.AbstractC1428l
    public final int e() {
        return this.f815e;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!AbstractC0345a.f(this.f814d, 0, this.f815e, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return this.f814d[i2];
    }

    @Override // z2.AbstractC1428l
    public final Object h(int i2) {
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        return E(i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f814d;
        int i2 = this.f815e;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            Object obj = objArr[i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f815e; i2++) {
            if (Intrinsics.a(this.f814d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f815e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f815e - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.f814d[i2], obj)) {
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
        C();
        return G(0, this.f815e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        return G(0, this.f815e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.b(i2, i4);
        Object[] objArr = this.f814d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i4) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i5 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.d(i2, i4, i5);
        return new c(this.f814d, i2, i4 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i2 = this.f815e;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f814d, 0, i2, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        C1436t.f(this.f814d, array, 0, 0, i2);
        int i4 = this.f815e;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0345a.g(this.f814d, 0, this.f815e, this);
    }

    public final void w(int i2, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        D(i2, i4);
        Iterator it = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f814d[i2 + i5] = it.next();
        }
    }

    public d(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f814d = new Object[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        return new b(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        int size = elements.size();
        w(i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        C();
        AbstractC1420d.a aVar = AbstractC1420d.f11939d;
        int i4 = this.f815e;
        aVar.getClass();
        AbstractC1420d.a.c(i2, i4);
        ((AbstractList) this).modCount++;
        D(i2, 1);
        this.f814d[i2] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return C1436t.j(this.f814d, 0, this.f815e);
    }
}
