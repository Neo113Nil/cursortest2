package e6;

import a4.i;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o.e0;
import w0.q;
import w1.p;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements ListIterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2503d;

    /* renamed from: e, reason: collision with root package name */
    public int f2504e;

    /* renamed from: f, reason: collision with root package name */
    public int f2505f;

    /* renamed from: g, reason: collision with root package name */
    public int f2506g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2507h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p pVar, int i, int i8) {
        this(pVar, (i8 & 1) != 0 ? 0 : i, 0, pVar.f7745d.f5443b);
        this.f2503d = 3;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((b) this.f2507h).f2512h).modCount;
        if (i != this.f2506g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i8;
        switch (this.f2503d) {
            case 0:
                a();
                b bVar = (b) this.f2507h;
                int i9 = this.f2504e;
                this.f2504e = i9 + 1;
                bVar.add(i9, obj);
                this.f2505f = -1;
                i = ((AbstractList) bVar).modCount;
                this.f2506g = i;
                return;
            case 1:
                b();
                c cVar = (c) this.f2507h;
                int i10 = this.f2504e;
                this.f2504e = i10 + 1;
                cVar.add(i10, obj);
                this.f2505f = -1;
                i8 = ((AbstractList) cVar).modCount;
                this.f2506g = i8;
                return;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                w0.p pVar = (w0.p) this.f2507h;
                pVar.add(this.f2504e + 1, obj);
                this.f2505f = -1;
                this.f2504e++;
                this.f2506g = q.g(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((c) this.f2507h)).modCount;
        if (i != this.f2506g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (q.g((w0.p) this.f2507h) != this.f2506g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2503d) {
            case 0:
                return this.f2504e < ((b) this.f2507h).f2510f;
            case 1:
                return this.f2504e < ((c) this.f2507h).f2515e;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2504e < ((w0.p) this.f2507h).size() - 1;
            default:
                return this.f2504e < this.f2506g;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f2503d) {
            case 0:
                if (this.f2504e > 0) {
                }
                break;
            case 1:
                if (this.f2504e > 0) {
                }
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f2504e >= 0) {
                }
                break;
            default:
                if (this.f2504e > this.f2505f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f2503d) {
            case 0:
                a();
                int i = this.f2504e;
                b bVar = (b) this.f2507h;
                if (i >= bVar.f2510f) {
                    throw new NoSuchElementException();
                }
                this.f2504e = i + 1;
                this.f2505f = i;
                return bVar.f2508d[bVar.f2509e + i];
            case 1:
                b();
                int i8 = this.f2504e;
                c cVar = (c) this.f2507h;
                if (i8 >= cVar.f2515e) {
                    throw new NoSuchElementException();
                }
                this.f2504e = i8 + 1;
                this.f2505f = i8;
                return cVar.f2514d[i8];
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i9 = this.f2504e + 1;
                this.f2505f = i9;
                w0.p pVar = (w0.p) this.f2507h;
                q.a(i9, pVar.size());
                Object obj = pVar.get(i9);
                this.f2504e = i9;
                return obj;
            default:
                e0 e0Var = ((p) this.f2507h).f7745d;
                int i10 = this.f2504e;
                this.f2504e = i10 + 1;
                Object e8 = e0Var.e(i10);
                q6.i.c(e8, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (l) e8;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f2503d) {
            case 0:
                return this.f2504e;
            case 1:
                return this.f2504e;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2504e + 1;
            default:
                return this.f2504e - this.f2505f;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f2503d) {
            case 0:
                a();
                int i = this.f2504e;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i - 1;
                this.f2504e = i8;
                this.f2505f = i8;
                b bVar = (b) this.f2507h;
                return bVar.f2508d[bVar.f2509e + i8];
            case 1:
                b();
                int i9 = this.f2504e;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f2504e = i10;
                this.f2505f = i10;
                return ((c) this.f2507h).f2514d[i10];
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                int i11 = this.f2504e;
                w0.p pVar = (w0.p) this.f2507h;
                q.a(i11, pVar.size());
                int i12 = this.f2504e;
                this.f2505f = i12;
                this.f2504e--;
                return pVar.get(i12);
            default:
                e0 e0Var = ((p) this.f2507h).f7745d;
                int i13 = this.f2504e - 1;
                this.f2504e = i13;
                Object e8 = e0Var.e(i13);
                q6.i.c(e8, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (l) e8;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f2503d) {
            case 0:
                i = this.f2504e;
                break;
            case 1:
                i = this.f2504e;
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f2504e;
            default:
                i = this.f2504e - this.f2505f;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i8;
        switch (this.f2503d) {
            case 0:
                b bVar = (b) this.f2507h;
                a();
                int i9 = this.f2505f;
                if (i9 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i9);
                this.f2504e = this.f2505f;
                this.f2505f = -1;
                i = ((AbstractList) bVar).modCount;
                this.f2506g = i;
                return;
            case 1:
                c cVar = (c) this.f2507h;
                b();
                int i10 = this.f2505f;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i10);
                this.f2504e = this.f2505f;
                this.f2505f = -1;
                i8 = ((AbstractList) cVar).modCount;
                this.f2506g = i8;
                return;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                c();
                w0.p pVar = (w0.p) this.f2507h;
                pVar.remove(this.f2505f);
                this.f2504e--;
                this.f2505f = -1;
                this.f2506g = q.g(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f2503d) {
            case 0:
                a();
                int i = this.f2505f;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f2507h).set(i, obj);
                return;
            case 1:
                b();
                int i8 = this.f2505f;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f2507h).set(i8, obj);
                return;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                w0.p pVar = (w0.p) this.f2507h;
                c();
                int i9 = this.f2505f;
                if (i9 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                pVar.set(i9, obj);
                this.f2506g = q.g(pVar);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(c cVar, int i) {
        int i8;
        this.f2503d = 1;
        this.f2507h = cVar;
        this.f2504e = i;
        this.f2505f = -1;
        i8 = ((AbstractList) cVar).modCount;
        this.f2506g = i8;
    }

    public a(w0.p pVar, int i) {
        this.f2503d = 2;
        this.f2507h = pVar;
        this.f2504e = i - 1;
        this.f2505f = -1;
        this.f2506g = q.g(pVar);
    }

    public a(p pVar, int i, int i8, int i9) {
        this.f2503d = 3;
        this.f2507h = pVar;
        this.f2504e = i;
        this.f2505f = i8;
        this.f2506g = i9;
    }

    public a(b bVar, int i) {
        int i8;
        this.f2503d = 0;
        this.f2507h = bVar;
        this.f2504e = i;
        this.f2505f = -1;
        i8 = ((AbstractList) bVar).modCount;
        this.f2506g = i8;
    }
}
