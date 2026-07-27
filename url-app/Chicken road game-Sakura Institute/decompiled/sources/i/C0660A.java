package i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0660A implements N2.f, Set, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0661B f6882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0661B f6883e;

    public C0660A(C0661B c0661b) {
        this.f6883e = c0661b;
        this.f6882d = c0661b;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f6883e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C0661B c0661b = this.f6883e;
        Collection elements2 = elements;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        int i2 = c0661b.f6887d;
        Collection elements3 = elements2;
        Intrinsics.checkNotNullParameter(elements3, "elements");
        for (Object obj : elements3) {
            c0661b.f6885b[c0661b.d(obj)] = obj;
        }
        return i2 != c0661b.f6887d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f6883e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6882d.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f6882d.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f6882d.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new M.c(this.f6883e);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f6883e.j(obj);
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
    public final boolean removeAll(Collection elements) {
        int i2;
        int i4;
        Intrinsics.checkNotNullParameter(elements, "elements");
        C0661B c0661b = this.f6883e;
        int i5 = c0661b.f6887d;
        Iterator it = elements.iterator();
        while (true) {
            int i6 = 1;
            int i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                c0661b.getClass();
                i2 = next.hashCode();
            } else {
                i2 = 0;
            }
            int i8 = i2 * (-862048943);
            int i9 = i8 ^ (i8 << 16);
            int i10 = i9 & 127;
            int i11 = c0661b.f6886c;
            int i12 = (i9 >>> 7) & i11;
            while (true) {
                long[] jArr = c0661b.f6884a;
                int i13 = i12 >> 3;
                int i14 = (i12 & 7) << 3;
                int i15 = i7;
                long j4 = (((-i14) >> 63) & (jArr[i13 + i6] << (64 - i14))) | (jArr[i13] >>> i14);
                long j5 = (i10 * 72340172838076673L) ^ j4;
                long j6 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j6 == 0) {
                        break;
                    }
                    i4 = ((Long.numberOfTrailingZeros(j6) >> 3) + i12) & i11;
                    if (Intrinsics.a(c0661b.f6885b[i4], next)) {
                        break;
                    }
                    j6 &= j6 - 1;
                }
                i7 = i15 + 8;
                i12 = (i12 + i7) & i11;
                i6 = 1;
            }
            if (i4 >= 0) {
                c0661b.k(i4);
            }
        }
        return i5 != c0661b.f6887d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        C0661B c0661b = this.f6883e;
        long[] jArr = c0661b.f6884a;
        int length = jArr.length - 2;
        boolean z4 = false;
        if (length >= 0) {
            int i2 = 0;
            boolean z5 = false;
            while (true) {
                long j4 = jArr[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j4) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (!elements.contains(c0661b.f6885b[i6])) {
                                c0661b.k(i6);
                                z5 = true;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i4 != 8) {
                        return z5;
                    }
                }
                if (i2 == length) {
                    z4 = z5;
                    break;
                }
                i2++;
            }
        }
        return z4;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f6882d.f6887d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return M2.o.b(this, array);
    }
}
