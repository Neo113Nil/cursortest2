package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzehx implements zzdig {
    private final Context zza;
    private final zzcbt zzb;
    private final ListenableFuture zzc;
    private final zzfdu zzd;
    private final zzcgv zze;
    private final zzfeq zzf;
    private final zzbkf zzg;
    private final boolean zzh;
    private final zzefa zzi;

    zzehx(Context context, zzcbt zzcbtVar, ListenableFuture listenableFuture, zzfdu zzfduVar, zzcgv zzcgvVar, zzfeq zzfeqVar, boolean z, zzbkf zzbkfVar, zzefa zzefaVar) {
        this.zza = context;
        this.zzb = zzcbtVar;
        this.zzc = listenableFuture;
        this.zzd = zzfduVar;
        this.zze = zzcgvVar;
        this.zzf = zzfeqVar;
        this.zzg = zzbkfVar;
        this.zzh = z;
        this.zzi = zzefaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdig
    public final void zza(boolean z, Context context, zzcyu zzcyuVar) {
        zzdgy zzdgyVar = (zzdgy) zzgbb.zzq(this.zzc);
        this.zze.zzan(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, com.google.android.gms.ads.internal.util.zzt.zzH(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzcyuVar != null) {
            zzcyuVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzdhv zzh = zzdgyVar.zzh();
        zzcgv zzcgvVar = this.zze;
        zzfdu zzfduVar = this.zzd;
        zzcbt zzcbtVar = this.zzb;
        int i = zzfduVar.zzR;
        String str = zzfduVar.zzC;
        zzfea zzfeaVar = zzfduVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzh, (com.google.android.gms.ads.internal.overlay.zzz) null, zzcgvVar, i, zzcbtVar, str, zzjVar, zzfeaVar.zzb, zzfeaVar.zza, this.zzf.zzf, zzcyuVar, zzfduVar.zzaj ? this.zzi : null), true);
    }
}
