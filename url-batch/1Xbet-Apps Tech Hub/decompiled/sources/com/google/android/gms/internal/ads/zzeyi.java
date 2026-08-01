package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeyi {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzeuy zza(zzexm zzexmVar, zzesy zzesyVar, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 0) {
            zzexmVar = zzesyVar;
        }
        return new zzetg(zzexmVar, 0L, scheduledExecutorService);
    }

    public static zzeuy zzb(zzexw zzexwVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzetg(zzexwVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdW)).longValue(), scheduledExecutorService);
    }

    public static zzeuy zzc(zzeyr zzeyrVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzetg(zzeyrVar, 0L, scheduledExecutorService);
    }
}
