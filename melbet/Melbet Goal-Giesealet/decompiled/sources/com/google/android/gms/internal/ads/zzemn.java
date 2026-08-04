package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzemn implements zzeup {
    private final Clock zza;
    private final zzfdc zzb;

    zzemn(Clock clock, zzfdc zzfdcVar) {
        this.zza = clock;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzemo(this.zzb, this.zza.currentTimeMillis()));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 4;
    }
}
