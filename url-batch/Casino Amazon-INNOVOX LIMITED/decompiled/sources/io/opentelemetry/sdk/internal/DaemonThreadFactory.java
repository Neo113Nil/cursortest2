package io.opentelemetry.sdk.internal;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class DaemonThreadFactory implements ThreadFactory {
    private final AtomicInteger counter;
    private final ThreadFactory delegate;
    private final String namePrefix;

    public DaemonThreadFactory(String str) {
        this(str, Executors.defaultThreadFactory());
    }

    public DaemonThreadFactory(String str, ThreadFactory threadFactory) {
        this.counter = new AtomicInteger();
        this.namePrefix = str;
        this.delegate = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.delegate.newThread(runnable);
        newThread.setUncaughtExceptionHandler(new ManagedUncaughtExceptionHandler(newThread.getUncaughtExceptionHandler()));
        try {
            newThread.setDaemon(true);
            newThread.setName(this.namePrefix + TokenBuilder.TOKEN_DELIMITER + this.counter.incrementAndGet());
            newThread.setContextClassLoader(null);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    static class ManagedUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

        @Nullable
        private final Thread.UncaughtExceptionHandler delegate;

        private ManagedUncaughtExceptionHandler(@Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.delegate = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (th instanceof InterruptedException) {
                thread.interrupt();
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.delegate;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
