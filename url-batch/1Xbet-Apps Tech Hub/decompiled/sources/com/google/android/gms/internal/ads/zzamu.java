package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzamu extends Thread {
    private final BlockingQueue zza;
    private final zzamt zzb;
    private final zzamk zzc;
    private volatile boolean zzd = false;
    private final zzamr zze;

    public zzamu(BlockingQueue blockingQueue, zzamt zzamtVar, zzamk zzamkVar, zzamr zzamrVar) {
        this.zza = blockingQueue;
        this.zzb = zzamtVar;
        this.zzc = zzamkVar;
        this.zze = zzamrVar;
    }

    private void zzb() throws InterruptedException {
        zzana zzanaVar = (zzana) this.zza.take();
        SystemClock.elapsedRealtime();
        zzanaVar.zzt(3);
        try {
            try {
                zzanaVar.zzm("network-queue-take");
                zzanaVar.zzw();
                TrafficStats.setThreadStatsTag(zzanaVar.zzc());
                zzamw zza = this.zzb.zza(zzanaVar);
                zzanaVar.zzm("network-http-complete");
                if (zza.zze && zzanaVar.zzv()) {
                    zzanaVar.zzp("not-modified");
                    zzanaVar.zzr();
                } else {
                    zzang zzh = zzanaVar.zzh(zza);
                    zzanaVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzanaVar.zzj(), zzh.zzb);
                        zzanaVar.zzm("network-cache-written");
                    }
                    zzanaVar.zzq();
                    this.zze.zzb(zzanaVar, zzh, null);
                    zzanaVar.zzs(zzh);
                }
            } catch (zzanj e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzanaVar, e);
                zzanaVar.zzr();
            } catch (Exception e2) {
                zzanm.zzc(e2, "Unhandled exception %s", e2.toString());
                zzanj zzanjVar = new zzanj(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzanaVar, zzanjVar);
                zzanaVar.zzr();
            }
        } finally {
            zzanaVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzanm.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
