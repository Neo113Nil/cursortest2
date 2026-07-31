package com.bytedance.sdk.component.btk.fs.zmn;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes14.dex */
public class zmn implements ThreadFactory {
    private final AtomicInteger fs = new AtomicInteger(1);
    private final ThreadGroup zmn;

    public zmn(String str) {
        this.zmn = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.zmn, runnable, "tt_img_" + this.fs.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
