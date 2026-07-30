package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* loaded from: classes3.dex */
abstract class zzf extends zze {
    private boolean zza;

    zzf(zzge zzgeVar) {
        super(zzgeVar);
        this.zzt.zzD();
    }

    protected final void zza() {
        if (!zze()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzt.zzB();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzt.zzB();
        this.zza = true;
    }

    @WorkerThread
    protected void zzd() {
    }

    final boolean zze() {
        return this.zza;
    }

    protected abstract boolean zzf();
}
