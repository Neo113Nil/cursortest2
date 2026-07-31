package m6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v extends f1 {

    /* renamed from: h, reason: collision with root package name */
    public static final v f19334h = new v();

    /* renamed from: i, reason: collision with root package name */
    private static final int f19335i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f19336j;
    private static volatile Executor pool;

    static {
        String str;
        Integer f7;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            f7 = l6.l.f(str);
            if (f7 == null || f7.intValue() < 1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = f7.intValue();
        }
        f19335i = intValue;
    }

    private v() {
    }

    private final ExecutorService T() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(X(), new ThreadFactory() { // from class: m6.u
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread U;
                U = v.U(atomicInteger, runnable);
                return U;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread U(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, kotlin.jvm.internal.i.i("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ExecutorService V() {
        Class<?> cls;
        ExecutorService executorService;
        Object invoke;
        if (System.getSecurityManager() != null) {
            return T();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return T();
        }
        if (!f19336j && f19335i < 0) {
            try {
                invoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            if (invoke instanceof ExecutorService) {
                executorService = (ExecutorService) invoke;
                if (executorService != null) {
                    if (!f19334h.Y(cls, executorService)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                }
            }
            executorService = null;
            if (executorService != null) {
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f19334h.X()));
            if (newInstance instanceof ExecutorService) {
                executorService2 = (ExecutorService) newInstance;
            }
        } catch (Throwable unused3) {
        }
        return executorService2 == null ? T() : executorService2;
    }

    private final synchronized Executor W() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = V();
            pool = executor;
        }
        return executor;
    }

    private final int X() {
        int a7;
        Integer valueOf = Integer.valueOf(f19335i);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        a7 = i6.f.a(Runtime.getRuntime().availableProcessors() - 1, 1);
        return a7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z() {
    }

    @Override // m6.f0
    public void P(y5.g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = W();
            }
            c.a();
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            c.a();
            r0.f19326l.g0(runnable);
        }
    }

    public final boolean Y(Class<?> cls, ExecutorService executorService) {
        executorService.submit(new Runnable() { // from class: m6.t
            @Override // java.lang.Runnable
            public final void run() {
                v.Z();
            }
        });
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // m6.f0
    public String toString() {
        return "CommonPool";
    }
}
