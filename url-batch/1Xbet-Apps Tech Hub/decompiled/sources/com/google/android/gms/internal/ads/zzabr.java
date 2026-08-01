package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabr {
    public static void zza(long j, zzfj zzfjVar, zzadk[] zzadkVarArr) {
        int i;
        while (true) {
            if (zzfjVar.zza() <= 1) {
                return;
            }
            int zzc = zzc(zzfjVar);
            int zzc2 = zzc(zzfjVar);
            int zzc3 = zzfjVar.zzc() + zzc2;
            if (zzc2 == -1 || zzc2 > zzfjVar.zza()) {
                zzez.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzc3 = zzfjVar.zzd();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzl = zzfjVar.zzl();
                int zzp = zzfjVar.zzp();
                if (zzp == 49) {
                    i = zzfjVar.zzf();
                    zzp = 49;
                } else {
                    i = 0;
                }
                int zzl2 = zzfjVar.zzl();
                if (zzp == 47) {
                    zzfjVar.zzH(1);
                    zzp = 47;
                }
                boolean z = zzl == 181 && (zzp == 49 || zzp == 47) && zzl2 == 3;
                if (zzp == 49) {
                    z &= i == 1195456820;
                }
                if (z) {
                    zzb(j, zzfjVar, zzadkVarArr);
                }
            }
            zzfjVar.zzG(zzc3);
        }
    }

    public static void zzb(long j, zzfj zzfjVar, zzadk[] zzadkVarArr) {
        int zzl = zzfjVar.zzl();
        if ((zzl & 64) != 0) {
            int i = zzl & 31;
            zzfjVar.zzH(1);
            int zzc = zzfjVar.zzc();
            for (zzadk zzadkVar : zzadkVarArr) {
                int i2 = i * 3;
                zzfjVar.zzG(zzc);
                zzadkVar.zzr(zzfjVar, i2);
                if (j != -9223372036854775807L) {
                    zzadkVar.zzt(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfj zzfjVar) {
        int i = 0;
        while (zzfjVar.zza() != 0) {
            int zzl = zzfjVar.zzl();
            i += zzl;
            if (zzl != 255) {
                return i;
            }
        }
        return -1;
    }
}
