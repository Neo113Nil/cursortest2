package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzalv implements zzacu {
    private final zzalw zza = new zzalw(null, 0, "audio/ac4");
    private final zzef zzb = new zzef(16384);
    private boolean zzc;

    static {
        int i = zzalu.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzacl zzaclVar;
        int i;
        zzef zzefVar = new zzef(10);
        int i2 = 0;
        while (true) {
            zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int zzG = zzefVar.zzG();
            i2 += zzG + 10;
            zzaclVar.zzj(zzG, false);
        }
        zzacvVar.zzl();
        zzaclVar.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaclVar.zzh(zzefVar.zzi(), 0, 7, false);
            zzefVar.zzh(0);
            int zzt = zzefVar.zzt();
            if (zzt == 44096 || zzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzi = zzefVar.zzi();
                int i6 = zzaby.zza;
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
                zzaclVar.zzj(i - 7, false);
            } else {
                zzacvVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaclVar.zzj(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
        zzacxVar.zzw(new zzadu(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        zzef zzefVar = this.zzb;
        int zza = zzacvVar.zza(zzefVar.zzi(), 0, 16384);
        if (zza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(zza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }
}
