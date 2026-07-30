package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeyb implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;

    zzeyb(zzgzy zzgzyVar, zzfjk zzfjkVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeyb.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzeyc zzc() {
        return new zzeyc("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd)));
    }
}
