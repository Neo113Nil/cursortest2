package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexq implements zzeuy {
    final zzgbl zza;
    final List zzb;
    final zzbcn zzc;

    public zzexq(zzbcn zzbcnVar, zzgbl zzgblVar, List list) {
        this.zzc = zzbcnVar;
        this.zza = zzgblVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzexr(zzexq.this.zzb);
            }
        });
    }
}
