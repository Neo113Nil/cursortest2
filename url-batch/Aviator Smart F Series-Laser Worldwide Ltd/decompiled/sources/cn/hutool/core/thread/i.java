package cn.hutool.core.thread;

import cn.hutool.core.util.z0;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public class i {
    public static b concurrencyTest(int i8, Runnable runnable) {
        return new b(i8).test(runnable);
    }

    public static ScheduledThreadPoolExecutor createScheduledExecutor(int i8) {
        return new ScheduledThreadPoolExecutor(i8);
    }

    public static ThreadFactory createThreadFactory(String str) {
        return ThreadFactoryBuilder.create().setNamePrefix(str).build();
    }

    public static ThreadFactoryBuilder createThreadFactoryBuilder() {
        return ThreadFactoryBuilder.create();
    }

    public static <T> ThreadLocal<T> createThreadLocal(boolean z7) {
        return z7 ? new InheritableThreadLocal() : new ThreadLocal<>();
    }

    public static ThreadGroup currentThreadGroup() {
        SecurityManager securityManager = System.getSecurityManager();
        return securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
    }

    public static Runnable execAsync(Runnable runnable, boolean z7) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(z7);
        thread.start();
        return runnable;
    }

    public static void execute(Runnable runnable) {
        e.execute(runnable);
    }

    public static Thread getMainThread() {
        for (Thread thread : getThreads()) {
            if (thread.getId() == 1) {
                return thread;
            }
        }
        return null;
    }

    public static StackTraceElement[] getStackTrace() {
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement getStackTraceElement(int i8) {
        StackTraceElement[] stackTrace = getStackTrace();
        if (i8 < 0) {
            i8 += stackTrace.length;
        }
        return stackTrace[i8];
    }

    public static Thread[] getThreads() {
        return getThreads(Thread.currentThread().getThreadGroup().getParent());
    }

    public static void interrupt(Thread thread, boolean z7) {
        if (thread == null || thread.isInterrupted()) {
            return;
        }
        thread.interrupt();
        if (z7) {
            waitForDie(thread);
        }
    }

    public static <T> CompletionService<T> newCompletionService() {
        return new ExecutorCompletionService(e.getExecutor());
    }

    public static CountDownLatch newCountDownLatch(int i8) {
        return new CountDownLatch(i8);
    }

    public static ExecutorService newExecutor(int i8) {
        ExecutorBuilder create = ExecutorBuilder.create();
        if (i8 > 0) {
            create.setCorePoolSize(i8);
        }
        return create.build();
    }

    public static ThreadPoolExecutor newExecutorByBlockingCoefficient(float f8) {
        if (f8 >= 1.0f || f8 < 0.0f) {
            throw new IllegalArgumentException("[blockingCoefficient] must between 0 and 1, or equals 0.");
        }
        int processorCount = (int) (z0.getProcessorCount() / (1.0f - f8));
        return ExecutorBuilder.create().setCorePoolSize(processorCount).setMaxPoolSize(processorCount).setKeepAliveTime(0L).build();
    }

    public static ExecutorService newFixedExecutor(int i8, String str, boolean z7) {
        return newFixedExecutor(i8, 1024, str, z7);
    }

    public static ThreadFactory newNamedThreadFactory(String str, boolean z7) {
        return new f(str, z7);
    }

    public static ExecutorService newSingleExecutor() {
        return ExecutorBuilder.create().setCorePoolSize(1).setMaxPoolSize(1).setKeepAliveTime(0L).buildFinalizable();
    }

    public static Thread newThread(Runnable runnable, String str) {
        Thread newThread = newThread(runnable, str, false);
        if (newThread.getPriority() != 5) {
            newThread.setPriority(5);
        }
        return newThread;
    }

    public static boolean safeSleep(Number number) {
        if (number == null) {
            return true;
        }
        return safeSleep(number.longValue());
    }

    public static ScheduledThreadPoolExecutor schedule(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Runnable runnable, long j8, long j9, boolean z7) {
        return schedule(scheduledThreadPoolExecutor, runnable, j8, j9, TimeUnit.MILLISECONDS, z7);
    }

    public static boolean sleep(Number number, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(number.longValue());
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public static void sync(Object obj) {
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void waitForDie() {
        waitForDie(Thread.currentThread());
    }

    public static Thread[] getThreads(ThreadGroup threadGroup) {
        Thread[] threadArr = new Thread[threadGroup.activeCount() * 2];
        int enumerate = threadGroup.enumerate(threadArr);
        Thread[] threadArr2 = new Thread[enumerate];
        System.arraycopy(threadArr, 0, threadArr2, 0, enumerate);
        return threadArr2;
    }

    public static <T> CompletionService<T> newCompletionService(ExecutorService executorService) {
        return new ExecutorCompletionService(executorService);
    }

    public static ExecutorService newFixedExecutor(int i8, int i9, String str, boolean z7) {
        return newFixedExecutor(i8, i9, str, (z7 ? RejectPolicy.BLOCK : RejectPolicy.ABORT).getValue());
    }

    public static ThreadFactory newNamedThreadFactory(String str, ThreadGroup threadGroup, boolean z7) {
        return new f(str, threadGroup, z7);
    }

    public static boolean safeSleep(long j8) {
        long j9 = 0;
        while (j9 >= 0 && j9 < j8) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!sleep(j8 - j9)) {
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (currentTimeMillis2 <= 0) {
                return true;
            }
            j9 += currentTimeMillis2;
        }
        return true;
    }

    public static ScheduledThreadPoolExecutor schedule(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, Runnable runnable, long j8, long j9, TimeUnit timeUnit, boolean z7) {
        if (scheduledThreadPoolExecutor == null) {
            scheduledThreadPoolExecutor = createScheduledExecutor(2);
        }
        if (z7) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable, j8, j9, timeUnit);
        } else {
            scheduledThreadPoolExecutor.scheduleWithFixedDelay(runnable, j8, j9, timeUnit);
        }
        return scheduledThreadPoolExecutor;
    }

    public static boolean sleep(Number number) {
        if (number == null) {
            return true;
        }
        return sleep(number.longValue());
    }

    public static void waitForDie(Thread thread) {
        if (thread == null) {
            return;
        }
        boolean z7 = false;
        do {
            try {
                thread.join();
                z7 = true;
            } catch (InterruptedException unused) {
            }
        } while (!z7);
    }

    public static <T> ThreadLocal<T> createThreadLocal(Supplier<? extends T> supplier) {
        ThreadLocal<T> withInitial;
        withInitial = ThreadLocal.withInitial(supplier);
        return withInitial;
    }

    public static ThreadFactory newNamedThreadFactory(String str, ThreadGroup threadGroup, boolean z7, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new f(str, threadGroup, z7, uncaughtExceptionHandler);
    }

    public static boolean sleep(long j8) {
        if (j8 <= 0) {
            return true;
        }
        try {
            Thread.sleep(j8);
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public static <T> Future<T> execAsync(Callable<T> callable) {
        return e.submit(callable);
    }

    public static ExecutorService newExecutor() {
        return ExecutorBuilder.create().useSynchronousQueue().build();
    }

    public static Thread newThread(Runnable runnable, String str, boolean z7) {
        Thread thread = new Thread(null, runnable, str);
        thread.setDaemon(z7);
        return thread;
    }

    public static Future<?> execAsync(Runnable runnable) {
        return e.submit(runnable);
    }

    public static ThreadPoolExecutor newExecutor(int i8, int i9) {
        return ExecutorBuilder.create().setCorePoolSize(i8).setMaxPoolSize(i9).build();
    }

    public static ExecutorService newFixedExecutor(int i8, int i9, String str, RejectedExecutionHandler rejectedExecutionHandler) {
        return ExecutorBuilder.create().setCorePoolSize(i8).setMaxPoolSize(i8).setWorkQueue(new LinkedBlockingQueue(i9)).setThreadFactory(createThreadFactory(str)).setHandler(rejectedExecutionHandler).build();
    }

    public static ExecutorService newExecutor(int i8, int i9, int i10) {
        return ExecutorBuilder.create().setCorePoolSize(i8).setMaxPoolSize(i9).setWorkQueue(new LinkedBlockingQueue(i10)).build();
    }
}
