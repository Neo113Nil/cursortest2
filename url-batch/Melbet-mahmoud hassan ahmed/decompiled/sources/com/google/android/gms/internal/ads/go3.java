package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class go3 extends co3<Boolean> implements RandomAccess, sr3 {

    /* renamed from: i, reason: collision with root package name */
    private static final go3 f5703i;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f5704g;

    /* renamed from: h, reason: collision with root package name */
    private int f5705h;

    static {
        go3 go3Var = new go3(new boolean[0], 0);
        f5703i = go3Var;
        go3Var.a();
    }

    go3() {
        this(new boolean[10], 0);
    }

    private go3(boolean[] zArr, int i7) {
        this.f5704g = zArr;
        this.f5705h = i7;
    }

    private final String k(int i7) {
        int i8 = this.f5705h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    private final void l(int i7) {
        if (i7 < 0 || i7 >= this.f5705h) {
            throw new IndexOutOfBoundsException(k(i7));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        if (i7 < 0 || i7 > (i8 = this.f5705h)) {
            throw new IndexOutOfBoundsException(k(i7));
        }
        boolean[] zArr = this.f5704g;
        if (i8 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            System.arraycopy(this.f5704g, i7, zArr2, i7 + 1, this.f5705h - i7);
            this.f5704g = zArr2;
        }
        this.f5704g[i7] = booleanValue;
        this.f5705h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        i();
        kq3.e(collection);
        if (!(collection instanceof go3)) {
            return super.addAll(collection);
        }
        go3 go3Var = (go3) collection;
        int i7 = go3Var.f5705h;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.f5705h;
        if (Integer.MAX_VALUE - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.f5704g;
        if (i9 > zArr.length) {
            this.f5704g = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(go3Var.f5704g, 0, this.f5704g, this.f5705h, go3Var.f5705h);
        this.f5705h = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.jq3
    public final /* bridge */ /* synthetic */ jq3 e(int i7) {
        if (i7 >= this.f5705h) {
            return new go3(Arrays.copyOf(this.f5704g, i7), this.f5705h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go3)) {
            return super.equals(obj);
        }
        go3 go3Var = (go3) obj;
        if (this.f5705h != go3Var.f5705h) {
            return false;
        }
        boolean[] zArr = go3Var.f5704g;
        for (int i7 = 0; i7 < this.f5705h; i7++) {
            if (this.f5704g[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        l(i7);
        return Boolean.valueOf(this.f5704g[i7]);
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f5705h; i8++) {
            i7 = (i7 * 31) + kq3.a(this.f5704g[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.f5705h;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f5704g[i8] == booleanValue) {
                return i8;
            }
        }
        return -1;
    }

    public final void j(boolean z6) {
        i();
        int i7 = this.f5705h;
        boolean[] zArr = this.f5704g;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[((i7 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.f5704g = zArr2;
        }
        boolean[] zArr3 = this.f5704g;
        int i8 = this.f5705h;
        this.f5705h = i8 + 1;
        zArr3[i8] = z6;
    }

    @Override // com.google.android.gms.internal.ads.co3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        i();
        l(i7);
        boolean[] zArr = this.f5704g;
        boolean z6 = zArr[i7];
        if (i7 < this.f5705h - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.f5705h--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        i();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f5704g;
        System.arraycopy(zArr, i8, zArr, i7, this.f5705h - i8);
        this.f5705h -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        l(i7);
        boolean[] zArr = this.f5704g;
        boolean z6 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5705h;
    }
}
