package com.applovin.impl.sdk.d;

import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f3114b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f3115c;
    private boolean s;

    /* renamed from: a, reason: collision with root package name */
    private final String f3113a = "TaskManager";
    private final List<c> q = new ArrayList(5);
    private final Object r = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f3116d = a("main");
    private final ScheduledThreadPoolExecutor e = a("timeout");
    private final ScheduledThreadPoolExecutor f = a("back");
    private final ScheduledThreadPoolExecutor g = a("postbacks");
    private final ScheduledThreadPoolExecutor h = a("caching_interstitial");
    private final ScheduledThreadPoolExecutor i = a("caching_incentivized");
    private final ScheduledThreadPoolExecutor j = a("caching_other");
    private final ScheduledThreadPoolExecutor k = a("reward");
    private final ScheduledThreadPoolExecutor l = a("mediation_main");
    private final ScheduledThreadPoolExecutor m = a("mediation_timeout");
    private final ScheduledThreadPoolExecutor n = a("mediation_background");
    private final ScheduledThreadPoolExecutor o = a("mediation_backup");
    private final ScheduledThreadPoolExecutor p = a("mediation_postbacks");

    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BACKUP
    }

    private class b implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        private final String f3122b;

        public b(String str) {
            this.f3122b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f3122b + ":" + com.applovin.impl.sdk.e.l.a(q.this.f3114b.s()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.d.q.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    q.this.f3115c.b("TaskManager", "Caught unhandled exception", th);
                }
            });
            return thread;
        }
    }

    private class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final String f3125b;

        /* renamed from: c, reason: collision with root package name */
        private final com.applovin.impl.sdk.d.a f3126c;

        /* renamed from: d, reason: collision with root package name */
        private final a f3127d;

        c(com.applovin.impl.sdk.d.a aVar, a aVar2) {
            this.f3125b = aVar.c();
            this.f3126c = aVar;
            this.f3127d = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long a2;
            com.applovin.impl.sdk.p pVar;
            String str;
            StringBuilder sb;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    com.applovin.impl.sdk.e.d.a();
                } catch (Throwable th) {
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    q.this.f3114b.E().a(this.f3126c.a(), true, currentTimeMillis2);
                    q.this.f3115c.b(this.f3126c.c(), "Task failed execution in " + currentTimeMillis2 + "ms.", th);
                    a2 = q.this.a(this.f3127d) - 1;
                    pVar = q.this.f3115c;
                    str = "TaskManager";
                    sb = new StringBuilder();
                }
                if (q.this.f3114b.c() && !this.f3126c.e()) {
                    q.this.f3115c.b(this.f3125b, "Task re-scheduled...");
                    q.this.a(this.f3126c, this.f3127d, 2000L);
                    a2 = q.this.a(this.f3127d) - 1;
                    pVar = q.this.f3115c;
                    str = "TaskManager";
                    sb = new StringBuilder();
                    sb.append(this.f3127d);
                    sb.append(" queue finished task ");
                    sb.append(this.f3126c.c());
                    sb.append(" with queue size ");
                    sb.append(a2);
                    pVar.b(str, sb.toString());
                }
                q.this.f3115c.b(this.f3125b, "Task started execution...");
                this.f3126c.run();
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                q.this.f3114b.E().a(this.f3126c.a(), currentTimeMillis3);
                q.this.f3115c.b(this.f3125b, "Task executed successfully in " + currentTimeMillis3 + "ms.");
                a2 = q.this.a(this.f3127d) - 1;
                pVar = q.this.f3115c;
                str = "TaskManager";
                sb = new StringBuilder();
                sb.append(this.f3127d);
                sb.append(" queue finished task ");
                sb.append(this.f3126c.c());
                sb.append(" with queue size ");
                sb.append(a2);
                pVar.b(str, sb.toString());
            } catch (Throwable th2) {
                long a3 = q.this.a(this.f3127d) - 1;
                q.this.f3115c.b("TaskManager", this.f3127d + " queue finished task " + this.f3126c.c() + " with queue size " + a3);
                throw th2;
            }
        }
    }

    public q(com.applovin.impl.sdk.j jVar) {
        this.f3114b = jVar;
        this.f3115c = jVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(a aVar) {
        long taskCount;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (aVar == a.MAIN) {
            taskCount = this.f3116d.getTaskCount();
            scheduledThreadPoolExecutor = this.f3116d;
        } else if (aVar == a.TIMEOUT) {
            taskCount = this.e.getTaskCount();
            scheduledThreadPoolExecutor = this.e;
        } else if (aVar == a.BACKGROUND) {
            taskCount = this.f.getTaskCount();
            scheduledThreadPoolExecutor = this.f;
        } else if (aVar == a.POSTBACKS) {
            taskCount = this.g.getTaskCount();
            scheduledThreadPoolExecutor = this.g;
        } else if (aVar == a.CACHING_INTERSTITIAL) {
            taskCount = this.h.getTaskCount();
            scheduledThreadPoolExecutor = this.h;
        } else if (aVar == a.CACHING_INCENTIVIZED) {
            taskCount = this.i.getTaskCount();
            scheduledThreadPoolExecutor = this.i;
        } else if (aVar == a.CACHING_OTHER) {
            taskCount = this.j.getTaskCount();
            scheduledThreadPoolExecutor = this.j;
        } else if (aVar == a.REWARD) {
            taskCount = this.k.getTaskCount();
            scheduledThreadPoolExecutor = this.k;
        } else if (aVar == a.MEDIATION_MAIN) {
            taskCount = this.l.getTaskCount();
            scheduledThreadPoolExecutor = this.l;
        } else if (aVar == a.MEDIATION_TIMEOUT) {
            taskCount = this.m.getTaskCount();
            scheduledThreadPoolExecutor = this.m;
        } else if (aVar == a.MEDIATION_BACKGROUND) {
            taskCount = this.n.getTaskCount();
            scheduledThreadPoolExecutor = this.n;
        } else if (aVar == a.MEDIATION_BACKUP) {
            taskCount = this.o.getTaskCount();
            scheduledThreadPoolExecutor = this.o;
        } else {
            if (aVar != a.MEDIATION_POSTBACKS) {
                return 0L;
            }
            taskCount = this.p.getTaskCount();
            scheduledThreadPoolExecutor = this.p;
        }
        return taskCount - scheduledThreadPoolExecutor.getCompletedTaskCount();
    }

    private ScheduledThreadPoolExecutor a(String str) {
        return new ScheduledThreadPoolExecutor(1, new b(str));
    }

    private static void a(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        if (j > 0) {
            scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.submit(runnable);
        }
    }

    private boolean a(c cVar) {
        if (cVar.f3126c.e()) {
            return false;
        }
        synchronized (this.r) {
            if (this.s) {
                return false;
            }
            this.q.add(cVar);
            return true;
        }
    }

    public void a() {
        synchronized (this.r) {
            this.s = false;
        }
    }

    public void a(com.applovin.impl.sdk.d.a aVar) {
        if (aVar == null) {
            this.f3115c.d("TaskManager", "Attempted to execute null task immediately");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f3115c.b("TaskManager", "Executing " + aVar.c() + " immediately...");
            aVar.run();
            this.f3114b.E().a(aVar.a(), System.currentTimeMillis() - currentTimeMillis);
            this.f3115c.b("TaskManager", aVar.c() + " finished executing...");
        } catch (Throwable th) {
            this.f3115c.b(aVar.c(), "Task failed execution", th);
            this.f3114b.E().a(aVar.a(), true, System.currentTimeMillis() - currentTimeMillis);
        }
    }

    public void a(com.applovin.impl.sdk.d.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.d.a aVar, a aVar2, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Invalid delay specified: " + j);
        }
        if (!((Boolean) this.f3114b.a(com.applovin.impl.sdk.b.a.F)).booleanValue()) {
            if (aVar2 == a.MEDIATION_MAIN) {
                aVar2 = a.MAIN;
            } else if (aVar2 == a.MEDIATION_BACKGROUND) {
                aVar2 = a.BACKGROUND;
            } else if (aVar2 == a.MEDIATION_POSTBACKS) {
                aVar2 = a.POSTBACKS;
            }
        }
        c cVar = new c(aVar, aVar2);
        if (a(cVar)) {
            this.f3115c.b(aVar.c(), "Task " + aVar.c() + " execution delayed until after init");
            return;
        }
        long a2 = a(aVar2) + 1;
        this.f3115c.a("TaskManager", "Scheduling " + aVar.c() + " on " + aVar2 + " queue in " + j + "ms with new queue size " + a2);
        if (aVar2 == a.MAIN) {
            scheduledThreadPoolExecutor = this.f3116d;
        } else if (aVar2 == a.TIMEOUT) {
            scheduledThreadPoolExecutor = this.e;
        } else if (aVar2 == a.BACKGROUND) {
            scheduledThreadPoolExecutor = this.f;
        } else if (aVar2 == a.POSTBACKS) {
            scheduledThreadPoolExecutor = this.g;
        } else if (aVar2 == a.CACHING_INTERSTITIAL) {
            scheduledThreadPoolExecutor = this.h;
        } else if (aVar2 == a.CACHING_INCENTIVIZED) {
            scheduledThreadPoolExecutor = this.i;
        } else if (aVar2 == a.CACHING_OTHER) {
            scheduledThreadPoolExecutor = this.j;
        } else if (aVar2 == a.REWARD) {
            scheduledThreadPoolExecutor = this.k;
        } else if (aVar2 == a.MEDIATION_MAIN) {
            scheduledThreadPoolExecutor = this.l;
        } else if (aVar2 == a.MEDIATION_TIMEOUT) {
            scheduledThreadPoolExecutor = this.m;
        } else if (aVar2 == a.MEDIATION_BACKGROUND) {
            scheduledThreadPoolExecutor = this.n;
        } else if (aVar2 == a.MEDIATION_BACKUP) {
            scheduledThreadPoolExecutor = this.o;
        } else if (aVar2 != a.MEDIATION_POSTBACKS) {
            return;
        } else {
            scheduledThreadPoolExecutor = this.p;
        }
        a(cVar, j, scheduledThreadPoolExecutor);
    }

    public void b() {
        synchronized (this.r) {
            this.s = true;
            for (c cVar : this.q) {
                a(cVar.f3126c, cVar.f3127d);
            }
            this.q.clear();
        }
    }
}
