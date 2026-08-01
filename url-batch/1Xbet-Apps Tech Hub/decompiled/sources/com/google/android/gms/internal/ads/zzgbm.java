package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgbm implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfzp zzb;

    zzgbm(Executor executor, zzfzp zzfzpVar) {
        this.zza = executor;
        this.zzb = zzfzpVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
