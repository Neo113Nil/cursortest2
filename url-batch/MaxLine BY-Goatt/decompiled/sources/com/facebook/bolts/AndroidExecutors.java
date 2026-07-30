package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AndroidExecutors {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final Companion Companion = new Companion(null);
    private static final AndroidExecutors INSTANCE = new AndroidExecutors();
    private static final long KEEP_ALIVE_TIME = 1;
    private static final int MAX_POOL_SIZE;
    private final Executor uiThread = new UIThreadExecutor();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class UIThreadExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.getClass();
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAX_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    public static final ExecutorService newCachedThreadPool() {
        return Companion.newCachedThreadPool();
    }

    public static final Executor uiThread() {
        return Companion.uiThread();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExecutorService newCachedThreadPool() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(AndroidExecutors.CORE_POOL_SIZE, AndroidExecutors.MAX_POOL_SIZE, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        public final Executor uiThread() {
            return AndroidExecutors.INSTANCE.uiThread;
        }

        private Companion() {
        }
    }
}
