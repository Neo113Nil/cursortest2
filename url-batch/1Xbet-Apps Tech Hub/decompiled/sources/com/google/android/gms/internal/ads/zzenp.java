package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzenp implements zzdas {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zza.set(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdas
    public final void zzh(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzfaz.zza(this.zza, new zzfay() { // from class: com.google.android.gms.internal.ads.zzeno
            @Override // com.google.android.gms.internal.ads.zzfay
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzdg) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
