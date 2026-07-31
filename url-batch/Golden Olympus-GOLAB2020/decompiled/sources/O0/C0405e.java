package O0;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: O0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0405e {

    /* renamed from: b, reason: collision with root package name */
    private static C0405e f1195b;

    /* renamed from: c, reason: collision with root package name */
    private static C0405e f1196c;

    /* renamed from: d, reason: collision with root package name */
    private static C0405e f1197d;

    /* renamed from: a, reason: collision with root package name */
    private ThreadPoolExecutor f1198a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* renamed from: O0.e$a */
    private static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Runnable f1199b;

        public a(Runnable runnable) {
            this.f1199b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f1199b;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    j0.l("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* renamed from: O0.e$b */
    static class b implements ThreadFactory {

        /* renamed from: d, reason: collision with root package name */
        private static final AtomicInteger f1200d = new AtomicInteger(1);

        /* renamed from: a, reason: collision with root package name */
        private final ThreadGroup f1201a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f1202b = new AtomicInteger(1);

        /* renamed from: c, reason: collision with root package name */
        private final String f1203c;

        b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f1201a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f1203c = "FormalHASDK-base-" + f1200d.getAndIncrement();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(this.f1201a, runnable, this.f1203c + this.f1202b.getAndIncrement(), 0L);
        }
    }

    static {
        new C0405e();
        new C0405e();
        f1195b = new C0405e();
        f1196c = new C0405e();
        f1197d = new C0405e();
    }

    private C0405e() {
    }

    public static C0405e a() {
        return f1197d;
    }

    public static C0405e c() {
        return f1196c;
    }

    public static C0405e d() {
        return f1195b;
    }

    public void b(InterfaceRunnableC0421v interfaceRunnableC0421v) {
        try {
            this.f1198a.execute(new a(interfaceRunnableC0421v));
        } catch (RejectedExecutionException unused) {
            j0.l("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
