package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgzn {
    private final boolean zza;
    private final zzguf zzb;

    /* synthetic */ zzgzn(boolean z, zzguf zzgufVar, byte[] bArr) {
        this.zza = z;
        this.zzb = zzgufVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgzc(this.zzb, this.zza, executor, callable);
    }
}
