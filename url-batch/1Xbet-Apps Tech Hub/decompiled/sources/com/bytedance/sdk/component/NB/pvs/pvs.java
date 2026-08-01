package com.bytedance.sdk.component.NB.pvs;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultThreadFactory.java */
/* loaded from: classes.dex */
public class pvs implements ThreadFactory {
    private final AtomicInteger icD = new AtomicInteger(1);
    private final ThreadGroup pvs;

    public pvs(String str) {
        this.pvs = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.pvs, runnable, "tt_img_" + this.icD.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
