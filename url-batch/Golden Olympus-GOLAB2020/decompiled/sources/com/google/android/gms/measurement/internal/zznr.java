package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class zznr implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zznx zzb;

    zznr(zznx zznxVar, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny.zzx(this.zzb.zza, this.zza);
    }
}
