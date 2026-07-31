package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class jp3 extends co3<Double> implements RandomAccess, sr3 {

    /* renamed from: i, reason: collision with root package name */
    private static final jp3 f7207i;

    /* renamed from: g, reason: collision with root package name */
    private double[] f7208g;

    /* renamed from: h, reason: collision with root package name */
    private int f7209h;

    static {
        jp3 jp3Var = new jp3(new double[0], 0);
        f7207i = jp3Var;
        jp3Var.a();
    }

    jp3() {
        this(new double[10], 0);
    }

    private jp3(double[] dArr, int i7) {
        this.f7208g = dArr;
        this.f7209h = i7;
    }

    private final String k(int i7) {
        int i8 = this.f7209h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f7209h) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        i();
        if (i7 < 0 || i7 > (i8 = this.f7209h)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        double[] dArr = this.f7208g;
        if (i8 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i8 - i7);
        } else {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            System.arraycopy(this.f7208g, i7, dArr2, i7 + 1, this.f7209h - i7);
            this.f7208g = dArr2;
        }
        this.f7208g[i7] = doubleValue;
        this.f7209h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        i();
        kq3.e(collection);
        if (!(collection instanceof jp3)) {
            return super.addAll(collection);
        }
        jp3 jp3Var = (jp3) collection;
        int i7 = jp3Var.f7209h;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f7209h;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.f7208g;
        if (i9 > dArr.length) {
            this.f7208g = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(jp3Var.f7208g, 0, this.f7208g, this.f7209h, jp3Var.f7209h);
        this.f7209h = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    public final /* bridge */ /* synthetic */ jq3 e(int i7) {
        if (i7 >= this.f7209h) {
            return new jp3(Arrays.copyOf(this.f7208g, i7), this.f7209h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp3)) {
            return super.equals(obj);
        }
        jp3 jp3Var = (jp3) obj;
        if (this.f7209h != jp3Var.f7209h) {
            return false;
        }
        double[] dArr = jp3Var.f7208g;
        for (int i7 = 0; i7 < this.f7209h; i7++) {
            if (Double.doubleToLongBits(this.f7208g[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        l(i7);
        return Double.valueOf(this.f7208g[i7]);
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f7209h; i8++) {
            i7 = (i7 * 31) + kq3.c(Double.doubleToLongBits(this.f7208g[i8]));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i7 = this.f7209h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f7208g[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    public final void j(double d7) {
        i();
        int i7 = this.f7209h;
        double[] dArr = this.f7208g;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[((i7 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.f7208g = dArr2;
        }
        double[] dArr3 = this.f7208g;
        int i8 = this.f7209h;
        this.f7209h = i8 + 1;
        dArr3[i8] = d7;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        l(i7);
        double[] dArr = this.f7208g;
        double d7 = dArr[i7];
        if (i7 < this.f7209h - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.f7209h--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        i();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f7208g;
        System.arraycopy(dArr, i8, dArr, i7, this.f7209h - i8);
        this.f7209h -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        i();
        l(i7);
        double[] dArr = this.f7208g;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7209h;
    }
}
