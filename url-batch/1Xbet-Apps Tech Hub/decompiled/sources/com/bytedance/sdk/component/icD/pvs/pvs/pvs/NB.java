package com.bytedance.sdk.component.icD.pvs.pvs.pvs;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetDispatcher.java */
/* loaded from: classes.dex */
public class NB extends com.bytedance.sdk.component.icD.pvs.Jd {
    private ExecutorService pvs;
    private List<com.bytedance.sdk.component.icD.pvs.icD> icD = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.icD.pvs.icD> vG = new CopyOnWriteArrayList();
    private AtomicInteger Jd = new AtomicInteger(64);

    public NB() {
        if (this.pvs == null) {
            this.pvs = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.icD.pvs.pvs.pvs.NB.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public ExecutorService icD() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public void pvs(int i) {
        this.Jd.set(i);
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public List<com.bytedance.sdk.component.icD.pvs.icD> vG() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public List<com.bytedance.sdk.component.icD.pvs.icD> Jd() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.Jd
    public int pvs() {
        return this.Jd.get();
    }
}
