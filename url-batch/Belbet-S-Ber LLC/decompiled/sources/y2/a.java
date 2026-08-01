package y2;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import x2.d;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements ListIterator, j3.a {

    /* renamed from: g, reason: collision with root package name */
    public int f4104g;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final d f4105j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4103f = 0;
    public int h = -1;

    public a(c cVar, int i) {
        int i4;
        this.f4105j = cVar;
        this.f4104g = i;
        i4 = ((AbstractList) cVar).modCount;
        this.i = i4;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f4105j).f4108j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i4;
        switch (this.f4103f) {
            case 0:
                a();
                b bVar = (b) this.f4105j;
                int i5 = this.f4104g;
                this.f4104g = i5 + 1;
                bVar.add(i5, obj);
                this.h = -1;
                i = ((AbstractList) bVar).modCount;
                this.i = i;
                break;
            default:
                b();
                c cVar = (c) this.f4105j;
                int i6 = this.f4104g;
                this.f4104g = i6 + 1;
                cVar.add(i6, obj);
                this.h = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.i = i4;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f4105j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4103f) {
            case 0:
                if (this.f4104g < ((b) this.f4105j).h) {
                }
                break;
            default:
                if (this.f4104g < ((c) this.f4105j).f4110g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4103f) {
            case 0:
                if (this.f4104g > 0) {
                }
                break;
            default:
                if (this.f4104g > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4103f) {
            case 0:
                a();
                int i = this.f4104g;
                b bVar = (b) this.f4105j;
                if (i >= bVar.h) {
                    throw new NoSuchElementException();
                }
                this.f4104g = i + 1;
                this.h = i;
                return bVar.f4106f[bVar.f4107g + i];
            default:
                b();
                int i4 = this.f4104g;
                c cVar = (c) this.f4105j;
                if (i4 >= cVar.f4110g) {
                    throw new NoSuchElementException();
                }
                this.f4104g = i4 + 1;
                this.h = i4;
                return cVar.f4109f[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4103f) {
        }
        return this.f4104g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4103f) {
            case 0:
                a();
                int i = this.f4104g;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f4104g = i4;
                this.h = i4;
                b bVar = (b) this.f4105j;
                return bVar.f4106f[bVar.f4107g + i4];
            default:
                b();
                int i5 = this.f4104g;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f4104g = i6;
                this.h = i6;
                return ((c) this.f4105j).f4109f[i6];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f4103f) {
            case 0:
                i = this.f4104g;
                break;
            default:
                i = this.f4104g;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i4;
        switch (this.f4103f) {
            case 0:
                b bVar = (b) this.f4105j;
                a();
                int i5 = this.h;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i5);
                this.f4104g = this.h;
                this.h = -1;
                i = ((AbstractList) bVar).modCount;
                this.i = i;
                return;
            default:
                c cVar = (c) this.f4105j;
                b();
                int i6 = this.h;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i6);
                this.f4104g = this.h;
                this.h = -1;
                i4 = ((AbstractList) cVar).modCount;
                this.i = i4;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4103f) {
            case 0:
                a();
                int i = this.h;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f4105j).set(i, obj);
                return;
            default:
                b();
                int i4 = this.h;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f4105j).set(i4, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        int i4;
        this.f4105j = bVar;
        this.f4104g = i;
        i4 = ((AbstractList) bVar).modCount;
        this.i = i4;
    }
}
