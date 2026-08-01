package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfba implements zzfbl {
    private zzcxo zza;

    @Override // com.google.android.gms.internal.ads.zzfbl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxo zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfbm zzfbmVar, zzfbk zzfbkVar, Object obj) {
        return zzb(zzfbmVar, zzfbkVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfbm zzfbmVar, zzfbk zzfbkVar, zzcxo zzcxoVar) {
        zzcuz zzb;
        if (zzcxoVar != null) {
            this.zza = zzcxoVar;
        } else {
            this.zza = (zzcxo) zzfbkVar.zza(zzfbmVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }
}
