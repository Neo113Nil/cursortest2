package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355x0 extends AbstractC0323i0 implements RandomAccess, InterfaceC0359z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6029d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0355x0 f6030e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f6031b;

    /* renamed from: c, reason: collision with root package name */
    public int f6032c;

    static {
        int[] iArr = new int[0];
        f6029d = iArr;
        f6030e = new C0355x0(iArr, 0, false);
    }

    public C0355x0(int[] iArr, int i4, boolean z) {
        super(z);
        this.f6031b = iArr;
        this.f6032c = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.A0
    public final /* bridge */ /* synthetic */ A0 a(int i4) {
        if (i4 >= this.f6032c) {
            return new C0355x0(i4 == 0 ? f6029d : Arrays.copyOf(this.f6031b, i4), this.f6032c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i4 < 0 || i4 > (i5 = this.f6032c)) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, this.f6032c, "Index:", ", Size:"));
        }
        int i6 = i4 + 1;
        int[] iArr = this.f6031b;
        int length = iArr.length;
        if (i5 < length) {
            System.arraycopy(iArr, i4, iArr, i6, i5 - i4);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6031b, 0, iArr2, 0, i4);
            System.arraycopy(this.f6031b, i4, iArr2, i6, this.f6032c - i4);
            this.f6031b = iArr2;
        }
        this.f6031b[i4] = intValue;
        this.f6032c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0323i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = B0.f5803a;
        collection.getClass();
        if (!(collection instanceof C0355x0)) {
            return super.addAll(collection);
        }
        C0355x0 c0355x0 = (C0355x0) collection;
        int i4 = c0355x0.f6032c;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f6032c;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.f6031b;
        if (i6 > iArr.length) {
            this.f6031b = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(c0355x0.f6031b, 0, this.f6031b, this.f6032c, c0355x0.f6032c);
        this.f6032c = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i4) {
        e(i4);
        return this.f6031b[i4];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i4) {
        b();
        int i5 = this.f6032c;
        int length = this.f6031b.length;
        if (i5 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6031b, 0, iArr, 0, this.f6032c);
            this.f6031b = iArr;
        }
        int[] iArr2 = this.f6031b;
        int i6 = this.f6032c;
        this.f6032c = i6 + 1;
        iArr2[i6] = i4;
    }

    public final void e(int i4) {
        if (i4 < 0 || i4 >= this.f6032c) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, this.f6032c, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0323i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0355x0)) {
            return super.equals(obj);
        }
        C0355x0 c0355x0 = (C0355x0) obj;
        if (this.f6032c != c0355x0.f6032c) {
            return false;
        }
        int[] iArr = c0355x0.f6031b;
        for (int i4 = 0; i4 < this.f6032c; i4++) {
            if (this.f6031b[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        e(i4);
        return Integer.valueOf(this.f6031b[i4]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0323i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f6032c; i5++) {
            i4 = (i4 * 31) + this.f6031b[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.f6032c;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f6031b[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0323i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        b();
        e(i4);
        int[] iArr = this.f6031b;
        int i5 = iArr[i4];
        if (i4 < this.f6032c - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f6032c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        b();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6031b;
        System.arraycopy(iArr, i5, iArr, i4, this.f6032c - i5);
        this.f6032c -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        e(i4);
        int[] iArr = this.f6031b;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6032c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
