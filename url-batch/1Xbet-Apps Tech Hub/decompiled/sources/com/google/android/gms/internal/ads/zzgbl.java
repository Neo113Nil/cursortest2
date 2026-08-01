package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public interface zzgbl extends ExecutorService {
    ListenableFuture zza(Runnable runnable);

    ListenableFuture zzb(Callable callable);
}
