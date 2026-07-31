package w0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import m0.p1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements Parcelable, u, List, RandomAccess, r6.b {
    public static final Parcelable.Creator<p> CREATOR = new o(0);

    /* renamed from: d, reason: collision with root package name */
    public t f7546d;

    public p(q0.c cVar) {
        f k3 = m.k();
        t tVar = new t(k3.g(), cVar);
        if (!(k3 instanceof a)) {
            tVar.f7573b = new t(1, cVar);
        }
        this.f7546d = tVar;
    }

    @Override // w0.u
    public final w a() {
        return this.f7546d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c c8 = cVar.c(obj);
            if (c8.equals(cVar)) {
                return false;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i, c8, true);
            }
            m.n(k3, this);
        } while (!b8);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return q.i(this, new k0.a(i, collection));
    }

    @Override // w0.u
    public final void c(w wVar) {
        wVar.f7573b = this.f7546d;
        this.f7546d = (t) wVar;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        f k3;
        t tVar = this.f7546d;
        q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (m.f7537c) {
            k3 = m.k();
            t tVar2 = (t) m.w(tVar, this, k3);
            synchronized (q.f7547a) {
                tVar2.f7568c = q0.j.f5955e;
                tVar2.f7569d++;
                tVar2.f7570e++;
            }
        }
        m.n(k3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q.f(this).f7568c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q.f(this).f7568c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i8) {
        int i9;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i9 = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.g f6 = cVar.f();
            f6.subList(i, i8).clear();
            q0.c c8 = f6.c();
            if (q6.i.a(c8, cVar)) {
                return;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i9, c8, true);
            }
            m.n(k3, this);
        } while (!b8);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return q.f(this).f7568c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q.f(this).f7568c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q.f(this).f7568c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q.f(this).f7568c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e6.a(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i8;
        q0.c cVar;
        f k3;
        boolean b8;
        Object obj = get(i);
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i8 = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c h8 = cVar.h(i);
            if (h8.equals(cVar)) {
                break;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i8, h8, true);
            }
            m.n(k3, this);
        } while (!b8);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c g3 = cVar.g(new q0.b(0, collection));
            if (q6.i.a(g3, cVar)) {
                return false;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i, g3, true);
            }
            m.n(k3, this);
        } while (!b8);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q.i(this, new q0.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i8;
        q0.c cVar;
        f k3;
        boolean b8;
        Object obj2 = get(i);
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i8 = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c i9 = cVar.i(i, obj);
            if (i9.equals(cVar)) {
                break;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i8, i9, false);
            }
            m.n(k3, this);
        } while (!b8);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q.f(this).f7568c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        if (!(i >= 0 && i <= i8 && i8 <= size())) {
            p1.a("fromIndex or toIndex are out of bounds");
        }
        return new x(this, i, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return q6.h.a(this);
    }

    public final String toString() {
        t tVar = this.f7546d;
        q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((t) m.i(tVar)).f7568c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q0.c cVar = q.f(this).f7568c;
        int a8 = cVar.a();
        parcel.writeInt(a8);
        for (int i8 = 0; i8 < a8; i8++) {
            parcel.writeValue(cVar.get(i8));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c e8 = cVar.e(collection);
            if (q6.i.a(e8, cVar)) {
                return false;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i, e8, true);
            }
            m.n(k3, this);
        } while (!b8);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new e6.a(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return q6.h.b(this, objArr);
    }

    public p() {
        this(q0.j.f5955e);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i8;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i8 = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            q0.c b9 = cVar.b(i, obj);
            if (b9.equals(cVar)) {
                return;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i8, b9, true);
            }
            m.n(k3, this);
        } while (!b8);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        q0.c cVar;
        f k3;
        boolean b8;
        do {
            synchronized (q.f7547a) {
                t tVar = this.f7546d;
                q6.i.c(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                t tVar2 = (t) m.i(tVar);
                i = tVar2.f7569d;
                cVar = tVar2.f7568c;
            }
            q6.i.b(cVar);
            int indexOf = cVar.indexOf(obj);
            q0.c h8 = indexOf != -1 ? cVar.h(indexOf) : cVar;
            if (h8.equals(cVar)) {
                return false;
            }
            t tVar3 = this.f7546d;
            q6.i.c(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f7537c) {
                k3 = m.k();
                b8 = q.b((t) m.w(tVar3, this, k3), i, h8, true);
            }
            m.n(k3, this);
        } while (!b8);
        return true;
    }
}
