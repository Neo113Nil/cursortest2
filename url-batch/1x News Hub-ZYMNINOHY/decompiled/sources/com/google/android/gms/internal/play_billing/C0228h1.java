package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228h1 extends T0 implements RandomAccess, InterfaceC0234j1, InterfaceC0281z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2868d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0228h1 f2869e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2870b;

    /* renamed from: c, reason: collision with root package name */
    public int f2871c;

    static {
        int[] iArr = new int[0];
        f2868d = iArr;
        f2869e = new C0228h1(iArr, 0, false);
    }

    public C0228h1(int[] iArr, int i3, boolean z) {
        super(z);
        this.f2870b = iArr;
        this.f2871c = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0237k1
    public final /* bridge */ /* synthetic */ InterfaceC0237k1 a(int i3) {
        if (i3 >= this.f2871c) {
            return new C0228h1(i3 == 0 ? f2868d : Arrays.copyOf(this.f2870b, i3), this.f2871c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i3 < 0 || i3 > (i4 = this.f2871c)) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, this.f2871c, "Index:", ", Size:"));
        }
        int i5 = i3 + 1;
        int[] iArr = this.f2870b;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i3, iArr, i5, i4 - i3);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2870b, 0, iArr2, 0, i3);
            System.arraycopy(this.f2870b, i3, iArr2, i5, this.f2871c - i3);
            this.f2870b = iArr2;
        }
        this.f2870b[i3] = intValue;
        this.f2871c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0240l1.f2880a;
        collection.getClass();
        if (!(collection instanceof C0228h1)) {
            return super.addAll(collection);
        }
        C0228h1 c0228h1 = (C0228h1) collection;
        int i3 = c0228h1.f2871c;
        if (i3 == 0) {
            return false;
        }
        int i4 = this.f2871c;
        if (Integer.MAX_VALUE - i4 < i3) {
            throw new OutOfMemoryError();
        }
        int i5 = i4 + i3;
        int[] iArr = this.f2870b;
        if (i5 > iArr.length) {
            this.f2870b = Arrays.copyOf(iArr, i5);
        }
        System.arraycopy(c0228h1.f2870b, 0, this.f2870b, this.f2871c, c0228h1.f2871c);
        this.f2871c = i5;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i3) {
        e(i3);
        return this.f2870b[i3];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3) {
        b();
        int i4 = this.f2871c;
        int length = this.f2870b.length;
        if (i4 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f2870b, 0, iArr, 0, this.f2871c);
            this.f2870b = iArr;
        }
        int[] iArr2 = this.f2870b;
        int i5 = this.f2871c;
        this.f2871c = i5 + 1;
        iArr2[i5] = i3;
    }

    public final void e(int i3) {
        if (i3 < 0 || i3 >= this.f2871c) {
            throw new IndexOutOfBoundsException(AbstractC0033i.g(i3, this.f2871c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0228h1)) {
            return super.equals(obj);
        }
        C0228h1 c0228h1 = (C0228h1) obj;
        if (this.f2871c != c0228h1.f2871c) {
            return false;
        }
        int[] iArr = c0228h1.f2870b;
        for (int i3 = 0; i3 < this.f2871c; i3++) {
            if (this.f2870b[i3] != iArr[i3]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i3) {
        e(i3);
        return Integer.valueOf(this.f2870b[i3]);
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i3 = 1;
        for (int i4 = 0; i4 < this.f2871c; i4++) {
            i3 = (i3 * 31) + this.f2870b[i4];
        }
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i3 = this.f2871c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f2870b[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.T0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i3) {
        b();
        e(i3);
        int[] iArr = this.f2870b;
        int i4 = iArr[i3];
        if (i3 < this.f2871c - 1) {
            System.arraycopy(iArr, i3 + 1, iArr, i3, (r2 - i3) - 1);
        }
        this.f2871c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        b();
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2870b;
        System.arraycopy(iArr, i4, iArr, i3, this.f2871c - i4);
        this.f2871c -= i4 - i3;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i3);
        int[] iArr = this.f2870b;
        int i4 = iArr[i3];
        iArr[i3] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2871c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
