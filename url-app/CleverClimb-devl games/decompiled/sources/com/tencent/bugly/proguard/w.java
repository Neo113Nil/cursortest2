package com.tencent.bugly.proguard;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static w f8799a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f8800b;

    protected w() {
        this.f8800b = null;
        this.f8800b = Executors.newScheduledThreadPool(3, new ThreadFactory(this) { // from class: com.tencent.bugly.proguard.w.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("BUGLY_THREAD");
                return thread;
            }
        });
        if (this.f8800b == null || this.f8800b.isShutdown()) {
            x.d("[AsyncTaskHandler] ScheduledExecutorService is not valiable!", new Object[0]);
        }
    }

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (f8799a == null) {
                f8799a = new w();
            }
            wVar = f8799a;
        }
        return wVar;
    }

    public final synchronized boolean a(Runnable runnable, long j) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        if (j <= 0) {
            j = 0;
        }
        x.c("[AsyncTaskHandler] Post a delay(time: %dms) task: %s", Long.valueOf(j), runnable.getClass().getName());
        try {
            this.f8800b.schedule(runnable, j, TimeUnit.MILLISECONDS);
            return true;
        } catch (Throwable th) {
            if (com.tencent.bugly.b.f8566c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public final synchronized boolean a(Runnable runnable) {
        if (!c()) {
            x.d("[AsyncTaskHandler] Async handler was closed, should not post task.", new Object[0]);
            return false;
        }
        if (runnable == null) {
            x.d("[AsyncTaskHandler] Task input is null.", new Object[0]);
            return false;
        }
        x.c("[AsyncTaskHandler] Post a normal task: %s", runnable.getClass().getName());
        try {
            this.f8800b.execute(runnable);
            return true;
        } catch (Throwable th) {
            if (com.tencent.bugly.b.f8566c) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public final synchronized void b() {
        if (this.f8800b != null && !this.f8800b.isShutdown()) {
            x.c("[AsyncTaskHandler] Close async handler.", new Object[0]);
            this.f8800b.shutdownNow();
        }
    }

    public final synchronized boolean c() {
        boolean z;
        if (this.f8800b != null) {
            z = this.f8800b.isShutdown() ? false : true;
        }
        return z;
    }
}
