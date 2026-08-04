package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgox implements ListenableFuture {
    static final ListenableFuture zza = new zzgox(null);
    private static final zzgpb zzb = new zzgpb(zzgox.class);
    private final Object zzc;

    zzgox(Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzghc.zzk(runnable, "Runnable was null.");
        zzghc.zzk(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzb.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(obj2).length() + 25 + String.valueOf(valueOf).length() + 2);
        sb.append(obj2);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
