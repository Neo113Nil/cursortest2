package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ay implements ListIterator, pw {
    public int g;
    public int i;
    public final o j;
    public final /* synthetic */ int f = 0;
    public int h = -1;

    public ay(dy dyVar, int i) {
        int i2;
        this.j = dyVar;
        this.g = i;
        i2 = ((AbstractList) dyVar).modCount;
        this.i = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((cy) this.j).j).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.f;
        o oVar = this.j;
        switch (i3) {
            case 0:
                a();
                cy cyVar = (cy) oVar;
                int i4 = this.g;
                this.g = i4 + 1;
                cyVar.add(i4, obj);
                this.h = -1;
                i = ((AbstractList) cyVar).modCount;
                this.i = i;
                break;
            default:
                b();
                dy dyVar = (dy) oVar;
                int i5 = this.g;
                this.g = i5 + 1;
                dyVar.add(i5, obj);
                this.h = -1;
                i2 = ((AbstractList) dyVar).modCount;
                this.i = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((dy) this.j)).modCount;
        if (i != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        o oVar = this.j;
        switch (i) {
            case 0:
                if (this.g < ((cy) oVar).h) {
                    break;
                }
                break;
            default:
                if (this.g < ((dy) oVar).g) {
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
        o oVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.g;
                cy cyVar = (cy) oVar;
                if (i2 >= cyVar.h) {
                    throw new NoSuchElementException();
                }
                this.g = i2 + 1;
                this.h = i2;
                return cyVar.f[cyVar.g + i2];
            default:
                b();
                int i3 = this.g;
                dy dyVar = (dy) oVar;
                if (i3 >= dyVar.g) {
                    throw new NoSuchElementException();
                }
                this.g = i3 + 1;
                this.h = i3;
                return dyVar.f[i3];
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
        o oVar = this.j;
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
                cy cyVar = (cy) oVar;
                return cyVar.f[cyVar.g + i3];
            default:
                b();
                int i4 = this.g;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.g = i5;
                this.h = i5;
                return ((dy) oVar).f[i5];
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
        o oVar = this.j;
        switch (i3) {
            case 0:
                cy cyVar = (cy) oVar;
                a();
                int i4 = this.h;
                if (i4 == -1) {
                    s9.u("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    cyVar.b(i4);
                    this.g = this.h;
                    this.h = -1;
                    i = ((AbstractList) cyVar).modCount;
                    this.i = i;
                    break;
                }
            default:
                dy dyVar = (dy) oVar;
                b();
                int i5 = this.h;
                if (i5 == -1) {
                    s9.u("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    dyVar.b(i5);
                    this.g = this.h;
                    this.h = -1;
                    i2 = ((AbstractList) dyVar).modCount;
                    this.i = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f;
        o oVar = this.j;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    s9.u("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((cy) oVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    s9.u("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((dy) oVar).set(i3, obj);
                    break;
                }
        }
    }

    public ay(cy cyVar, int i) {
        int i2;
        this.j = cyVar;
        this.g = i;
        i2 = ((AbstractList) cyVar).modCount;
        this.i = i2;
    }
}
