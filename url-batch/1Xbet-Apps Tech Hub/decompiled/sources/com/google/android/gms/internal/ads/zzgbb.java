package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgbb extends zzgbd {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgba zza(Iterable iterable) {
        return new zzgba(false, zzfwu.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgba zzb(Iterable iterable) {
        int i = zzfwu.zzd;
        iterable.getClass();
        return new zzgba(true, zzfwu.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzgba zzc(ListenableFuture... listenableFutureArr) {
        return new zzgba(true, zzfwu.zzk(listenableFutureArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgaj(zzfwu.zzj(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzftn zzftnVar, Executor executor) {
        zzfzm zzfzmVar = new zzfzm(listenableFuture, cls, zzftnVar);
        listenableFuture.addListener(zzfzmVar, zzgbr.zzc(executor, zzfzmVar));
        return zzfzmVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgai zzgaiVar, Executor executor) {
        zzfzl zzfzlVar = new zzfzl(listenableFuture, cls, zzgaiVar);
        listenableFuture.addListener(zzfzlVar, zzgbr.zzc(executor, zzfzlVar));
        return zzfzlVar;
    }

    public static ListenableFuture zzh(Object obj) {
        return obj == null ? zzgbf.zza : new zzgbf(obj);
    }

    public static ListenableFuture zzi() {
        return zzgbf.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgca zzgcaVar = new zzgca(callable);
        executor.execute(zzgcaVar);
        return zzgcaVar;
    }

    public static ListenableFuture zzk(zzgah zzgahVar, Executor executor) {
        zzgca zzgcaVar = new zzgca(zzgahVar);
        executor.execute(zzgcaVar);
        return zzgcaVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgaj(zzfwu.zzk(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzftn zzftnVar, Executor executor) {
        zzfzw zzfzwVar = new zzfzw(listenableFuture, zzftnVar);
        listenableFuture.addListener(zzfzwVar, zzgbr.zzc(executor, zzfzwVar));
        return zzfzwVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgai zzgaiVar, Executor executor) {
        int i = zzfzx.zzc;
        executor.getClass();
        zzfzv zzfzvVar = new zzfzv(listenableFuture, zzgaiVar);
        listenableFuture.addListener(zzfzvVar, zzgbr.zzc(executor, zzfzvVar));
        return zzfzvVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzgbx.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgcc.zza(future);
        }
        throw new IllegalStateException(zzfun.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgcc.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgaq((Error) cause);
            }
            throw new zzgcb(cause);
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgbe(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgax zzgaxVar, Executor executor) {
        zzgaxVar.getClass();
        listenableFuture.addListener(new zzgay(listenableFuture, zzgaxVar), executor);
    }
}
