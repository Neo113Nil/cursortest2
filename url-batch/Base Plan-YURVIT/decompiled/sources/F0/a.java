package F0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator {

    /* renamed from: f, reason: collision with root package name */
    public int f455f;

    /* renamed from: h, reason: collision with root package name */
    public int f457h;

    /* renamed from: i, reason: collision with root package name */
    public final E0.a f458i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f454e = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f456g = -1;

    public a(c cVar, int i2) {
        int i3;
        this.f458i = cVar;
        this.f455f = i2;
        i3 = ((AbstractList) cVar).modCount;
        this.f457h = i3;
    }

    public final void a() {
        int i2;
        int i3;
        switch (this.f454e) {
            case 0:
                i2 = ((AbstractList) ((b) this.f458i).f463i).modCount;
                if (i2 != this.f457h) {
                    throw new ConcurrentModificationException();
                }
                return;
            default:
                i3 = ((AbstractList) ((c) this.f458i)).modCount;
                if (i3 != this.f457h) {
                    throw new ConcurrentModificationException();
                }
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i3;
        switch (this.f454e) {
            case 0:
                a();
                b bVar = (b) this.f458i;
                int i4 = this.f455f;
                this.f455f = i4 + 1;
                bVar.add(i4, obj);
                this.f456g = -1;
                i2 = ((AbstractList) bVar).modCount;
                this.f457h = i2;
                break;
            default:
                a();
                c cVar = (c) this.f458i;
                int i5 = this.f455f;
                this.f455f = i5 + 1;
                cVar.add(i5, obj);
                this.f456g = -1;
                i3 = ((AbstractList) cVar).modCount;
                this.f457h = i3;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f454e) {
            case 0:
                if (this.f455f < ((b) this.f458i).f461g) {
                }
                break;
            default:
                if (this.f455f < ((c) this.f458i).f466f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f454e) {
            case 0:
                if (this.f455f > 0) {
                }
                break;
            default:
                if (this.f455f > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f454e) {
            case 0:
                a();
                int i2 = this.f455f;
                b bVar = (b) this.f458i;
                if (i2 >= bVar.f461g) {
                    throw new NoSuchElementException();
                }
                this.f455f = i2 + 1;
                this.f456g = i2;
                return bVar.f459e[bVar.f460f + i2];
            default:
                a();
                int i3 = this.f455f;
                c cVar = (c) this.f458i;
                if (i3 >= cVar.f466f) {
                    throw new NoSuchElementException();
                }
                this.f455f = i3 + 1;
                this.f456g = i3;
                return cVar.f465e[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f454e) {
        }
        return this.f455f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f454e) {
            case 0:
                a();
                int i2 = this.f455f;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.f455f = i3;
                this.f456g = i3;
                b bVar = (b) this.f458i;
                return bVar.f459e[bVar.f460f + i3];
            default:
                a();
                int i4 = this.f455f;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.f455f = i5;
                this.f456g = i5;
                return ((c) this.f458i).f465e[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i2;
        switch (this.f454e) {
            case 0:
                i2 = this.f455f;
                break;
            default:
                i2 = this.f455f;
                break;
        }
        return i2 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i3;
        switch (this.f454e) {
            case 0:
                b bVar = (b) this.f458i;
                a();
                int i4 = this.f456g;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i4);
                this.f455f = this.f456g;
                this.f456g = -1;
                i2 = ((AbstractList) bVar).modCount;
                this.f457h = i2;
                return;
            default:
                c cVar = (c) this.f458i;
                a();
                int i5 = this.f456g;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i5);
                this.f455f = this.f456g;
                this.f456g = -1;
                i3 = ((AbstractList) cVar).modCount;
                this.f457h = i3;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f454e) {
            case 0:
                a();
                int i2 = this.f456g;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f458i).set(i2, obj);
                return;
            default:
                a();
                int i3 = this.f456g;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f458i).set(i3, obj);
                return;
        }
    }

    public a(b bVar, int i2) {
        int i3;
        this.f458i = bVar;
        this.f455f = i2;
        i3 = ((AbstractList) bVar).modCount;
        this.f457h = i3;
    }
}
