package cn.hutool.core.thread;

import cn.hutool.core.exceptions.UtilException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class e {
    private static ExecutorService executor;

    static {
        init();
    }

    private e() {
    }

    public static void execute(Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            throw new UtilException(e8, "Exception when running task!", new Object[0]);
        }
    }

    public static ExecutorService getExecutor() {
        return executor;
    }

    public static synchronized void init() {
        synchronized (e.class) {
            try {
                ExecutorService executorService = executor;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                executor = ExecutorBuilder.create().useSynchronousQueue().build();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void shutdown(boolean z7) {
        synchronized (e.class) {
            try {
                ExecutorService executorService = executor;
                if (executorService != null) {
                    if (z7) {
                        executorService.shutdownNow();
                    } else {
                        executorService.shutdown();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        return executor.submit(callable);
    }

    public static Future<?> submit(Runnable runnable) {
        return executor.submit(runnable);
    }
}
