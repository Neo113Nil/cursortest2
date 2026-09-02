package m5;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import l5.AbstractC0501e;
import y5.InterfaceC0766a;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524a implements ListIterator, InterfaceC0766a {

    /* renamed from: g, reason: collision with root package name */
    public int f5447g;

    /* renamed from: i, reason: collision with root package name */
    public int f5449i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0501e f5450j;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5446f = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f5448h = -1;

    public C0524a(C0526c c0526c, int i7) {
        int i8;
        this.f5450j = c0526c;
        this.f5447g = i7;
        i8 = ((AbstractList) c0526c).modCount;
        this.f5449i = i8;
    }

    public void a() {
        int i7;
        i7 = ((AbstractList) ((C0525b) this.f5450j).f5455j).modCount;
        if (i7 != this.f5449i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i7;
        int i8;
        switch (this.f5446f) {
            case 0:
                a();
                C0525b c0525b = (C0525b) this.f5450j;
                int i9 = this.f5447g;
                this.f5447g = i9 + 1;
                c0525b.add(i9, obj);
                this.f5448h = -1;
                i7 = ((AbstractList) c0525b).modCount;
                this.f5449i = i7;
                break;
            default:
                b();
                C0526c c0526c = (C0526c) this.f5450j;
                int i10 = this.f5447g;
                this.f5447g = i10 + 1;
                c0526c.add(i10, obj);
                this.f5448h = -1;
                i8 = ((AbstractList) c0526c).modCount;
                this.f5449i = i8;
                break;
        }
    }

    public void b() {
        int i7;
        i7 = ((AbstractList) ((C0526c) this.f5450j)).modCount;
        if (i7 != this.f5449i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5446f) {
            case 0:
                if (this.f5447g < ((C0525b) this.f5450j).f5453h) {
                }
                break;
            default:
                if (this.f5447g < ((C0526c) this.f5450j).f5458g) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5446f) {
            case 0:
                if (this.f5447g > 0) {
                }
                break;
            default:
                if (this.f5447g > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5446f) {
            case 0:
                a();
                int i7 = this.f5447g;
                C0525b c0525b = (C0525b) this.f5450j;
                if (i7 >= c0525b.f5453h) {
                    throw new NoSuchElementException();
                }
                this.f5447g = i7 + 1;
                this.f5448h = i7;
                return c0525b.f5451f[c0525b.f5452g + i7];
            default:
                b();
                int i8 = this.f5447g;
                C0526c c0526c = (C0526c) this.f5450j;
                if (i8 >= c0526c.f5458g) {
                    throw new NoSuchElementException();
                }
                this.f5447g = i8 + 1;
                this.f5448h = i8;
                return c0526c.f5457f[i8];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5446f) {
        }
        return this.f5447g;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5446f) {
            case 0:
                a();
                int i7 = this.f5447g;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f5447g = i8;
                this.f5448h = i8;
                C0525b c0525b = (C0525b) this.f5450j;
                return c0525b.f5451f[c0525b.f5452g + i8];
            default:
                b();
                int i9 = this.f5447g;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f5447g = i10;
                this.f5448h = i10;
                return ((C0526c) this.f5450j).f5457f[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i7;
        switch (this.f5446f) {
            case 0:
                i7 = this.f5447g;
                break;
            default:
                i7 = this.f5447g;
                break;
        }
        return i7 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7;
        int i8;
        switch (this.f5446f) {
            case 0:
                C0525b c0525b = (C0525b) this.f5450j;
                a();
                int i9 = this.f5448h;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0525b.b(i9);
                this.f5447g = this.f5448h;
                this.f5448h = -1;
                i7 = ((AbstractList) c0525b).modCount;
                this.f5449i = i7;
                return;
            default:
                C0526c c0526c = (C0526c) this.f5450j;
                b();
                int i10 = this.f5448h;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c0526c.b(i10);
                this.f5447g = this.f5448h;
                this.f5448h = -1;
                i8 = ((AbstractList) c0526c).modCount;
                this.f5449i = i8;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f5446f) {
            case 0:
                a();
                int i7 = this.f5448h;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0525b) this.f5450j).set(i7, obj);
                return;
            default:
                b();
                int i8 = this.f5448h;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C0526c) this.f5450j).set(i8, obj);
                return;
        }
    }

    public C0524a(C0525b c0525b, int i7) {
        int i8;
        this.f5450j = c0525b;
        this.f5447g = i7;
        i8 = ((AbstractList) c0525b).modCount;
        this.f5449i = i8;
    }
}
