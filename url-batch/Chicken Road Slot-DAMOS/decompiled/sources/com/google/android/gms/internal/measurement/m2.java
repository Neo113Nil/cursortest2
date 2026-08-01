package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m2 extends p0 implements RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    public static final Object[] f2523r;

    /* renamed from: s, reason: collision with root package name */
    public static final m2 f2524s;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f2525e;

    /* renamed from: i, reason: collision with root package name */
    public int f2526i;

    static {
        Object[] objArr = new Object[0];
        f2523r = objArr;
        f2524s = new m2(objArr, 0, false);
    }

    public m2(Object[] objArr, int i3, boolean z10) {
        super(z10);
        this.f2525e = objArr;
        this.f2526i = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i10;
        b();
        if (i3 < 0 || i3 > (i10 = this.f2526i)) {
            kotlin.collections.i0.g(r0.a(this.f2526i, i3, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i11 = i3 + 1;
        Object[] objArr = this.f2525e;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i3, objArr, i11, i10 - i3);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2525e, 0, objArr2, 0, i3);
            System.arraycopy(this.f2525e, i3, objArr2, i11, this.f2526i - i3);
            this.f2525e = objArr2;
        }
        this.f2525e[i3] = obj;
        this.f2526i++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i3) {
        if (i3 < 0 || i3 >= this.f2526i) {
            kotlin.collections.i0.g(r0.a(this.f2526i, i3, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i3 = this.f2526i;
        if (i3 != list.size()) {
            return false;
        }
        if (!(obj instanceof m2)) {
            for (int i10 = 0; i10 < i3; i10++) {
                if (!this.f2525e[i10].equals(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        m2 m2Var = (m2) obj;
        for (int i11 = 0; i11 < i3; i11++) {
            if (!this.f2525e[i11].equals(m2Var.f2525e[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        c(i3);
        return this.f2525e[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = this.f2526i;
        int i10 = 1;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 = (i10 * 31) + this.f2525e[i11].hashCode();
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.t1
    public final /* bridge */ /* synthetic */ t1 j(int i3) {
        if (i3 >= this.f2526i) {
            return new m2(i3 == 0 ? f2523r : Arrays.copyOf(this.f2525e, i3), this.f2526i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.p0, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        b();
        c(i3);
        Object[] objArr = this.f2525e;
        Object obj = objArr[i3];
        if (i3 < this.f2526i - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f2526i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        b();
        c(i3);
        Object[] objArr = this.f2525e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2526i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i3 = this.f2526i;
        int length = this.f2525e.length;
        if (i3 == length) {
            this.f2525e = Arrays.copyOf(this.f2525e, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f2525e;
        int i10 = this.f2526i;
        this.f2526i = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
