package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzexw implements zzeuy {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbtt zzc;

    public zzexw(zzbtt zzbttVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbttVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzm(zzgbb.zzo(zzgbb.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdW)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzftn() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return new zzexx((Bundle) obj);
            }
        }, zzcca.zza);
    }
}
