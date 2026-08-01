package com.bytedance.sdk.component.so;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TTThreadFactory.java */
/* loaded from: classes.dex */
public class Mxy implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    private final AtomicInteger Jd;
    protected final String icD;
    protected final ThreadGroup pvs;
    protected int vG;

    public Mxy(String str) {
        this(5, str);
    }

    public Mxy(int i, String str) {
        this.Jd = new AtomicInteger(1);
        this.vG = i;
        this.pvs = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.icD = THREAD_NAME_PRE.concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread pvs = pvs(this.pvs, runnable, this.icD + this.Jd.getAndIncrement());
        if (pvs.isDaemon()) {
            pvs.setDaemon(false);
        }
        int i = this.vG;
        if (i > 10 || i <= 0) {
            this.vG = 5;
        }
        pvs.setPriority(this.vG);
        return pvs;
    }

    protected Thread pvs(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
