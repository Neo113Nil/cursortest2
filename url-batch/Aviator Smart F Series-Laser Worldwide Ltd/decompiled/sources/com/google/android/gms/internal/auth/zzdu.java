package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzdu extends zzdq implements RandomAccess, zzgd {
    private static final zzdu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzdu zzduVar = new zzdu(new boolean[0], 0);
        zza = zzduVar;
        zzduVar.zzb();
    }

    zzdu() {
        this(new boolean[10], 0);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i8 < 0 || i8 > (i9 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i8));
        }
        boolean[] zArr = this.zzb;
        if (i9 < zArr.length) {
            System.arraycopy(zArr, i8, zArr, i8 + 1, i9 - i8);
        } else {
            boolean[] zArr2 = new boolean[((i9 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            System.arraycopy(this.zzb, i8, zArr2, i8 + 1, this.zzc - i8);
            this.zzb = zArr2;
        }
        this.zzb[i8] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzdu)) {
            return super.addAll(collection);
        }
        zzdu zzduVar = (zzdu) collection;
        int i8 = zzduVar.zzc;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.zzc;
        if (Integer.MAX_VALUE - i9 < i8) {
            throw new OutOfMemoryError();
        }
        int i10 = i9 + i8;
        boolean[] zArr = this.zzb;
        if (i10 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i10);
        }
        System.arraycopy(zzduVar.zzb, 0, this.zzb, this.zzc, zzduVar.zzc);
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
        if (!(obj instanceof zzdu)) {
            return super.equals(obj);
        }
        zzdu zzduVar = (zzdu) obj;
        if (this.zzc != zzduVar.zzc) {
            return false;
        }
        boolean[] zArr = zzduVar.zzb;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            if (this.zzb[i8] != zArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        zzg(i8);
        return Boolean.valueOf(this.zzb[i8]);
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.zzc; i9++) {
            i8 = (i8 * 31) + zzez.zza(this.zzb[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i8 = this.zzc;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.zzb[i9] == booleanValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        zza();
        zzg(i8);
        boolean[] zArr = this.zzb;
        boolean z7 = zArr[i8];
        if (i8 < this.zzc - 1) {
            System.arraycopy(zArr, i8 + 1, zArr, i8, (r2 - i8) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        zza();
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i9, zArr, i8, this.zzc - i9);
        this.zzc -= i9 - i8;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i8);
        boolean[] zArr = this.zzb;
        boolean z7 = zArr[i8];
        zArr[i8] = booleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int i8) {
        if (i8 >= this.zzc) {
            return new zzdu(Arrays.copyOf(this.zzb, i8), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z7) {
        zza();
        int i8 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i8 == zArr.length) {
            boolean[] zArr2 = new boolean[((i8 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i8);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        zArr3[i9] = z7;
    }

    private zzdu(boolean[] zArr, int i8) {
        this.zzb = zArr;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
