package com.bytedance.sdk.openadsdk.kj;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashMonitor.java */
/* loaded from: classes2.dex */
public class icD {
    private int Jd;
    private pvs NB;
    private so icD;
    private ScheduledExecutorService pvs = null;
    private long vG = 0;

    /* compiled from: CrashMonitor.java */
    public interface pvs {
    }

    public icD(so soVar, int i) {
        this.icD = soVar;
        this.Jd = i;
    }

    public void pvs(long j) {
        this.vG = j;
    }

    public void pvs(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.pvs = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.kj.icD.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = icD.this.vG;
                if (System.currentTimeMillis() - icD.this.vG > icD.this.Jd) {
                    icD.this.pvs.shutdown();
                    if (icD.this.icD != null) {
                        icD.this.icD.icD(0, "Automatic detection of stuck");
                    }
                    if (icD.this.NB != null) {
                        pvs unused2 = icD.this.NB;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void pvs() {
        ScheduledExecutorService scheduledExecutorService = this.pvs;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean icD() {
        ScheduledExecutorService scheduledExecutorService = this.pvs;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
