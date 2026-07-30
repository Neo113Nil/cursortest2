package com.baidu.ar;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class sc {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3214a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f3215b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3216c;

    /* renamed from: d, reason: collision with root package name */
    public static ThreadPoolExecutor f3217d;

    /* renamed from: e, reason: collision with root package name */
    public static ThreadPoolExecutor f3218e;

    /* renamed from: f, reason: collision with root package name */
    public static ThreadPoolExecutor f3219f;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f3214a = availableProcessors;
        int i8 = availableProcessors + 1;
        f3215b = i8;
        int i9 = (availableProcessors * 2) + 1;
        f3216c = i9;
        Log.d("ThreadPoolFactory", "CPU_COUNT = " + availableProcessors + ", CORE_POOL_SIZE = " + i8 + ", MAXIMUM_POOL_SIZE = " + i9 + ", KEEP_ALIVE = 15");
        new LinkedBlockingQueue(128);
        new LinkedBlockingQueue(128);
        new LinkedBlockingQueue(128);
        f3217d = null;
        f3218e = null;
        f3219f = null;
    }

    public static void a() {
        try {
            a(f3219f);
            a(f3217d);
            a(f3218e);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void a(ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
