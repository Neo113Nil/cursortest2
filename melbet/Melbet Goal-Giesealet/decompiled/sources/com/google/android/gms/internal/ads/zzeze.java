package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzeze implements zzffk {
    private final zzfab zza;

    public zzeze(zzfab zzfabVar) {
        this.zza = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final ListenableFuture zza(zzffl zzfflVar) {
        zzezh zzezhVar = (zzezh) zzfflVar;
        return ((zzezd) this.zza).zzb(zzezhVar.zzb, zzezhVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffk
    public final void zzb(zzffa zzffaVar) {
        zzffaVar.zza = ((zzezd) this.zza).zza();
    }
}
