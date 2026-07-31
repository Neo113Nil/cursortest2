package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class ur3<E> extends co3<E> implements RandomAccess {

    /* renamed from: i, reason: collision with root package name */
    private static final ur3<Object> f12955i;

    /* renamed from: g, reason: collision with root package name */
    private E[] f12956g;

    /* renamed from: h, reason: collision with root package name */
    private int f12957h;

    static {
        ur3<Object> ur3Var = new ur3<>(new Object[0], 0);
        f12955i = ur3Var;
        ur3Var.a();
    }

    private ur3(E[] eArr, int i7) {
        this.f12956g = eArr;
        this.f12957h = i7;
    }

    public static <E> ur3<E> j() {
        return (ur3<E>) f12955i;
    }

    private final String k(int i7) {
        int i8 = this.f12957h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f12957h) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, E e7) {
        int i8;
        i();
        if (i7 < 0 || i7 > (i8 = this.f12957h)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        E[] eArr = this.f12956g;
        if (i8 < eArr.length) {
            System.arraycopy(eArr, i7, eArr, i7 + 1, i8 - i7);
        } else {
            E[] eArr2 = (E[]) new Object[((i8 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i7);
            System.arraycopy(this.f12956g, i7, eArr2, i7 + 1, this.f12957h - i7);
            this.f12956g = eArr2;
        }
        this.f12956g[i7] = e7;
        this.f12957h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        i();
        int i7 = this.f12957h;
        E[] eArr = this.f12956g;
        if (i7 == eArr.length) {
            this.f12956g = (E[]) Arrays.copyOf(eArr, ((i7 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12956g;
        int i8 = this.f12957h;
        this.f12957h = i8 + 1;
        eArr2[i8] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    public final /* bridge */ /* synthetic */ jq3 e(int i7) {
        if (i7 >= this.f12957h) {
            return new ur3(Arrays.copyOf(this.f12956g, i7), this.f12957h);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        l(i7);
        return this.f12956g[i7];
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final E remove(int i7) {
        i();
        l(i7);
        E[] eArr = this.f12956g;
        E e7 = eArr[i7];
        if (i7 < this.f12957h - 1) {
            System.arraycopy(eArr, i7 + 1, eArr, i7, (r2 - i7) - 1);
        }
        this.f12957h--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i7, E e7) {
        i();
        l(i7);
        E[] eArr = this.f12956g;
        E e8 = eArr[i7];
        eArr[i7] = e7;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12957h;
    }
}
