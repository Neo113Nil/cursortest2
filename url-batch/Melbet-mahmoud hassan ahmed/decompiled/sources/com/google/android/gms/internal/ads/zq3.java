package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zq3 extends co3<Long> implements RandomAccess, iq3, sr3 {

    /* renamed from: i, reason: collision with root package name */
    private static final zq3 f15229i;

    /* renamed from: g, reason: collision with root package name */
    private long[] f15230g;

    /* renamed from: h, reason: collision with root package name */
    private int f15231h;

    static {
        zq3 zq3Var = new zq3(new long[0], 0);
        f15229i = zq3Var;
        zq3Var.a();
    }

    zq3() {
        this(new long[10], 0);
    }

    private zq3(long[] jArr, int i7) {
        this.f15230g = jArr;
        this.f15231h = i7;
    }

    public static zq3 k() {
        return f15229i;
    }

    private final String m(int i7) {
        int i8 = this.f15231h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void n(int i7) {
        if (i7 < 0 || i7 >= this.f15231h) {
            throw new IndexOutOfBoundsException(m(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        long longValue = ((Long) obj).longValue();
        i();
        if (i7 < 0 || i7 > (i8 = this.f15231h)) {
            throw new IndexOutOfBoundsException(m(i7));
        }
        long[] jArr = this.f15230g;
        if (i8 < jArr.length) {
            System.arraycopy(jArr, i7, jArr, i7 + 1, i8 - i7);
        } else {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            System.arraycopy(this.f15230g, i7, jArr2, i7 + 1, this.f15231h - i7);
            this.f15230g = jArr2;
        }
        this.f15230g[i7] = longValue;
        this.f15231h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        l(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        i();
        kq3.e(collection);
        if (!(collection instanceof zq3)) {
            return super.addAll(collection);
        }
        zq3 zq3Var = (zq3) collection;
        int i7 = zq3Var.f15231h;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f15231h;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        long[] jArr = this.f15230g;
        if (i9 > jArr.length) {
            this.f15230g = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(zq3Var.f15230g, 0, this.f15230g, this.f15231h, zq3Var.f15231h);
        this.f15231h = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final iq3 e(int i7) {
        if (i7 >= this.f15231h) {
            return new zq3(Arrays.copyOf(this.f15230g, i7), this.f15231h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq3)) {
            return super.equals(obj);
        }
        zq3 zq3Var = (zq3) obj;
        if (this.f15231h != zq3Var.f15231h) {
            return false;
        }
        long[] jArr = zq3Var.f15230g;
        for (int i7 = 0; i7 < this.f15231h; i7++) {
            if (this.f15230g[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        n(i7);
        return Long.valueOf(this.f15230g[i7]);
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f15231h; i8++) {
            i7 = (i7 * 31) + kq3.c(this.f15230g[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.f15231h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f15230g[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    public final long j(int i7) {
        n(i7);
        return this.f15230g[i7];
    }

    public final void l(long j7) {
        i();
        int i7 = this.f15231h;
        long[] jArr = this.f15230g;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[((i7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.f15230g = jArr2;
        }
        long[] jArr3 = this.f15230g;
        int i8 = this.f15231h;
        this.f15231h = i8 + 1;
        jArr3[i8] = j7;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        n(i7);
        long[] jArr = this.f15230g;
        long j7 = jArr[i7];
        if (i7 < this.f15231h - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (r3 - i7) - 1);
        }
        this.f15231h--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        i();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f15230g;
        System.arraycopy(jArr, i8, jArr, i7, this.f15231h - i8);
        this.f15231h -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        n(i7);
        long[] jArr = this.f15230g;
        long j7 = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15231h;
    }
}
