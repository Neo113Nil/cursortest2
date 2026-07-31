package com.google.android.gms.internal.p002firebaseauthapi;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzamy {
    private static final zzamy zza = new zzamy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamy() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzamy zzc() {
        return zza;
    }

    static zzamy zzd() {
        return new zzamy();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamy)) {
            return false;
        }
        zzamy zzamyVar = (zzamy) obj;
        int i4 = this.zzb;
        if (i4 == zzamyVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamyVar.zzc;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamyVar.zzd;
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
        int i5 = (i4 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.zzd;
        int i10 = this.zzb;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }

    public final int zza() {
        int zze;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                zze = zzajo.zze(i8, ((Long) this.zzd[i6]).longValue());
            } else if (i9 == 1) {
                zze = zzajo.zza(i8, ((Long) this.zzd[i6]).longValue());
            } else if (i9 == 2) {
                zze = zzajo.zza(i8, (zzaiw) this.zzd[i6]);
            } else if (i9 == 3) {
                zze = (zzajo.zzg(i8) << 1) + ((zzamy) this.zzd[i6]).zza();
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException(zzakm.zza());
                }
                zze = zzajo.zzb(i8, ((Integer) this.zzd[i6]).intValue());
            }
            i5 += zze;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            i5 += zzajo.zzb(this.zzc[i6] >>> 3, (zzaiw) this.zzd[i6]);
        }
        this.zze = i5;
        return i5;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzamy(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = i4;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z4;
    }

    public final void zzb(zzanm zzanmVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanmVar.zza() == 1) {
            for (int i4 = 0; i4 < this.zzb; i4++) {
                zza(this.zzc[i4], this.zzd[i4], zzanmVar);
            }
            return;
        }
        for (int i5 = this.zzb - 1; i5 >= 0; i5--) {
            zza(this.zzc[i5], this.zzd[i5], zzanmVar);
        }
    }

    final zzamy zza(zzamy zzamyVar) {
        if (zzamyVar.equals(zza)) {
            return this;
        }
        zzf();
        int i4 = this.zzb + zzamyVar.zzb;
        zza(i4);
        System.arraycopy(zzamyVar.zzc, 0, this.zzc, this.zzb, zzamyVar.zzb);
        System.arraycopy(zzamyVar.zzd, 0, this.zzd, this.zzb, zzamyVar.zzb);
        this.zzb = i4;
        return this;
    }

    static zzamy zza(zzamy zzamyVar, zzamy zzamyVar2) {
        int i4 = zzamyVar.zzb + zzamyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzamyVar.zzc, i4);
        System.arraycopy(zzamyVar2.zzc, 0, copyOf, zzamyVar.zzb, zzamyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamyVar.zzd, i4);
        System.arraycopy(zzamyVar2.zzd, 0, copyOf2, zzamyVar.zzb, zzamyVar2.zzb);
        return new zzamy(i4, copyOf, copyOf2, true);
    }

    private final void zza(int i4) {
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

    final void zza(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzalo.zza(sb, i4, String.valueOf(this.zzc[i5] >>> 3), this.zzd[i5]);
        }
    }

    final void zza(int i4, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i5 = this.zzb;
        iArr[i5] = i4;
        this.zzd[i5] = obj;
        this.zzb = i5 + 1;
    }

    final void zza(zzanm zzanmVar) {
        if (zzanmVar.zza() == 2) {
            for (int i4 = this.zzb - 1; i4 >= 0; i4--) {
                zzanmVar.zza(this.zzc[i4] >>> 3, this.zzd[i4]);
            }
            return;
        }
        for (int i5 = 0; i5 < this.zzb; i5++) {
            zzanmVar.zza(this.zzc[i5] >>> 3, this.zzd[i5]);
        }
    }

    private static void zza(int i4, Object obj, zzanm zzanmVar) {
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            zzanmVar.zzb(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 1) {
            zzanmVar.zza(i5, ((Long) obj).longValue());
            return;
        }
        if (i6 == 2) {
            zzanmVar.zza(i5, (zzaiw) obj);
            return;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                zzanmVar.zzb(i5, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzakm.zza());
        }
        if (zzanmVar.zza() == 1) {
            zzanmVar.zzb(i5);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zza(i5);
        } else {
            zzanmVar.zza(i5);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zzb(i5);
        }
    }
}
