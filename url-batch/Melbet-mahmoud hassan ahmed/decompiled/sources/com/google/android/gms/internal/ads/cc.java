package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class cc implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f3797a = Executors.defaultThreadFactory();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f3798b = new AtomicInteger(1);

    cc() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f3797a.newThread(runnable);
        int andIncrement = this.f3798b.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
