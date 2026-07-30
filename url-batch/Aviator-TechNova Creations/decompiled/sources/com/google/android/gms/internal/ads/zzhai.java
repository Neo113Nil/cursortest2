package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhai implements Runnable {
    zzhak zza;

    zzhai(zzhak zzhakVar) {
        this.zza = zzhakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture zzf;
        zzhak zzhakVar = this.zza;
        if (zzhakVar == null || (zzf = zzhakVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (zzf.isDone()) {
            zzhakVar.zzk(zzf);
            return;
        }
        try {
            ScheduledFuture zzx = zzhakVar.zzx();
            zzhakVar.zzy(null);
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
                    zzhakVar.zzb(new zzhaj(str, null));
                    throw th;
                }
            }
            String obj = zzf.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzhakVar.zzb(new zzhaj(sb2.toString(), null));
        } finally {
            zzf.cancel(true);
        }
    }
}
