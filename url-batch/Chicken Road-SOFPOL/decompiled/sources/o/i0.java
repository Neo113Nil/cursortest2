package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 implements r6.d, Set, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final f0 f5479d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f5480e;

    public i0(f0 f0Var) {
        q6.i.e(f0Var, "parent");
        this.f5479d = f0Var;
        this.f5480e = f0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f5480e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        q6.i.e(collection, "elements");
        f0 f0Var = this.f5480e;
        f0Var.getClass();
        int i = f0Var.f5453g;
        for (Object obj : collection) {
            int d8 = f0Var.d(obj);
            f0Var.f5448b[d8] = obj;
            long[] jArr = f0Var.f5449c;
            int i8 = f0Var.f5450d;
            jArr[d8] = (i8 & 2147483647L) | 4611686016279904256L;
            if (i8 != Integer.MAX_VALUE) {
                jArr[i8] = ((d8 & 2147483647L) << 31) | (jArr[i8] & (-4611686016279904257L));
            }
            f0Var.f5450d = d8;
            if (f0Var.f5451e == Integer.MAX_VALUE) {
                f0Var.f5451e = d8;
            }
        }
        return i != f0Var.f5453g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5480e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5479d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        q6.i.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5479d.c(it.next())) {
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
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        return q6.i.a(this.f5479d, ((i0) obj).f5479d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f5479d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5479d.f5453g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5480e.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        q6.i.e(collection, "elements");
        f0 f0Var = this.f5480e;
        f0Var.getClass();
        int i8 = f0Var.f5453g;
        Iterator it = collection.iterator();
        while (true) {
            int i9 = 1;
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i11 = hashCode ^ (hashCode << 16);
            int i12 = i11 & 127;
            int i13 = f0Var.f5452f;
            int i14 = (i11 >>> 7) & i13;
            while (true) {
                long[] jArr = f0Var.f5447a;
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                int i17 = i9;
                int i18 = i10;
                long j7 = (((-i16) >> 63) & (jArr[i15 + i9] << (64 - i16))) | (jArr[i15] >>> i16);
                long j8 = (i12 * 72340172838076673L) ^ j7;
                long j9 = -9187201950435737472L;
                long j10 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i14) & i13;
                    long j11 = j9;
                    if (q6.i.a(f0Var.f5448b[i], next)) {
                        break;
                    }
                    j10 &= j10 - 1;
                    j9 = j11;
                }
                i10 = i18 + 8;
                i14 = (i14 + i10) & i13;
                i9 = i17;
            }
            if (i >= 0) {
                f0Var.h(i);
            }
        }
        return i8 != f0Var.f5453g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        q6.i.e(collection, "elements");
        return this.f5480e.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5479d.f5453g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return q6.h.a(this);
    }

    public final String toString() {
        return this.f5479d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        q6.i.e(objArr, "array");
        return q6.h.b(this, objArr);
    }
}
