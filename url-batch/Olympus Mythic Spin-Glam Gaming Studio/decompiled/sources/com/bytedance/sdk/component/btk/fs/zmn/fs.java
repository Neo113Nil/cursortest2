package com.bytedance.sdk.component.btk.fs.zmn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class fs {
    private static final TimeUnit zmn = TimeUnit.SECONDS;

    public static ExecutorService zmn() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, zmn, new LinkedBlockingQueue(), new zmn("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
