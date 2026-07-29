package com.applovin.impl.sdk.e;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3247a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f3248b;

    /* renamed from: c, reason: collision with root package name */
    private long f3249c;

    /* renamed from: d, reason: collision with root package name */
    private long f3250d;
    private final Runnable e;
    private long f;
    private final Object g = new Object();

    private j(com.applovin.impl.sdk.j jVar, Runnable runnable) {
        this.f3247a = jVar;
        this.e = runnable;
    }

    public static j a(long j, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
        j jVar2 = new j(jVar, runnable);
        jVar2.f3249c = System.currentTimeMillis();
        jVar2.f3250d = j;
        jVar2.f3248b = new Timer();
        jVar2.f3248b.schedule(jVar2.e(), j);
        return jVar2;
    }

    private TimerTask e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.e.j.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    try {
                        j.this.e.run();
                        synchronized (j.this.g) {
                            j.this.f3248b = null;
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    synchronized (j.this.g) {
                        j.this.f3248b = null;
                        throw th;
                    }
                }
            }
        };
    }

    public long a() {
        if (this.f3248b == null) {
            return this.f3250d - this.f;
        }
        return this.f3250d - (System.currentTimeMillis() - this.f3249c);
    }

    public void b() {
        synchronized (this.g) {
            if (this.f3248b != null) {
                try {
                    try {
                        this.f3248b.cancel();
                        this.f = System.currentTimeMillis() - this.f3249c;
                    } catch (Throwable th) {
                        if (this.f3247a != null) {
                            this.f3247a.u().b("Timer", "Encountered error while pausing timer", th);
                        }
                    }
                } finally {
                    this.f3248b = null;
                }
            }
        }
    }

    public void c() {
        synchronized (this.g) {
            try {
                if (this.f > 0) {
                    try {
                        this.f3250d -= this.f;
                        if (this.f3250d < 0) {
                            this.f3250d = 0L;
                        }
                        this.f3248b = new Timer();
                        this.f3248b.schedule(e(), this.f3250d);
                        this.f3249c = System.currentTimeMillis();
                    } catch (Throwable th) {
                        if (this.f3247a != null) {
                            this.f3247a.u().b("Timer", "Encountered error while resuming timer", th);
                        }
                    }
                }
            } finally {
                this.f = 0L;
            }
        }
    }

    public void d() {
        synchronized (this.g) {
            if (this.f3248b != null) {
                try {
                    try {
                        this.f3248b.cancel();
                        this.f3248b = null;
                    } catch (Throwable th) {
                        this.f3248b = null;
                        this.f = 0L;
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (this.f3247a != null) {
                        this.f3247a.u().b("Timer", "Encountered error while cancelling timer", th2);
                    }
                    this.f3248b = null;
                }
                this.f = 0L;
            }
        }
    }
}
