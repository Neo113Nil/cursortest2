package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzesh implements zzeuy {
    private final zzgbl zza;
    private final zzdwn zzb;

    zzesh(zzgbl zzgblVar, zzdwn zzdwnVar) {
        this.zza = zzgblVar;
        this.zzb = zzdwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesh.this.zzc();
            }
        });
    }

    final /* synthetic */ zzesi zzc() throws Exception {
        zzdwn zzdwnVar = this.zzb;
        String zzc = zzdwnVar.zzc();
        boolean zzq = zzdwnVar.zzq();
        boolean zzl = com.google.android.gms.ads.internal.zzt.zzs().zzl();
        zzdwn zzdwnVar2 = this.zzb;
        return new zzesi(zzc, zzq, zzl, zzdwnVar2.zzo(), zzdwnVar2.zzr());
    }
}
