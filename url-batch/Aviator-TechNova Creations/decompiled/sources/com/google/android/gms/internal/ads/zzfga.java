package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfga implements zzfgj {
    private final zzfgj zza;
    private zzdam zzb;

    public zzfga(zzfgj zzfgjVar) {
        this.zza = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfgk zzfgkVar, zzfgi zzfgiVar, zzdam zzdamVar) {
        zzbzu zzbzuVar;
        this.zzb = zzdamVar;
        if (zzdamVar == null || (zzbzuVar = zzfgkVar.zza) == null) {
            zzdam zzdamVar2 = zzdamVar;
            return ((zzffz) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        }
        zzcxj zza = zzdamVar.zza();
        return zza.zzc(zza.zza(zzgzo.zza(zzbzuVar)));
    }
}
