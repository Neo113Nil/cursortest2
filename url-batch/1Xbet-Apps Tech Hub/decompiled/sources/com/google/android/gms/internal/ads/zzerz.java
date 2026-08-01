package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzerz implements zzeuy {
    private final zzgbl zza;
    private final zzfeq zzb;

    zzerz(zzgbl zzgblVar, zzfeq zzfeqVar) {
        this.zza = zzgblVar;
        this.zzb = zzfeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerz.this.zzc();
            }
        });
    }

    final /* synthetic */ zzesa zzc() throws Exception {
        return new zzesa("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
