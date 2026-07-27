package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337h1 extends T0 implements RandomAccess, InterfaceC0343j1, InterfaceC0390z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5192d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0337h1 f5193e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5194b;

    /* renamed from: c, reason: collision with root package name */
    public int f5195c;

    static {
        int[] iArr = new int[0];
        f5192d = iArr;
        f5193e = new C0337h1(iArr, 0, false);
    }

    public C0337h1(int[] iArr, int i2, boolean z) {
        super(z);
        this.f5194b = iArr;
        this.f5195c = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0346k1
    public final /* bridge */ /* synthetic */ InterfaceC0346k1 a(int i2) {
        if (i2 >= this.f5195c) {
            return new C0337h1(i2 == 0 ? f5192d : Arrays.copyOf(this.f5194b, i2), this.f5195c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i2 < 0 || i2 > (i3 = this.f5195c)) {
            throw new IndexOutOfBoundsException(B0.o.h("Index:", i2, this.f5195c, ", Size:"));
        }
        int i6 = i2 + 1;
        int[] iArr = this.f5194b;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i6, i3 - i2);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5194b, 0, iArr2, 0, i2);
            System.arraycopy(this.f5194b, i2, iArr2, i6, this.f5195c - i2);
            this.f5194b = iArr2;
        }
        this.f5194b[i2] = intValue;
        this.f5195c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0349l1.f5205a;
        collection.getClass();
        if (!(collection instanceof C0337h1)) {
            return super.addAll(collection);
        }
        C0337h1 c0337h1 = (C0337h1) collection;
        int i2 = c0337h1.f5195c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f5195c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i6 = i3 + i2;
        int[] iArr = this.f5194b;
        if (i6 > iArr.length) {
            this.f5194b = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(c0337h1.f5194b, 0, this.f5194b, this.f5195c, c0337h1.f5195c);
        this.f5195c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i2) {
        h(i2);
        return this.f5194b[i2];
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0337h1)) {
            return super.equals(obj);
        }
        C0337h1 c0337h1 = (C0337h1) obj;
        if (this.f5195c != c0337h1.f5195c) {
            return false;
        }
        int[] iArr = c0337h1.f5194b;
        for (int i2 = 0; i2 < this.f5195c; i2++) {
            if (this.f5194b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i2) {
        b();
        int i3 = this.f5195c;
        int length = this.f5194b.length;
        if (i3 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f5194b, 0, iArr, 0, this.f5195c);
            this.f5194b = iArr;
        }
        int[] iArr2 = this.f5194b;
        int i6 = this.f5195c;
        this.f5195c = i6 + 1;
        iArr2[i6] = i2;
    }

    public final void g(int i2) {
        int length = this.f5194b.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f5194b = new int[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f5194b = Arrays.copyOf(this.f5194b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        h(i2);
        return Integer.valueOf(this.f5194b[i2]);
    }

    public final void h(int i2) {
        if (i2 < 0 || i2 >= this.f5195c) {
            throw new IndexOutOfBoundsException(B0.o.h("Index:", i2, this.f5195c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f5195c; i3++) {
            i2 = (i2 * 31) + this.f5194b[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f5195c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f5194b[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        b();
        h(i2);
        int[] iArr = this.f5194b;
        int i3 = iArr[i2];
        if (i2 < this.f5195c - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f5195c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        b();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5194b;
        System.arraycopy(iArr, i3, iArr, i2, this.f5195c - i3);
        this.f5195c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        h(i2);
        int[] iArr = this.f5194b;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5195c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
