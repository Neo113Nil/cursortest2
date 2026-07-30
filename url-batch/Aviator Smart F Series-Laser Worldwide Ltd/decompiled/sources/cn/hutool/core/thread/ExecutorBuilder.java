package cn.hutool.core.thread;

import cn.hutool.core.builder.Builder;
import cn.hutool.core.util.e0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ExecutorBuilder implements Builder<ThreadPoolExecutor> {
    public static final int DEFAULT_QUEUE_CAPACITY = 1024;
    private static final long serialVersionUID = 1;
    private Boolean allowCoreThreadTimeOut;
    private int corePoolSize;
    private RejectedExecutionHandler handler;
    private ThreadFactory threadFactory;
    private BlockingQueue<Runnable> workQueue;
    private int maxPoolSize = Integer.MAX_VALUE;
    private long keepAliveTime = TimeUnit.SECONDS.toNanos(60);

    public static ExecutorBuilder create() {
        return new ExecutorBuilder();
    }

    public ExecutorService buildFinalizable() {
        return new d(build());
    }

    public ExecutorBuilder setAllowCoreThreadTimeOut(boolean z7) {
        this.allowCoreThreadTimeOut = Boolean.valueOf(z7);
        return this;
    }

    public ExecutorBuilder setCorePoolSize(int i8) {
        this.corePoolSize = i8;
        return this;
    }

    public ExecutorBuilder setHandler(RejectedExecutionHandler rejectedExecutionHandler) {
        this.handler = rejectedExecutionHandler;
        return this;
    }

    public ExecutorBuilder setKeepAliveTime(long j8) {
        this.keepAliveTime = j8;
        return this;
    }

    public ExecutorBuilder setMaxPoolSize(int i8) {
        this.maxPoolSize = i8;
        return this;
    }

    public ExecutorBuilder setThreadFactory(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        return this;
    }

    public ExecutorBuilder setWorkQueue(BlockingQueue<Runnable> blockingQueue) {
        this.workQueue = blockingQueue;
        return this;
    }

    public ExecutorBuilder useArrayBlockingQueue(int i8) {
        return setWorkQueue(new ArrayBlockingQueue(i8));
    }

    public ExecutorBuilder useSynchronousQueue() {
        return useSynchronousQueue(false);
    }

    @Override // cn.hutool.core.builder.Builder
    public ThreadPoolExecutor build() {
        return build(this);
    }

    public ExecutorBuilder setKeepAliveTime(long j8, TimeUnit timeUnit) {
        return setKeepAliveTime(timeUnit.toNanos(j8));
    }

    public ExecutorBuilder useSynchronousQueue(boolean z7) {
        return setWorkQueue(new SynchronousQueue(z7));
    }

    private static ThreadPoolExecutor build(ExecutorBuilder executorBuilder) {
        int i8 = executorBuilder.corePoolSize;
        int i9 = executorBuilder.maxPoolSize;
        long j8 = executorBuilder.keepAliveTime;
        BlockingQueue blockingQueue = executorBuilder.workQueue;
        if (blockingQueue == null) {
            blockingQueue = i8 <= 0 ? new SynchronousQueue() : new LinkedBlockingQueue(1024);
        }
        BlockingQueue blockingQueue2 = blockingQueue;
        ThreadFactory threadFactory = executorBuilder.threadFactory;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i8, i9, j8, TimeUnit.NANOSECONDS, blockingQueue2, threadFactory, (RejectedExecutionHandler) e0.defaultIfNull(executorBuilder.handler, RejectPolicy.ABORT.getValue()));
        Boolean bool = executorBuilder.allowCoreThreadTimeOut;
        if (bool != null) {
            threadPoolExecutor.allowCoreThreadTimeOut(bool.booleanValue());
        }
        return threadPoolExecutor;
    }
}
