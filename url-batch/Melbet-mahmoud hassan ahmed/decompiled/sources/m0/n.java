package m0;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n {

    /* renamed from: f, reason: collision with root package name */
    private static final String f18885f = d0.j.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f18886a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f18887b;

    /* renamed from: c, reason: collision with root package name */
    final Map<String, c> f18888c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, b> f18889d;

    /* renamed from: e, reason: collision with root package name */
    final Object f18890e;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f18891a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f18891a);
            this.f18891a = this.f18891a + 1;
            return newThread;
        }
    }

    public interface b {
        void b(String str);
    }

    public static class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final n f18893f;

        /* renamed from: g, reason: collision with root package name */
        private final String f18894g;

        c(n nVar, String str) {
            this.f18893f = nVar;
            this.f18894g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f18893f.f18890e) {
                if (this.f18893f.f18888c.remove(this.f18894g) != null) {
                    b remove = this.f18893f.f18889d.remove(this.f18894g);
                    if (remove != null) {
                        remove.b(this.f18894g);
                    }
                } else {
                    d0.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f18894g), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f18886a = aVar;
        this.f18888c = new HashMap();
        this.f18889d = new HashMap();
        this.f18890e = new Object();
        this.f18887b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f18887b.isShutdown()) {
            return;
        }
        this.f18887b.shutdownNow();
    }

    public void b(String str, long j7, b bVar) {
        synchronized (this.f18890e) {
            d0.j.c().a(f18885f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f18888c.put(str, cVar);
            this.f18889d.put(str, bVar);
            this.f18887b.schedule(cVar, j7, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f18890e) {
            if (this.f18888c.remove(str) != null) {
                d0.j.c().a(f18885f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f18889d.remove(str);
            }
        }
    }
}
