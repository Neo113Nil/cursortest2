package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzof {
    private static final zzof zza = new zzof(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzof(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i4;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public static zzof zzc() {
        return zza;
    }

    static zzof zze(zzof zzofVar, zzof zzofVar2) {
        int i4 = zzofVar.zzb + zzofVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzofVar.zzc, i4);
        System.arraycopy(zzofVar2.zzc, 0, copyOf, zzofVar.zzb, zzofVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzofVar.zzd, i4);
        System.arraycopy(zzofVar2.zzd, 0, copyOf2, zzofVar.zzb, zzofVar2.zzb);
        return new zzof(i4, copyOf, copyOf2, true);
    }

    static zzof zzf() {
        return new zzof(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i4) {
        int[] iArr = this.zzc;
        if (i4 > iArr.length) {
            int i5 = this.zzb;
            int i6 = i5 + (i5 / 2);
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i4);
            this.zzd = Arrays.copyOf(this.zzd, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzof)) {
            return false;
        }
        zzof zzofVar = (zzof) obj;
        int i4 = this.zzb;
        if (i4 == zzofVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzofVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzofVar.zzd;
                    int i6 = this.zzb;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        int i5 = i4 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.zzd;
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final int zza() {
        int zzz;
        int zzA;
        int i4;
        int i5 = this.zze;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            int i8 = this.zzc[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.zzd[i7]).getClass();
                    i4 = zzlk.zzz(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int i11 = i9 << 3;
                    zzld zzldVar = (zzld) this.zzd[i7];
                    int zzz2 = zzlk.zzz(i11);
                    int zzd = zzldVar.zzd();
                    i4 = zzz2 + zzlk.zzz(zzd) + zzd;
                } else if (i10 == 3) {
                    int zzz3 = zzlk.zzz(i9 << 3);
                    zzz = zzz3 + zzz3;
                    zzA = ((zzof) this.zzd[i7]).zza();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i7]).getClass();
                    i4 = zzlk.zzz(i9 << 3) + 4;
                }
                i6 += i4;
            } else {
                int i12 = i9 << 3;
                long longValue = ((Long) this.zzd[i7]).longValue();
                zzz = zzlk.zzz(i12);
                zzA = zzlk.zzA(longValue);
            }
            i4 = zzz + zzA;
            i6 += i4;
        }
        this.zze = i6;
        return i6;
    }

    public final int zzb() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6] >>> 3;
            zzld zzldVar = (zzld) this.zzd[i6];
            int zzz = zzlk.zzz(8);
            int zzz2 = zzlk.zzz(16) + zzlk.zzz(i7);
            int zzz3 = zzlk.zzz(24);
            int zzd = zzldVar.zzd();
            i5 += zzz + zzz + zzz2 + zzz3 + zzlk.zzz(zzd) + zzd;
        }
        this.zze = i5;
        return i5;
    }

    final zzof zzd(zzof zzofVar) {
        if (zzofVar.equals(zza)) {
            return this;
        }
        zzg();
        int i4 = this.zzb + zzofVar.zzb;
        zzm(i4);
        System.arraycopy(zzofVar.zzc, 0, this.zzc, this.zzb, zzofVar.zzb);
        System.arraycopy(zzofVar.zzd, 0, this.zzd, this.zzb, zzofVar.zzb);
        this.zzb = i4;
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

    final void zzi(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zznj.zzb(sb, i4, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    final void zzj(int i4, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i4;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    final void zzk(zzor zzorVar) {
        for (int i4 = 0; i4 < this.zzb; i4++) {
            zzorVar.zzw(this.zzc[i4] >>> 3, this.zzd[i4]);
        }
    }

    public final void zzl(zzor zzorVar) {
        if (this.zzb != 0) {
            for (int i4 = 0; i4 < this.zzb; i4++) {
                int i5 = this.zzc[i4];
                Object obj = this.zzd[i4];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    zzorVar.zzt(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    zzorVar.zzm(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    zzorVar.zzd(i7, (zzld) obj);
                } else if (i6 == 3) {
                    zzorVar.zzF(i7);
                    ((zzof) obj).zzl(zzorVar);
                    zzorVar.zzh(i7);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzml("Protocol message tag had invalid wire type."));
                    }
                    zzorVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzof() {
        this(0, new int[8], new Object[8], true);
    }
}
