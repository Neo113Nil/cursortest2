package com.bytedance.sdk.component.zg.fs;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class btk implements ThreadFactory {
    public static volatile boolean zn;
    private final AtomicInteger fb = new AtomicInteger(1);
    protected final String fs;
    protected final ThreadGroup zmn;

    public btk(String str) {
        this.zmn = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.fs = zmn(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (zn) {
            return null;
        }
        Thread zmn = zmn(this.zmn, runnable, this.fs + "_" + this.fb.getAndIncrement());
        if (zmn.isDaemon()) {
            zmn.setDaemon(false);
        }
        return zmn;
    }

    protected Thread zmn(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String zmn(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
