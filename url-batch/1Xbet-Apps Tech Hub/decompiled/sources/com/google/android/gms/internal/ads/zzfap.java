package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfap implements zzfgx {
    private final zzfbl zza;

    public zzfap(zzfbl zzfblVar) {
        this.zza = zzfblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final ListenableFuture zza(zzfgy zzfgyVar) {
        zzfaq zzfaqVar = (zzfaq) zzfgyVar;
        return ((zzfam) this.zza).zzb(zzfaqVar.zzb, zzfaqVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfgx
    public final void zzb(zzfgm zzfgmVar) {
        zzfgmVar.zza = ((zzfam) this.zza).zza();
    }
}
