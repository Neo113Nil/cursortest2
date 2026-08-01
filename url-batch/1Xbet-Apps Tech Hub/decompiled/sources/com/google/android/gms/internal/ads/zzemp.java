package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzemp extends com.google.android.gms.ads.internal.client.zzbp {
    final zzfeo zza;
    final zzdkt zzb;
    private final Context zzc;
    private final zzciq zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzemp(zzciq zzciqVar, Context context, String str) {
        zzfeo zzfeoVar = new zzfeo();
        this.zza = zzfeoVar;
        this.zzb = new zzdkt();
        this.zzd = zzciqVar;
        zzfeoVar.zzs(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdkv zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfeo zzfeoVar = this.zza;
        if (zzfeoVar.zzg() == null) {
            zzfeoVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzc());
        }
        return new zzemq(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbhg zzbhgVar) {
        this.zzb.zza(zzbhgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbhj zzbhjVar) {
        this.zzb.zzb(zzbhjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, zzbhp zzbhpVar, zzbhm zzbhmVar) {
        this.zzb.zzc(str, zzbhpVar, zzbhmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(zzbmv zzbmvVar) {
        this.zzb.zzd(zzbmvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbht zzbhtVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb.zze(zzbhtVar);
        this.zza.zzr(zzqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbhw zzbhwVar) {
        this.zzb.zzf(zzbhwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbmm zzbmmVar) {
        this.zza.zzv(zzbmmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbfw zzbfwVar) {
        this.zza.zzA(zzbfwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zza.zzQ(zzcfVar);
    }
}
