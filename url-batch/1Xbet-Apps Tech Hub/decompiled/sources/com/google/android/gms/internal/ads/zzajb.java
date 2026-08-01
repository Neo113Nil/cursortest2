package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzajb {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzfj zzg = new zzfj(255);

    zzajb() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacf zzacfVar, boolean z) throws IOException {
        zza();
        this.zzg.zzD(27);
        if (zzaci.zzc(zzacfVar, this.zzg.zzI(), 0, 27, z) && this.zzg.zzt() == 1332176723) {
            if (this.zzg.zzl() != 0) {
                if (z) {
                    return false;
                }
                throw zzcf.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzl();
            this.zzb = this.zzg.zzq();
            this.zzg.zzr();
            this.zzg.zzr();
            this.zzg.zzr();
            int zzl = this.zzg.zzl();
            this.zzc = zzl;
            this.zzd = zzl + 27;
            this.zzg.zzD(zzl);
            if (zzaci.zzc(zzacfVar, this.zzg.zzI(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzl();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacf zzacfVar, long j) throws IOException {
        zzef.zzd(zzacfVar.zzf() == zzacfVar.zze());
        this.zzg.zzD(4);
        while (true) {
            if ((j == -1 || zzacfVar.zzf() + 4 < j) && zzaci.zzc(zzacfVar, this.zzg.zzI(), 0, 4, true)) {
                this.zzg.zzG(0);
                if (this.zzg.zzt() == 1332176723) {
                    zzacfVar.zzj();
                    return true;
                }
                ((zzabu) zzacfVar).zzo(1, false);
            }
        }
        do {
            if (j != -1 && zzacfVar.zzf() >= j) {
                break;
            }
        } while (zzacfVar.zzc(1) != -1);
        return false;
    }
}
