package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 implements xd.f, Set, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f8309d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f8310e;

    public g0(e0 e0Var) {
        e0Var.getClass();
        e0Var.getClass();
        this.f8309d = e0Var;
        this.f8310e = e0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f8310e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        e0 e0Var = this.f8310e;
        e0Var.getClass();
        collection2.getClass();
        int i3 = e0Var.g;
        for (Object obj : collection2) {
            int d10 = e0Var.d(obj);
            e0Var.f8290b[d10] = obj;
            long[] jArr = e0Var.f8291c;
            int i10 = e0Var.f8292d;
            jArr[d10] = (i10 & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((d10 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            e0Var.f8292d = d10;
            if (e0Var.f8293e == Integer.MAX_VALUE) {
                e0Var.f8293e = d10;
            }
        }
        return i3 != e0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8310e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8309d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f8309d.c(it.next())) {
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
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.a(this.f8309d, ((g0) obj).f8309d);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f8309d.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8309d.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new de.e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f8310e.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i3;
        collection.getClass();
        Collection collection2 = collection;
        e0 e0Var = this.f8310e;
        e0Var.getClass();
        collection2.getClass();
        int i10 = e0Var.g;
        Iterator it = collection2.iterator();
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
            int i15 = e0Var.f8294f;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = e0Var.f8289a;
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
                    if (Intrinsics.a(e0Var.f8290b[i3], next)) {
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
                e0Var.h(i3);
            }
        }
        return i10 != e0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f8310e.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8309d.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return wd.i.b(this, objArr);
    }

    public final String toString() {
        return this.f8309d.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }
}
