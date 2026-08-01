package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzera implements zzeuy {
    private final zzgbl zza;

    zzera(zzgbl zzgblVar) {
        this.zza = zzgblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzerb(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzo().zzi().zzh().zza()).longValue());
            }
        });
    }
}
