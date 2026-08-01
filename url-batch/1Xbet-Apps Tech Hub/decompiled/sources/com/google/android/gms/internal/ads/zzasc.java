package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzasc implements Runnable {
    final /* synthetic */ zzasd zza;

    zzasc(zzasd zzasdVar) {
        this.zza = zzasdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzatj zzatjVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzasd.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbdc.zzco.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzatjVar = this.zza.zze;
                    zzasd.zza = zzfpv.zzb(zzatjVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzasd.zzc;
            conditionVariable2.open();
        }
    }
}
