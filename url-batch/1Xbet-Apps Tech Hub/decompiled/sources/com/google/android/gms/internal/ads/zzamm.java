package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzamm extends Thread {
    private static final boolean zza = zzanm.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzamk zzd;
    private volatile boolean zze = false;
    private final zzann zzf;
    private final zzamr zzg;

    public zzamm(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzamk zzamkVar, zzamr zzamrVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzamkVar;
        this.zzg = zzamrVar;
        this.zzf = new zzann(this, blockingQueue2, zzamrVar);
    }

    private void zzc() throws InterruptedException {
        zzana zzanaVar = (zzana) this.zzb.take();
        zzanaVar.zzm("cache-queue-take");
        zzanaVar.zzt(1);
        try {
            zzanaVar.zzw();
            zzamj zza2 = this.zzd.zza(zzanaVar.zzj());
            if (zza2 == null) {
                zzanaVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzanaVar)) {
                    this.zzc.put(zzanaVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzanaVar.zzm("cache-hit-expired");
                    zzanaVar.zze(zza2);
                    if (!this.zzf.zzc(zzanaVar)) {
                        this.zzc.put(zzanaVar);
                    }
                } else {
                    zzanaVar.zzm("cache-hit");
                    zzang zzh = zzanaVar.zzh(new zzamw(zza2.zza, zza2.zzg));
                    zzanaVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzanaVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzanaVar.zzj(), true);
                        zzanaVar.zze(null);
                        if (!this.zzf.zzc(zzanaVar)) {
                            this.zzc.put(zzanaVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzanaVar.zzm("cache-hit-refresh-needed");
                        zzanaVar.zze(zza2);
                        zzh.zzd = true;
                        if (this.zzf.zzc(zzanaVar)) {
                            this.zzg.zzb(zzanaVar, zzh, null);
                        } else {
                            this.zzg.zzb(zzanaVar, zzh, new zzaml(this, zzanaVar));
                        }
                    } else {
                        this.zzg.zzb(zzanaVar, zzh, null);
                    }
                }
            }
        } finally {
            zzanaVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzanm.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzanm.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
