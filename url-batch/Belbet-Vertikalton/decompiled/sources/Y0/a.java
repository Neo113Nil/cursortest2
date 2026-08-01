package Y0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1390a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1391b;

    /* renamed from: c, reason: collision with root package name */
    public int f1392c;

    /* renamed from: d, reason: collision with root package name */
    public int f1393d;
    public final X0.f e;

    public a(c cVar, int i) {
        int i2;
        j1.h.e(cVar, "list");
        this.e = cVar;
        this.f1391b = i;
        this.f1392c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.f1393d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.e).e).modCount;
        if (i != this.f1393d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f1390a) {
            case 0:
                a();
                int i3 = this.f1391b;
                this.f1391b = i3 + 1;
                b bVar = (b) this.e;
                bVar.add(i3, obj);
                this.f1392c = -1;
                i = ((AbstractList) bVar).modCount;
                this.f1393d = i;
                break;
            default:
                b();
                int i4 = this.f1391b;
                this.f1391b = i4 + 1;
                c cVar = (c) this.e;
                cVar.add(i4, obj);
                this.f1392c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f1393d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.e)).modCount;
        if (i != this.f1393d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1390a) {
            case 0:
                if (this.f1391b < ((b) this.e).f1396c) {
                }
                break;
            default:
                if (this.f1391b < ((c) this.e).f1400b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1390a) {
            case 0:
                if (this.f1391b > 0) {
                }
                break;
            default:
                if (this.f1391b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1390a) {
            case 0:
                a();
                int i = this.f1391b;
                b bVar = (b) this.e;
                if (i >= bVar.f1396c) {
                    throw new NoSuchElementException();
                }
                this.f1391b = i + 1;
                this.f1392c = i;
                return bVar.f1394a[bVar.f1395b + i];
            default:
                b();
                int i2 = this.f1391b;
                c cVar = (c) this.e;
                if (i2 >= cVar.f1400b) {
                    throw new NoSuchElementException();
                }
                this.f1391b = i2 + 1;
                this.f1392c = i2;
                return cVar.f1399a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1390a) {
        }
        return this.f1391b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1390a) {
            case 0:
                a();
                int i = this.f1391b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f1391b = i2;
                this.f1392c = i2;
                b bVar = (b) this.e;
                return bVar.f1394a[bVar.f1395b + i2];
            default:
                b();
                int i3 = this.f1391b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f1391b = i4;
                this.f1392c = i4;
                return ((c) this.e).f1399a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1390a) {
        }
        return this.f1391b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f1390a) {
            case 0:
                a();
                int i3 = this.f1392c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.e;
                bVar.b(i3);
                this.f1391b = this.f1392c;
                this.f1392c = -1;
                i = ((AbstractList) bVar).modCount;
                this.f1393d = i;
                return;
            default:
                b();
                int i4 = this.f1392c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.e;
                cVar.b(i4);
                this.f1391b = this.f1392c;
                this.f1392c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f1393d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1390a) {
            case 0:
                a();
                int i = this.f1392c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f1392c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        j1.h.e(bVar, "list");
        this.e = bVar;
        this.f1391b = i;
        this.f1392c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.f1393d = i2;
    }
}
