package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class bq3 extends co3<Integer> implements RandomAccess, fq3, sr3 {

    /* renamed from: i, reason: collision with root package name */
    private static final bq3 f3500i;

    /* renamed from: g, reason: collision with root package name */
    private int[] f3501g;

    /* renamed from: h, reason: collision with root package name */
    private int f3502h;

    static {
        bq3 bq3Var = new bq3(new int[0], 0);
        f3500i = bq3Var;
        bq3Var.a();
    }

    bq3() {
        this(new int[10], 0);
    }

    private bq3(int[] iArr, int i7) {
        this.f3501g = iArr;
        this.f3502h = i7;
    }

    public static bq3 k() {
        return f3500i;
    }

    private final String l(int i7) {
        int i8 = this.f3502h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void m(int i7) {
        if (i7 < 0 || i7 >= this.f3502h) {
            throw new IndexOutOfBoundsException(l(i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.jq3
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final fq3 e(int i7) {
        if (i7 >= this.f3502h) {
            return new bq3(Arrays.copyOf(this.f3501g, i7), this.f3502h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.fq3
    public final void O(int i7) {
        i();
        int i8 = this.f3502h;
        int[] iArr = this.f3501g;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            this.f3501g = iArr2;
        }
        int[] iArr3 = this.f3501g;
        int i9 = this.f3502h;
        this.f3502h = i9 + 1;
        iArr3[i9] = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        i();
        if (i7 < 0 || i7 > (i8 = this.f3502h)) {
            throw new IndexOutOfBoundsException(l(i7));
        }
        int[] iArr = this.f3501g;
        if (i8 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
        } else {
            int[] iArr2 = new int[((i8 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f3501g, i7, iArr2, i7 + 1, this.f3502h - i7);
            this.f3501g = iArr2;
        }
        this.f3501g[i7] = intValue;
        this.f3502h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        O(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        i();
        kq3.e(collection);
        if (!(collection instanceof bq3)) {
            return super.addAll(collection);
        }
        bq3 bq3Var = (bq3) collection;
        int i7 = bq3Var.f3502h;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f3502h;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.f3501g;
        if (i9 > iArr.length) {
            this.f3501g = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(bq3Var.f3501g, 0, this.f3501g, this.f3502h, bq3Var.f3502h);
        this.f3502h = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq3)) {
            return super.equals(obj);
        }
        bq3 bq3Var = (bq3) obj;
        if (this.f3502h != bq3Var.f3502h) {
            return false;
        }
        int[] iArr = bq3Var.f3501g;
        for (int i7 = 0; i7 < this.f3502h; i7++) {
            if (this.f3501g[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        m(i7);
        return Integer.valueOf(this.f3501g[i7]);
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f3502h; i8++) {
            i7 = (i7 * 31) + this.f3501g[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.f3502h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f3501g[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    public final int j(int i7) {
        m(i7);
        return this.f3501g[i7];
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        m(i7);
        int[] iArr = this.f3501g;
        int i8 = iArr[i7];
        if (i7 < this.f3502h - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.f3502h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        i();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f3501g;
        System.arraycopy(iArr, i8, iArr, i7, this.f3502h - i8);
        this.f3502h -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        m(i7);
        int[] iArr = this.f3501g;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3502h;
    }
}
