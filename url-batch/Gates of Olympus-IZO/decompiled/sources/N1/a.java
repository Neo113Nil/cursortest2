package N1;

import S.t;
import S.u;
import U.k;
import a2.InterfaceC0184a;
import h1.C0438i;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import t0.r;

/* loaded from: classes.dex */
public final class a implements ListIterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2854d;

    /* renamed from: e, reason: collision with root package name */
    public int f2855e;

    /* renamed from: f, reason: collision with root package name */
    public int f2856f;

    /* renamed from: g, reason: collision with root package name */
    public int f2857g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2858h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(r rVar, int i3, int i4) {
        this(rVar, (i4 & 1) != 0 ? 0 : i3, 0, rVar.f7952g);
        this.f2854d = 3;
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((b) this.f2858h).f2863h).modCount;
        if (i3 != this.f2857g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        switch (this.f2854d) {
            case 0:
                a();
                int i4 = this.f2855e;
                this.f2855e = i4 + 1;
                b bVar = (b) this.f2858h;
                bVar.add(i4, obj);
                this.f2856f = -1;
                this.f2857g = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                int i5 = this.f2855e;
                this.f2855e = i5 + 1;
                c cVar = (c) this.f2858h;
                cVar.add(i5, obj);
                this.f2856f = -1;
                i3 = ((AbstractList) cVar).modCount;
                this.f2857g = i3;
                return;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i6 = this.f2855e + 1;
                t tVar = (t) this.f2858h;
                tVar.add(i6, obj);
                this.f2856f = -1;
                this.f2855e++;
                this.f2857g = tVar.j();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i3;
        i3 = ((AbstractList) ((c) this.f2858h)).modCount;
        if (i3 != this.f2857g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((t) this.f2858h).j() != this.f2857g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2854d) {
            case 0:
                return this.f2855e < ((b) this.f2858h).f2861f;
            case 1:
                return this.f2855e < ((c) this.f2858h).f2866e;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2855e < ((t) this.f2858h).size() - 1;
            default:
                return this.f2855e < this.f2857g;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2854d) {
            case 0:
                if (this.f2855e > 0) {
                }
                break;
            case 1:
                if (this.f2855e > 0) {
                }
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f2855e >= 0) {
                }
                break;
            default:
                if (this.f2855e > this.f2856f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2854d) {
            case 0:
                a();
                int i3 = this.f2855e;
                b bVar = (b) this.f2858h;
                if (i3 >= bVar.f2861f) {
                    throw new NoSuchElementException();
                }
                this.f2855e = i3 + 1;
                this.f2856f = i3;
                return bVar.f2859d[bVar.f2860e + i3];
            case 1:
                b();
                int i4 = this.f2855e;
                c cVar = (c) this.f2858h;
                if (i4 >= cVar.f2866e) {
                    throw new NoSuchElementException();
                }
                this.f2855e = i4 + 1;
                this.f2856f = i4;
                return cVar.f2865d[i4];
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i5 = this.f2855e + 1;
                this.f2856f = i5;
                t tVar = (t) this.f2858h;
                u.a(i5, tVar.size());
                Object obj = tVar.get(i5);
                this.f2855e = i5;
                return obj;
            default:
                Object[] objArr = ((r) this.f2858h).f7949d;
                int i6 = this.f2855e;
                this.f2855e = i6 + 1;
                Object obj2 = objArr[i6];
                Z1.i.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (k) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2854d) {
            case 0:
                return this.f2855e;
            case 1:
                return this.f2855e;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2855e + 1;
            default:
                return this.f2855e - this.f2856f;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2854d) {
            case 0:
                a();
                int i3 = this.f2855e;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f2855e = i4;
                this.f2856f = i4;
                b bVar = (b) this.f2858h;
                return bVar.f2859d[bVar.f2860e + i4];
            case 1:
                b();
                int i5 = this.f2855e;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f2855e = i6;
                this.f2856f = i6;
                return ((c) this.f2858h).f2865d[i6];
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i7 = this.f2855e;
                t tVar = (t) this.f2858h;
                u.a(i7, tVar.size());
                int i8 = this.f2855e;
                this.f2856f = i8;
                this.f2855e--;
                return tVar.get(i8);
            default:
                Object[] objArr = ((r) this.f2858h).f7949d;
                int i9 = this.f2855e - 1;
                this.f2855e = i9;
                Object obj = objArr[i9];
                Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (k) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f2854d) {
            case 0:
                return this.f2855e - 1;
            case 1:
                return this.f2855e - 1;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2855e;
            default:
                return (this.f2855e - this.f2856f) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        switch (this.f2854d) {
            case 0:
                a();
                int i4 = this.f2856f;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f2858h;
                bVar.c(i4);
                this.f2855e = this.f2856f;
                this.f2856f = -1;
                this.f2857g = ((AbstractList) bVar).modCount;
                return;
            case 1:
                b();
                int i5 = this.f2856f;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f2858h;
                cVar.c(i5);
                this.f2855e = this.f2856f;
                this.f2856f = -1;
                i3 = ((AbstractList) cVar).modCount;
                this.f2857g = i3;
                return;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i6 = this.f2855e;
                t tVar = (t) this.f2858h;
                tVar.remove(i6);
                this.f2855e--;
                this.f2856f = -1;
                this.f2857g = tVar.j();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2854d) {
            case 0:
                a();
                int i3 = this.f2856f;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f2858h).set(i3, obj);
                return;
            case 1:
                b();
                int i4 = this.f2856f;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f2858h).set(i4, obj);
                return;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i5 = this.f2856f;
                if (i5 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                t tVar = (t) this.f2858h;
                tVar.set(i5, obj);
                this.f2857g = tVar.j();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(r rVar, int i3, int i4, int i5) {
        this.f2854d = 3;
        this.f2858h = rVar;
        this.f2855e = i3;
        this.f2856f = i4;
        this.f2857g = i5;
    }

    public a(c cVar, int i3) {
        int i4;
        this.f2854d = 1;
        Z1.i.f(cVar, "list");
        this.f2858h = cVar;
        this.f2855e = i3;
        this.f2856f = -1;
        i4 = ((AbstractList) cVar).modCount;
        this.f2857g = i4;
    }

    public a(t tVar, int i3) {
        this.f2854d = 2;
        this.f2858h = tVar;
        this.f2855e = i3 - 1;
        this.f2856f = -1;
        this.f2857g = tVar.j();
    }

    public a(b bVar, int i3) {
        this.f2854d = 0;
        Z1.i.f(bVar, "list");
        this.f2858h = bVar;
        this.f2855e = i3;
        this.f2856f = -1;
        this.f2857g = ((AbstractList) bVar).modCount;
    }
}
