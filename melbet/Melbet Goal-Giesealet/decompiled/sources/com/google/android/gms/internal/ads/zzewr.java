package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzewr implements zzeup {
    final ScheduledExecutorService zza;

    public zzewr(zzbta zzbtaVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zzk(zzgot.zzi(zzgot.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeH)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzewq.zza, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 49;
    }
}
