package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bt implements ListIterator, wr {
    public int g;
    public int i;
    public final n j;
    public final /* synthetic */ int f = 0;
    public int h = -1;

    public bt(dt dtVar, int i) {
        int i2;
        this.j = dtVar;
        this.g = i;
        i2 = ((AbstractList) dtVar).modCount;
        this.i = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((ct) this.j).j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.f;
        n nVar = this.j;
        switch (i3) {
            case 0:
                a();
                ct ctVar = (ct) nVar;
                int i4 = this.g;
                this.g = i4 + 1;
                ctVar.add(i4, obj);
                this.h = -1;
                i = ((AbstractList) ctVar).modCount;
                this.i = i;
                break;
            default:
                b();
                dt dtVar = (dt) nVar;
                int i5 = this.g;
                this.g = i5 + 1;
                dtVar.add(i5, obj);
                this.h = -1;
                i2 = ((AbstractList) dtVar).modCount;
                this.i = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((dt) this.j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        n nVar = this.j;
        switch (i) {
            case 0:
                if (this.g < ((ct) nVar).h) {
                    break;
                }
                break;
            default:
                if (this.g < ((dt) nVar).g) {
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
        n nVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                ct ctVar = (ct) nVar;
                if (i2 >= ctVar.h) {
                    throw new NoSuchElementException();
                }
                this.g = i2 + 1;
                this.h = i2;
                return ctVar.f[ctVar.g + i2];
            default:
                b();
                int i3 = this.g;
                dt dtVar = (dt) nVar;
                if (i3 >= dtVar.g) {
                    throw new NoSuchElementException();
                }
                this.g = i3 + 1;
                this.h = i3;
                return dtVar.f[i3];
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
        n nVar = this.j;
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
                ct ctVar = (ct) nVar;
                return ctVar.f[ctVar.g + i3];
            default:
                b();
                int i4 = this.g;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.g = i5;
                this.h = i5;
                return ((dt) nVar).f[i5];
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
        n nVar = this.j;
        switch (i3) {
            case 0:
                ct ctVar = (ct) nVar;
                a();
                int i4 = this.h;
                if (i4 == -1) {
                    g9.s("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    ctVar.b(i4);
                    this.g = this.h;
                    this.h = -1;
                    i = ((AbstractList) ctVar).modCount;
                    this.i = i;
                    break;
                }
            default:
                dt dtVar = (dt) nVar;
                b();
                int i5 = this.h;
                if (i5 == -1) {
                    g9.s("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    dtVar.b(i5);
                    this.g = this.h;
                    this.h = -1;
                    i2 = ((AbstractList) dtVar).modCount;
                    this.i = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f;
        n nVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    g9.s("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((ct) nVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    g9.s("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((dt) nVar).set(i3, obj);
                    break;
                }
        }
    }

    public bt(ct ctVar, int i) {
        int i2;
        this.j = ctVar;
        this.g = i;
        i2 = ((AbstractList) ctVar).modCount;
        this.i = i2;
    }
}
