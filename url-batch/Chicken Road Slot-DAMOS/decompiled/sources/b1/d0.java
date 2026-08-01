package b1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 implements ListIterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f964d;

    /* renamed from: e, reason: collision with root package name */
    public int f965e;

    /* renamed from: i, reason: collision with root package name */
    public int f966i;

    /* renamed from: r, reason: collision with root package name */
    public int f967r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f968s;

    public d0(w wVar, int i3) {
        this.f964d = 0;
        this.f968s = wVar;
        this.f965e = i3 - 1;
        this.f966i = -1;
        this.f967r = x.g(wVar);
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((id.b) this.f968s).f4684s).modCount;
        if (i3 != this.f967r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        int i10;
        switch (this.f964d) {
            case 0:
                c();
                w wVar = (w) this.f968s;
                wVar.add(this.f965e + 1, obj);
                this.f966i = -1;
                this.f965e++;
                this.f967r = x.g(wVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                id.b bVar = (id.b) this.f968s;
                int i11 = this.f965e;
                this.f965e = i11 + 1;
                bVar.add(i11, obj);
                this.f966i = -1;
                i3 = ((AbstractList) bVar).modCount;
                this.f967r = i3;
                return;
            default:
                b();
                id.d dVar = (id.d) this.f968s;
                int i12 = this.f965e;
                this.f965e = i12 + 1;
                dVar.add(i12, obj);
                this.f966i = -1;
                i10 = ((AbstractList) dVar).modCount;
                this.f967r = i10;
                return;
        }
    }

    public void b() {
        int i3;
        i3 = ((AbstractList) ((id.d) this.f968s)).modCount;
        if (i3 != this.f967r) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (x.g((w) this.f968s) != this.f967r) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f964d) {
            case 0:
                return this.f965e < ((w) this.f968s).size() - 1;
            case 1:
                return this.f965e < this.f967r;
            case 2:
                return this.f965e < ((id.b) this.f968s).f4682i;
            default:
                return this.f965e < ((id.d) this.f968s).f4688e;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f964d) {
            case 0:
                if (this.f965e >= 0) {
                }
                break;
            case 1:
                if (this.f965e > this.f966i) {
                }
                break;
            case 2:
                if (this.f965e > 0) {
                }
                break;
            default:
                if (this.f965e > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f964d) {
            case 0:
                c();
                int i3 = this.f965e + 1;
                this.f966i = i3;
                w wVar = (w) this.f968s;
                x.a(i3, wVar.size());
                Object obj = wVar.get(i3);
                this.f965e = i3;
                break;
            case 1:
                s.d0 d0Var = ((c2.o) this.f968s).f1628d;
                int i10 = this.f965e;
                this.f965e = i10 + 1;
                Object f3 = d0Var.f(i10);
                f3.getClass();
                break;
            case 2:
                a();
                int i11 = this.f965e;
                id.b bVar = (id.b) this.f968s;
                if (i11 >= bVar.f4682i) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    this.f965e = i11 + 1;
                    this.f966i = i11;
                    break;
                }
            default:
                b();
                int i12 = this.f965e;
                id.d dVar = (id.d) this.f968s;
                if (i12 >= dVar.f4688e) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    this.f965e = i12 + 1;
                    this.f966i = i12;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f964d) {
        }
        return this.f965e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f964d) {
            case 0:
                c();
                int i3 = this.f965e;
                w wVar = (w) this.f968s;
                x.a(i3, wVar.size());
                int i10 = this.f965e;
                this.f966i = i10;
                this.f965e--;
                break;
            case 1:
                s.d0 d0Var = ((c2.o) this.f968s).f1628d;
                int i11 = this.f965e - 1;
                this.f965e = i11;
                Object f3 = d0Var.f(i11);
                f3.getClass();
                break;
            case 2:
                a();
                int i12 = this.f965e;
                if (i12 <= 0) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    int i13 = i12 - 1;
                    this.f965e = i13;
                    this.f966i = i13;
                    id.b bVar = (id.b) this.f968s;
                    break;
                }
            default:
                b();
                int i14 = this.f965e;
                if (i14 <= 0) {
                    kotlin.collections.i0.c();
                    break;
                } else {
                    int i15 = i14 - 1;
                    this.f965e = i15;
                    this.f966i = i15;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i3;
        switch (this.f964d) {
            case 0:
                return this.f965e;
            case 1:
                i3 = this.f965e - this.f966i;
                break;
            case 2:
                i3 = this.f965e;
                break;
            default:
                i3 = this.f965e;
                break;
        }
        return i3 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        int i10;
        switch (this.f964d) {
            case 0:
                c();
                w wVar = (w) this.f968s;
                wVar.remove(this.f966i);
                this.f965e--;
                this.f966i = -1;
                this.f967r = x.g(wVar);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                id.b bVar = (id.b) this.f968s;
                a();
                int i11 = this.f966i;
                if (i11 == -1) {
                    kotlin.collections.i0.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                bVar.c(i11);
                this.f965e = this.f966i;
                this.f966i = -1;
                i3 = ((AbstractList) bVar).modCount;
                this.f967r = i3;
                return;
            default:
                id.d dVar = (id.d) this.f968s;
                b();
                int i12 = this.f966i;
                if (i12 == -1) {
                    kotlin.collections.i0.l("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                dVar.c(i12);
                this.f965e = this.f966i;
                this.f966i = -1;
                i10 = ((AbstractList) dVar).modCount;
                this.f967r = i10;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f964d) {
            case 0:
                w wVar = (w) this.f968s;
                c();
                int i3 = this.f966i;
                if (i3 < 0) {
                    kotlin.collections.i0.l("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    wVar.set(i3, obj);
                    this.f967r = x.g(wVar);
                    return;
                }
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                a();
                int i10 = this.f966i;
                if (i10 != -1) {
                    ((id.b) this.f968s).set(i10, obj);
                    return;
                } else {
                    kotlin.collections.i0.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                b();
                int i11 = this.f966i;
                if (i11 != -1) {
                    ((id.d) this.f968s).set(i11, obj);
                    return;
                } else {
                    kotlin.collections.i0.l("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public d0(id.d dVar, int i3) {
        int i10;
        this.f964d = 3;
        this.f968s = dVar;
        this.f965e = i3;
        this.f966i = -1;
        i10 = ((AbstractList) dVar).modCount;
        this.f967r = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(c2.o oVar, int i3, int i10) {
        this(oVar, (i10 & 1) != 0 ? 0 : i3, 0, oVar.f1628d.f8285b);
        this.f964d = 1;
    }

    public d0(c2.o oVar, int i3, int i10, int i11) {
        this.f964d = 1;
        this.f968s = oVar;
        this.f965e = i3;
        this.f966i = i10;
        this.f967r = i11;
    }

    public d0(id.b bVar, int i3) {
        int i10;
        this.f964d = 2;
        this.f968s = bVar;
        this.f965e = i3;
        this.f966i = -1;
        i10 = ((AbstractList) bVar).modCount;
        this.f967r = i10;
    }
}
