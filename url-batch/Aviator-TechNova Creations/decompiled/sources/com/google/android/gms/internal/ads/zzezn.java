package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzezn implements zzfax {
    private final Bundle zza;

    zzezn(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zza(new zzezo(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 30;
    }
}
