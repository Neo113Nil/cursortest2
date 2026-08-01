package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgba {
    private final boolean zza;
    private final zzfwu zzb;

    /* synthetic */ zzgba(boolean z, zzfwu zzfwuVar, zzgaz zzgazVar) {
        this.zza = z;
        this.zzb = zzfwuVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgao(this.zzb, this.zza, executor, callable);
    }
}
