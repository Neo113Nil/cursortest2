package com.google.firebase.messaging.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ExecutorFactory {
    void executeOneOff(String str, String str2, ThreadPriority threadPriority, Runnable runnable);

    ScheduledExecutorService newScheduledThreadPool(int i, ThreadPriority threadPriority);

    ScheduledExecutorService newScheduledThreadPool(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService newSingleThreadExecutor(ThreadPriority threadPriority);

    ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService newThreadPool(int i, ThreadPriority threadPriority);

    ExecutorService newThreadPool(int i, ThreadFactory threadFactory, ThreadPriority threadPriority);

    ExecutorService newThreadPool(ThreadPriority threadPriority);

    ExecutorService newThreadPool(ThreadFactory threadFactory, ThreadPriority threadPriority);

    Future<?> submitOneOff(String str, String str2, ThreadPriority threadPriority, Runnable runnable);
}
