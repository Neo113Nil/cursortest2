package j;

import a2.InterfaceC0184a;
import a2.InterfaceC0188e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508z implements InterfaceC0188e, Set, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0475A f5243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0475A f5244e;

    public C0508z(C0475A c0475a) {
        this.f5244e = c0475a;
        this.f5243d = c0475a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f5244e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Z1.i.f(collection, "elements");
        C0475A c0475a = this.f5244e;
        int i3 = c0475a.f5132d;
        for (Object obj : collection) {
            c0475a.f5130b[c0475a.d(obj)] = obj;
        }
        return i3 != c0475a.f5132d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5244e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5243d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Z1.i.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f5243d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5243d.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new O.c(this.f5244e);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5244e.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i3;
        int i4;
        Z1.i.f(collection, "elements");
        C0475A c0475a = this.f5244e;
        int i5 = c0475a.f5132d;
        Iterator it = collection.iterator();
        while (true) {
            int i6 = 1;
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                c0475a.getClass();
                i3 = next.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = i3 * (-862048943);
            int i9 = i8 ^ (i8 << 16);
            int i10 = i9 & 127;
            int i11 = c0475a.f5131c;
            int i12 = (i9 >>> 7) & i11;
            while (true) {
                long[] jArr = c0475a.f5129a;
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                int i15 = i7;
                long j3 = (((-i14) >> 63) & (jArr[i13 + i6] << (64 - i14))) | (jArr[i13] >>> i14);
                long j4 = (i10 * 72340172838076673L) ^ j3;
                long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j5 == 0) {
                        break;
                    }
                    i4 = ((Long.numberOfTrailingZeros(j5) >> 3) + i12) & i11;
                    if (Z1.i.a(c0475a.f5130b[i4], next)) {
                        break;
                    }
                    j5 &= j5 - 1;
                }
                i7 = i15 + 8;
                i12 = (i12 + i7) & i11;
                i6 = 1;
            }
            if (i4 >= 0) {
                c0475a.k(i4);
            }
        }
        return i5 != c0475a.f5132d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Z1.i.f(collection, "elements");
        C0475A c0475a = this.f5244e;
        long[] jArr = c0475a.f5129a;
        int length = jArr.length - 2;
        boolean z3 = false;
        if (length >= 0) {
            int i3 = 0;
            boolean z4 = false;
            while (true) {
                long j3 = jArr[i3];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j3) < 128) {
                            int i6 = (i3 << 3) + i5;
                            if (!collection.contains(c0475a.f5130b[i6])) {
                                c0475a.k(i6);
                                z4 = true;
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i4 != 8) {
                        return z4;
                    }
                }
                if (i3 == length) {
                    z3 = z4;
                    break;
                }
                i3++;
            }
        }
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5243d.f5132d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Z1.i.f(objArr, "array");
        return Z1.h.b(this, objArr);
    }
}
