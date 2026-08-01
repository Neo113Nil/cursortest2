package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgbu implements Runnable {

    @CheckForNull
    zzgbx zza;

    zzgbu(zzgbx zzgbxVar) {
        this.zza = zzgbxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ListenableFuture listenableFuture;
        ScheduledFuture scheduledFuture;
        zzgbx zzgbxVar = this.zza;
        if (zzgbxVar == null || listenableFuture == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzgbxVar.zzs(listenableFuture);
            return;
        }
        try {
            scheduledFuture = zzgbxVar.zzb;
            zzgbxVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgbxVar.zzd(new zzgbw(str, null));
                    throw th;
                }
            }
            zzgbxVar.zzd(new zzgbw(str + ": " + listenableFuture.toString(), null));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
