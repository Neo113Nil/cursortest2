package Y0;

import X0.f;
import g1.d;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f997a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f998b;

    /* renamed from: c, reason: collision with root package name */
    public int f999c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final f f1000e;

    public a(c cVar, int i) {
        int i2;
        d.e(cVar, "list");
        this.f1000e = cVar;
        this.f998b = i;
        this.f999c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f1000e).f1004e).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f997a) {
            case 0:
                a();
                int i3 = this.f998b;
                this.f998b = i3 + 1;
                b bVar = (b) this.f1000e;
                bVar.add(i3, obj);
                this.f999c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                break;
            default:
                b();
                int i4 = this.f998b;
                this.f998b = i4 + 1;
                c cVar = (c) this.f1000e;
                cVar.add(i4, obj);
                this.f999c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f1000e)).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f997a) {
            case 0:
                if (this.f998b < ((b) this.f1000e).f1003c) {
                }
                break;
            default:
                if (this.f998b < ((c) this.f1000e).f1006b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f997a) {
            case 0:
                if (this.f998b > 0) {
                }
                break;
            default:
                if (this.f998b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f997a) {
            case 0:
                a();
                int i = this.f998b;
                b bVar = (b) this.f1000e;
                if (i >= bVar.f1003c) {
                    throw new NoSuchElementException();
                }
                this.f998b = i + 1;
                this.f999c = i;
                return bVar.f1001a[bVar.f1002b + i];
            default:
                b();
                int i2 = this.f998b;
                c cVar = (c) this.f1000e;
                if (i2 >= cVar.f1006b) {
                    throw new NoSuchElementException();
                }
                this.f998b = i2 + 1;
                this.f999c = i2;
                return cVar.f1005a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f997a) {
        }
        return this.f998b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f997a) {
            case 0:
                a();
                int i = this.f998b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f998b = i2;
                this.f999c = i2;
                b bVar = (b) this.f1000e;
                return bVar.f1001a[bVar.f1002b + i2];
            default:
                b();
                int i3 = this.f998b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f998b = i4;
                this.f999c = i4;
                return ((c) this.f1000e).f1005a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f997a) {
        }
        return this.f998b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f997a) {
            case 0:
                a();
                int i3 = this.f999c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f1000e;
                bVar.b(i3);
                this.f998b = this.f999c;
                this.f999c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                return;
            default:
                b();
                int i4 = this.f999c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f1000e;
                cVar.b(i4);
                this.f998b = this.f999c;
                this.f999c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f997a) {
            case 0:
                a();
                int i = this.f999c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f1000e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f999c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f1000e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        d.e(bVar, "list");
        this.f1000e = bVar;
        this.f998b = i;
        this.f999c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.d = i2;
    }
}
