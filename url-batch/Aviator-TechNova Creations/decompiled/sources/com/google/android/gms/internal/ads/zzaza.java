package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzaza implements Runnable {
    final /* synthetic */ zzazb zza;

    zzaza(zzazb zzazbVar) {
        Objects.requireNonNull(zzazbVar);
        this.zza = zzazbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        ConditionVariable conditionVariable2;
        zzazb zzazbVar = this.zza;
        if (zzazbVar.zzb != null) {
            return;
        }
        conditionVariable = zzazb.zzd;
        synchronized (conditionVariable) {
            if (zzazbVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbhe.zzdl.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzazb.zza = zzfxd.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzazb.zzd;
            conditionVariable2.open();
        }
    }
}
