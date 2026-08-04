package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzell implements zzcyj {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zza.set(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzezq.zza(this.zza, new zzezp() { // from class: com.google.android.gms.internal.ads.zzelk
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdt) obj).zze(com.google.android.gms.ads.internal.client.zzt.this);
            }
        });
    }
}
