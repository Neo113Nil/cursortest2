package cn.hutool.core.thread;

import cn.hutool.core.exceptions.UtilException;
import java.io.Closeable;
import java.lang.Thread;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class g implements Closeable {
    private CountDownLatch endLatch;
    private Thread.UncaughtExceptionHandler exceptionHandler;
    private ExecutorService executorService;
    private boolean isBeginAtSameTime;
    private final int threadSize;
    private final CountDownLatch beginLatch = new CountDownLatch(1);
    private final Set<c> workers = new LinkedHashSet();

    class a extends c {
        final /* synthetic */ Runnable val$runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
            super();
            this.val$runnable = runnable;
        }

        @Override // cn.hutool.core.thread.g.c
        public void work() {
            this.val$runnable.run();
        }
    }

    class b extends c {
        final /* synthetic */ Runnable val$runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super();
            this.val$runnable = runnable;
        }

        @Override // cn.hutool.core.thread.g.c
        public void work() {
            this.val$runnable.run();
        }
    }

    public abstract class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.isBeginAtSameTime) {
                try {
                    g.this.beginLatch.await();
                } catch (InterruptedException e8) {
                    throw new UtilException(e8);
                }
            }
            try {
                work();
            } finally {
                g.this.endLatch.countDown();
            }
        }

        public abstract void work();
    }

    public g(int i8) {
        this.threadSize = i8;
    }

    private ExecutorService buildExecutor() {
        return ExecutorBuilder.create().setCorePoolSize(this.threadSize).setThreadFactory(new f("hutool-", null, false, this.exceptionHandler)).build();
    }

    public g addRepeatWorker(Runnable runnable) {
        for (int i8 = 0; i8 < this.threadSize; i8++) {
            addWorker((c) new a(runnable));
        }
        return this;
    }

    public g addWorker(Runnable runnable) {
        return addWorker((c) new b(runnable));
    }

    public void clearWorker() {
        this.workers.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
    }

    public long count() {
        return this.endLatch.getCount();
    }

    public g setBeginAtSameTime(boolean z7) {
        this.isBeginAtSameTime = z7;
        return this;
    }

    public g setExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.exceptionHandler = uncaughtExceptionHandler;
        return this;
    }

    public void start() {
        start(true);
    }

    public void stop() {
        ExecutorService executorService = this.executorService;
        if (executorService != null) {
            executorService.shutdown();
            this.executorService = null;
        }
        clearWorker();
    }

    public void stopNow() {
        ExecutorService executorService = this.executorService;
        if (executorService != null) {
            executorService.shutdownNow();
            this.executorService = null;
        }
        clearWorker();
    }

    public synchronized g addWorker(c cVar) {
        this.workers.add(cVar);
        return this;
    }

    public void start(boolean z7) {
        this.endLatch = new CountDownLatch(this.workers.size());
        ExecutorService executorService = this.executorService;
        if (executorService == null || executorService.isShutdown()) {
            this.executorService = buildExecutor();
        }
        for (c cVar : this.workers) {
            if (this.exceptionHandler != null) {
                this.executorService.execute(cVar);
            } else {
                this.executorService.submit(cVar);
            }
        }
        this.beginLatch.countDown();
        if (z7) {
            try {
                this.endLatch.await();
            } catch (InterruptedException e8) {
                throw new UtilException(e8);
            }
        }
    }
}
