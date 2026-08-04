package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgpn implements Runnable {
    zzgpp zza;

    zzgpn(zzgpp zzgppVar) {
        this.zza = zzgppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture zzf;
        zzgpp zzgppVar = this.zza;
        if (zzgppVar == null || (zzf = zzgppVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (zzf.isDone()) {
            zzgppVar.zzk(zzf);
            return;
        }
        try {
            ScheduledFuture zzx = zzgppVar.zzx();
            zzgppVar.zzy(null);
            String str = "Timed out";
            if (zzx != null) {
                try {
                    long abs = Math.abs(zzx.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    zzgppVar.zzb(new zzgpo(str, null));
                    throw th;
                }
            }
            String obj = zzf.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzgppVar.zzb(new zzgpo(sb2.toString(), null));
        } finally {
            zzf.cancel(true);
        }
    }
}
