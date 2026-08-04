package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzamv implements zzand {
    private zzu zza;
    private zzel zzb;
    private zzaeb zzc;

    public zzamv(String str, String str2) {
        zzs zzsVar = new zzs();
        zzsVar.zzl("video/mp2t");
        zzsVar.zzm(str);
        this.zza = zzsVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
        this.zzb = zzelVar;
        zzanrVar.zza();
        zzaeb zzu = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzc = zzu;
        zzu.zzu(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        this.zzb.getClass();
        String str = zzeo.zza;
        long zzb = this.zzb.zzb();
        long zzc = this.zzb.zzc();
        if (zzb == -9223372036854775807L || zzc == -9223372036854775807L) {
            return;
        }
        zzu zzuVar = this.zza;
        if (zzc != zzuVar.zzt) {
            zzs zza = zzuVar.zza();
            zza.zzr(zzc);
            zzu zzM = zza.zzM();
            this.zza = zzM;
            this.zzc.zzu(zzM);
        }
        int zzd = zzefVar.zzd();
        this.zzc.zzz(zzefVar, zzd);
        this.zzc.zzx(zzb, 1, zzd, 0, null);
    }
}
