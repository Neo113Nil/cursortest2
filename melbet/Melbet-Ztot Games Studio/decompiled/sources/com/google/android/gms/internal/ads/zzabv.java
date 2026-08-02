package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzabv {
    public static void zza(long j, zzek zzekVar, zzadp[] zzadpVarArr) {
        int i;
        while (true) {
            if (zzekVar.zzb() <= 1) {
                return;
            }
            int zzc = zzc(zzekVar);
            int zzc2 = zzc(zzekVar);
            int zzd = zzekVar.zzd() + zzc2;
            if (zzc2 == -1 || zzc2 > zzekVar.zzb()) {
                zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzd = zzekVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzm = zzekVar.zzm();
                int zzq = zzekVar.zzq();
                if (zzq == 49) {
                    i = zzekVar.zzg();
                    zzq = 49;
                } else {
                    i = 0;
                }
                int zzm2 = zzekVar.zzm();
                if (zzq == 47) {
                    zzekVar.zzL(1);
                    zzq = 47;
                }
                boolean z = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                if (zzq == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzekVar, zzadpVarArr);
                }
            }
            zzekVar.zzK(zzd);
        }
    }

    public static void zzb(long j, zzek zzekVar, zzadp[] zzadpVarArr) {
        int zzm = zzekVar.zzm();
        if ((zzm & 64) != 0) {
            int i = zzm & 31;
            zzekVar.zzL(1);
            int zzd = zzekVar.zzd();
            for (zzadp zzadpVar : zzadpVarArr) {
                int i2 = i * 3;
                zzekVar.zzK(zzd);
                zzadpVar.zzq(zzekVar, i2);
                zzdi.zzf(j != -9223372036854775807L);
                zzadpVar.zzs(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzek zzekVar) {
        int i = 0;
        while (zzekVar.zzb() != 0) {
            int zzm = zzekVar.zzm();
            i += zzm;
            if (zzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
