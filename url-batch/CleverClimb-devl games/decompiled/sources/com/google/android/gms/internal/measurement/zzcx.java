package com.google.android.gms.internal.measurement;

import android.os.Handler;

/* loaded from: classes2.dex */
final class zzcx implements zzca {
    private final /* synthetic */ Runnable zzabo;
    private final /* synthetic */ zzcu zzabp;

    zzcx(zzcu zzcuVar, Runnable runnable) {
        this.zzabp = zzcuVar;
        this.zzabo = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final void zza(Throwable th) {
        Handler handler;
        handler = this.zzabp.handler;
        handler.post(this.zzabo);
    }
}
