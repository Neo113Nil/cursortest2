package com.onesignal.debug.internal.crash;

/* loaded from: classes.dex */
public interface k {
    Thread mainThread();

    StackTraceElement[] mainThreadStackTrace();

    long now();

    void postToMainThread(Runnable runnable);

    void removeFromMainThread(Runnable runnable);
}
