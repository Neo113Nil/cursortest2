package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g60 implements ListIterator, yb0 {
    public final /* synthetic */ int d;
    public int e;
    public int g;
    public int h;
    public final Object i;

    public g60(ac1 ac1Var, int i) {
        this.d = 3;
        this.i = ac1Var;
        this.e = i - 1;
        this.g = -1;
        this.h = yr1.N(ac1Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((th0) this.i).i).modCount;
        if (i != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.d;
        Object obj2 = this.i;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                th0 th0Var = (th0) obj2;
                int i4 = this.e;
                this.e = i4 + 1;
                th0Var.add(i4, obj);
                this.g = -1;
                i = ((AbstractList) th0Var).modCount;
                this.h = i;
                return;
            case 2:
                b();
                vh0 vh0Var = (vh0) obj2;
                int i5 = this.e;
                this.e = i5 + 1;
                vh0Var.add(i5, obj);
                this.g = -1;
                i2 = ((AbstractList) vh0Var).modCount;
                this.h = i2;
                return;
            default:
                c();
                ac1 ac1Var = (ac1) obj2;
                ac1Var.add(this.e + 1, obj);
                this.g = -1;
                this.e++;
                this.h = yr1.N(ac1Var);
                return;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((vh0) this.i)).modCount;
        if (i != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (yr1.N((ac1) this.i) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e < this.h) {
                    break;
                }
                break;
            case 1:
                if (this.e < ((th0) obj).g) {
                    break;
                }
                break;
            case 2:
                if (this.e < ((vh0) obj).e) {
                    break;
                }
                break;
            default:
                if (this.e < ((ac1) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (this.e > this.g) {
                }
                break;
            case 1:
                if (this.e > 0) {
                }
                break;
            case 2:
                if (this.e > 0) {
                }
                break;
            default:
                if (this.e >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mn0 mn0Var = ((i60) obj).d;
                int i2 = this.e;
                this.e = i2 + 1;
                Object f = mn0Var.f(i2);
                f.getClass();
                return (zl0) f;
            case 1:
                a();
                int i3 = this.e;
                th0 th0Var = (th0) obj;
                if (i3 >= th0Var.g) {
                    dd0.c();
                    return null;
                }
                this.e = i3 + 1;
                this.g = i3;
                return th0Var.d[th0Var.e + i3];
            case 2:
                b();
                int i4 = this.e;
                vh0 vh0Var = (vh0) obj;
                if (i4 >= vh0Var.e) {
                    dd0.c();
                    return null;
                }
                this.e = i4 + 1;
                this.g = i4;
                return vh0Var.d[i4];
            default:
                c();
                int i5 = this.e + 1;
                this.g = i5;
                ac1 ac1Var = (ac1) obj;
                yr1.A(i5, ac1Var.size());
                Object obj2 = ac1Var.get(i5);
                this.e = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.e - this.g;
            case 1:
                return this.e;
            case 2:
                return this.e;
            default:
                return this.e + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.d;
        Object obj = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                mn0 mn0Var = ((i60) obj).d;
                int i2 = this.e - 1;
                this.e = i2;
                Object f = mn0Var.f(i2);
                f.getClass();
                return (zl0) f;
            case 1:
                a();
                int i3 = this.e;
                if (i3 <= 0) {
                    dd0.c();
                    return null;
                }
                int i4 = i3 - 1;
                this.e = i4;
                this.g = i4;
                th0 th0Var = (th0) obj;
                return th0Var.d[th0Var.e + i4];
            case 2:
                b();
                int i5 = this.e;
                if (i5 <= 0) {
                    dd0.c();
                    return null;
                }
                int i6 = i5 - 1;
                this.e = i6;
                this.g = i6;
                return ((vh0) obj).d[i6];
            default:
                c();
                ac1 ac1Var = (ac1) obj;
                yr1.A(this.e, ac1Var.size());
                int i7 = this.e;
                this.g = i7;
                this.e--;
                return ac1Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (this.e - this.g) - 1;
            case 1:
                i = this.e;
                break;
            case 2:
                i = this.e;
                break;
            default:
                return this.e;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.d;
        Object obj = this.i;
        switch (i3) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                th0 th0Var = (th0) obj;
                a();
                int i4 = this.g;
                if (i4 == -1) {
                    dd0.j("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                th0Var.b(i4);
                this.e = this.g;
                this.g = -1;
                i = ((AbstractList) th0Var).modCount;
                this.h = i;
                return;
            case 2:
                vh0 vh0Var = (vh0) obj;
                b();
                int i5 = this.g;
                if (i5 == -1) {
                    dd0.j("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                vh0Var.b(i5);
                this.e = this.g;
                this.g = -1;
                i2 = ((AbstractList) vh0Var).modCount;
                this.h = i2;
                return;
            default:
                c();
                ac1 ac1Var = (ac1) obj;
                ac1Var.remove(this.g);
                this.e--;
                this.g = -1;
                this.h = yr1.N(ac1Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.d;
        Object obj2 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.g;
                if (i2 != -1) {
                    ((th0) obj2).set(i2, obj);
                    return;
                } else {
                    dd0.j("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.g;
                if (i3 != -1) {
                    ((vh0) obj2).set(i3, obj);
                    return;
                } else {
                    dd0.j("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ac1 ac1Var = (ac1) obj2;
                c();
                int i4 = this.g;
                if (i4 < 0) {
                    dd0.j("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ac1Var.set(i4, obj);
                    this.h = yr1.N(ac1Var);
                    return;
                }
        }
    }

    public g60(vh0 vh0Var, int i) {
        int i2;
        this.d = 2;
        this.i = vh0Var;
        this.e = i;
        this.g = -1;
        i2 = ((AbstractList) vh0Var).modCount;
        this.h = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g60(i60 i60Var, int i, int i2) {
        this(i60Var, (i2 & 1) != 0 ? 0 : i, 0, i60Var.d.b);
        this.d = 0;
    }

    public g60(i60 i60Var, int i, int i2, int i3) {
        this.d = 0;
        this.i = i60Var;
        this.e = i;
        this.g = i2;
        this.h = i3;
    }

    public g60(th0 th0Var, int i) {
        int i2;
        this.d = 1;
        this.i = th0Var;
        this.e = i;
        this.g = -1;
        i2 = ((AbstractList) th0Var).modCount;
        this.h = i2;
    }
}
