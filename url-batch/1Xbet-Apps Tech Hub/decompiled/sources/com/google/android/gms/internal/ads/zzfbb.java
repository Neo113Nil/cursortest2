package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfbb implements zzfbl {
    private final zzfbl zza;
    private zzcxo zzb;

    public zzfbb(zzfbl zzfblVar) {
        this.zza = zzfblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcxo zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfbm zzfbmVar, zzfbk zzfbkVar, zzcxo zzcxoVar) {
        this.zzb = zzcxoVar;
        if (zzfbmVar.zza == null) {
            return ((zzfba) this.zza).zzb(zzfbmVar, zzfbkVar, zzcxoVar);
        }
        zzcuz zzb = this.zzb.zzb();
        return zzb.zzi(zzb.zzk(zzgbb.zzh(zzfbmVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfbl
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfbm zzfbmVar, zzfbk zzfbkVar, Object obj) {
        return zzb(zzfbmVar, zzfbkVar, null);
    }
}
