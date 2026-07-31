package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class zzij extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzil zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzij(zzil zzilVar, Runnable runnable, boolean z4, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzilVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzil.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z4;
        if (andIncrement == Long.MAX_VALUE) {
            zzilVar.zzu.zzaW().zze().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzij zzijVar = (zzij) obj;
        boolean z4 = zzijVar.zza;
        boolean z5 = this.zza;
        if (z5 != z4) {
            return !z5 ? 1 : -1;
        }
        long j4 = this.zzc;
        long j5 = zzijVar.zzc;
        if (j4 < j5) {
            return -1;
        }
        if (j4 > j5) {
            return 1;
        }
        this.zzb.zzu.zzaW().zzh().zzb("Two tasks share the same index. index", Long.valueOf(j4));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaW().zze().zzb(this.zzd, th);
        if ((th instanceof zzih) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzij(zzil zzilVar, Callable callable, boolean z4, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzilVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzil.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z4;
        if (andIncrement == Long.MAX_VALUE) {
            zzilVar.zzu.zzaW().zze().zza("Tasks index overflow");
        }
    }
}
