package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbzp implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    zzbzp(zzbzs zzbzsVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + this.zza.getAndIncrement());
    }
}
