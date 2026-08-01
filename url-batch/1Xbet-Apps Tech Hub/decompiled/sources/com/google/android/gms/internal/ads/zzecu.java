package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzecu implements zzdff {
    private final String zzc;
    private final zzfje zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzi();

    public zzecu(String str, zzfje zzfjeVar) {
        this.zzc = str;
        this.zzd = zzfjeVar;
    }

    private final zzfjd zzg(String str) {
        String str2 = this.zze.zzQ() ? "" : this.zzc;
        zzfjd zzb = zzfjd.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zza(String str) {
        zzfjd zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzb(String str, String str2) {
        zzfjd zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzc(String str) {
        zzfjd zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final void zzd(String str) {
        zzfjd zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdff
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
