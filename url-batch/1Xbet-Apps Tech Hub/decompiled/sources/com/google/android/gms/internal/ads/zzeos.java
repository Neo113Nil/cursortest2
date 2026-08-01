package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeos implements zzeuy {
    private final Clock zza;
    private final zzfeq zzb;

    zzeos(Clock clock, zzfeq zzfeqVar) {
        this.zza = clock;
        this.zzb = zzfeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzh(new zzeot(this.zzb, this.zza.currentTimeMillis()));
    }
}
