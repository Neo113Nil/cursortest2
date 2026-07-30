package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzgzo extends zzgzq {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzgzs.zza : new zzgzs(obj);
    }

    public static ListenableFuture zzb() {
        return zzgzs.zza;
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzhan zzhanVar = new zzhan(callable);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzhan zze = zzhan.zze(runnable, null);
        executor.execute(zze);
        return zze;
    }

    public static ListenableFuture zzf(zzgyv zzgyvVar, Executor executor) {
        zzhan zzhanVar = new zzhan(zzgyvVar);
        executor.execute(zzhanVar);
        return zzhanVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgyf zzgyfVar = new zzgyf(listenableFuture, cls, zzgqtVar);
        listenableFuture.addListener(zzgyfVar, zzhaf.zzd(executor, zzgyfVar));
        return zzgyfVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzgyw zzgywVar, Executor executor) {
        int i = zzgyg.zzd;
        zzgye zzgyeVar = new zzgye(listenableFuture, cls, zzgywVar);
        listenableFuture.addListener(zzgyeVar, zzhaf.zzd(executor, zzgyeVar));
        return zzgyeVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzhak.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzgyw zzgywVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgyl zzgylVar = new zzgyl(listenableFuture, zzgywVar);
        listenableFuture.addListener(zzgylVar, zzhaf.zzd(executor, zzgylVar));
        return zzgylVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzgqt zzgqtVar, Executor executor) {
        int i = zzgyn.zzc;
        zzgym zzgymVar = new zzgym(listenableFuture, zzgqtVar);
        listenableFuture.addListener(zzgymVar, zzhaf.zzd(executor, zzgymVar));
        return zzgymVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgyx(zzguf.zzr(listenableFutureArr), true);
    }

    public static ListenableFuture zzm(Iterable iterable) {
        return new zzgyx(zzguf.zzp(iterable), true);
    }

    public static zzgzn zzn(Iterable iterable) {
        return new zzgzn(false, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzgzn zzo(ListenableFuture... listenableFutureArr) {
        return new zzgzn(true, zzguf.zzr(listenableFutureArr), null);
    }

    public static zzgzn zzp(Iterable iterable) {
        return new zzgzn(true, zzguf.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzq(ListenableFuture... listenableFutureArr) {
        return new zzgyx(zzguf.zzr(listenableFutureArr), false);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhap.zza(future);
        }
        throw new IllegalStateException(zzgrt.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhap.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgze((Error) e.getCause());
            }
            throw new zzhao(e.getCause());
        }
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzgzr(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgzl zzgzlVar, Executor executor) {
        zzgzlVar.getClass();
        listenableFuture.addListener(new zzgzm(listenableFuture, zzgzlVar), executor);
    }
}
