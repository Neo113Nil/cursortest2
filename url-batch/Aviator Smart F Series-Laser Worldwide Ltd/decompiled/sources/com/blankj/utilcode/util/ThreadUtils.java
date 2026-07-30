package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ThreadUtils {
    private static final byte TYPE_CACHED = -2;
    private static final byte TYPE_CPU = -8;
    private static final byte TYPE_IO = -4;
    private static final byte TYPE_SINGLE = -1;
    private static Executor sDeliver;
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final Map<Integer, Map<Integer, ExecutorService>> TYPE_PRIORITY_POOLS = new HashMap();
    private static final Map<e, ExecutorService> TASK_POOL_MAP = new ConcurrentHashMap();
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final Timer TIMER = new Timer();

    private static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile f mPool;

        LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        LinkedBlockingQueue4Util(boolean z7) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z7) {
                this.mCapacity = 0;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer((LinkedBlockingQueue4Util) runnable);
            }
            return false;
        }

        LinkedBlockingQueue4Util(int i8) {
            this.mCapacity = i8;
        }
    }

    static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        class a extends Thread {
            a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                }
            }
        }

        class b implements Thread.UncaughtExceptionHandler {
            b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        UtilsThreadFactory(String str, int i8) {
            this(str, i8, false);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            a aVar = new a(runnable, this.namePrefix + getAndIncrement());
            aVar.setDaemon(this.isDaemon);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.priority);
            return aVar;
        }

        UtilsThreadFactory(String str, int i8, boolean z7) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i8;
            this.isDaemon = z7;
        }
    }

    static class a extends TimerTask {
        final /* synthetic */ ExecutorService val$pool;
        final /* synthetic */ e val$task;

        a(ExecutorService executorService, e eVar) {
            this.val$pool = executorService;
            this.val$task = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.val$pool.execute(this.val$task);
        }
    }

    static class b extends TimerTask {
        final /* synthetic */ ExecutorService val$pool;
        final /* synthetic */ e val$task;

        b(ExecutorService executorService, e eVar) {
            this.val$pool = executorService;
            this.val$task = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.val$pool.execute(this.val$task);
        }
    }

    static class c implements Executor {
        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            ThreadUtils.runOnUiThread(runnable);
        }
    }

    public static abstract class d extends e {
        @Override // com.blankj.utilcode.util.ThreadUtils.e
        public void onCancel() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        public void onFail(Throwable th) {
            Log.e("ThreadUtils", "onFail: ", th);
        }
    }

    public static abstract class e implements Runnable {
        private static final int CANCELLED = 4;
        private static final int COMPLETING = 3;
        private static final int EXCEPTIONAL = 2;
        private static final int INTERRUPTED = 5;
        private static final int NEW = 0;
        private static final int RUNNING = 1;
        private static final int TIMEOUT = 6;
        private Executor deliver;
        private volatile boolean isSchedule;
        private InterfaceC0148e mTimeoutListener;
        private long mTimeoutMillis;
        private Timer mTimer;
        private volatile Thread runner;
        private final AtomicInteger state = new AtomicInteger(0);

        class a implements Runnable {
            final /* synthetic */ Object val$result;

            a(Object obj) {
                this.val$result = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.onSuccess(this.val$result);
            }
        }

        class b implements Runnable {
            final /* synthetic */ Object val$result;

            b(Object obj) {
                this.val$result = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.onSuccess(this.val$result);
                e.this.onDone();
            }
        }

        class c implements Runnable {
            final /* synthetic */ Throwable val$throwable;

            c(Throwable th) {
                this.val$throwable = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.onFail(this.val$throwable);
                e.this.onDone();
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.onCancel();
                e.this.onDone();
            }
        }

        /* renamed from: com.blankj.utilcode.util.ThreadUtils$e$e, reason: collision with other inner class name */
        public interface InterfaceC0148e {
        }

        static /* synthetic */ InterfaceC0148e access$400(e eVar) {
            eVar.getClass();
            return null;
        }

        private Executor getDeliver() {
            Executor executor = this.deliver;
            return executor == null ? ThreadUtils.getGlobalDeliver() : executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedule(boolean z7) {
            this.isSchedule = z7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void timeout() {
            synchronized (this.state) {
                try {
                    if (this.state.get() > 1) {
                        return;
                    }
                    this.state.set(6);
                    if (this.runner != null) {
                        this.runner.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void cancel() {
            cancel(true);
        }

        public abstract Object doInBackground();

        public boolean isCanceled() {
            return this.state.get() >= 4;
        }

        public boolean isDone() {
            return this.state.get() > 1;
        }

        public abstract void onCancel();

        @CallSuper
        protected void onDone() {
            ThreadUtils.TASK_POOL_MAP.remove(this);
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
            }
        }

        public abstract void onFail(Throwable th);

        public abstract void onSuccess(Object obj);

        @Override // java.lang.Runnable
        public void run() {
            if (this.isSchedule) {
                if (this.runner == null) {
                    if (!this.state.compareAndSet(0, 1)) {
                        return;
                    } else {
                        this.runner = Thread.currentThread();
                    }
                } else if (this.state.get() != 1) {
                    return;
                }
            } else if (!this.state.compareAndSet(0, 1)) {
                return;
            } else {
                this.runner = Thread.currentThread();
            }
            try {
                Object doInBackground = doInBackground();
                if (this.isSchedule) {
                    if (this.state.get() != 1) {
                        return;
                    }
                    getDeliver().execute(new a(doInBackground));
                } else if (this.state.compareAndSet(1, 3)) {
                    getDeliver().execute(new b(doInBackground));
                }
            } catch (InterruptedException unused) {
                this.state.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.state.compareAndSet(1, 2)) {
                    getDeliver().execute(new c(th));
                }
            }
        }

        public e setDeliver(Executor executor) {
            this.deliver = executor;
            return this;
        }

        public e setTimeout(long j8, InterfaceC0148e interfaceC0148e) {
            this.mTimeoutMillis = j8;
            return this;
        }

        public void cancel(boolean z7) {
            synchronized (this.state) {
                try {
                    if (this.state.get() > 1) {
                        return;
                    }
                    this.state.set(4);
                    if (z7 && this.runner != null) {
                        this.runner.interrupt();
                    }
                    getDeliver().execute(new d());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static final class f extends ThreadPoolExecutor {
        private final AtomicInteger mSubmittedCount;
        private LinkedBlockingQueue4Util mWorkQueue;

        f(int i8, int i9, long j8, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i8, i9, j8, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.mSubmittedCount = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.mWorkQueue = linkedBlockingQueue4Util;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService createPool(int i8, int i9) {
            if (i8 == -8) {
                return new f(ThreadUtils.CPU_COUNT + 1, (ThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i9));
            }
            if (i8 == -4) {
                return new f((ThreadUtils.CPU_COUNT * 2) + 1, (ThreadUtils.CPU_COUNT * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i9));
            }
            if (i8 == -2) {
                return new f(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i9));
            }
            if (i8 == -1) {
                return new f(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i9));
            }
            return new f(i8, i8, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i8 + ")", i9));
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.mSubmittedCount.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.mWorkQueue.offer(runnable);
            } catch (Throwable unused2) {
                this.mSubmittedCount.decrementAndGet();
            }
        }
    }

    public static void cancel(e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.cancel();
    }

    private static <T> void execute(ExecutorService executorService, e eVar) {
        execute(executorService, eVar, 0L, 0L, null);
    }

    private static <T> void executeAtFixedRate(ExecutorService executorService, e eVar, long j8, long j9, TimeUnit timeUnit) {
        execute(executorService, eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByCached(e eVar) {
        execute(getPoolByTypeAndPriority(-2), eVar);
    }

    public static <T> void executeByCachedAtFixRate(e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-2), eVar, j8, timeUnit);
    }

    public static <T> void executeByCpu(e eVar) {
        execute(getPoolByTypeAndPriority(-8), eVar);
    }

    public static <T> void executeByCpuAtFixRate(e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-8), eVar, j8, timeUnit);
    }

    public static <T> void executeByCustom(ExecutorService executorService, e eVar) {
        execute(executorService, eVar);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByCustomWithDelay(ExecutorService executorService, e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(executorService, eVar, j8, timeUnit);
    }

    public static <T> void executeByFixed(@IntRange(from = 1) int i8, e eVar) {
        execute(getPoolByTypeAndPriority(i8), eVar);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i8, e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@IntRange(from = 1) int i8, e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(i8), eVar, j8, timeUnit);
    }

    public static <T> void executeByIo(e eVar) {
        execute(getPoolByTypeAndPriority(-4), eVar);
    }

    public static <T> void executeByIoAtFixRate(e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByIoWithDelay(e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-4), eVar, j8, timeUnit);
    }

    public static <T> void executeBySingle(e eVar) {
        execute(getPoolByTypeAndPriority(-1), eVar);
    }

    public static <T> void executeBySingleAtFixRate(e eVar, long j8, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(e eVar, long j8, TimeUnit timeUnit) {
        executeWithDelay(getPoolByTypeAndPriority(-1), eVar, j8, timeUnit);
    }

    private static <T> void executeWithDelay(ExecutorService executorService, e eVar, long j8, TimeUnit timeUnit) {
        execute(executorService, eVar, j8, 0L, timeUnit);
    }

    public static ExecutorService getCachedPool() {
        return getPoolByTypeAndPriority(-2);
    }

    public static ExecutorService getCpuPool() {
        return getPoolByTypeAndPriority(-8);
    }

    public static ExecutorService getFixedPool(@IntRange(from = 1) int i8) {
        return getPoolByTypeAndPriority(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Executor getGlobalDeliver() {
        if (sDeliver == null) {
            sDeliver = new c();
        }
        return sDeliver;
    }

    public static ExecutorService getIoPool() {
        return getPoolByTypeAndPriority(-4);
    }

    public static Handler getMainHandler() {
        return HANDLER;
    }

    private static ExecutorService getPoolByTypeAndPriority(int i8) {
        return getPoolByTypeAndPriority(i8, 5);
    }

    public static ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void runOnUiThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j8) {
        HANDLER.postDelayed(runnable, j8);
    }

    public static void setDeliver(Executor executor) {
        sDeliver = executor;
    }

    public static void cancel(e... eVarArr) {
        if (eVarArr == null || eVarArr.length == 0) {
            return;
        }
        for (e eVar : eVarArr) {
            if (eVar != null) {
                eVar.cancel();
            }
        }
    }

    private static <T> void execute(ExecutorService executorService, e eVar, long j8, long j9, TimeUnit timeUnit) {
        Map<e, ExecutorService> map = TASK_POOL_MAP;
        synchronized (map) {
            try {
                if (map.get(eVar) != null) {
                    Log.e("ThreadUtils", "Task can only be executed once.");
                    return;
                }
                map.put(eVar, executorService);
                if (j9 != 0) {
                    eVar.setSchedule(true);
                    TIMER.scheduleAtFixedRate(new b(executorService, eVar), timeUnit.toMillis(j8), timeUnit.toMillis(j9));
                } else if (j8 == 0) {
                    executorService.execute(eVar);
                } else {
                    TIMER.schedule(new a(executorService, eVar), timeUnit.toMillis(j8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T> void executeByCached(e eVar, @IntRange(from = 1, to = 10) int i8) {
        execute(getPoolByTypeAndPriority(-2, i8), eVar);
    }

    public static <T> void executeByCachedAtFixRate(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByCachedWithDelay(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeWithDelay(getPoolByTypeAndPriority(-2, i8), eVar, j8, timeUnit);
    }

    public static <T> void executeByCpu(e eVar, @IntRange(from = 1, to = 10) int i8) {
        execute(getPoolByTypeAndPriority(-8, i8), eVar);
    }

    public static <T> void executeByCpuAtFixRate(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByCpuWithDelay(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeWithDelay(getPoolByTypeAndPriority(-8, i8), eVar, j8, timeUnit);
    }

    public static <T> void executeByCustomAtFixRate(ExecutorService executorService, e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(executorService, eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByFixed(@IntRange(from = 1) int i8, e eVar, @IntRange(from = 1, to = 10) int i9) {
        execute(getPoolByTypeAndPriority(i8, i9), eVar);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i8, e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i9) {
        executeAtFixedRate(getPoolByTypeAndPriority(i8, i9), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByFixedWithDelay(@IntRange(from = 1) int i8, e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i9) {
        executeWithDelay(getPoolByTypeAndPriority(i8, i9), eVar, j8, timeUnit);
    }

    public static <T> void executeByIo(e eVar, @IntRange(from = 1, to = 10) int i8) {
        execute(getPoolByTypeAndPriority(-4, i8), eVar);
    }

    public static <T> void executeByIoAtFixRate(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeByIoWithDelay(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeWithDelay(getPoolByTypeAndPriority(-4, i8), eVar, j8, timeUnit);
    }

    public static <T> void executeBySingle(e eVar, @IntRange(from = 1, to = 10) int i8) {
        execute(getPoolByTypeAndPriority(-1, i8), eVar);
    }

    public static <T> void executeBySingleAtFixRate(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i8), eVar, 0L, j8, timeUnit);
    }

    public static <T> void executeBySingleWithDelay(e eVar, long j8, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeWithDelay(getPoolByTypeAndPriority(-1, i8), eVar, j8, timeUnit);
    }

    public static ExecutorService getCachedPool(@IntRange(from = 1, to = 10) int i8) {
        return getPoolByTypeAndPriority(-2, i8);
    }

    public static ExecutorService getCpuPool(@IntRange(from = 1, to = 10) int i8) {
        return getPoolByTypeAndPriority(-8, i8);
    }

    public static ExecutorService getFixedPool(@IntRange(from = 1) int i8, @IntRange(from = 1, to = 10) int i9) {
        return getPoolByTypeAndPriority(i8, i9);
    }

    public static ExecutorService getIoPool(@IntRange(from = 1, to = 10) int i8) {
        return getPoolByTypeAndPriority(-4, i8);
    }

    private static ExecutorService getPoolByTypeAndPriority(int i8, int i9) {
        ExecutorService executorService;
        Map<Integer, Map<Integer, ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i8));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorService = f.createPool(i8, i9);
                    concurrentHashMap.put(Integer.valueOf(i9), executorService);
                    map.put(Integer.valueOf(i8), concurrentHashMap);
                } else {
                    executorService = map2.get(Integer.valueOf(i9));
                    if (executorService == null) {
                        executorService = f.createPool(i8, i9);
                        map2.put(Integer.valueOf(i9), executorService);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static ExecutorService getSinglePool(@IntRange(from = 1, to = 10) int i8) {
        return getPoolByTypeAndPriority(-1, i8);
    }

    public static <T> void executeByCachedAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i8, e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(i8), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByCachedAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-2, i8), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByCpuAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-8, i8), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByFixedAtFixRate(@IntRange(from = 1) int i8, e eVar, long j8, long j9, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i9) {
        executeAtFixedRate(getPoolByTypeAndPriority(i8, i9), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeByIoAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-4, i8), eVar, j8, j9, timeUnit);
    }

    public static <T> void executeBySingleAtFixRate(e eVar, long j8, long j9, TimeUnit timeUnit, @IntRange(from = 1, to = 10) int i8) {
        executeAtFixedRate(getPoolByTypeAndPriority(-1, i8), eVar, j8, j9, timeUnit);
    }

    public static void cancel(List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (e eVar : list) {
            if (eVar != null) {
                eVar.cancel();
            }
        }
    }

    public static void cancel(ExecutorService executorService) {
        if (executorService instanceof f) {
            for (Map.Entry<e, ExecutorService> entry : TASK_POOL_MAP.entrySet()) {
                if (entry.getValue() == executorService) {
                    cancel(entry.getKey());
                }
            }
            return;
        }
        Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
    }
}
