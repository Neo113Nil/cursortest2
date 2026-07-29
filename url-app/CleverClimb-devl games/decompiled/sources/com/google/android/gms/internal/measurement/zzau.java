package com.google.android.gms.internal.measurement;

import java.lang.Thread;

/* loaded from: classes2.dex */
final class zzau implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzat zzvz;

    zzau(zzat zzatVar) {
        this.zzvz = zzatVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzcm zzcj = this.zzvz.zzcj();
        if (zzcj != null) {
            zzcj.zze("Job execution failed", th);
        }
    }
}
