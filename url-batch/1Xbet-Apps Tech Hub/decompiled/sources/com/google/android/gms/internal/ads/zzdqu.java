package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdqu {
    private final zzchh zza;
    private final Context zzb;
    private final zzasi zzc;
    private final zzbee zzd;
    private final zzcbt zze;
    private final com.google.android.gms.ads.internal.zza zzf;
    private final zzayp zzg;
    private final zzdaw zzh;
    private final zzefa zzi;

    public zzdqu(zzchh zzchhVar, Context context, zzasi zzasiVar, zzbee zzbeeVar, zzcbt zzcbtVar, com.google.android.gms.ads.internal.zza zzaVar, zzayp zzaypVar, zzdaw zzdawVar, zzefa zzefaVar) {
        this.zza = zzchhVar;
        this.zzb = context;
        this.zzc = zzasiVar;
        this.zzd = zzbeeVar;
        this.zze = zzcbtVar;
        this.zzf = zzaVar;
        this.zzg = zzaypVar;
        this.zzh = zzdawVar;
        this.zzi = zzefaVar;
    }

    public final zzcgv zza(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdu zzfduVar, zzfdy zzfdyVar) throws zzchg {
        zzcik zzc = zzcik.zzc(zzqVar);
        String str = zzqVar.zza;
        zzdqj zzdqjVar = new zzdqj(this);
        zzefa zzefaVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzf;
        zzayp zzaypVar = this.zzg;
        return zzchh.zza(this.zzb, zzc, str, false, false, this.zzc, this.zzd, this.zze, null, zzdqjVar, zzaVar, zzaypVar, zzfduVar, zzfdyVar, zzefaVar);
    }
}
