package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzhg extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhh<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzhc zzd;

    public zzhg(zzhc zzhcVar, String str, BlockingQueue<zzhh<?>> blockingQueue) {
        this.zzd = zzhcVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzhg zzhgVar;
        zzhg zzhgVar2;
        obj = this.zzd.zzh;
        synchronized (obj) {
            if (!this.zzc) {
                semaphore = this.zzd.zzi;
                semaphore.release();
                obj2 = this.zzd.zzh;
                obj2.notifyAll();
                zzhgVar = this.zzd.zzb;
                if (this == zzhgVar) {
                    this.zzd.zzb = null;
                } else {
                    zzhgVar2 = this.zzd.zzc;
                    if (this == zzhgVar2) {
                        this.zzd.zzc = null;
                    } else {
                        this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                    }
                }
                this.zzc = true;
            }
        }
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzd.zzj().zzu().zza(getName() + " was interrupted", interruptedException);
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.zzd.zzi;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhh<?> poll = this.zzb.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.zza ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null) {
                            z = this.zzd.zzj;
                            if (!z) {
                                try {
                                    this.zza.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                                } catch (InterruptedException e2) {
                                    zza(e2);
                                }
                            }
                        }
                    }
                    obj = this.zzd.zzh;
                    synchronized (obj) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }
}
