package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
abstract class zzgan extends zzgbk {
    private final Executor zza;
    final /* synthetic */ zzgao zzb;

    zzgan(zzgao zzgaoVar, Executor executor) {
        this.zzb = zzgaoVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgbk
    final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbk
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
