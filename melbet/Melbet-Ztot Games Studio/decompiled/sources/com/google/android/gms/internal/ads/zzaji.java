package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaji {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzek zzg = new zzek(255);

    zzaji() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacl zzaclVar, boolean z) throws IOException {
        zza();
        this.zzg.zzH(27);
        if (zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, 27, z) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z) {
                    return false;
                }
                throw zzbo.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzH(zzm);
            if (zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzm();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacl zzaclVar, long j) throws IOException {
        zzdi.zzd(zzaclVar.zzf() == zzaclVar.zze());
        this.zzg.zzH(4);
        while (true) {
            if ((j == -1 || zzaclVar.zzf() + 4 < j) && zzaco.zzc(zzaclVar, this.zzg.zzM(), 0, 4, true)) {
                this.zzg.zzK(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzaclVar.zzj();
                    return true;
                }
                ((zzaby) zzaclVar).zzo(1, false);
            }
        }
        do {
            if (j != -1 && zzaclVar.zzf() >= j) {
                break;
            }
        } while (zzaclVar.zzc(1) != -1);
        return false;
    }
}
