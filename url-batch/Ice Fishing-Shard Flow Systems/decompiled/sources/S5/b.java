package S5;

import f6.InterfaceC0406a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC0629h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements ListIterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2508d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f2509e;

    /* renamed from: i, reason: collision with root package name */
    public int f2510i;

    /* renamed from: l, reason: collision with root package name */
    public int f2511l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0629h f2512m;

    public b(e list, int i2) {
        int i5;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f2512m = list;
        this.f2509e = i2;
        this.f2510i = -1;
        i5 = ((AbstractList) list).modCount;
        this.f2511l = i5;
    }

    public void a() {
        int i2;
        i2 = ((AbstractList) ((c) this.f2512m).f2517m).modCount;
        if (i2 != this.f2511l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i2;
        int i5;
        switch (this.f2508d) {
            case 0:
                a();
                c cVar = (c) this.f2512m;
                int i7 = this.f2509e;
                this.f2509e = i7 + 1;
                cVar.add(i7, obj);
                this.f2510i = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f2511l = i2;
                break;
            default:
                b();
                e eVar = (e) this.f2512m;
                int i8 = this.f2509e;
                this.f2509e = i8 + 1;
                eVar.add(i8, obj);
                this.f2510i = -1;
                i5 = ((AbstractList) eVar).modCount;
                this.f2511l = i5;
                break;
        }
    }

    public void b() {
        int i2;
        i2 = ((AbstractList) ((e) this.f2512m)).modCount;
        if (i2 != this.f2511l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2508d) {
            case 0:
                if (this.f2509e < ((c) this.f2512m).f2515i) {
                }
                break;
            default:
                if (this.f2509e < ((e) this.f2512m).f2521e) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2508d) {
            case 0:
                if (this.f2509e > 0) {
                }
                break;
            default:
                if (this.f2509e > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2508d) {
            case 0:
                a();
                int i2 = this.f2509e;
                c cVar = (c) this.f2512m;
                if (i2 >= cVar.f2515i) {
                    throw new NoSuchElementException();
                }
                this.f2509e = i2 + 1;
                this.f2510i = i2;
                return cVar.f2513d[cVar.f2514e + i2];
            default:
                b();
                int i5 = this.f2509e;
                e eVar = (e) this.f2512m;
                if (i5 >= eVar.f2521e) {
                    throw new NoSuchElementException();
                }
                this.f2509e = i5 + 1;
                this.f2510i = i5;
                return eVar.f2520d[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2508d) {
        }
        return this.f2509e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2508d) {
            case 0:
                a();
                int i2 = this.f2509e;
                if (i2 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i2 - 1;
                this.f2509e = i5;
                this.f2510i = i5;
                c cVar = (c) this.f2512m;
                return cVar.f2513d[cVar.f2514e + i5];
            default:
                b();
                int i7 = this.f2509e;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f2509e = i8;
                this.f2510i = i8;
                return ((e) this.f2512m).f2520d[i8];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i2;
        switch (this.f2508d) {
            case 0:
                i2 = this.f2509e;
                break;
            default:
                i2 = this.f2509e;
                break;
        }
        return i2 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2;
        int i5;
        switch (this.f2508d) {
            case 0:
                c cVar = (c) this.f2512m;
                a();
                int i7 = this.f2510i;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i7);
                this.f2509e = this.f2510i;
                this.f2510i = -1;
                i2 = ((AbstractList) cVar).modCount;
                this.f2511l = i2;
                return;
            default:
                e eVar = (e) this.f2512m;
                b();
                int i8 = this.f2510i;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                eVar.b(i8);
                this.f2509e = this.f2510i;
                this.f2510i = -1;
                i5 = ((AbstractList) eVar).modCount;
                this.f2511l = i5;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2508d) {
            case 0:
                a();
                int i2 = this.f2510i;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f2512m).set(i2, obj);
                return;
            default:
                b();
                int i5 = this.f2510i;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e) this.f2512m).set(i5, obj);
                return;
        }
    }

    public b(c list, int i2) {
        int i5;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f2512m = list;
        this.f2509e = i2;
        this.f2510i = -1;
        i5 = ((AbstractList) list).modCount;
        this.f2511l = i5;
    }
}
