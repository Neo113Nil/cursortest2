package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m0 implements r6.d, Set, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final k0 f5511d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f5512e;

    public m0(k0 k0Var) {
        this.f5511d = k0Var;
        this.f5512e = k0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f5512e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        q6.i.e(collection, "elements");
        k0 k0Var = this.f5512e;
        int i = k0Var.f5492d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k0Var.j(it.next());
        }
        return i != k0Var.f5492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5512e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5511d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        q6.i.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5511d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        return q6.i.a(this.f5511d, ((m0) obj).f5511d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f5511d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5511d.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5512e.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        q6.i.e(collection, "elements");
        k0 k0Var = this.f5512e;
        k0Var.getClass();
        int i = k0Var.f5492d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k0Var.i(it.next());
        }
        return i != k0Var.f5492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z3;
        q6.i.e(collection, "elements");
        k0 k0Var = this.f5512e;
        k0Var.getClass();
        Object[] objArr = k0Var.f5490b;
        int i = k0Var.f5492d;
        long[] jArr = k0Var.f5489a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j7) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (!d6.m.Q(collection, objArr[i11])) {
                                k0Var.m(i11);
                            }
                        }
                        j7 >>= 8;
                    }
                    z3 = false;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    z3 = false;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        } else {
            z3 = false;
        }
        if (i != k0Var.f5492d) {
            return true;
        }
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5511d.f5492d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return q6.h.a(this);
    }

    public final String toString() {
        return this.f5511d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        return q6.h.b(this, objArr);
    }
}
