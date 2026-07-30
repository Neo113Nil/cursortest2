package cn.hutool.core.thread;

import cn.hutool.core.text.l;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f implements ThreadFactory {
    private final ThreadGroup group;
    private final Thread.UncaughtExceptionHandler handler;
    private final boolean isDaemon;
    private final String prefix;
    private final AtomicInteger threadNumber;

    public f(String str, boolean z7) {
        this(str, null, z7);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.group, runnable, l.format("{}{}", this.prefix, Integer.valueOf(this.threadNumber.getAndIncrement())));
        if (thread.isDaemon()) {
            if (!this.isDaemon) {
                thread.setDaemon(false);
            }
        } else if (this.isDaemon) {
            thread.setDaemon(true);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.handler;
        if (uncaughtExceptionHandler != null) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        if (5 != thread.getPriority()) {
            thread.setPriority(5);
        }
        return thread;
    }

    public f(String str, ThreadGroup threadGroup, boolean z7) {
        this(str, threadGroup, z7, null);
    }

    public f(String str, ThreadGroup threadGroup, boolean z7, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.threadNumber = new AtomicInteger(1);
        this.prefix = l.isBlank(str) ? "Hutool" : str;
        this.group = threadGroup == null ? i.currentThreadGroup() : threadGroup;
        this.isDaemon = z7;
        this.handler = uncaughtExceptionHandler;
    }
}
