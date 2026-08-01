package com.bytedance.sdk.component.NB.pvs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPoolFactory.java */
/* loaded from: classes.dex */
public class vG {
    private static final TimeUnit pvs = TimeUnit.SECONDS;

    public static ExecutorService pvs() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, pvs, new LinkedBlockingQueue(), new pvs("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
