package com.aiming.mdt.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.aiming.mdt.a.ʻʽˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class ThreadFactoryC0084 implements ThreadFactory {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private final AtomicInteger f214 = new AtomicInteger(1);

    ThreadFactoryC0084() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder("Request #");
        sb.append(this.f214.getAndIncrement());
        return new Thread(runnable, sb.toString());
    }
}
