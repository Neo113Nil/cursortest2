package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgzh {
    private static final zzgzh zza = new zzgzh(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgzh() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgzh(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgzh zzc() {
        return zza;
    }

    static zzgzh zze(zzgzh zzgzhVar, zzgzh zzgzhVar2) {
        int i = zzgzhVar.zzb + zzgzhVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgzhVar.zzc, i);
        System.arraycopy(zzgzhVar2.zzc, 0, copyOf, zzgzhVar.zzb, zzgzhVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgzhVar.zzd, i);
        System.arraycopy(zzgzhVar2.zzd, 0, copyOf2, zzgzhVar.zzb, zzgzhVar2.zzb);
        return new zzgzh(i, copyOf, copyOf2, true);
    }

    static zzgzh zzf() {
        return new zzgzh(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgzh)) {
            return false;
        }
        zzgzh zzgzhVar = (zzgzh) obj;
        int i = this.zzb;
        if (i == zzgzhVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzhVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzhVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzB;
        int zzA;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzgvt.zzA(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzgve zzgveVar = (zzgve) this.zzd[i4];
                    int i9 = zzgvt.zzf;
                    int zzd = zzgveVar.zzd();
                    i = zzgvt.zzA(i8) + zzgvt.zzA(zzd) + zzd;
                } else if (i7 == 3) {
                    int i10 = i6 << 3;
                    int i11 = zzgvt.zzf;
                    zzB = ((zzgzh) this.zzd[i4]).zza();
                    int zzA2 = zzgvt.zzA(i10);
                    zzA = zzA2 + zzA2;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzgwy.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzgvt.zzA(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i12 = i6 << 3;
                zzB = zzgvt.zzB(((Long) this.zzd[i4]).longValue());
                zzA = zzgvt.zzA(i12);
            }
            i = zzA + zzB;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzgve zzgveVar = (zzgve) this.zzd[i3];
            int i5 = zzgvt.zzf;
            int zzd = zzgveVar.zzd();
            int zzA = zzgvt.zzA(zzd) + zzd;
            int zzA2 = zzgvt.zzA(16);
            int zzA3 = zzgvt.zzA(i4);
            int zzA4 = zzgvt.zzA(8);
            i2 += zzA4 + zzA4 + zzA2 + zzA3 + zzgvt.zzA(24) + zzA;
        }
        this.zze = i2;
        return i2;
    }

    final zzgzh zzd(zzgzh zzgzhVar) {
        if (zzgzhVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgzhVar.zzb;
        zzl(i);
        System.arraycopy(zzgzhVar.zzc, 0, this.zzc, this.zzb, zzgzhVar.zzb);
        System.arraycopy(zzgzhVar.zzd, 0, this.zzd, this.zzb, zzgzhVar.zzb);
        this.zzb = i;
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

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgxy.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgvu zzgvuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzgvuVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzgvuVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzgvuVar.zzd(i4, (zzgve) obj);
                } else if (i3 == 3) {
                    zzgvuVar.zzE(i4);
                    ((zzgzh) obj).zzk(zzgvuVar);
                    zzgvuVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzgwy.zza());
                    }
                    zzgvuVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
