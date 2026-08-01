package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l1 extends p0 implements RandomAccess, o1, k2 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2489r;

    /* renamed from: s, reason: collision with root package name */
    public static final l1 f2490s;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2491e;

    /* renamed from: i, reason: collision with root package name */
    public int f2492i;

    static {
        int[] iArr = new int[0];
        f2489r = iArr;
        f2490s = new l1(iArr, 0, false);
    }

    public l1(int[] iArr, int i3, boolean z10) {
        super(z10);
        this.f2491e = iArr;
        this.f2492i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i3 < 0 || i3 > (i10 = this.f2492i)) {
            kotlin.collections.i0.g(r0.a(this.f2492i, i3, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i11 = i3 + 1;
        int[] iArr = this.f2491e;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i3, iArr, i11, i10 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2491e, 0, iArr2, 0, i3);
            System.arraycopy(this.f2491e, i3, iArr2, i11, this.f2492i - i3);
            this.f2491e = iArr2;
        }
        this.f2491e[i3] = intValue;
        this.f2492i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof l1)) {
            return super.addAll(collection);
        }
        l1 l1Var = (l1) collection;
        int i3 = l1Var.f2492i;
        if (i3 == 0) {
            return false;
        }
        int i10 = this.f2492i;
        if (Integer.MAX_VALUE - i10 < i3) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i3;
        int[] iArr = this.f2491e;
        if (i11 > iArr.length) {
            this.f2491e = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(l1Var.f2491e, 0, this.f2491e, this.f2492i, l1Var.f2492i);
        this.f2492i = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l1 j(int i3) {
        if (i3 >= this.f2492i) {
            return new l1(i3 == 0 ? f2489r : Arrays.copyOf(this.f2491e, i3), this.f2492i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i3) {
        g(i3);
        return this.f2491e[i3];
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return super.equals(obj);
        }
        l1 l1Var = (l1) obj;
        if (this.f2492i != l1Var.f2492i) {
            return false;
        }
        int[] iArr = l1Var.f2491e;
        for (int i3 = 0; i3 < this.f2492i; i3++) {
            if (this.f2491e[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i3) {
        b();
        int i10 = this.f2492i;
        int length = this.f2491e.length;
        if (i10 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2491e, 0, iArr, 0, this.f2492i);
            this.f2491e = iArr;
        }
        int[] iArr2 = this.f2491e;
        int i11 = this.f2492i;
        this.f2492i = i11 + 1;
        iArr2[i11] = i3;
    }

    public final void g(int i3) {
        if (i3 < 0 || i3 >= this.f2492i) {
            kotlin.collections.i0.g(r0.a(this.f2492i, i3, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        g(i3);
        return Integer.valueOf(this.f2491e[i3]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f2492i; i10++) {
            i3 = (i3 * 31) + this.f2491e[i10];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.f2492i;
        for (int i10 = 0; i10 < i3; i10++) {
            if (this.f2491e[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        b();
        g(i3);
        int[] iArr = this.f2491e;
        int i10 = iArr[i3];
        if (i3 < this.f2492i - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f2492i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        b();
        if (i10 < i3) {
            kotlin.collections.i0.g("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f2491e;
        System.arraycopy(iArr, i10, iArr, i3, this.f2492i - i10);
        this.f2492i -= i10 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        g(i3);
        int[] iArr = this.f2491e;
        int i10 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2492i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
