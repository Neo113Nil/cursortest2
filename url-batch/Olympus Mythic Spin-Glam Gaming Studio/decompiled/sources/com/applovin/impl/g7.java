package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes12.dex */
public class g7 {
    private final com.applovin.impl.sdk.k a;
    private Timer b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private final Runnable g;
    private long h;
    private final Object i = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.g.run();
                synchronized (g7.this.i) {
                    try {
                        if (g7.this.f) {
                            g7.this.c = System.currentTimeMillis();
                            g7 g7Var = g7.this;
                            g7Var.d = g7Var.e;
                        } else {
                            g7.this.b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (g7.this.a != null) {
                        g7.this.a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.a.O().a("Timer", "Encountered error while executing timed task", th);
                        }
                        g7.this.a.D().a("Timer", "executingTimedTask", th);
                    }
                    synchronized (g7.this.i) {
                        try {
                            if (g7.this.f) {
                                g7.this.c = System.currentTimeMillis();
                                g7 g7Var2 = g7.this;
                                g7Var2.d = g7Var2.e;
                            } else {
                                g7.this.b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (g7.this.i) {
                        try {
                            if (g7.this.f) {
                                g7.this.c = System.currentTimeMillis();
                                g7 g7Var3 = g7.this;
                                g7Var3.d = g7Var3.e;
                            } else {
                                g7.this.b = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.a = kVar;
        this.g = runnable;
    }

    public long c() {
        if (this.b == null) {
            return this.d - this.h;
        }
        return this.d - (System.currentTimeMillis() - this.c);
    }

    public void d() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.h = Math.max(1L, System.currentTimeMillis() - this.c);
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.a.O().a("Timer", "Encountered error while pausing timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } finally {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.i) {
            long j = this.h;
            if (j > 0) {
                try {
                    long j2 = this.d - j;
                    this.d = j2;
                    if (j2 < 0) {
                        this.d = 0L;
                    }
                    this.b = new Timer();
                    a(b(), this.d, this.f, this.e);
                    this.c = System.currentTimeMillis();
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.a.O().a("Timer", "Encountered error while resuming timer", th);
                                }
                            }
                        }
                        this.h = 0L;
                    } finally {
                        this.h = 0L;
                    }
                }
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public static g7 a(long j, boolean z, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(kVar, runnable);
            g7Var.c = System.currentTimeMillis();
            g7Var.d = j;
            g7Var.f = z;
            g7Var.e = j;
            try {
                g7Var.b = new Timer();
                g7Var.a(g7Var.b(), j, z, g7Var.e);
            } catch (OutOfMemoryError e) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return g7Var;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.i) {
            Timer timer = this.b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.b = null;
                } catch (Throwable th) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.a.O().a("Timer", "Encountered error while cancelling timer", th);
                                }
                            }
                        }
                        this.b = null;
                    } catch (Throwable th2) {
                        this.b = null;
                        this.h = 0L;
                        throw th2;
                    }
                }
                this.h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j, boolean z, long j2) {
        if (z) {
            this.b.schedule(timerTask, j, j2);
        } else {
            this.b.schedule(timerTask, j);
        }
    }
}
