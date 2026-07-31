package com.bytedance.sdk.openadsdk.doe;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class fs {
    private zmn btk;
    private int fb;
    private zg fs;
    private ScheduledExecutorService zmn = null;
    private long zn = 0;

    public interface zmn {
    }

    public fs(zg zgVar, int i) {
        this.fs = zgVar;
        this.fb = i;
    }

    public void zmn(long j) {
        this.zn = j;
    }

    public void zmn(int i) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.zmn = newScheduledThreadPool;
        newScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.doe.fs.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = fs.this.zn;
                if (System.currentTimeMillis() - fs.this.zn > fs.this.fb) {
                    fs.this.zmn.shutdown();
                    if (fs.this.fs != null) {
                        fs.this.fs.fs(0, "Automatic detection of stuck");
                    }
                    if (fs.this.btk != null) {
                        zmn unused2 = fs.this.btk;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void zmn() {
        ScheduledExecutorService scheduledExecutorService = this.zmn;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean fs() {
        ScheduledExecutorService scheduledExecutorService = this.zmn;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
