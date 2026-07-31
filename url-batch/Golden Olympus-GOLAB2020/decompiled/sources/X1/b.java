package X1;

import i2.InterfaceC2471a;
import i2.InterfaceC2474d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractC3213c;
import kotlin.collections.AbstractC3215e;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b extends AbstractC3215e implements List, RandomAccess, Serializable, InterfaceC2474d {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f9679h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final b f9680i;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f9681b;

    /* renamed from: c, reason: collision with root package name */
    private int f9682c;

    /* renamed from: d, reason: collision with root package name */
    private int f9683d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9684e;

    /* renamed from: f, reason: collision with root package name */
    private final b f9685f;

    /* renamed from: g, reason: collision with root package name */
    private final b f9686g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: X1.b$b, reason: collision with other inner class name */
    private static final class C0068b implements ListIterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private final b f9687b;

        /* renamed from: c, reason: collision with root package name */
        private int f9688c;

        /* renamed from: d, reason: collision with root package name */
        private int f9689d;

        /* renamed from: e, reason: collision with root package name */
        private int f9690e;

        public C0068b(b list, int i4) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f9687b = list;
            this.f9688c = i4;
            this.f9689d = -1;
            this.f9690e = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f9687b).modCount != this.f9690e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f9687b;
            int i4 = this.f9688c;
            this.f9688c = i4 + 1;
            bVar.add(i4, obj);
            this.f9689d = -1;
            this.f9690e = ((AbstractList) this.f9687b).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f9688c < this.f9687b.f9683d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f9688c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f9688c >= this.f9687b.f9683d) {
                throw new NoSuchElementException();
            }
            int i4 = this.f9688c;
            this.f9688c = i4 + 1;
            this.f9689d = i4;
            return this.f9687b.f9681b[this.f9687b.f9682c + this.f9689d];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f9688c;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i4 = this.f9688c;
            if (i4 <= 0) {
                throw new NoSuchElementException();
            }
            int i5 = i4 - 1;
            this.f9688c = i5;
            this.f9689d = i5;
            return this.f9687b.f9681b[this.f9687b.f9682c + this.f9689d];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f9688c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i4 = this.f9689d;
            if (i4 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f9687b.remove(i4);
            this.f9688c = this.f9689d;
            this.f9689d = -1;
            this.f9690e = ((AbstractList) this.f9687b).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i4 = this.f9689d;
            if (i4 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f9687b.set(i4, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f9684e = true;
        f9680i = bVar;
    }

    private b(Object[] objArr, int i4, int i5, boolean z4, b bVar, b bVar2) {
        this.f9681b = objArr;
        this.f9682c = i4;
        this.f9683d = i5;
        this.f9684e = z4;
        this.f9685f = bVar;
        this.f9686g = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    private final void l(int i4, Collection collection, int i5) {
        v();
        b bVar = this.f9685f;
        if (bVar != null) {
            bVar.l(i4, collection, i5);
            this.f9681b = this.f9685f.f9681b;
            this.f9683d += i5;
        } else {
            t(i4, i5);
            Iterator it = collection.iterator();
            for (int i6 = 0; i6 < i5; i6++) {
                this.f9681b[i4 + i6] = it.next();
            }
        }
    }

    private final void m(int i4, Object obj) {
        v();
        b bVar = this.f9685f;
        if (bVar == null) {
            t(i4, 1);
            this.f9681b[i4] = obj;
        } else {
            bVar.m(i4, obj);
            this.f9681b = this.f9685f.f9681b;
            this.f9683d++;
        }
    }

    private final void o() {
        b bVar = this.f9686g;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void p() {
        if (u()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean q(List list) {
        boolean h4;
        h4 = c.h(this.f9681b, this.f9682c, this.f9683d, list);
        return h4;
    }

    private final void r(int i4) {
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f9681b;
        if (i4 > objArr.length) {
            this.f9681b = c.e(this.f9681b, AbstractC3213c.Companion.e(objArr.length, i4));
        }
    }

    private final void s(int i4) {
        r(this.f9683d + i4);
    }

    private final void t(int i4, int i5) {
        s(i5);
        Object[] objArr = this.f9681b;
        AbstractC3219i.h(objArr, objArr, i4 + i5, i4, this.f9682c + this.f9683d);
        this.f9683d += i5;
    }

    private final boolean u() {
        if (this.f9684e) {
            return true;
        }
        b bVar = this.f9686g;
        return bVar != null && bVar.f9684e;
    }

    private final void v() {
        ((AbstractList) this).modCount++;
    }

    private final Object w(int i4) {
        v();
        b bVar = this.f9685f;
        if (bVar != null) {
            this.f9683d--;
            return bVar.w(i4);
        }
        Object[] objArr = this.f9681b;
        Object obj = objArr[i4];
        AbstractC3219i.h(objArr, objArr, i4, i4 + 1, this.f9682c + this.f9683d);
        c.f(this.f9681b, (this.f9682c + this.f9683d) - 1);
        this.f9683d--;
        return obj;
    }

    private final void x(int i4, int i5) {
        if (i5 > 0) {
            v();
        }
        b bVar = this.f9685f;
        if (bVar != null) {
            bVar.x(i4, i5);
        } else {
            Object[] objArr = this.f9681b;
            AbstractC3219i.h(objArr, objArr, i4, i4 + i5, this.f9683d);
            Object[] objArr2 = this.f9681b;
            int i6 = this.f9683d;
            c.g(objArr2, i6 - i5, i6);
        }
        this.f9683d -= i5;
    }

    private final int y(int i4, int i5, Collection collection, boolean z4) {
        int i6;
        b bVar = this.f9685f;
        if (bVar != null) {
            i6 = bVar.y(i4, i5, collection, z4);
        } else {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5) {
                int i9 = i4 + i7;
                if (collection.contains(this.f9681b[i9]) == z4) {
                    Object[] objArr = this.f9681b;
                    i7++;
                    objArr[i8 + i4] = objArr[i9];
                    i8++;
                } else {
                    i7++;
                }
            }
            int i10 = i5 - i8;
            Object[] objArr2 = this.f9681b;
            AbstractC3219i.h(objArr2, objArr2, i4 + i8, i5 + i4, this.f9683d);
            Object[] objArr3 = this.f9681b;
            int i11 = this.f9683d;
            c.g(objArr3, i11 - i10, i11);
            i6 = i10;
        }
        if (i6 > 0) {
            v();
        }
        this.f9683d -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        p();
        o();
        m(this.f9682c + this.f9683d, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        p();
        o();
        int size = elements.size();
        l(this.f9682c + this.f9683d, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        p();
        o();
        x(this.f9682c, this.f9683d);
    }

    @Override // kotlin.collections.AbstractC3215e
    public int d() {
        o();
        return this.f9683d;
    }

    @Override // kotlin.collections.AbstractC3215e
    public Object e(int i4) {
        p();
        o();
        AbstractC3213c.Companion.b(i4, this.f9683d);
        return w(this.f9682c + i4);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        o();
        if (obj != this) {
            return (obj instanceof List) && q((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        o();
        AbstractC3213c.Companion.b(i4, this.f9683d);
        return this.f9681b[this.f9682c + i4];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i4;
        o();
        i4 = c.i(this.f9681b, this.f9682c, this.f9683d);
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        o();
        for (int i4 = 0; i4 < this.f9683d; i4++) {
            if (Intrinsics.areEqual(this.f9681b[this.f9682c + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        o();
        return this.f9683d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        o();
        for (int i4 = this.f9683d - 1; i4 >= 0; i4--) {
            if (Intrinsics.areEqual(this.f9681b[this.f9682c + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final List n() {
        if (this.f9685f != null) {
            throw new IllegalStateException();
        }
        p();
        this.f9684e = true;
        return this.f9683d > 0 ? this : f9680i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        p();
        o();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        p();
        o();
        return y(this.f9682c, this.f9683d, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        p();
        o();
        return y(this.f9682c, this.f9683d, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        p();
        o();
        AbstractC3213c.Companion.b(i4, this.f9683d);
        Object[] objArr = this.f9681b;
        int i5 = this.f9682c;
        Object obj2 = objArr[i5 + i4];
        objArr[i5 + i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i4, int i5) {
        AbstractC3213c.Companion.d(i4, i5, this.f9683d);
        Object[] objArr = this.f9681b;
        int i6 = this.f9682c + i4;
        int i7 = i5 - i4;
        boolean z4 = this.f9684e;
        b bVar = this.f9686g;
        return new b(objArr, i6, i7, z4, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        o();
        int length = destination.length;
        int i4 = this.f9683d;
        if (length >= i4) {
            Object[] objArr = this.f9681b;
            int i5 = this.f9682c;
            AbstractC3219i.h(objArr, destination, 0, i5, i4 + i5);
            return CollectionsKt.terminateCollectionToArray(this.f9683d, destination);
        }
        Object[] objArr2 = this.f9681b;
        int i6 = this.f9682c;
        Object[] copyOfRange = Arrays.copyOfRange(objArr2, i6, i4 + i6, destination.getClass());
        Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j4;
        o();
        j4 = c.j(this.f9681b, this.f9682c, this.f9683d, this);
        return j4;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i4) {
        o();
        AbstractC3213c.Companion.c(i4, this.f9683d);
        return new C0068b(this, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        p();
        o();
        AbstractC3213c.Companion.c(i4, this.f9683d);
        m(this.f9682c + i4, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        p();
        o();
        AbstractC3213c.Companion.c(i4, this.f9683d);
        int size = elements.size();
        l(this.f9682c + i4, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        o();
        Object[] objArr = this.f9681b;
        int i4 = this.f9682c;
        return AbstractC3219i.l(objArr, i4, this.f9683d + i4);
    }

    public b() {
        this(10);
    }

    public b(int i4) {
        this(c.d(i4), 0, 0, false, null, null);
    }
}
