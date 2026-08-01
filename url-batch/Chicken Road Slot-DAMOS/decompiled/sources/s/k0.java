package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 implements xd.f, Set, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final i0 f8341d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f8342e;

    public k0(i0 i0Var) {
        this.f8341d = i0Var;
        this.f8342e = i0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f8342e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i0 i0Var = this.f8342e;
        int i3 = i0Var.f8322d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i0Var.i(it.next());
        }
        return i3 != i0Var.f8322d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8342e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8341d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f8341d.c(it.next())) {
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
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        return this.f8341d.equals(((k0) obj).f8341d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f8341d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8341d.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new de.e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8342e.k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i3;
        collection.getClass();
        i0 i0Var = this.f8342e;
        int i10 = i0Var.f8322d;
        Iterator it = collection.iterator();
        while (true) {
            int i11 = 1;
            int i12 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i13 = hashCode ^ (hashCode << 16);
            int i14 = i13 & 127;
            int i15 = i0Var.f8321c;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = i0Var.f8319a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i11;
                int i20 = i12;
                long j = (((-i18) >> 63) & (jArr[i17 + i11] << (64 - i18))) | (jArr[i17] >>> i18);
                long j3 = (i14 * 72340172838076673L) ^ j;
                long j10 = -9187201950435737472L;
                long j11 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i3 = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                    long j12 = j10;
                    if (Intrinsics.a(i0Var.f8320b[i3], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                    j10 = j12;
                }
                i12 = i20 + 8;
                i16 = (i16 + i12) & i15;
                i11 = i19;
            }
            if (i3 >= 0) {
                i0Var.l(i3);
            }
        }
        return i10 != i0Var.f8322d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i0 i0Var = this.f8342e;
        Object[] objArr = i0Var.f8320b;
        int i3 = i0Var.f8322d;
        long[] jArr = i0Var.f8319a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!CollectionsKt.u(collection, objArr[i13])) {
                                i0Var.l(i13);
                            }
                        }
                        j >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return i3 != i0Var.f8322d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8341d.f8322d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wd.i.b(this, objArr);
    }

    public final String toString() {
        return this.f8341d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }
}
