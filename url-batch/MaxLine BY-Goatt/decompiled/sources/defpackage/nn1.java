package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nn1 implements o71, Set, k71 {
    public final ln1 m;
    public final ln1 n;

    public nn1(ln1 ln1Var) {
        ln1Var.getClass();
        ln1Var.getClass();
        this.m = ln1Var;
        this.n = ln1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.n.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ln1 ln1Var = this.n;
        ln1Var.getClass();
        collection2.getClass();
        int i = ln1Var.g;
        for (Object obj : collection2) {
            int d = ln1Var.d(obj);
            ln1Var.b[d] = obj;
            long[] jArr = ln1Var.c;
            int i2 = ln1Var.d;
            jArr[d] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((d & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            ln1Var.d = d;
            if (ln1Var.e == Integer.MAX_VALUE) {
                ln1Var.e = d;
            }
        }
        return i != ln1Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.n.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.m.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.m.c(it.next())) {
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
        if (obj == null || nn1.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.b(this.m, ((nn1) obj).m);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.m.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new wu0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.n.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i;
        int i2;
        collection.getClass();
        Collection collection2 = collection;
        ln1 ln1Var = this.n;
        ln1Var.getClass();
        collection2.getClass();
        int i3 = ln1Var.g;
        Iterator it = collection2.iterator();
        while (true) {
            int i4 = 1;
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int hashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 & 127;
            int i8 = ln1Var.f;
            int i9 = (i6 >>> 7) & i8;
            while (true) {
                long[] jArr = ln1Var.a;
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                long j = ((jArr[i10 + i4] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
                long j2 = (i7 * 72340172838076673L) ^ j;
                long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j3 == 0) {
                        break;
                    }
                    i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i9) & i8;
                    int i12 = i4;
                    if (Intrinsics.b(ln1Var.b[i2], next)) {
                        break;
                    }
                    j3 &= j3 - 1;
                    i4 = i12;
                }
                i5 += 8;
                i9 = (i9 + i5) & i8;
                i4 = i;
            }
            if (i2 >= 0) {
                ln1Var.h(i2);
            }
        }
        return i3 != ln1Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.n.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.m.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ll3.X(this, objArr);
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ll3.W(this);
    }
}
