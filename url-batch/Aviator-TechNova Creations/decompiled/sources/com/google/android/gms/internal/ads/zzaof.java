package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaof implements zzaeu {
    private final zzaog zza = new zzaog(null, 0, "audio/ac4");
    private final zzer zzb = new zzer(16384);
    private boolean zzc;

    static {
        int i = zzaoe.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzael zzaelVar;
        int i;
        zzer zzerVar = new zzer(10);
        int i2 = 0;
        while (true) {
            zzaelVar = (zzael) zzaevVar;
            zzaelVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int zzG = zzerVar.zzG();
            i2 += zzG + 10;
            zzaelVar.zzj(zzG, false);
        }
        zzaevVar.zzl();
        zzaelVar.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaelVar.zzh(zzerVar.zzi(), 0, 7, false);
            zzerVar.zzh(0);
            int zzt = zzerVar.zzt();
            if (zzt == 44096 || zzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzi = zzerVar.zzi();
                int i6 = zzady.zza;
                if (zzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzi[2] & 255) << 8) | (zzi[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzi[4] & 255) << 16) | ((zzi[5] & 255) << 8) | (zzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzt == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzaelVar.zzj(i - 7, false);
            } else {
                zzaevVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaelVar.zzj(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
        zzaexVar.zzw(new zzafx(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        zzer zzerVar = this.zzb;
        int zza = zzaevVar.zza(zzerVar.zzi(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
