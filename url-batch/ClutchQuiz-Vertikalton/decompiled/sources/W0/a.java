package W0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f894a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f895b;

    /* renamed from: c, reason: collision with root package name */
    public int f896c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final V0.a f897e;

    public a(c cVar, int i) {
        int i2;
        g1.f.e(cVar, "list");
        this.f897e = cVar;
        this.f895b = i;
        this.f896c = -1;
        i2 = ((AbstractList) cVar).modCount;
        this.d = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f897e).f901e).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        switch (this.f894a) {
            case 0:
                a();
                int i3 = this.f895b;
                this.f895b = i3 + 1;
                b bVar = (b) this.f897e;
                bVar.add(i3, obj);
                this.f896c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                break;
            default:
                b();
                int i4 = this.f895b;
                this.f895b = i4 + 1;
                c cVar = (c) this.f897e;
                cVar.add(i4, obj);
                this.f896c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f897e)).modCount;
        if (i != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f894a) {
            case 0:
                if (this.f895b < ((b) this.f897e).f900c) {
                }
                break;
            default:
                if (this.f895b < ((c) this.f897e).f903b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f894a) {
            case 0:
                if (this.f895b > 0) {
                }
                break;
            default:
                if (this.f895b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f894a) {
            case 0:
                a();
                int i = this.f895b;
                b bVar = (b) this.f897e;
                if (i >= bVar.f900c) {
                    throw new NoSuchElementException();
                }
                this.f895b = i + 1;
                this.f896c = i;
                return bVar.f898a[bVar.f899b + i];
            default:
                b();
                int i2 = this.f895b;
                c cVar = (c) this.f897e;
                if (i2 >= cVar.f903b) {
                    throw new NoSuchElementException();
                }
                this.f895b = i2 + 1;
                this.f896c = i2;
                return cVar.f902a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f894a) {
        }
        return this.f895b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f894a) {
            case 0:
                a();
                int i = this.f895b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f895b = i2;
                this.f896c = i2;
                b bVar = (b) this.f897e;
                return bVar.f898a[bVar.f899b + i2];
            default:
                b();
                int i3 = this.f895b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f895b = i4;
                this.f896c = i4;
                return ((c) this.f897e).f902a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f894a) {
        }
        return this.f895b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        switch (this.f894a) {
            case 0:
                a();
                int i3 = this.f896c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f897e;
                bVar.b(i3);
                this.f895b = this.f896c;
                this.f896c = -1;
                i = ((AbstractList) bVar).modCount;
                this.d = i;
                return;
            default:
                b();
                int i4 = this.f896c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f897e;
                cVar.b(i4);
                this.f895b = this.f896c;
                this.f896c = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.d = i2;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f894a) {
            case 0:
                a();
                int i = this.f896c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f897e).set(i, obj);
                return;
            default:
                b();
                int i2 = this.f896c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f897e).set(i2, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i2;
        g1.f.e(bVar, "list");
        this.f897e = bVar;
        this.f895b = i;
        this.f896c = -1;
        i2 = ((AbstractList) bVar).modCount;
        this.d = i2;
    }
}
