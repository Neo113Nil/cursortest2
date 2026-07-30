package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzekt implements zzdmc {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzfjk zze;
    private final zzbok zzf;
    private final boolean zzg;
    private final zzejf zzh;
    private final zzdxz zzi;

    zzekt(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzfjkVar;
        this.zzg = z;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final void zza(boolean z, Context context, zzdbs zzdbsVar) {
        zzcti zzctiVar = (zzcti) zzgzo.zzt(this.zzb);
        zzcjl zzcjlVar = this.zzd;
        zzcjlVar.zzag(true);
        boolean z2 = this.zzg;
        boolean zzc = z2 ? this.zzf.zzc(true) : true;
        boolean z3 = z2 && this.zzf.zzd();
        float zze = z2 ? this.zzf.zze() : 0.0f;
        zzfir zzfirVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zzc, true, z3, zze, -1, z, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzj = zzctiVar.zzj();
        int i = zzfirVar.zzQ;
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
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        String str2 = zzfiwVar.zzb;
        String str3 = zzfiwVar.zza;
        zzfjk zzfjkVar = this.zze;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzj, null, zzcjlVar, i, versionInfoParcel, str, zzlVar, str2, str3, zzfjkVar.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzh : null, zzcjlVar.zzn()), true, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public final zzfir zzb() {
        return this.zzc;
    }
}
