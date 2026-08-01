package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgbr {
    public static zzgbl zza(ExecutorService executorService) {
        if (executorService instanceof zzgbl) {
            return (zzgbl) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgbq((ScheduledExecutorService) executorService) : new zzgbn(executorService);
    }

    public static Executor zzb() {
        return zzgap.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfzp zzfzpVar) {
        executor.getClass();
        return executor == zzgap.INSTANCE ? executor : new zzgbm(executor, zzfzpVar);
    }
}
