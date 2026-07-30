package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzeq extends zzdq implements RandomAccess, zzgd {
    private static final zzeq zza;
    private float[] zzb;
    private int zzc;

    static {
        zzeq zzeqVar = new zzeq(new float[0], 0);
        zza = zzeqVar;
        zzeqVar.zzb();
    }

    zzeq() {
        this(new float[10], 0);
    }

    private final String zzf(int i8) {
        return "Index:" + i8 + ", Size:" + this.zzc;
    }

    private final void zzg(int i8) {
        if (i8 < 0 || i8 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i8 < 0 || i8 > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        float[] fArr = this.zzb;
        if (i9 < fArr.length) {
            System.arraycopy(fArr, i8, fArr, i8 + 1, i9 - i8);
        } else {
            float[] fArr2 = new float[((i9 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            System.arraycopy(this.zzb, i8, fArr2, i8 + 1, this.zzc - i8);
            this.zzb = fArr2;
        }
        this.zzb[i8] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzeq)) {
            return super.addAll(collection);
        }
        zzeq zzeqVar = (zzeq) collection;
        int i8 = zzeqVar.zzc;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.zzc;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        float[] fArr = this.zzb;
        if (i10 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i10);
        }
        System.arraycopy(zzeqVar.zzb, 0, this.zzb, this.zzc, zzeqVar.zzc);
        this.zzc = i10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeq)) {
            return super.equals(obj);
        }
        zzeq zzeqVar = (zzeq) obj;
        if (this.zzc != zzeqVar.zzc) {
            return false;
        }
        float[] fArr = zzeqVar.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (Float.floatToIntBits(this.zzb[i8]) != Float.floatToIntBits(fArr[i8])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Float.valueOf(this.zzb[i8]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            i8 = (i8 * 31) + Float.floatToIntBits(this.zzb[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i8 = this.zzc;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.zzb[i9] == floatValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzg(i8);
        float[] fArr = this.zzb;
        float f8 = fArr[i8];
        if (i8 < this.zzc - 1) {
            System.arraycopy(fArr, i8 + 1, fArr, i8, (r2 - i8) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        zza();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i9, fArr, i8, this.zzc - i9);
        this.zzc -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i8);
        float[] fArr = this.zzb;
        float f8 = fArr[i8];
        fArr[i8] = floatValue;
        return Float.valueOf(f8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzeq(Arrays.copyOf(this.zzb, i8), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f8) {
        zza();
        int i8 = this.zzc;
        float[] fArr = this.zzb;
        if (i8 == fArr.length) {
            float[] fArr2 = new float[((i8 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i8);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        fArr3[i9] = f8;
    }

    private zzeq(float[] fArr, int i8) {
        this.zzb = fArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
