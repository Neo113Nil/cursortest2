package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzffz implements zzfgj {
    private zzdam zza;

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzcxj zza;
        if (zzdamVar != null) {
            this.zza = zzdamVar;
        } else {
            this.zza = (zzdam) zzfgiVar.zza(zzfgkVar.zzb).zzh();
        }
        zza = this.zza.zza();
        return zza.zzc(zza.zzb());
    }
}
