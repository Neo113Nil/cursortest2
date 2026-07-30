package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.vL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4061vL extends JK implements RandomAccess, InterfaceC3576mL, HL {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f34754w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4061vL f34755x;

    /* renamed from: u, reason: collision with root package name */
    public long[] f34756u;

    /* renamed from: v, reason: collision with root package name */
    public int f34757v;

    static {
        long[] jArr = new long[0];
        f34754w = jArr;
        f34755x = new C4061vL(jArr, 0, false);
    }

    public C4061vL(long[] jArr, int i, boolean z8) {
        super(z8);
        this.f34756u = jArr;
        this.f34757v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i4 = this.f34757v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i9 = i + 1;
        long[] jArr = this.f34756u;
        int length = jArr.length;
        if (i4 < length) {
            System.arraycopy(jArr, i, jArr, i9, i4 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f34756u, 0, jArr2, 0, i);
            System.arraycopy(this.f34756u, i, jArr2, i9, this.f34757v - i);
            this.f34756u = jArr2;
        }
        this.f34756u[i] = longValue;
        this.f34757v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof C4061vL)) {
            return super.addAll(collection);
        }
        C4061vL c4061vL = (C4061vL) collection;
        int i = c4061vL.f34757v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f34757v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i4 + i;
        long[] jArr = this.f34756u;
        if (i9 > jArr.length) {
            this.f34756u = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(c4061vL.f34756u, 0, this.f34756u, this.f34757v, c4061vL.f34757v);
        this.f34757v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        f(i);
        return this.f34756u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j9) {
        a();
        int i = this.f34757v;
        int length = this.f34756u.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f34756u, 0, jArr, 0, this.f34757v);
            this.f34756u = jArr;
        }
        long[] jArr2 = this.f34756u;
        int i4 = this.f34757v;
        this.f34757v = i4 + 1;
        jArr2[i4] = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3630nL
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C4061vL A(int i) {
        if (i >= this.f34757v) {
            return new C4061vL(i == 0 ? f34754w : Arrays.copyOf(this.f34756u, i), this.f34757v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4061vL)) {
            return super.equals(obj);
        }
        C4061vL c4061vL = (C4061vL) obj;
        if (this.f34757v != c4061vL.f34757v) {
            return false;
        }
        long[] jArr = c4061vL.f34756u;
        for (int i = 0; i < this.f34757v; i++) {
            if (this.f34756u[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f34757v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i4 = this.f34757v;
        return D.y.n(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Long.valueOf(this.f34756u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f34757v; i4++) {
            long j9 = this.f34756u[i4];
            byte[] bArr = AbstractC3684oL.f33136a;
            i = (i * 31) + ((int) (j9 ^ (j9 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f34757v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f34756u[i4] == longValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.JK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        long[] jArr = this.f34756u;
        long j9 = jArr[i];
        if (i < this.f34757v - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f34757v--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f34756u;
        System.arraycopy(jArr, i4, jArr, i, this.f34757v - i4);
        this.f34757v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i);
        long[] jArr = this.f34756u;
        long j9 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34757v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
