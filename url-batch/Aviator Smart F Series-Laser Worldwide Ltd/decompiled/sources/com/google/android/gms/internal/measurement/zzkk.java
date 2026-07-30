package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzkk extends zzjl implements RandomAccess, zzmp {
    private static final zzkk zza = new zzkk(new double[0], 0, false);
    private double[] zzb;
    private int zzc;

    zzkk() {
        this(new double[10], 0, true);
    }

    private final String zzf(int i8) {
        return "Index:" + i8 + ", Size:" + this.zzc;
    }

    private final void zzg(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        double doubleValue = ((Double) obj).doubleValue();
        zzbW();
        if (i8 < 0 || i8 > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        double[] dArr = this.zzb;
        if (i9 < dArr.length) {
            System.arraycopy(dArr, i8, dArr, i8 + 1, i9 - i8);
        } else {
            double[] dArr2 = new double[((i9 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            System.arraycopy(this.zzb, i8, dArr2, i8 + 1, this.zzc - i8);
            this.zzb = dArr2;
        }
        this.zzb[i8] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzkk)) {
            return super.addAll(collection);
        }
        zzkk zzkkVar = (zzkk) collection;
        int i8 = zzkkVar.zzc;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.zzc;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        double[] dArr = this.zzb;
        if (i10 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i10);
        }
        System.arraycopy(zzkkVar.zzb, 0, this.zzb, this.zzc, zzkkVar.zzc);
        this.zzc = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return super.equals(obj);
        }
        zzkk zzkkVar = (zzkk) obj;
        if (this.zzc != zzkkVar.zzc) {
            return false;
        }
        double[] dArr = zzkkVar.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (Double.doubleToLongBits(this.zzb[i8]) != Double.doubleToLongBits(dArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Double.valueOf(this.zzb[i8]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i9]);
            byte[] bArr = zzlj.zzd;
            i8 = (i8 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i8 = this.zzc;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.zzb[i9] == doubleValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zzbW();
        zzg(i8);
        double[] dArr = this.zzb;
        double d8 = dArr[i8];
        if (i8 < this.zzc - 1) {
            System.arraycopy(dArr, i8 + 1, dArr, i8, (r3 - i8) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        zzbW();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i9, dArr, i8, this.zzc - i9);
        this.zzc -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbW();
        zzg(i8);
        double[] dArr = this.zzb;
        double d8 = dArr[i8];
        dArr[i8] = doubleValue;
        return Double.valueOf(d8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzkk(Arrays.copyOf(this.zzb, i8), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d8) {
        zzbW();
        int i8 = this.zzc;
        double[] dArr = this.zzb;
        if (i8 == dArr.length) {
            double[] dArr2 = new double[((i8 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i8);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        dArr3[i9] = d8;
    }

    private zzkk(double[] dArr, int i8, boolean z7) {
        super(z7);
        this.zzb = dArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
