package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Q0 extends AbstractC0323i0 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f5900d;

    /* renamed from: e, reason: collision with root package name */
    public static final Q0 f5901e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5902b;

    /* renamed from: c, reason: collision with root package name */
    public int f5903c;

    static {
        Object[] objArr = new Object[0];
        f5900d = objArr;
        f5901e = new Q0(objArr, 0, false);
    }

    public Q0(Object[] objArr, int i4, boolean z) {
        super(z);
        this.f5902b = objArr;
        this.f5903c = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.A0
    public final /* bridge */ /* synthetic */ A0 a(int i4) {
        if (i4 >= this.f5903c) {
            return new Q0(i4 == 0 ? f5900d : Arrays.copyOf(this.f5902b, i4), this.f5903c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        b();
        if (i4 < 0 || i4 > (i5 = this.f5903c)) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, this.f5903c, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        Object[] objArr = this.f5902b;
        int length = objArr.length;
        if (i5 < length) {
            System.arraycopy(objArr, i4, objArr, i6, i5 - i4);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5902b, 0, objArr2, 0, i4);
            System.arraycopy(this.f5902b, i4, objArr2, i6, this.f5903c - i4);
            this.f5902b = objArr2;
        }
        this.f5902b[i4] = obj;
        this.f5903c++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i4) {
        if (i4 < 0 || i4 >= this.f5903c) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, this.f5903c, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        c(i4);
        return this.f5902b[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0323i0, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        b();
        c(i4);
        Object[] objArr = this.f5902b;
        Object obj = objArr[i4];
        if (i4 < this.f5903c - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f5903c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        b();
        c(i4);
        Object[] objArr = this.f5902b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5903c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i4 = this.f5903c;
        int length = this.f5902b.length;
        if (i4 == length) {
            this.f5902b = Arrays.copyOf(this.f5902b, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f5902b;
        int i5 = this.f5903c;
        this.f5903c = i5 + 1;
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
