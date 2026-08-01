package b1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements Parcelable, f0, List, RandomAccess, xd.c {
    public static final Parcelable.Creator<w> CREATOR = new v(0);

    /* renamed from: d, reason: collision with root package name */
    public e0 f1042d;

    public w(t0.b bVar) {
        i j = r.j();
        e0 e0Var = new e0(j.g(), bVar);
        if (!(j instanceof c)) {
            e0Var.f982b = new e0(1, bVar);
        }
        this.f1042d = e0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b e2 = bVar.e(obj);
            if (e2.equals(bVar)) {
                return false;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i3, e2, true);
            }
            r.n(j, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i3;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b f3 = bVar.f(collection);
            if (Intrinsics.a(f3, bVar)) {
                return false;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i3, f3, true);
            }
            r.n(j, this);
        } while (!b10);
        return true;
    }

    @Override // b1.f0
    public final void b(h0 h0Var) {
        h0Var.f982b = this.f1042d;
        this.f1042d = (e0) h0Var;
    }

    @Override // b1.f0
    public final h0 c() {
        return this.f1042d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i j;
        e0 e0Var = this.f1042d;
        e0Var.getClass();
        synchronized (r.f1030c) {
            j = r.j();
            e0 e0Var2 = (e0) r.w(e0Var, this, j);
            synchronized (x.f1043a) {
                e0Var2.f971c = t0.h.f9218i;
                e0Var2.f972d++;
                e0Var2.f973e++;
            }
        }
        r.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return x.f(this).f971c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return x.f(this).f971c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f(int i3, int i10) {
        int i11;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i11 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.e g = bVar.g();
            g.subList(i3, i10).clear();
            t0.b e2 = g.e();
            if (Intrinsics.a(e2, bVar)) {
                return;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i11, e2, true);
            }
            r.n(j, this);
        } while (!b10);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return x.f(this).f971c.get(i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return x.f(this).f971c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return x.f(this).f971c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return x.f(this).f971c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            int indexOf = bVar.indexOf(obj);
            t0.b i10 = indexOf != -1 ? bVar.i(indexOf) : bVar;
            if (i10.equals(bVar)) {
                return false;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i3, i10, true);
            }
            r.n(j, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i3;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b h10 = bVar.h(new t(1, collection));
            if (Intrinsics.a(h10, bVar)) {
                return false;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i3, h10, true);
            }
            r.n(j, this);
        } while (!b10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return x.i(this, new t(0, collection));
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        int i10;
        t0.b bVar;
        i j;
        boolean b10;
        Object obj2 = get(i3);
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i10 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b k10 = bVar.k(i3, obj);
            if (k10.equals(bVar)) {
                break;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i10, k10, false);
            }
            r.n(j, this);
        } while (!b10);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return x.f(this).f971c.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        if (!(i3 >= 0 && i3 <= i10 && i10 <= size())) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        return new j0(this, i3, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }

    public final String toString() {
        e0 e0Var = this.f1042d;
        e0Var.getClass();
        return "SnapshotStateList(value=" + ((e0) r.h(e0Var)).f971c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        t0.b bVar = x.f(this).f971c;
        int size = bVar.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeValue(bVar.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wd.i.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new d0(this, i3);
    }

    public w() {
        this(t0.h.f9218i);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        t0.b bVar;
        i j;
        boolean b10;
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i10 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b c10 = bVar.c(i3, obj);
            if (c10.equals(bVar)) {
                return;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i10, c10, true);
            }
            r.n(j, this);
        } while (!b10);
    }

    @Override // java.util.List
    public final boolean addAll(final int i3, final Collection collection) {
        return x.i(this, new Function1() { // from class: b1.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i3, collection));
            }
        });
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        int i10;
        t0.b bVar;
        i j;
        boolean b10;
        Object obj = get(i3);
        do {
            synchronized (x.f1043a) {
                e0 e0Var = this.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i10 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.b i11 = bVar.i(i3);
            if (i11.equals(bVar)) {
                break;
            }
            e0 e0Var3 = this.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, this, j), i10, i11, true);
            }
            r.n(j, this);
        } while (!b10);
        return obj;
    }
}
