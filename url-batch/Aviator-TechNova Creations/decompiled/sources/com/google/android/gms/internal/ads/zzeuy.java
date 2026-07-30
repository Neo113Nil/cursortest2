package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeuy implements zzfax {
    private final zzfjk zza;

    zzeuy(zzfjk zzfjkVar) {
        this.zza = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzeuz(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 58;
    }
}
