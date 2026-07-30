package S5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.AbstractC0627f;
import kotlin.collections.AbstractC0629h;
import kotlin.collections.C0624c;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends AbstractC0629h implements List, RandomAccess, Serializable {

    /* renamed from: l, reason: collision with root package name */
    private static final d f2518l = new d(null);

    /* renamed from: m, reason: collision with root package name */
    public static final e f2519m;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f2520d;

    /* renamed from: e, reason: collision with root package name */
    public int f2521e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2522i;

    static {
        e eVar = new e(0);
        eVar.f2522i = true;
        f2519m = eVar;
    }

    public e() {
        this(0, 1, null);
    }

    @Override // kotlin.collections.AbstractC0629h
    public final int a() {
        return this.f2521e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i2 = this.f2521e;
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f2520d[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        int size = elements.size();
        d(this.f2521e, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC0629h
    public final Object b(int i2) {
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.b(i2, i5);
        return h(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        i(0, this.f2521e);
    }

    public final void d(int i2, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        g(i2, i5);
        Iterator it = collection.iterator();
        for (int i7 = 0; i7 < i5; i7++) {
            this.f2520d[i2 + i7] = it.next();
        }
    }

    public final void e(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f2520d[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f2520d;
            int i2 = this.f2521e;
            if (i2 == list.size()) {
                for (int i5 = 0; i5 < i2; i5++) {
                    if (Intrinsics.a(objArr[i5], list.get(i5))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f2522i) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i2, int i5) {
        int i7 = this.f2521e + i5;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2520d;
        if (i7 > objArr.length) {
            C0624c c0624c = AbstractC0627f.f6131d;
            int length = objArr.length;
            c0624c.getClass();
            int e7 = C0624c.e(length, i7);
            Object[] objArr2 = this.f2520d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr2, e7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f2520d = copyOf;
        }
        Object[] objArr3 = this.f2520d;
        o.e(objArr3, objArr3, i2 + i5, i2, this.f2521e);
        this.f2521e += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.b(i2, i5);
        return this.f2520d[i2];
    }

    public final Object h(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f2520d;
        Object obj = objArr[i2];
        o.e(objArr, objArr, i2, i2 + 1, this.f2521e);
        Object[] objArr2 = this.f2520d;
        int i5 = this.f2521e - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i5] = null;
        this.f2521e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f2520d;
        int i2 = this.f2521e;
        int i5 = 1;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj = objArr[i7];
            i5 = (i5 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public final void i(int i2, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f2520d;
        o.e(objArr, objArr, i2, i2 + i5, this.f2521e);
        Object[] objArr2 = this.f2520d;
        int i7 = this.f2521e;
        P0.f.F(objArr2, i7 - i5, i7);
        this.f2521e -= i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f2521e; i2++) {
            if (Intrinsics.a(this.f2520d[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f2521e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i2, int i5, Collection collection, boolean z7) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            int i9 = i2 + i7;
            if (collection.contains(this.f2520d[i9]) == z7) {
                Object[] objArr = this.f2520d;
                i7++;
                objArr[i8 + i2] = objArr[i9];
                i8++;
            } else {
                i7++;
            }
        }
        int i10 = i5 - i8;
        Object[] objArr2 = this.f2520d;
        o.e(objArr2, objArr2, i2 + i8, i5 + i2, this.f2521e);
        Object[] objArr3 = this.f2520d;
        int i11 = this.f2521e;
        P0.f.F(objArr3, i11 - i10, i11);
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f2521e -= i10;
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f2521e - 1; i2 >= 0; i2--) {
            if (Intrinsics.a(this.f2520d[i2], obj)) {
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
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        return j(0, this.f2521e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        return j(0, this.f2521e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.b(i2, i5);
        Object[] objArr = this.f2520d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i5) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i7 = this.f2521e;
        c0624c.getClass();
        C0624c.d(i2, i5, i7);
        return new c(this.f2520d, i2, i5 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i2 = this.f2521e;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f2520d, 0, i2, array.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        o.e(this.f2520d, array, 0, 0, i2);
        int i5 = this.f2521e;
        Intrinsics.checkNotNullParameter(array, "array");
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return P0.f.a(this.f2520d, 0, this.f2521e, this);
    }

    public /* synthetic */ e(int i2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 10 : i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.c(i2, i5);
        return new b(this, i2);
    }

    public e(int i2) {
        if (i2 >= 0) {
            this.f2520d = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.c(i2, i5);
        int size = elements.size();
        d(i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        f();
        C0624c c0624c = AbstractC0627f.f6131d;
        int i5 = this.f2521e;
        c0624c.getClass();
        C0624c.c(i2, i5);
        ((AbstractList) this).modCount++;
        g(i2, 1);
        this.f2520d[i2] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return o.h(this.f2520d, 0, this.f2521e);
    }
}
