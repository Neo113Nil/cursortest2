package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzapf implements zzapn {
    private zzv zza;
    private zzfg zzb;
    private zzagh zzc;

    public zzapf(String str, String str2) {
        zzt zztVar = new zzt();
        zztVar.zzl("video/mp2t");
        zztVar.zzm(str);
        this.zza = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zzb = zzfgVar;
        zzaqbVar.zza();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzc = zzu;
        zzu.zzz(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final void zzb(zzer zzerVar) {
        this.zzb.getClass();
        String str = zzfj.zza;
        long zzb = this.zzb.zzb();
        long zzc = this.zzb.zzc();
        if (zzb == -9223372036854775807L || zzc == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.zza;
        if (zzc != zzvVar.zzt) {
            zzt zza = zzvVar.zza();
            zza.zzr(zzc);
            zzv zzM = zza.zzM();
            this.zza = zzM;
            this.zzc.zzz(zzM);
        }
        int zzd = zzerVar.zzd();
        this.zzc.zzc(zzerVar, zzd);
        this.zzc.zze(zzb, 1, zzd, 0, null);
    }
}
