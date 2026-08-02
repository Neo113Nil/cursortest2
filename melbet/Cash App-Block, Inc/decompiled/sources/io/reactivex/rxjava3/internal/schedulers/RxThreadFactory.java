package io.reactivex.rxjava3.internal.schedulers;

import com.google.android.gms.dynamite.zza;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    public final boolean nonBlocking;
    public final String prefix;
    public final int priority;

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread zzaVar = this.nonBlocking ? new zza(runnable, str) : new Thread(runnable, str);
        zzaVar.setPriority(this.priority);
        zzaVar.setDaemon(true);
        return zzaVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("RxThreadFactory["), this.prefix, "]");
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }
}
