package A2;

import Q.v;
import Q.w;
import S.n;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import r0.r;

/* loaded from: classes.dex */
public final class b implements ListIterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f803d;

    /* renamed from: e, reason: collision with root package name */
    public int f804e;

    /* renamed from: i, reason: collision with root package name */
    public int f805i;

    /* renamed from: j, reason: collision with root package name */
    public int f806j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f807k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(r rVar, int i2, int i4) {
        this(rVar, (i4 & 1) != 0 ? 0 : i2, 0, rVar.f9838j);
        this.f803d = 3;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i4;
        switch (this.f803d) {
            case 0:
                b();
                int i5 = this.f804e;
                this.f804e = i5 + 1;
                c cVar = (c) this.f807k;
                cVar.add(i5, obj);
                this.f805i = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f806j = i2;
                return;
            case 1:
                c();
                int i6 = this.f804e;
                this.f804e = i6 + 1;
                d dVar = (d) this.f807k;
                dVar.add(i6, obj);
                this.f805i = -1;
                i4 = ((AbstractList) dVar).modCount;
                this.f806j = i4;
                return;
            case 2:
                d();
                int i7 = this.f804e + 1;
                v vVar = (v) this.f807k;
                vVar.add(i7, obj);
                this.f805i = -1;
                this.f804e++;
                this.f806j = vVar.B();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i2;
        i2 = ((AbstractList) ((c) this.f807k).f812k).modCount;
        if (i2 != this.f806j) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        int i2;
        i2 = ((AbstractList) ((d) this.f807k)).modCount;
        if (i2 != this.f806j) {
            throw new ConcurrentModificationException();
        }
    }

    public void d() {
        if (((v) this.f807k).B() != this.f806j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f803d) {
            case 0:
                return this.f804e < ((c) this.f807k).f810i;
            case 1:
                return this.f804e < ((d) this.f807k).f815e;
            case 2:
                return this.f804e < ((v) this.f807k).size() - 1;
            default:
                return this.f804e < this.f806j;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f803d) {
            case 0:
                if (this.f804e > 0) {
                }
                break;
            case 1:
                if (this.f804e > 0) {
                }
                break;
            case 2:
                if (this.f804e >= 0) {
                }
                break;
            default:
                if (this.f804e > this.f805i) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f803d) {
            case 0:
                b();
                int i2 = this.f804e;
                c cVar = (c) this.f807k;
                if (i2 >= cVar.f810i) {
                    throw new NoSuchElementException();
                }
                this.f804e = i2 + 1;
                this.f805i = i2;
                return cVar.f808d[cVar.f809e + i2];
            case 1:
                c();
                int i4 = this.f804e;
                d dVar = (d) this.f807k;
                if (i4 >= dVar.f815e) {
                    throw new NoSuchElementException();
                }
                this.f804e = i4 + 1;
                this.f805i = i4;
                return dVar.f814d[i4];
            case 2:
                d();
                int i5 = this.f804e + 1;
                this.f805i = i5;
                v vVar = (v) this.f807k;
                w.a(i5, vVar.size());
                Object obj = vVar.get(i5);
                this.f804e = i5;
                return obj;
            default:
                Object[] objArr = ((r) this.f807k).f9835d;
                int i6 = this.f804e;
                this.f804e = i6 + 1;
                Object obj2 = objArr[i6];
                Intrinsics.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f803d) {
            case 0:
                return this.f804e;
            case 1:
                return this.f804e;
            case 2:
                return this.f804e + 1;
            default:
                return this.f804e - this.f805i;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f803d) {
            case 0:
                b();
                int i2 = this.f804e;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i2 - 1;
                this.f804e = i4;
                this.f805i = i4;
                c cVar = (c) this.f807k;
                return cVar.f808d[cVar.f809e + i4];
            case 1:
                c();
                int i5 = this.f804e;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f804e = i6;
                this.f805i = i6;
                return ((d) this.f807k).f814d[i6];
            case 2:
                d();
                int i7 = this.f804e;
                v vVar = (v) this.f807k;
                w.a(i7, vVar.size());
                int i8 = this.f804e;
                this.f805i = i8;
                this.f804e--;
                return vVar.get(i8);
            default:
                Object[] objArr = ((r) this.f807k).f9835d;
                int i9 = this.f804e - 1;
                this.f804e = i9;
                Object obj = objArr[i9];
                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (n) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f803d) {
            case 0:
                return this.f804e - 1;
            case 1:
                return this.f804e - 1;
            case 2:
                return this.f804e;
            default:
                return (this.f804e - this.f805i) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i4;
        switch (this.f803d) {
            case 0:
                b();
                int i5 = this.f805i;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f807k;
                cVar.h(i5);
                this.f804e = this.f805i;
                this.f805i = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f806j = i2;
                return;
            case 1:
                c();
                int i6 = this.f805i;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                d dVar = (d) this.f807k;
                dVar.h(i6);
                this.f804e = this.f805i;
                this.f805i = -1;
                i4 = ((AbstractList) dVar).modCount;
                this.f806j = i4;
                return;
            case 2:
                d();
                int i7 = this.f804e;
                v vVar = (v) this.f807k;
                vVar.remove(i7);
                this.f804e--;
                this.f805i = -1;
                this.f806j = vVar.B();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f803d) {
            case 0:
                b();
                int i2 = this.f805i;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f807k).set(i2, obj);
                return;
            case 1:
                c();
                int i4 = this.f805i;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((d) this.f807k).set(i4, obj);
                return;
            case 2:
                d();
                int i5 = this.f805i;
                if (i5 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                v vVar = (v) this.f807k;
                vVar.set(i5, obj);
                this.f806j = vVar.B();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(r rVar, int i2, int i4, int i5) {
        this.f803d = 3;
        this.f807k = rVar;
        this.f804e = i2;
        this.f805i = i4;
        this.f806j = i5;
    }

    public b(d list, int i2) {
        int i4;
        this.f803d = 1;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f807k = list;
        this.f804e = i2;
        this.f805i = -1;
        i4 = ((AbstractList) list).modCount;
        this.f806j = i4;
    }

    public b(v vVar, int i2) {
        this.f803d = 2;
        this.f807k = vVar;
        this.f804e = i2 - 1;
        this.f805i = -1;
        this.f806j = vVar.B();
    }

    public b(c list, int i2) {
        int i4;
        this.f803d = 0;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f807k = list;
        this.f804e = i2;
        this.f805i = -1;
        i4 = ((AbstractList) list).modCount;
        this.f806j = i4;
    }
}
