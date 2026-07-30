package com.baidu.ar;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class cb {

    /* renamed from: e, reason: collision with root package name */
    public static volatile cb f1956e;

    /* renamed from: b, reason: collision with root package name */
    public ScheduledExecutorService f1958b;

    /* renamed from: c, reason: collision with root package name */
    public b f1959c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1957a = true;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f1960d = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (cb.this.f1957a || cb.this.f1959c == null) {
                return;
            }
            cb.this.f1959c.updateRender();
        }
    }

    public interface b {
        void updateRender();
    }

    public final void a() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f1958b = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(this.f1960d, 0L, 40L, TimeUnit.MILLISECONDS);
    }

    public void c() {
        this.f1957a = true;
    }

    public void d() {
        this.f1957a = true;
        ScheduledExecutorService scheduledExecutorService = this.f1958b;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f1958b = null;
        }
    }

    public void e() {
        this.f1957a = false;
        ScheduledExecutorService scheduledExecutorService = this.f1958b;
        if (scheduledExecutorService == null || scheduledExecutorService.isTerminated()) {
            a();
        }
    }

    public static cb b() {
        if (f1956e == null) {
            synchronized (cb.class) {
                try {
                    if (f1956e == null) {
                        f1956e = new cb();
                    }
                } finally {
                }
            }
        }
        return f1956e;
    }

    public void a(b bVar) {
        this.f1959c = bVar;
    }
}
