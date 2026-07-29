package com.facebook.ads.internal.q.a;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class l implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicLong f5418a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private int f5419b = Thread.currentThread().getPriority();

    protected String a() {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", Long.valueOf(this.f5418a.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, a(), 0L);
        thread.setPriority(this.f5419b);
        return thread;
    }
}
