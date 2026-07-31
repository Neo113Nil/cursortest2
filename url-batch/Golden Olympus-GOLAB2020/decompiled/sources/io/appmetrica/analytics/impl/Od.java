package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class Od implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f38077a = new AtomicInteger(0);

    public static int a() {
        return f38077a.incrementAndGet();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new InterruptionSafeThread(runnable, ((String) null) + "-" + f38077a.incrementAndGet());
    }
}
