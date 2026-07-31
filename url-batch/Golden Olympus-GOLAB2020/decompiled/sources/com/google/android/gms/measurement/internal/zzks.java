package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzks implements Executor {
    final /* synthetic */ zzlw zza;

    zzks(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.zzu.zzaX().zzq(runnable);
    }
}
