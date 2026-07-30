package i;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements s6.f, Set, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f4718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f4719g;

    public a0(b0 b0Var) {
        this.f4719g = b0Var;
        this.f4718f = b0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f4719g.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        r6.k.f(collection, "elements");
        b0 b0Var = this.f4719g;
        int i7 = b0Var.f4724d;
        for (Object obj : collection) {
            b0Var.f4722b[b0Var.d(obj)] = obj;
        }
        return i7 != b0Var.f4724d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f4719g.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4718f.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        r6.k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4718f.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4718f.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new z(this.f4719g);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f4719g.j(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(Collection collection) {
        int i7;
        int i8;
        r6.k.f(collection, "elements");
        b0 b0Var = this.f4719g;
        int i9 = b0Var.f4724d;
        Iterator it = collection.iterator();
        while (true) {
            int i10 = 1;
            int i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                b0Var.getClass();
                i7 = next.hashCode();
            } else {
                i7 = 0;
            }
            int i12 = i7 * (-862048943);
            int i13 = i12 ^ (i12 << 16);
            int i14 = i13 & 127;
            int i15 = b0Var.f4723c;
            int i16 = (i13 >>> 7) & i15;
            while (true) {
                long[] jArr = b0Var.f4721a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                int i19 = i10;
                int i20 = i11;
                long j8 = (((-i18) >> 63) & (jArr[i17 + i10] << (64 - i18))) | (jArr[i17] >>> i18);
                long j9 = (i14 * 72340172838076673L) ^ j8;
                long j10 = -9187201950435737472L;
                long j11 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i8 = ((Long.numberOfTrailingZeros(j11) >> 3) + i16) & i15;
                    long j12 = j10;
                    if (r6.k.a(b0Var.f4722b[i8], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                    j10 = j12;
                }
                i11 = i20 + 8;
                i16 = (i16 + i11) & i15;
                i10 = i19;
            }
            if (i8 >= 0) {
                b0Var.k(i8);
            }
        }
        return i9 != b0Var.f4724d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        r6.k.f(collection, "elements");
        b0 b0Var = this.f4719g;
        long[] jArr = b0Var.f4721a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i7 = 0;
        boolean z8 = false;
        while (true) {
            long j8 = jArr[i7];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j8) < 128) {
                        int i10 = (i7 << 3) + i9;
                        if (!collection.contains(b0Var.f4722b[i10])) {
                            b0Var.k(i10);
                            z8 = true;
                        }
                    }
                    j8 >>= 8;
                }
                if (i8 != 8) {
                    return z8;
                }
            }
            if (i7 == length) {
                return z8;
            }
            i7++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4718f.f4724d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return r6.j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        r6.k.f(objArr, "array");
        return r6.j.b(this, objArr);
    }
}
