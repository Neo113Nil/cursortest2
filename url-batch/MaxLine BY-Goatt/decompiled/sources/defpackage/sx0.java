package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sx0 implements ListIterator, k71 {
    public final /* synthetic */ int m;
    public int n;
    public int o;
    public int p;
    public final Object q;

    public sx0(fn2 fn2Var, int i) {
        this.m = 3;
        this.q = fn2Var;
        this.n = i - 1;
        this.o = -1;
        this.p = tk3.R(fn2Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((ke1) this.q).q).modCount;
        if (i != this.p) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.m;
        Object obj2 = this.q;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                ke1 ke1Var = (ke1) obj2;
                int i4 = this.n;
                this.n = i4 + 1;
                ke1Var.add(i4, obj);
                this.o = -1;
                i = ((AbstractList) ke1Var).modCount;
                this.p = i;
                return;
            case 2:
                b();
                le1 le1Var = (le1) obj2;
                int i5 = this.n;
                this.n = i5 + 1;
                le1Var.add(i5, obj);
                this.o = -1;
                i2 = ((AbstractList) le1Var).modCount;
                this.p = i2;
                return;
            default:
                c();
                fn2 fn2Var = (fn2) obj2;
                fn2Var.add(this.n + 1, obj);
                this.o = -1;
                this.n++;
                this.p = tk3.R(fn2Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((le1) this.q)).modCount;
        if (i != this.p) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (tk3.R((fn2) this.q) != this.p) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.m;
        Object obj = this.q;
        switch (i) {
            case 0:
                if (this.n < this.p) {
                    break;
                }
                break;
            case 1:
                if (this.n < ((ke1) obj).o) {
                    break;
                }
                break;
            case 2:
                if (this.n < ((le1) obj).n) {
                    break;
                }
                break;
            default:
                if (this.n < ((fn2) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.m) {
            case 0:
                if (this.n > this.o) {
                }
                break;
            case 1:
                if (this.n > 0) {
                }
                break;
            case 2:
                if (this.n > 0) {
                }
                break;
            default:
                if (this.n >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.m;
        Object obj = this.q;
        switch (i) {
            case 0:
                jn1 jn1Var = ((ux0) obj).m;
                int i2 = this.n;
                this.n = i2 + 1;
                Object e = jn1Var.e(i2);
                e.getClass();
                return (ul1) e;
            case 1:
                a();
                int i3 = this.n;
                ke1 ke1Var = (ke1) obj;
                if (i3 >= ke1Var.o) {
                    b71.f();
                    return null;
                }
                this.n = i3 + 1;
                this.o = i3;
                return ke1Var.m[ke1Var.n + i3];
            case 2:
                b();
                int i4 = this.n;
                le1 le1Var = (le1) obj;
                if (i4 >= le1Var.n) {
                    b71.f();
                    return null;
                }
                this.n = i4 + 1;
                this.o = i4;
                return le1Var.m[i4];
            default:
                c();
                int i5 = this.n + 1;
                this.o = i5;
                fn2 fn2Var = (fn2) obj;
                tk3.v(i5, fn2Var.size());
                Object obj2 = fn2Var.get(i5);
                this.n = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.m) {
            case 0:
                return this.n - this.o;
            case 1:
                return this.n;
            case 2:
                return this.n;
            default:
                return this.n + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.m;
        Object obj = this.q;
        switch (i) {
            case 0:
                jn1 jn1Var = ((ux0) obj).m;
                int i2 = this.n - 1;
                this.n = i2;
                Object e = jn1Var.e(i2);
                e.getClass();
                return (ul1) e;
            case 1:
                a();
                int i3 = this.n;
                if (i3 <= 0) {
                    b71.f();
                    return null;
                }
                int i4 = i3 - 1;
                this.n = i4;
                this.o = i4;
                ke1 ke1Var = (ke1) obj;
                return ke1Var.m[ke1Var.n + i4];
            case 2:
                b();
                int i5 = this.n;
                if (i5 <= 0) {
                    b71.f();
                    return null;
                }
                int i6 = i5 - 1;
                this.n = i6;
                this.o = i6;
                return ((le1) obj).m[i6];
            default:
                c();
                fn2 fn2Var = (fn2) obj;
                tk3.v(this.n, fn2Var.size());
                int i7 = this.n;
                this.o = i7;
                this.n--;
                return fn2Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.m) {
            case 0:
                return (this.n - this.o) - 1;
            case 1:
                i = this.n;
                break;
            case 2:
                i = this.n;
                break;
            default:
                return this.n;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.m;
        Object obj = this.q;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ke1 ke1Var = (ke1) obj;
                a();
                int i4 = this.o;
                if (i4 == -1) {
                    lh.g("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ke1Var.b(i4);
                this.n = this.o;
                this.o = -1;
                i = ((AbstractList) ke1Var).modCount;
                this.p = i;
                return;
            case 2:
                le1 le1Var = (le1) obj;
                b();
                int i5 = this.o;
                if (i5 == -1) {
                    lh.g("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                le1Var.b(i5);
                this.n = this.o;
                this.o = -1;
                i2 = ((AbstractList) le1Var).modCount;
                this.p = i2;
                return;
            default:
                c();
                fn2 fn2Var = (fn2) obj;
                fn2Var.remove(this.o);
                this.n--;
                this.o = -1;
                this.p = tk3.R(fn2Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.o;
                if (i2 != -1) {
                    ((ke1) obj2).set(i2, obj);
                    return;
                } else {
                    lh.g("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.o;
                if (i3 != -1) {
                    ((le1) obj2).set(i3, obj);
                    return;
                } else {
                    lh.g("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                fn2 fn2Var = (fn2) obj2;
                c();
                int i4 = this.o;
                if (i4 < 0) {
                    lh.g("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    fn2Var.set(i4, obj);
                    this.p = tk3.R(fn2Var);
                    return;
                }
        }
    }

    public sx0(le1 le1Var, int i) {
        int i2;
        this.m = 2;
        this.q = le1Var;
        this.n = i;
        this.o = -1;
        i2 = ((AbstractList) le1Var).modCount;
        this.p = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sx0(ux0 ux0Var, int i, int i2) {
        this(ux0Var, (i2 & 1) != 0 ? 0 : i, 0, ux0Var.m.b);
        this.m = 0;
    }

    public sx0(ux0 ux0Var, int i, int i2, int i3) {
        this.m = 0;
        this.q = ux0Var;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    public sx0(ke1 ke1Var, int i) {
        int i2;
        this.m = 1;
        this.q = ke1Var;
        this.n = i;
        this.o = -1;
        i2 = ((AbstractList) ke1Var).modCount;
        this.p = i2;
    }
}
