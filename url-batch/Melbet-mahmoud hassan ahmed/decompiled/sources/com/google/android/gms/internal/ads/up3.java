package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class up3 extends co3<Float> implements RandomAccess, sr3 {

    /* renamed from: i, reason: collision with root package name */
    private static final up3 f12906i;

    /* renamed from: g, reason: collision with root package name */
    private float[] f12907g;

    /* renamed from: h, reason: collision with root package name */
    private int f12908h;

    static {
        up3 up3Var = new up3(new float[0], 0);
        f12906i = up3Var;
        up3Var.a();
    }

    up3() {
        this(new float[10], 0);
    }

    private up3(float[] fArr, int i7) {
        this.f12907g = fArr;
        this.f12908h = i7;
    }

    private final String k(int i7) {
        int i8 = this.f12908h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f12908h) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        float floatValue = ((Float) obj).floatValue();
        i();
        if (i7 < 0 || i7 > (i8 = this.f12908h)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        float[] fArr = this.f12907g;
        if (i8 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i7 + 1, i8 - i7);
        } else {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            System.arraycopy(this.f12907g, i7, fArr2, i7 + 1, this.f12908h - i7);
            this.f12907g = fArr2;
        }
        this.f12907g[i7] = floatValue;
        this.f12908h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        i();
        kq3.e(collection);
        if (!(collection instanceof up3)) {
            return super.addAll(collection);
        }
        up3 up3Var = (up3) collection;
        int i7 = up3Var.f12908h;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f12908h;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        float[] fArr = this.f12907g;
        if (i9 > fArr.length) {
            this.f12907g = Arrays.copyOf(fArr, i9);
        }
        System.arraycopy(up3Var.f12907g, 0, this.f12907g, this.f12908h, up3Var.f12908h);
        this.f12908h = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    public final /* bridge */ /* synthetic */ jq3 e(int i7) {
        if (i7 >= this.f12908h) {
            return new up3(Arrays.copyOf(this.f12907g, i7), this.f12908h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up3)) {
            return super.equals(obj);
        }
        up3 up3Var = (up3) obj;
        if (this.f12908h != up3Var.f12908h) {
            return false;
        }
        float[] fArr = up3Var.f12907g;
        for (int i7 = 0; i7 < this.f12908h; i7++) {
            if (Float.floatToIntBits(this.f12907g[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        l(i7);
        return Float.valueOf(this.f12907g[i7]);
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f12908h; i8++) {
            i7 = (i7 * 31) + Float.floatToIntBits(this.f12907g[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i7 = this.f12908h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f12907g[i8] == floatValue) {
                return i8;
            }
        }
        return -1;
    }

    public final void j(float f7) {
        i();
        int i7 = this.f12908h;
        float[] fArr = this.f12907g;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[((i7 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.f12907g = fArr2;
        }
        float[] fArr3 = this.f12907g;
        int i8 = this.f12908h;
        this.f12908h = i8 + 1;
        fArr3[i8] = f7;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        l(i7);
        float[] fArr = this.f12907g;
        float f7 = fArr[i7];
        if (i7 < this.f12908h - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (r2 - i7) - 1);
        }
        this.f12908h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        i();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f12907g;
        System.arraycopy(fArr, i8, fArr, i7, this.f12908h - i8);
        this.f12908h -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        i();
        l(i7);
        float[] fArr = this.f12907g;
        float f7 = fArr[i7];
        fArr[i7] = floatValue;
        return Float.valueOf(f7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12908h;
    }
}
