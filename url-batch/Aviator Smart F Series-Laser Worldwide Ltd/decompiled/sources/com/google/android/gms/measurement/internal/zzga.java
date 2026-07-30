package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
final class zzga extends Thread {
    final /* synthetic */ zzgb zza;
    private final Object zzb;
    private final BlockingQueue zzc;

    @GuardedBy("threadLifeCycleLock")
    private boolean zzd = false;

    public zzga(zzgb zzgbVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzgbVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzga zzgaVar;
        zzga zzgaVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            try {
                if (!this.zzd) {
                    semaphore = this.zza.zzi;
                    semaphore.release();
                    obj2 = this.zza.zzh;
                    obj2.notifyAll();
                    zzgb zzgbVar = this.zza;
                    zzgaVar = zzgbVar.zzb;
                    if (this == zzgaVar) {
                        zzgbVar.zzb = null;
                    } else {
                        zzgaVar2 = zzgbVar.zzc;
                        if (this == zzgaVar2) {
                            zzgbVar.zzc = null;
                        } else {
                            zzgbVar.zzt.zzaA().zzd().zza("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.zzd = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzt.zzaA().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z7 = false;
        while (!z7) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z7 = true;
            } catch (InterruptedException e8) {
                zzc(e8);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfz zzfzVar = (zzfz) this.zzc.poll();
                if (zzfzVar != null) {
                    Process.setThreadPriority(true != zzfzVar.zza ? 10 : threadPriority);
                    zzfzVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzgb.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e9) {
                                zzc(e9);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}
