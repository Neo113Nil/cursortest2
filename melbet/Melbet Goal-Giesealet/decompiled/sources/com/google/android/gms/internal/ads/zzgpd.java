package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzgpd extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.ads.zzgpd
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    ListenableFuture submit(Callable callable);
}
