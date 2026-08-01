package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzegi implements zzdig {
    private final zzcbt zza;
    private final ListenableFuture zzb;
    private final zzfdu zzc;
    private final zzcgv zzd;
    private final zzfeq zze;
    private final zzbkf zzf;
    private final boolean zzg;
    private final zzefa zzh;

    zzegi(zzcbt zzcbtVar, ListenableFuture listenableFuture, zzfdu zzfduVar, zzcgv zzcgvVar, zzfeq zzfeqVar, boolean z, zzbkf zzbkfVar, zzefa zzefaVar) {
        this.zza = zzcbtVar;
        this.zzb = listenableFuture;
        this.zzc = zzfduVar;
        this.zzd = zzcgvVar;
        this.zze = zzfeqVar;
        this.zzg = z;
        this.zzf = zzbkfVar;
        this.zzh = zzefaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
        zzcra zzcraVar = (zzcra) zzgbb.zzq(this.zzb);
        this.zzd.zzan(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzcyuVar != null) {
            zzcyuVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdhv zzg = zzcraVar.zzg();
        zzcgv zzcgvVar = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            com.google.android.gms.ads.internal.client.zzw zzwVar = this.zze.zzj;
            if (zzwVar != null) {
                int i2 = zzwVar.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            zzcbn.zze("Error setting app open orientation; no targeting orientation available.");
            i = this.zzc.zzR;
        }
        int i3 = i;
        zzcbt zzcbtVar = this.zza;
        zzfdu zzfduVar = this.zzc;
        String str = zzfduVar.zzC;
        zzfea zzfeaVar = zzfduVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzg, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcgvVar, i3, zzcbtVar, str, zzjVar, zzfeaVar.zzb, zzfeaVar.zza, this.zze.zzf, zzcyuVar, zzfduVar.zzaj ? this.zzh : null), true);
    }
}
