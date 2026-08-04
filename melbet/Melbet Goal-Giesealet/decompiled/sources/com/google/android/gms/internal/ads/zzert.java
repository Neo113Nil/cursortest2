package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzert implements zzeup {
    private final zzgpd zza;
    private final zzfdc zzb;

    zzert(zzgpd zzgpdVar, zzfdc zzfdcVar) {
        this.zza = zzgpdVar;
        this.zzb = zzfdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzers
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzert.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzeru zzc() {
        return new zzeru("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd)));
    }
}
