package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class zq implements ListIterator, vp {
    public int g;
    public int i;
    public final l j;
    public final /* synthetic */ int f = 0;
    public int h = -1;

    public zq(br brVar, int i) {
        int i2;
        this.j = brVar;
        this.g = i;
        i2 = ((AbstractList) brVar).modCount;
        this.i = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((ar) this.j).j).modCount;
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
                ar arVar = (ar) lVar;
                int i4 = this.g;
                this.g = i4 + 1;
                arVar.add(i4, obj);
                this.h = -1;
                i = ((AbstractList) arVar).modCount;
                this.i = i;
                break;
            default:
                b();
                br brVar = (br) lVar;
                int i5 = this.g;
                this.g = i5 + 1;
                brVar.add(i5, obj);
                this.h = -1;
                i2 = ((AbstractList) brVar).modCount;
                this.i = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((br) this.j)).modCount;
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
                if (this.g < ((ar) lVar).h) {
                    break;
                }
                break;
            default:
                if (this.g < ((br) lVar).g) {
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
                ar arVar = (ar) lVar;
                if (i2 >= arVar.h) {
                    throw new NoSuchElementException();
                }
                this.g = i2 + 1;
                this.h = i2;
                return arVar.f[arVar.g + i2];
            default:
                b();
                int i3 = this.g;
                br brVar = (br) lVar;
                if (i3 >= brVar.g) {
                    throw new NoSuchElementException();
                }
                this.g = i3 + 1;
                this.h = i3;
                return brVar.f[i3];
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
                ar arVar = (ar) lVar;
                return arVar.f[arVar.g + i3];
            default:
                b();
                int i4 = this.g;
                if (i4 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i4 - 1;
                this.g = i5;
                this.h = i5;
                return ((br) lVar).f[i5];
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
                ar arVar = (ar) lVar;
                a();
                int i4 = this.h;
                if (i4 == -1) {
                    o8.t("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    arVar.b(i4);
                    this.g = this.h;
                    this.h = -1;
                    i = ((AbstractList) arVar).modCount;
                    this.i = i;
                    break;
                }
            default:
                br brVar = (br) lVar;
                b();
                int i5 = this.h;
                if (i5 == -1) {
                    o8.t("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    brVar.b(i5);
                    this.g = this.h;
                    this.h = -1;
                    i2 = ((AbstractList) brVar).modCount;
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
                    o8.t("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((ar) lVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    o8.t("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((br) lVar).set(i3, obj);
                    break;
                }
        }
    }

    public zq(ar arVar, int i) {
        int i2;
        this.j = arVar;
        this.g = i;
        i2 = ((AbstractList) arVar).modCount;
        this.i = i2;
    }
}
