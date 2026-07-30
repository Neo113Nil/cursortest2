package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class zzfz extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzgb zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfz(zzgb zzgbVar, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzgbVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgb.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z7;
        if (andIncrement == Long.MAX_VALUE) {
            zzgbVar.zzt.zzaA().zzd().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzfz zzfzVar = (zzfz) obj;
        boolean z7 = this.zza;
        if (z7 == zzfzVar.zza) {
            long j8 = this.zzc;
            long j9 = zzfzVar.zzc;
            if (j8 < j9) {
                return -1;
            }
            if (j8 <= j9) {
                this.zzb.zzt.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
                return 0;
            }
        } else if (z7) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzaA().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfx) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfz(zzgb zzgbVar, Callable callable, boolean z7, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzgbVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        atomicLong = zzgb.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z7;
        if (andIncrement == Long.MAX_VALUE) {
            zzgbVar.zzt.zzaA().zzd().zza("Tasks index overflow");
        }
    }
}
