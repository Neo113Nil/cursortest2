package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl(int i8, int[] iArr, Object[] objArr, boolean z7) {
        this.zze = -1;
        this.zzb = i8;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z7;
    }

    public static zznl zzc() {
        return zza;
    }

    static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i8 = zznlVar.zzb + zznlVar2.zzb;
        int[] copyOf = Arrays.copyOf(zznlVar.zzc, i8);
        System.arraycopy(zznlVar2.zzc, 0, copyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zznlVar.zzd, i8);
        System.arraycopy(zznlVar2.zzd, 0, copyOf2, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i8, copyOf, copyOf2, true);
    }

    static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i8) {
        int[] iArr = this.zzc;
        if (i8 > iArr.length) {
            int i9 = this.zzb;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i8);
            this.zzd = Arrays.copyOf(this.zzd, i8);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i8 = this.zzb;
        if (i8 == zznlVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznlVar.zzc;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zznlVar.zzd;
                    int i10 = this.zzb;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (objArr[i11].equals(objArr2[i11])) {
                        }
                    }
                    return true;
                }
                if (iArr[i9] != iArr2[i9]) {
                    break;
                }
                i9++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.zzb;
        int i9 = i8 + 527;
        int[] iArr = this.zzc;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 * 31) + i11;
        Object[] objArr = this.zzd;
        int i14 = this.zzb;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return (i13 * 31) + i10;
    }

    public final int zza() {
        int zzy;
        int zzx;
        int i8;
        int i9 = this.zze;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.zzd[i11]).longValue();
                    i8 = zzki.zzx(i13 << 3) + 8;
                } else if (i14 == 2) {
                    zzka zzkaVar = (zzka) this.zzd[i11];
                    int i15 = zzki.zzb;
                    int zzd = zzkaVar.zzd();
                    i8 = zzki.zzx(i13 << 3) + zzki.zzx(zzd) + zzd;
                } else if (i14 == 3) {
                    int i16 = i13 << 3;
                    int i17 = zzki.zzb;
                    zzy = ((zznl) this.zzd[i11]).zza();
                    int zzx2 = zzki.zzx(i16);
                    zzx = zzx2 + zzx2;
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzll.zza());
                    }
                    ((Integer) this.zzd[i11]).intValue();
                    i8 = zzki.zzx(i13 << 3) + 4;
                }
                i10 += i8;
            } else {
                int i18 = i13 << 3;
                zzy = zzki.zzy(((Long) this.zzd[i11]).longValue());
                zzx = zzki.zzx(i18);
            }
            i8 = zzx + zzy;
            i10 += i8;
        }
        this.zze = i10;
        return i10;
    }

    public final int zzb() {
        int i8 = this.zze;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.zzb; i10++) {
            int i11 = this.zzc[i10] >>> 3;
            zzka zzkaVar = (zzka) this.zzd[i10];
            int i12 = zzki.zzb;
            int zzd = zzkaVar.zzd();
            int zzx = zzki.zzx(zzd) + zzd;
            int zzx2 = zzki.zzx(16);
            int zzx3 = zzki.zzx(i11);
            int zzx4 = zzki.zzx(8);
            i9 += zzx4 + zzx4 + zzx2 + zzx3 + zzki.zzx(24) + zzx;
        }
        this.zze = i9;
        return i9;
    }

    final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i8 = this.zzb + zznlVar.zzb;
        zzl(i8);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i8;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < this.zzb; i9++) {
            zzmk.zzb(sb, i8, String.valueOf(this.zzc[i9] >>> 3), this.zzd[i9]);
        }
    }

    final void zzj(int i8, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i9 = this.zzb;
        iArr[i9] = i8;
        this.zzd[i9] = obj;
        this.zzb = i9 + 1;
    }

    public final void zzk(zzoc zzocVar) {
        if (this.zzb != 0) {
            for (int i8 = 0; i8 < this.zzb; i8++) {
                int i9 = this.zzc[i8];
                Object obj = this.zzd[i8];
                int i10 = i9 & 7;
                int i11 = i9 >>> 3;
                if (i10 == 0) {
                    zzocVar.zzt(i11, ((Long) obj).longValue());
                } else if (i10 == 1) {
                    zzocVar.zzm(i11, ((Long) obj).longValue());
                } else if (i10 == 2) {
                    zzocVar.zzd(i11, (zzka) obj);
                } else if (i10 == 3) {
                    zzocVar.zzE(i11);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i11);
                } else {
                    if (i10 != 5) {
                        throw new RuntimeException(zzll.zza());
                    }
                    zzocVar.zzk(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }
}
