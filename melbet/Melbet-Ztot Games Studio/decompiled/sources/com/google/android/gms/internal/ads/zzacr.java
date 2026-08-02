package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzacr {
    public static int zza(zzek zzekVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzekVar.zzm() + 1;
            case 7:
                return zzekVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzacl zzaclVar, zzacv zzacvVar) throws IOException {
        zzaclVar.zzj();
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzabyVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzabyVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzek zzekVar = new zzek(i2);
        zzekVar.zzJ(zzaco.zza(zzaclVar, zzekVar.zzM(), 0, i2));
        zzaclVar.zzj();
        zzacq zzacqVar = new zzacq();
        if (zzd(zzekVar, zzacvVar, z, zzacqVar)) {
            return zzacqVar.zza;
        }
        throw zzbo.zza(null, null);
    }

    public static boolean zzc(zzek zzekVar, zzacv zzacvVar, int i, zzacq zzacqVar) {
        int zza;
        int zzd = zzekVar.zzd();
        long zzu = zzekVar.zzu();
        long j = zzu >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzu >> 12;
        long j3 = zzu >> 8;
        long j4 = zzu >> 4;
        long j5 = zzu >> 1;
        long j6 = zzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzacvVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzacvVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if (!(i3 == 0 || i3 == zzacvVar.zzi) || j6 == 1 || !zzd(zzekVar, zzacvVar, z, zzacqVar) || (zza = zza(zzekVar, (int) (j2 & 15))) == -1 || zza > zzacvVar.zzb) {
            return false;
        }
        int i4 = zzacvVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzacvVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzekVar.zzm() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int zzq = zzekVar.zzq();
                if (i5 == 14) {
                    zzq *= 10;
                }
                if (zzq != i4) {
                    return false;
                }
            }
        }
        return zzekVar.zzm() == zzet.zzf(zzekVar.zzM(), zzd, zzekVar.zzd() + (-1), 0);
    }

    private static boolean zzd(zzek zzekVar, zzacv zzacvVar, boolean z, zzacq zzacqVar) {
        try {
            long zzw = zzekVar.zzw();
            if (!z) {
                zzw *= zzacvVar.zzb;
            }
            zzacqVar.zza = zzw;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
