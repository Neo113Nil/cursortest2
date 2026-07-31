package S;

import g2.InterfaceC0439a;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class x implements ListIterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4280d;

    /* renamed from: e, reason: collision with root package name */
    public int f4281e;

    /* renamed from: f, reason: collision with root package name */
    public int f4282f;

    /* renamed from: g, reason: collision with root package name */
    public int f4283g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4284h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(t0.r rVar, int i3, int i4) {
        this(rVar, (i4 & 1) != 0 ? 0 : i3, 0, rVar.f8786g);
        this.f4280d = 3;
    }

    public void a() {
        int i3;
        i3 = ((AbstractList) ((T1.a) this.f4284h).f4342h).modCount;
        if (i3 != this.f4283g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        int i4;
        switch (this.f4280d) {
            case 0:
                c();
                int i5 = this.f4281e + 1;
                t tVar = (t) this.f4284h;
                tVar.add(i5, obj);
                this.f4282f = -1;
                this.f4281e++;
                this.f4283g = tVar.j();
                return;
            case 1:
                a();
                int i6 = this.f4281e;
                this.f4281e = i6 + 1;
                T1.a aVar = (T1.a) this.f4284h;
                aVar.add(i6, obj);
                this.f4282f = -1;
                i3 = ((AbstractList) aVar).modCount;
                this.f4283g = i3;
                return;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i7 = this.f4281e;
                this.f4281e = i7 + 1;
                T1.b bVar = (T1.b) this.f4284h;
                bVar.add(i7, obj);
                this.f4282f = -1;
                i4 = ((AbstractList) bVar).modCount;
                this.f4283g = i4;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public void b() {
        int i3;
        i3 = ((AbstractList) ((T1.b) this.f4284h)).modCount;
        if (i3 != this.f4283g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((t) this.f4284h).j() != this.f4283g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4280d) {
            case 0:
                return this.f4281e < ((t) this.f4284h).size() - 1;
            case 1:
                return this.f4281e < ((T1.a) this.f4284h).f4340f;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f4281e < ((T1.b) this.f4284h).f4345e;
            default:
                return this.f4281e < this.f4283g;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f4280d) {
            case 0:
                if (this.f4281e >= 0) {
                }
                break;
            case 1:
                if (this.f4281e > 0) {
                }
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.f4281e > 0) {
                }
                break;
            default:
                if (this.f4281e > this.f4282f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f4280d) {
            case 0:
                c();
                int i3 = this.f4281e + 1;
                this.f4282f = i3;
                t tVar = (t) this.f4284h;
                u.a(i3, tVar.size());
                Object obj = tVar.get(i3);
                this.f4281e = i3;
                return obj;
            case 1:
                a();
                int i4 = this.f4281e;
                T1.a aVar = (T1.a) this.f4284h;
                if (i4 >= aVar.f4340f) {
                    throw new NoSuchElementException();
                }
                this.f4281e = i4 + 1;
                this.f4282f = i4;
                return aVar.f4338d[aVar.f4339e + i4];
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i5 = this.f4281e;
                T1.b bVar = (T1.b) this.f4284h;
                if (i5 >= bVar.f4345e) {
                    throw new NoSuchElementException();
                }
                this.f4281e = i5 + 1;
                this.f4282f = i5;
                return bVar.f4344d[i5];
            default:
                Object[] objArr = ((t0.r) this.f4284h).f8783d;
                int i6 = this.f4281e;
                this.f4281e = i6 + 1;
                Object obj2 = objArr[i6];
                f2.j.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (U.p) obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f4280d) {
            case 0:
                return this.f4281e + 1;
            case 1:
                return this.f4281e;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f4281e;
            default:
                return this.f4281e - this.f4282f;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f4280d) {
            case 0:
                c();
                int i3 = this.f4281e;
                t tVar = (t) this.f4284h;
                u.a(i3, tVar.size());
                int i4 = this.f4281e;
                this.f4282f = i4;
                this.f4281e--;
                return tVar.get(i4);
            case 1:
                a();
                int i5 = this.f4281e;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f4281e = i6;
                this.f4282f = i6;
                T1.a aVar = (T1.a) this.f4284h;
                return aVar.f4338d[aVar.f4339e + i6];
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i7 = this.f4281e;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i8 = i7 - 1;
                this.f4281e = i8;
                this.f4282f = i8;
                return ((T1.b) this.f4284h).f4344d[i8];
            default:
                Object[] objArr = ((t0.r) this.f4284h).f8783d;
                int i9 = this.f4281e - 1;
                this.f4281e = i9;
                Object obj = objArr[i9];
                f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (U.p) obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f4280d) {
            case 0:
                return this.f4281e;
            case 1:
                return this.f4281e - 1;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f4281e - 1;
            default:
                return (this.f4281e - this.f4282f) - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        int i4;
        switch (this.f4280d) {
            case 0:
                c();
                int i5 = this.f4281e;
                t tVar = (t) this.f4284h;
                tVar.remove(i5);
                this.f4281e--;
                this.f4282f = -1;
                this.f4283g = tVar.j();
                return;
            case 1:
                a();
                int i6 = this.f4282f;
                if (i6 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                T1.a aVar = (T1.a) this.f4284h;
                aVar.c(i6);
                this.f4281e = this.f4282f;
                this.f4282f = -1;
                i3 = ((AbstractList) aVar).modCount;
                this.f4283g = i3;
                return;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i7 = this.f4282f;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                T1.b bVar = (T1.b) this.f4284h;
                bVar.c(i7);
                this.f4281e = this.f4282f;
                this.f4282f = -1;
                i4 = ((AbstractList) bVar).modCount;
                this.f4283g = i4;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f4280d) {
            case 0:
                c();
                int i3 = this.f4282f;
                if (i3 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                t tVar = (t) this.f4284h;
                tVar.set(i3, obj);
                this.f4283g = tVar.j();
                return;
            case 1:
                a();
                int i4 = this.f4282f;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((T1.a) this.f4284h).set(i4, obj);
                return;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i5 = this.f4282f;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((T1.b) this.f4284h).set(i5, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(t0.r rVar, int i3, int i4, int i5) {
        this.f4280d = 3;
        this.f4284h = rVar;
        this.f4281e = i3;
        this.f4282f = i4;
        this.f4283g = i5;
    }

    public x(T1.b bVar, int i3) {
        int i4;
        this.f4280d = 2;
        f2.j.f(bVar, "list");
        this.f4284h = bVar;
        this.f4281e = i3;
        this.f4282f = -1;
        i4 = ((AbstractList) bVar).modCount;
        this.f4283g = i4;
    }

    public x(t tVar, int i3) {
        this.f4280d = 0;
        this.f4284h = tVar;
        this.f4281e = i3 - 1;
        this.f4282f = -1;
        this.f4283g = tVar.j();
    }

    public x(T1.a aVar, int i3) {
        int i4;
        this.f4280d = 1;
        f2.j.f(aVar, "list");
        this.f4284h = aVar;
        this.f4281e = i3;
        this.f4282f = -1;
        i4 = ((AbstractList) aVar).modCount;
        this.f4283g = i4;
    }
}
