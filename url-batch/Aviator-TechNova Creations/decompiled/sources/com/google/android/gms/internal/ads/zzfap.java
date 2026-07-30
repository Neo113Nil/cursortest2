package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzfap implements zzfax {
    private final boolean zza;

    zzfap(zzfgn zzfgnVar) {
        this.zza = zzfgnVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzfao(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 36;
    }
}
