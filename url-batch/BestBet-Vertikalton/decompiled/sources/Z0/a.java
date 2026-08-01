package Z0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class a implements ListIterator, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1525a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1526b;

    /* renamed from: c, reason: collision with root package name */
    public int f1527c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final Y0.e f1528e;

    public a(c cVar, int i) {
        int i2;
        k1.e.e(cVar, "list");
        this.f1528e = cVar;
        this.f1526b = i;
        this.f1527c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f1528e).f1532e).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f1525a) {
            case 0:
                a();
                int i3 = this.f1526b;
                this.f1526b = i3 + 1;
                b bVar = (b) this.f1528e;
                bVar.add(i3, obj);
                this.f1527c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                break;
            default:
                b();
                int i4 = this.f1526b;
                this.f1526b = i4 + 1;
                c cVar = (c) this.f1528e;
                cVar.add(i4, obj);
                this.f1527c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f1528e)).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1525a) {
            case 0:
                if (this.f1526b < ((b) this.f1528e).f1531c) {
                }
                break;
            default:
                if (this.f1526b < ((c) this.f1528e).f1534b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1525a) {
            case 0:
                if (this.f1526b > 0) {
                }
                break;
            default:
                if (this.f1526b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1525a) {
            case 0:
                a();
                int i = this.f1526b;
                b bVar = (b) this.f1528e;
                if (i >= bVar.f1531c) {
                    throw new NoSuchElementException();
                }
                this.f1526b = i + 1;
                this.f1527c = i;
                return bVar.f1529a[bVar.f1530b + i];
            default:
                b();
                int i2 = this.f1526b;
                c cVar = (c) this.f1528e;
                if (i2 >= cVar.f1534b) {
                    throw new NoSuchElementException();
                }
                this.f1526b = i2 + 1;
                this.f1527c = i2;
                return cVar.f1533a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1525a) {
        }
        return this.f1526b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1525a) {
            case 0:
                a();
                int i = this.f1526b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f1526b = i2;
                this.f1527c = i2;
                b bVar = (b) this.f1528e;
                return bVar.f1529a[bVar.f1530b + i2];
            default:
                b();
                int i3 = this.f1526b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f1526b = i4;
                this.f1527c = i4;
                return ((c) this.f1528e).f1533a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1525a) {
        }
        return this.f1526b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f1525a) {
            case 0:
                a();
                int i3 = this.f1527c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f1528e;
                bVar.b(i3);
                this.f1526b = this.f1527c;
                this.f1527c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                return;
            default:
                b();
                int i4 = this.f1527c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f1528e;
                cVar.b(i4);
                this.f1526b = this.f1527c;
                this.f1527c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1525a) {
            case 0:
                a();
                int i = this.f1527c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f1528e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f1527c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f1528e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        k1.e.e(bVar, "list");
        this.f1528e = bVar;
        this.f1526b = i;
        this.f1527c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.d = i2;
    }
}
