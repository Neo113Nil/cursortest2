package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z1 extends p0 implements RandomAccess, s1, k2 {

    /* renamed from: r, reason: collision with root package name */
    public static final long[] f3029r;

    /* renamed from: s, reason: collision with root package name */
    public static final z1 f3030s;

    /* renamed from: e, reason: collision with root package name */
    public long[] f3031e;

    /* renamed from: i, reason: collision with root package name */
    public int f3032i;

    static {
        long[] jArr = new long[0];
        f3029r = jArr;
        f3030s = new z1(jArr, 0, false);
    }

    public z1(long[] jArr, int i3, boolean z10) {
        super(z10);
        this.f3031e = jArr;
        this.f3032i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        b();
        if (i3 < 0 || i3 > (i10 = this.f3032i)) {
            kotlin.collections.i0.g(r0.a(this.f3032i, i3, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i11 = i3 + 1;
        long[] jArr = this.f3031e;
        int length = jArr.length;
        if (i10 < length) {
            System.arraycopy(jArr, i3, jArr, i11, i10 - i3);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f3031e, 0, jArr2, 0, i3);
            System.arraycopy(this.f3031e, i3, jArr2, i11, this.f3032i - i3);
            this.f3031e = jArr2;
        }
        this.f3031e[i3] = longValue;
        this.f3032i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof z1)) {
            return super.addAll(collection);
        }
        z1 z1Var = (z1) collection;
        int i3 = z1Var.f3032i;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f3032i;
        if (Integer.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        long[] jArr = this.f3031e;
        if (i11 > jArr.length) {
            this.f3031e = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(z1Var.f3031e, 0, this.f3031e, this.f3032i, z1Var.f3032i);
        this.f3032i = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i3) {
        g(i3);
        return this.f3031e[i3];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final z1 j(int i3) {
        if (i3 >= this.f3032i) {
            return new z1(i3 == 0 ? f3029r : Arrays.copyOf(this.f3031e, i3), this.f3032i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return super.equals(obj);
        }
        z1 z1Var = (z1) obj;
        if (this.f3032i != z1Var.f3032i) {
            return false;
        }
        long[] jArr = z1Var.f3031e;
        for (int i3 = 0; i3 < this.f3032i; i3++) {
            if (this.f3031e[i3] != jArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j) {
        b();
        int i3 = this.f3032i;
        int length = this.f3031e.length;
        if (i3 == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f3031e, 0, jArr, 0, this.f3032i);
            this.f3031e = jArr;
        }
        long[] jArr2 = this.f3031e;
        int i10 = this.f3032i;
        this.f3032i = i10 + 1;
        jArr2[i10] = j;
    }

    public final void g(int i3) {
        if (i3 < 0 || i3 >= this.f3032i) {
            kotlin.collections.i0.g(r0.a(this.f3032i, i3, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        g(i3);
        return Long.valueOf(this.f3031e[i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f3032i; i10++) {
            long j = this.f3031e[i10];
            byte[] bArr = r1.f2724a;
            i3 = (i3 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i3 = this.f3032i;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f3031e[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        b();
        g(i3);
        long[] jArr = this.f3031e;
        long j = jArr[i3];
        if (i3 < this.f3032i - 1) {
            System.arraycopy(jArr, i3 + 1, jArr, i3, (r3 - i3) - 1);
        }
        this.f3032i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        b();
        if (i10 < i3) {
            kotlin.collections.i0.g("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f3031e;
        System.arraycopy(jArr, i10, jArr, i3, this.f3032i - i10);
        this.f3032i -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        g(i3);
        long[] jArr = this.f3031e;
        long j = jArr[i3];
        jArr[i3] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3032i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
