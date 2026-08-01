package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class nq implements ListIterator, kp {
    public int g;
    public int i;
    public final l j;
    public final /* synthetic */ int f = 0;
    public int h = -1;

    public nq(pq pqVar, int i) {
        int i2;
        this.j = pqVar;
        this.g = i;
        i2 = ((AbstractList) pqVar).modCount;
        this.i = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((oq) this.j).j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.f;
        l lVar = this.j;
        switch (i3) {
            case 0:
                a();
                oq oqVar = (oq) lVar;
                int i4 = this.g;
                this.g = i4 + 1;
                oqVar.add(i4, obj);
                this.h = -1;
                i = ((AbstractList) oqVar).modCount;
                this.i = i;
                break;
            default:
                b();
                pq pqVar = (pq) lVar;
                int i5 = this.g;
                this.g = i5 + 1;
                pqVar.add(i5, obj);
                this.h = -1;
                i2 = ((AbstractList) pqVar).modCount;
                this.i = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((pq) this.j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        l lVar = this.j;
        switch (i) {
            case 0:
                if (this.g < ((oq) lVar).h) {
                    break;
                }
                break;
            default:
                if (this.g < ((pq) lVar).g) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f) {
            case 0:
                if (this.g > 0) {
                }
                break;
            default:
                if (this.g > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        l lVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                oq oqVar = (oq) lVar;
                if (i2 >= oqVar.h) {
                    throw new NoSuchElementException();
                }
                this.g = i2 + 1;
                this.h = i2;
                return oqVar.f[oqVar.g + i2];
            default:
                b();
                int i3 = this.g;
                pq pqVar = (pq) lVar;
                if (i3 >= pqVar.g) {
                    throw new NoSuchElementException();
                }
                this.g = i3 + 1;
                this.h = i3;
                return pqVar.f[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f) {
        }
        return this.g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f;
        l lVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i3 = i2 - 1;
                this.g = i3;
                this.h = i3;
                oq oqVar = (oq) lVar;
                return oqVar.f[oqVar.g + i3];
            default:
                b();
                int i4 = this.g;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.g = i5;
                this.h = i5;
                return ((pq) lVar).f[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f) {
            case 0:
                i = this.g;
                break;
            default:
                i = this.g;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.f;
        l lVar = this.j;
        switch (i3) {
            case 0:
                oq oqVar = (oq) lVar;
                a();
                int i4 = this.h;
                if (i4 == -1) {
                    t8.t("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    oqVar.b(i4);
                    this.g = this.h;
                    this.h = -1;
                    i = ((AbstractList) oqVar).modCount;
                    this.i = i;
                    break;
                }
            default:
                pq pqVar = (pq) lVar;
                b();
                int i5 = this.h;
                if (i5 == -1) {
                    t8.t("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    pqVar.b(i5);
                    this.g = this.h;
                    this.h = -1;
                    i2 = ((AbstractList) pqVar).modCount;
                    this.i = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f;
        l lVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    t8.t("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((oq) lVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    t8.t("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((pq) lVar).set(i3, obj);
                    break;
                }
        }
    }

    public nq(oq oqVar, int i) {
        int i2;
        this.j = oqVar;
        this.g = i;
        i2 = ((AbstractList) oqVar).modCount;
        this.i = i2;
    }
}
