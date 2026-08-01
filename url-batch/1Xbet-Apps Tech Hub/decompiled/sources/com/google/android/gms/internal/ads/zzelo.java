package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzelo implements zzefv {
    private final Context zza;
    private final zzcsm zzb;
    private final zzbea zzc;
    private final zzgbl zzd;
    private final zzfiu zze;

    public zzelo(Context context, zzcsm zzcsmVar, zzfiu zzfiuVar, zzgbl zzgblVar, zzbea zzbeaVar) {
        this.zza = context;
        this.zzb = zzcsmVar;
        this.zze = zzfiuVar;
        this.zzd = zzgblVar;
        this.zzc = zzbeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzelm zzelmVar = new zzelm(this, new View(this.zza), null, new zzctp() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // com.google.android.gms.internal.ads.zzctp
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzfdv) zzfduVar.zzv.get(0));
        zzcrq zza = this.zzb.zza(new zzcuh(zzfehVar, zzfduVar, null), zzelmVar);
        zzeln zzk = zza.zzk();
        zzfea zzfeaVar = zzfduVar.zzt;
        final zzbdv zzbdvVar = new zzbdv(zzk, zzfeaVar.zzb, zzfeaVar.zza);
        zzfio zzfioVar = zzfio.CUSTOM_RENDER_SYN;
        return zzfie.zzd(new zzfhy() { // from class: com.google.android.gms.internal.ads.zzell
            @Override // com.google.android.gms.internal.ads.zzfhy
            public final void zza() {
                zzelo.this.zzc(zzbdvVar);
            }
        }, this.zzd, zzfioVar, this.zze).zzb(zzfio.CUSTOM_RENDER_ACK).zzd(zzgbb.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzfea zzfeaVar;
        return (this.zzc == null || (zzfeaVar = zzfduVar.zzt) == null || zzfeaVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbdv zzbdvVar) throws Exception {
        this.zzc.zze(zzbdvVar);
    }
}
