package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaly implements zzacu {
    private final zzalz zza;
    private final zzef zzb;
    private final zzef zzc;
    private final zzee zzd;
    private zzacx zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzalx.zza;
    }

    public zzaly() {
        throw null;
    }

    public zzaly(int i) {
        this.zza = new zzalz(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzef(2048);
        this.zzg = -1L;
        zzef zzefVar = new zzef(10);
        this.zzc = zzefVar;
        byte[] zzi = zzefVar.zzi();
        this.zzd = new zzee(zzi, zzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar;
        zzacl zzaclVar;
        int i = 0;
        while (true) {
            zzefVar = this.zzc;
            zzaclVar = (zzacl) zzacvVar;
            zzaclVar.zzh(zzefVar.zzi(), 0, 10, false);
            zzefVar.zzh(0);
            if (zzefVar.zzx() != 4801587) {
                break;
            }
            zzefVar.zzk(3);
            int zzG = zzefVar.zzG();
            i += zzG + 10;
            zzaclVar.zzj(zzG, false);
        }
        zzacvVar.zzl();
        zzaclVar.zzj(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaclVar.zzh(zzefVar.zzi(), 0, 2, false);
            zzefVar.zzh(0);
            if (zzalz.zzf(zzefVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaclVar.zzh(zzefVar.zzi(), 0, 4, false);
                zzee zzeeVar = this.zzd;
                zzeeVar.zzf(14);
                int zzj = zzeeVar.zzj(13);
                if (zzj <= 6) {
                    i4++;
                    zzacvVar.zzl();
                    zzaclVar.zzj(i4, false);
                } else {
                    zzaclVar.zzj(zzj - 6, false);
                    i3 += zzj;
                }
            } else {
                i4++;
                zzacvVar.zzl();
                zzaclVar.zzj(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = zzacxVar;
        this.zza.zzb(zzacxVar, new zzanr(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zze.getClass();
        zzef zzefVar = this.zzb;
        int zza = zzacvVar.zza(zzefVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzadu(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (zza == -1) {
            return -1;
        }
        zzefVar.zzh(0);
        zzefVar.zzf(zza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzefVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }
}
