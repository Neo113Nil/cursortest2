package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeur implements zzeuy {
    private final boolean zza;

    zzeur(zzfbp zzfbpVar) {
        this.zza = zzfbpVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzh(this.zza ? new zzeux() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
