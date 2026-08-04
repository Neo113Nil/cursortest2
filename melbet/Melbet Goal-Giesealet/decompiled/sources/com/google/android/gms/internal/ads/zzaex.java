package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaex implements zzacf {
    private final zzadh zza;
    private final int zzb;
    private final zzadb zzc = new zzadb();

    /* synthetic */ zzaex(zzadh zzadhVar, int i, byte[] bArr) {
        this.zza = zzadhVar;
        this.zzb = i;
    }

    private final long zzc(zzacv zzacvVar) throws IOException {
        while (zzacvVar.zzm() < zzacvVar.zzo() - 6) {
            zzadh zzadhVar = this.zza;
            int i = this.zzb;
            zzadb zzadbVar = this.zzc;
            long zzm = zzacvVar.zzm();
            zzef zzefVar = new zzef(17);
            zzacvVar.zzi(zzefVar.zzi(), 0, 2);
            if (zzefVar.zzo() != i) {
                zzacvVar.zzl();
                zzacvVar.zzk((int) (zzm - zzacvVar.zzn()));
            } else {
                zzefVar.zzf(zzacy.zzb(zzacvVar, zzefVar.zzi(), 2, 15) + 2);
                zzacvVar.zzl();
                zzacvVar.zzk((int) (zzm - zzacvVar.zzn()));
                if (zzadc.zza(zzefVar, zzadhVar, i, zzadbVar)) {
                    break;
                }
            }
            zzacvVar.zzk(1);
        }
        if (zzacvVar.zzm() < zzacvVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzacvVar.zzk((int) (zzacvVar.zzo() - zzacvVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacv zzacvVar, long j) throws IOException {
        long zzn = zzacvVar.zzn();
        long zzc = zzc(zzacvVar);
        long zzm = zzacvVar.zzm();
        zzacvVar.zzk(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzacvVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzace.zzb(zzc2, zzacvVar.zzm()) : zzace.zza(zzc, zzn) : zzace.zzc(zzm);
    }
}
