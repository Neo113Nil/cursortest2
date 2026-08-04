package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeem implements zzdgp {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfcj zzc;
    private final zzcek zzd;
    private final zzfdc zze;
    private final zzbjo zzf;
    private final boolean zzg;
    private final zzecy zzh;
    private final zzdsm zzi;

    zzeem(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfcj zzfcjVar, zzcek zzcekVar, zzfdc zzfdcVar, boolean z, zzbjo zzbjoVar, zzecy zzecyVar, zzdsm zzdsmVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfcjVar;
        this.zzd = zzcekVar;
        this.zze = zzfdcVar;
        this.zzg = z;
        this.zzf = zzbjoVar;
        this.zzh = zzecyVar;
        this.zzi = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) {
        zzcnv zzcnvVar = (zzcnv) zzgot.zzs(this.zzb);
        zzcek zzcekVar = this.zzd;
        zzcekVar.zzag(true);
        boolean z2 = this.zzg;
        boolean zzc = z2 ? this.zzf.zzc(true) : true;
        boolean z3 = z2 && this.zzf.zzd();
        float zze = z2 ? this.zzf.zze() : 0.0f;
        zzfcj zzfcjVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z3, zze, -1, z, zzfcjVar.zzO, false);
        if (zzcwfVar != null) {
            zzcwfVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdge zzj = zzcnvVar.zzj();
        int i = zzfcjVar.zzQ;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar != null) {
                int i2 = zzxVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfcjVar.zzB;
        zzfco zzfcoVar = zzfcjVar.zzs;
        String str2 = zzfcoVar.zzb;
        String str3 = zzfcoVar.zza;
        zzfdc zzfdcVar = this.zze;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcekVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfdcVar.zzg, zzcwfVar, zzfcjVar.zzb() ? this.zzh : null, zzcekVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final zzfcj zzb() {
        return this.zzc;
    }
}
