package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.gL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3254gL extends JK implements RandomAccess, InterfaceC3414jL, HL {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f30988w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3254gL f30989x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f30990u;

    /* renamed from: v, reason: collision with root package name */
    public int f30991v;

    static {
        int[] iArr = new int[0];
        f30988w = iArr;
        f30989x = new C3254gL(iArr, 0, false);
    }

    public C3254gL(int[] iArr, int i, boolean z8) {
        super(z8);
        this.f30990u = iArr;
        this.f30991v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i4 = this.f30991v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i9 = i + 1;
        int[] iArr = this.f30990u;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i, iArr, i9, i4 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f30990u, 0, iArr2, 0, i);
            System.arraycopy(this.f30990u, i, iArr2, i9, this.f30991v - i);
            this.f30990u = iArr2;
        }
        this.f30990u[i] = intValue;
        this.f30991v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof C3254gL)) {
            return super.addAll(collection);
        }
        C3254gL c3254gL = (C3254gL) collection;
        int i = c3254gL.f30991v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f30991v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i4 + i;
        int[] iArr = this.f30990u;
        if (i9 > iArr.length) {
            this.f30990u = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c3254gL.f30990u, 0, this.f30990u, this.f30991v, c3254gL.f30991v);
        this.f30991v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630nL
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C3254gL A(int i) {
        if (i >= this.f30991v) {
            return new C3254gL(i == 0 ? f30988w : Arrays.copyOf(this.f30990u, i), this.f30991v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        f(i);
        return this.f30990u[i];
    }

    public final void e(int i) {
        a();
        int i4 = this.f30991v;
        int length = this.f30990u.length;
        if (i4 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f30990u, 0, iArr, 0, this.f30991v);
            this.f30990u = iArr;
        }
        int[] iArr2 = this.f30990u;
        int i9 = this.f30991v;
        this.f30991v = i9 + 1;
        iArr2[i9] = i;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254gL)) {
            return super.equals(obj);
        }
        C3254gL c3254gL = (C3254gL) obj;
        if (this.f30991v != c3254gL.f30991v) {
            return false;
        }
        int[] iArr = c3254gL.f30990u;
        for (int i = 0; i < this.f30991v; i++) {
            if (this.f30990u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f30991v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i4 = this.f30991v;
        return D.y.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.f30990u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f30991v; i4++) {
            i = (i * 31) + this.f30990u[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f30991v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f30990u[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.f30990u;
        int i4 = iArr[i];
        if (i < this.f30991v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f30991v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f30990u;
        System.arraycopy(iArr, i4, iArr, i, this.f30991v - i4);
        this.f30991v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.f30990u;
        int i4 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30991v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
