package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public class hhw extends com.bytedance.sdk.component.fs.zmn.fb {
    private ExecutorService zmn;
    private List<com.bytedance.sdk.component.fs.zmn.fs> fs = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.fs.zmn.fs> zn = new CopyOnWriteArrayList();
    private AtomicInteger fb = new AtomicInteger(64);

    public hhw() {
        if (this.zmn == null) {
            this.zmn = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.fs.zmn.zmn.zmn.hhw.1
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

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public ExecutorService fs() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public void zmn(int i) {
        this.fb.set(i);
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public List<com.bytedance.sdk.component.fs.zmn.fs> zn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public List<com.bytedance.sdk.component.fs.zmn.fs> fb() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public int zmn() {
        return this.fb.get();
    }
}
