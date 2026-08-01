package com.bytedance.sdk.component.so.vG;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PagThreadFactory.java */
/* loaded from: classes.dex */
public class Jd implements ThreadFactory {
    protected final String icD;
    protected final ThreadGroup pvs;
    private final AtomicInteger vG = new AtomicInteger(1);

    public Jd(String str) {
        this.pvs = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.icD = pvs(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread pvs = pvs(this.pvs, runnable, this.icD + "_" + this.vG.getAndIncrement());
        if (pvs.isDaemon()) {
            pvs.setDaemon(false);
        }
        return pvs;
    }

    protected Thread pvs(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String pvs(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
