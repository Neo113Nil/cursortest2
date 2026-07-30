package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
abstract class zzap {
    private static volatile Handler zza;
    private final zzgz zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzap(zzgz zzgzVar) {
        Preconditions.checkNotNull(zzgzVar);
        this.zzb = zzgzVar;
        this.zzc = new zzao(this, zzgzVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            try {
                if (zza == null) {
                    zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzaw().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j8) {
        zzb();
        if (j8 >= 0) {
            this.zzd = this.zzb.zzax().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j8)) {
                return;
            }
            this.zzb.zzaA().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j8));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
