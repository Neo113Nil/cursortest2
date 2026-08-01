package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzelt implements zzefv {
    private final zzbea zza;
    private final zzgbl zzb;
    private final zzfiu zzc;
    private final zzemc zzd;

    public zzelt(zzfiu zzfiuVar, zzgbl zzgblVar, zzbea zzbeaVar, zzemc zzemcVar) {
        this.zzc = zzfiuVar;
        this.zzb = zzgblVar;
        this.zza = zzbeaVar;
        this.zzd = zzemcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final ListenableFuture zza(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzccf zzccfVar = new zzccf();
        zzely zzelyVar = new zzely();
        zzelyVar.zzd(new zzels(this, zzccfVar, zzfehVar, zzfduVar, zzelyVar));
        zzfea zzfeaVar = zzfduVar.zzt;
        final zzbdv zzbdvVar = new zzbdv(zzelyVar, zzfeaVar.zzb, zzfeaVar.zza);
        zzfio zzfioVar = zzfio.CUSTOM_RENDER_SYN;
        return zzfie.zzd(new zzfhy() { // from class: com.google.android.gms.internal.ads.zzelr
            @Override // com.google.android.gms.internal.ads.zzfhy
            public final void zza() {
                zzelt.this.zzc(zzbdvVar);
            }
        }, this.zzb, zzfioVar, this.zzc).zzb(zzfio.CUSTOM_RENDER_ACK).zzd(zzccfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefv
    public final boolean zzb(zzfeh zzfehVar, zzfdu zzfduVar) {
        zzfea zzfeaVar;
        return (this.zza == null || (zzfeaVar = zzfduVar.zzt) == null || zzfeaVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(zzbdv zzbdvVar) throws Exception {
        this.zza.zze(zzbdvVar);
    }
}
