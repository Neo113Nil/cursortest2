package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fn2 implements Parcelable, yo2, List, RandomAccess, m71 {
    public static final Parcelable.Creator<fn2> CREATOR = new en2(0);
    public xo2 m;

    public fn2(w0 w0Var) {
        nm2 k = tm2.k();
        xo2 xo2Var = new xo2(k.g(), w0Var);
        if (!(k instanceof mv0)) {
            xo2Var.b = new xo2(1L, w0Var);
        }
        this.m = xo2Var;
    }

    @Override // defpackage.yo2
    public final ap2 a() {
        return this.m;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 c = w0Var.c(obj);
            if (c.equals(w0Var)) {
                return false;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i, c, true);
            }
            tm2.n(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 d = w0Var.d(collection);
            if (Intrinsics.b(d, w0Var)) {
                return false;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i, d, true);
            }
            tm2.n(k, this);
        } while (!z);
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i3 = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            f12 e = w0Var.e();
            e.subList(i, i2).clear();
            w0 c = e.c();
            if (Intrinsics.b(c, w0Var)) {
                return;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i3, c, true);
            }
            tm2.n(k, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        nm2 k;
        xo2 xo2Var = this.m;
        xo2Var.getClass();
        synchronized (tm2.c) {
            k = tm2.k();
            xo2 xo2Var2 = (xo2) tm2.w(xo2Var, this, k);
            synchronized (tk3.j) {
                xo2Var2.c = am2.o;
                xo2Var2.d++;
                xo2Var2.e++;
            }
        }
        tm2.n(k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return tk3.Q(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return tk3.Q(this).c.containsAll(collection);
    }

    @Override // defpackage.yo2
    public final void d(ap2 ap2Var) {
        ap2Var.b = this.m;
        this.m = (xo2) ap2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return tk3.Q(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return tk3.Q(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return tk3.Q(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return tk3.Q(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new sx0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            int indexOf = w0Var.indexOf(obj);
            w0 g = indexOf != -1 ? w0Var.g(indexOf) : w0Var;
            if (g.equals(w0Var)) {
                return false;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i, g, true);
            }
            tm2.n(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 f = w0Var.f(new v0(0, collection));
            if (Intrinsics.b(f, w0Var)) {
                return false;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i, f, true);
            }
            tm2.n(k, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return tk3.V(this, new v0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        w0 w0Var;
        nm2 k;
        boolean z;
        Object obj2 = get(i);
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i2 = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 j = w0Var.j(i, obj);
            if (j.equals(w0Var)) {
                break;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i2, j, false);
            }
            tm2.n(k, this);
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return tk3.Q(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            v32.a("fromIndex or toIndex are out of bounds");
        }
        return new bq2(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ll3.W(this);
    }

    public final String toString() {
        xo2 xo2Var = this.m;
        xo2Var.getClass();
        return "SnapshotStateList(value=" + ((xo2) tm2.i(xo2Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        w0 w0Var = tk3.Q(this).c;
        int size = w0Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(w0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ll3.X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new sx0(this, i);
    }

    public fn2() {
        this(am2.o);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        w0 w0Var;
        nm2 k;
        boolean z;
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i2 = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 b = w0Var.b(i, obj);
            if (b.equals(w0Var)) {
                return;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i2, b, true);
            }
            tm2.n(k, this);
        } while (!z);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return tk3.V(this, new Function1() { // from class: dn2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        w0 w0Var;
        nm2 k;
        boolean z;
        Object obj = get(i);
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = this.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i2 = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            w0 g = w0Var.g(i);
            if (g.equals(w0Var)) {
                break;
            }
            xo2 xo2Var3 = this.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, this, k), i2, g, true);
            }
            tm2.n(k, this);
        } while (!z);
        return obj;
    }
}
