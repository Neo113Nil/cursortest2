package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ac1 implements Parcelable, ge1, List, RandomAccess, zb0 {
    public static final Parcelable.Creator<ac1> CREATOR = new zb1();
    public ee1 d;

    public ac1(j0 j0Var) {
        ib1 j = pb1.j();
        ee1 ee1Var = new ee1(j.g(), j0Var);
        if (!(j instanceof x40)) {
            ee1Var.b = new ee1(1L, j0Var);
        }
        this.d = ee1Var;
    }

    @Override // defpackage.ge1
    public final ie1 a() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 d = j0Var.d(obj);
            if (d.equals(j0Var)) {
                return false;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i, d, true);
            }
            pb1.n(j, this);
        } while (!C);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 e = j0Var.e(collection);
            if (Intrinsics.a(e, j0Var)) {
                return false;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i, e, true);
            }
            pb1.n(j, this);
        } while (!C);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ib1 j;
        ee1 ee1Var = this.d;
        ee1Var.getClass();
        synchronized (pb1.c) {
            j = pb1.j();
            ee1 ee1Var2 = (ee1) pb1.w(ee1Var, this, j);
            synchronized (yr1.r) {
                ee1Var2.c = eb1.g;
                ee1Var2.d++;
                ee1Var2.e++;
            }
        }
        pb1.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return yr1.M(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return yr1.M(this).c.containsAll(collection);
    }

    @Override // defpackage.ge1
    public final void d(ie1 ie1Var) {
        ie1Var.b = this.d;
        this.d = (ee1) ie1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i3 = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            uw0 f = j0Var.f();
            f.subList(i, i2).clear();
            j0 d = f.d();
            if (Intrinsics.a(d, j0Var)) {
                return;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i3, d, true);
            }
            pb1.n(j, this);
        } while (!C);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return yr1.M(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return yr1.M(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return yr1.M(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return yr1.M(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new g60(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            int indexOf = j0Var.indexOf(obj);
            j0 h = indexOf != -1 ? j0Var.h(indexOf) : j0Var;
            if (h.equals(j0Var)) {
                return false;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i, h, true);
            }
            pb1.n(j, this);
        } while (!C);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 g = j0Var.g(new i0(0, collection));
            if (Intrinsics.a(g, j0Var)) {
                return false;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i, g, true);
            }
            pb1.n(j, this);
        } while (!C);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return yr1.P(this, new i0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        j0 j0Var;
        ib1 j;
        boolean C;
        Object obj2 = get(i);
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i2 = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 i3 = j0Var.i(i, obj);
            if (i3.equals(j0Var)) {
                break;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i2, i3, false);
            }
            pb1.n(j, this);
        } while (!C);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return yr1.M(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            cy0.a("fromIndex or toIndex are out of bounds");
        }
        return new af1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mo.F(this);
    }

    public final String toString() {
        ee1 ee1Var = this.d;
        ee1Var.getClass();
        return "SnapshotStateList(value=" + ((ee1) pb1.h(ee1Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j0 j0Var = yr1.M(this).c;
        int size = j0Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(j0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mo.G(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new g60(this, i);
    }

    public ac1() {
        this(eb1.g);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        j0 j0Var;
        ib1 j;
        boolean C;
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i2 = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 b = j0Var.b(i, obj);
            if (b.equals(j0Var)) {
                return;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i2, b, true);
            }
            pb1.n(j, this);
        } while (!C);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return yr1.P(this, new mx(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        j0 j0Var;
        ib1 j;
        boolean C;
        Object obj = get(i);
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = this.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i2 = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            j0 h = j0Var.h(i);
            if (h.equals(j0Var)) {
                break;
            }
            ee1 ee1Var3 = this.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, this, j), i2, h, true);
            }
            pb1.n(j, this);
        } while (!C);
        return obj;
    }
}
