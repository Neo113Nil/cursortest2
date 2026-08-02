package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzefg implements zzdgx {
    private final VersionInfoParcel zza;
    private final ListenableFuture zzb;
    private final zzfel zzc;
    private final zzcej zzd;
    private final zzffg zze;
    private final zzbja zzf;
    private final boolean zzg;
    private final zzeds zzh;

    zzefg(VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfel zzfelVar, zzcej zzcejVar, zzffg zzffgVar, boolean z, zzbja zzbjaVar, zzeds zzedsVar) {
        this.zza = versionInfoParcel;
        this.zzb = listenableFuture;
        this.zzc = zzfelVar;
        this.zzd = zzcejVar;
        this.zze = zzffgVar;
        this.zzg = z;
        this.zzf = zzbjaVar;
        this.zzh = zzedsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    @Override // com.google.android.gms.internal.ads.zzdgx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z, Context context, zzcxd zzcxdVar) {
        int i;
        zzcov zzcovVar = (zzcov) zzgcj.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzk zzkVar = new com.google.android.gms.ads.internal.zzk(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzO, false);
        if (zzcxdVar != null) {
            zzcxdVar.zzf();
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        zzdgm zzg = zzcovVar.zzg();
        zzcej zzcejVar = this.zzd;
        int i2 = this.zzc.zzQ;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                VersionInfoParcel versionInfoParcel = this.zza;
                zzfel zzfelVar = this.zzc;
                String str = zzfelVar.zzB;
                zzfeq zzfeqVar = zzfelVar.zzs;
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcejVar, i, versionInfoParcel, str, zzkVar, zzfeqVar.zzb, zzfeqVar.zza, this.zze.zzf, zzcxdVar, !zzfelVar.zzai ? this.zzh : null), true);
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzQ;
        }
        i = i2;
        VersionInfoParcel versionInfoParcel2 = this.zza;
        zzfel zzfelVar2 = this.zzc;
        String str2 = zzfelVar2.zzB;
        zzfeq zzfeqVar2 = zzfelVar2.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzaa) null, zzcejVar, i, versionInfoParcel2, str2, zzkVar, zzfeqVar2.zzb, zzfeqVar2.zza, this.zze.zzf, zzcxdVar, !zzfelVar2.zzai ? this.zzh : null), true);
    }
}
