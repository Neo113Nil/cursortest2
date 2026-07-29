package com.appsflyer;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f3409a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f3410b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f3411c;

    private a() {
    }

    public static a a() {
        if (f3409a == null) {
            f3409a = new a();
        }
        return f3409a;
    }

    public Executor b() {
        if (this.f3410b == null || ((this.f3410b instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) this.f3410b).isShutdown() || ((ThreadPoolExecutor) this.f3410b).isTerminated() || ((ThreadPoolExecutor) this.f3410b).isTerminating()))) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.f3410b = Executors.newFixedThreadPool(2);
            } else {
                return Executors.newSingleThreadExecutor();
            }
        }
        return this.f3410b;
    }

    final ScheduledThreadPoolExecutor c() {
        if (this.f3411c == null || this.f3411c.isShutdown() || this.f3411c.isTerminated()) {
            this.f3411c = Executors.newScheduledThreadPool(2);
        }
        return (ScheduledThreadPoolExecutor) this.f3411c;
    }

    final void d() {
        try {
            a(this.f3411c);
            if (this.f3410b instanceof ThreadPoolExecutor) {
                a((ThreadPoolExecutor) this.f3410b);
            }
        } catch (Throwable th) {
            d.a("failed to stop Executors", th);
        }
    }

    private static void a(ExecutorService executorService) {
        try {
            try {
                d.a("shut downing executor ...");
                executorService.shutdown();
                executorService.awaitTermination(10L, TimeUnit.SECONDS);
                if (!executorService.isTerminated()) {
                    d.a("killing non-finished tasks");
                }
                executorService.shutdownNow();
            } catch (InterruptedException unused) {
                d.a("InterruptedException!!!");
                if (!executorService.isTerminated()) {
                    d.a("killing non-finished tasks");
                }
                executorService.shutdownNow();
            }
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                d.a("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
