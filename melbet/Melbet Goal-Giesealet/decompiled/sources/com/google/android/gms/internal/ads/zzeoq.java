package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzeoq implements zzeup {
    private final zzfdc zza;

    zzeoq(zzfdc zzfdcVar) {
        this.zza = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzeor(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 58;
    }
}
