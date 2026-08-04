package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzfdk implements zzgoq {
    final /* synthetic */ zzcek zza;
    final /* synthetic */ zzcmi zzb;
    final /* synthetic */ zzfjv zzc;
    final /* synthetic */ zzecn zzd;

    zzfdk(zzcek zzcekVar, zzcmi zzcmiVar, zzfjv zzfjvVar, zzecn zzecnVar) {
        this.zza = zzcekVar;
        this.zzb = zzcmiVar;
        this.zzc = zzfjvVar;
        this.zzd = zzecnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmi zzcmiVar;
        String str = (String) obj;
        zzcek zzcekVar = this.zza;
        zzfcj zzC = zzcekVar.zzC();
        if (zzC != null && !zzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzb) != null && zzcmi.zzc(str)) {
                zzcmiVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfcm zzaC = zzcekVar.zzaC();
        if (zzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcekVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgH)).booleanValue() && zzC != null && zzC.zzS;
        if (zzC != null && zzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new zzecp(currentTimeMillis, zzaC.zzb, str, (zzs || z2 || z) ? 2 : 1));
    }
}
