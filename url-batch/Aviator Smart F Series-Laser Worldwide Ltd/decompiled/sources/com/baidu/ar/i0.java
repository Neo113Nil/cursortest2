package com.baidu.ar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i0 extends ue {

    /* renamed from: c, reason: collision with root package name */
    public boolean f2429c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2430d;

    /* renamed from: e, reason: collision with root package name */
    public ScheduledExecutorService f2431e;

    /* renamed from: f, reason: collision with root package name */
    public ScheduledFuture f2432f;

    /* renamed from: b, reason: collision with root package name */
    public final f8 f2428b = g8.a((Class<?>) i0.class);

    /* renamed from: g, reason: collision with root package name */
    public long f2433g = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: h, reason: collision with root package name */
    public final Object f2434h = new Object();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<te> f2435a = new ArrayList<>();

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2435a.clear();
            try {
                this.f2435a.addAll(i0.this.c());
                long nanoTime = (long) (System.nanoTime() - (i0.this.f2433g * 1.5d));
                Iterator<te> it = this.f2435a.iterator();
                while (it.hasNext()) {
                    i0.this.a(it.next(), nanoTime);
                }
            } catch (Exception unused) {
            }
            this.f2435a.clear();
        }
    }

    public final void b() {
        ScheduledExecutorService scheduledExecutorService = this.f2431e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f2431e = null;
        }
        ScheduledFuture scheduledFuture = this.f2432f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f2432f = null;
        }
    }

    public abstract Collection<te> c();

    public boolean d() {
        return this.f2430d;
    }

    public boolean e() {
        return this.f2429c;
    }

    public final void f() {
        b();
        this.f2431e = Executors.newSingleThreadScheduledExecutor(new h9("connectionLostChecker"));
        a aVar = new a();
        ScheduledExecutorService scheduledExecutorService = this.f2431e;
        long j8 = this.f2433g;
        this.f2432f = scheduledExecutorService.scheduleAtFixedRate(aVar, j8, j8, TimeUnit.NANOSECONDS);
    }

    public void g() {
        synchronized (this.f2434h) {
            try {
                if (this.f2433g <= 0) {
                    this.f2428b.b("Connection lost timer deactivated");
                } else {
                    this.f2428b.b("Connection lost timer started");
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h() {
        synchronized (this.f2434h) {
            try {
                if (this.f2431e == null) {
                    if (this.f2432f != null) {
                    }
                }
                this.f2428b.b("Connection lost timer stopped");
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z7) {
        this.f2429c = z7;
    }

    public final void a(te teVar, long j8) {
        if (teVar instanceof we) {
            we weVar = (we) teVar;
            if (weVar.b() < j8) {
                this.f2428b.a("Closing connection due to no pong received: {}", weVar);
                weVar.b(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (weVar.g()) {
                weVar.h();
            } else {
                this.f2428b.a("Trying to ping a non open connection: {}", weVar);
            }
        }
    }

    public void a(boolean z7) {
        this.f2430d = z7;
    }
}
