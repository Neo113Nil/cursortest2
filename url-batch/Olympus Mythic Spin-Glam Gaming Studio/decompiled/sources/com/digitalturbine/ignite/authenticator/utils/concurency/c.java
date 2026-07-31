package com.digitalturbine.ignite.authenticator.utils.concurency;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class c {
    public static final ThreadPoolExecutor a;
    public static final Handler b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(5), new a(), new b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
    }
}
